package com.gmdiias.controle.analise;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.gmdiias.basic.BasicService;
import com.gmdiias.controle.avaliacao.AvaliacaoService;
import com.gmdiias.controle.avaliacao.Resultado;

@Service
@Transactional
public class CasoTesteService extends BasicService<CasoTeste, CasoTesteRepository> {

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
}
