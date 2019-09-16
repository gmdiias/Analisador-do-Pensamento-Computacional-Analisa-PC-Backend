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

		boolean condiconal = AvaliacaoService.verificaCondicao(caso.getCodigo(), caso.getLinguagem().getCondicional());
		boolean condicionalComplexa = AvaliacaoService.verificaCondicao(caso.getCodigo(), caso.getLinguagem().getCondicionalComplexo());
		boolean operador = AvaliacaoService.verificaCondicao(caso.getCodigo(), caso.getLinguagem().getOperadorLogico());
		boolean loops = AvaliacaoService.verificaCondicao(caso.getCodigo(), caso.getLinguagem().getLoop());
		boolean loopsComplexos = AvaliacaoService.verificaCondicao(caso.getCodigo(), caso.getLinguagem().getLoopComplexo());
		boolean valoresFixos = AvaliacaoService.verificaCondicao(caso.getCodigo(), caso.getLinguagem().getValorFixo());
		boolean variaveis = AvaliacaoService.verificaCondicao(caso.getCodigo(), caso.getLinguagem().getVariavel());
		boolean listas = AvaliacaoService.verificaCondicao(caso.getCodigo(), caso.getLinguagem().getLista());
		boolean sequenciais = AvaliacaoService.verificaCondicao(caso.getCodigo(), caso.getLinguagem().getSequenciais());
		boolean multiFuncoes = AvaliacaoService.verificaCondicao(caso.getCodigo(), caso.getLinguagem().getMultiFuncoes());
		boolean modulos = AvaliacaoService.verificaCondicao(caso.getCodigo(), caso.getLinguagem().getModulos());

		Resultado resultado = new Resultado(condiconal, condicionalComplexa, operador, loops, loopsComplexos,
				sequenciais, valoresFixos, variaveis, listas, sequenciais, multiFuncoes, modulos);

		return resultado;
	}

	public CasoTeste save(CasoTeste entity) {

		Optional<Linguagem> opLinguagem = linguagemService.findOne(entity.getLinguagem().getId());

		if (opLinguagem.isPresent()) {
			entity.setLinguagem(opLinguagem.get());
			entity.setAvaliacao(realizaAvaliacaoDoCasoDeTeste(entity));
			return repository.save(entity);
		}

		throw new RuntimeException("Linguagem não encontrada");
	}
}
