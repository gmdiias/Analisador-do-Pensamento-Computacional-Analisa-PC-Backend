package com.gmdiias.controle.avaliacao;

import java.util.Set;

import com.gmdiias.controle.atributos.ExpressaoRegular;

public class AvaliacaoService {

	public static boolean verificaCondicao(String codReceived, Set<ExpressaoRegular> listExpressoes) {
		return listExpressoes.stream().anyMatch(banana -> codReceived.matches(banana.getExpressao()));
	}
	
}
