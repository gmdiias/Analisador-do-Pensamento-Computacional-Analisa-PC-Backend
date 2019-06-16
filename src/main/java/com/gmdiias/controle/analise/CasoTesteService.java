package com.gmdiias.controle.analise;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gmdiias.basic.BasicService;
import com.gmdiias.controle.avaliacao.AvaliacaoService;
import com.gmdiias.controle.avaliacao.Resultado;
import com.gmdiias.controle.linguagem.Linguagem;
import com.gmdiias.controle.linguagem.LinguagemService;

@Service
@Transactional
public class CasoTesteService extends BasicService<CasoTeste, CasoTesteRepository> {

	@Autowired
	LinguagemService linguagemService;
	
	public Resultado realizaAvaliacaoDoCasoDeTeste(CasoTeste caso) {
		
		Resultado resultado = new Resultado();
		
		boolean condiconal = AvaliacaoService.verificaCondicao(caso.getCodigo(), caso.getLinguagem().getCondicionais());
		boolean condicionalComplexa = AvaliacaoService.verificaCondicao(caso.getCodigo(), caso.getLinguagem().getCondicionaisComplexos());
		boolean operador = AvaliacaoService.verificaCondicao(caso.getCodigo(), caso.getLinguagem().getOperadoresLogicos());
		resultado.setHasCondicional(condiconal);
		resultado.setHasCondicionalComplexo(condicionalComplexa);
		resultado.setHasOperadores(operador);
		
		return resultado;
	}
	
	public CasoTeste save(CasoTeste entity) {
		
		Optional<Linguagem> opLinguagem = linguagemService.findOne(entity.getLinguagem().getId());
		
		if(opLinguagem.isPresent()) {
			entity.setLinguagem(opLinguagem.get());
			entity.setAvaliacao(realizaAvaliacaoDoCasoDeTeste(entity));
			return repository.save(entity);
		}
		
		throw new RuntimeException("Linguagem não encontrada");
    }
}
