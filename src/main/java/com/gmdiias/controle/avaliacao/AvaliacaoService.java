package com.gmdiias.controle.avaliacao;

import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.gmdiias.controle.atributos.ExpressaoRegular;

public class AvaliacaoService {

	public static boolean verificaCondicao(String codReceived, Set<ExpressaoRegular> listExpressoes) {
		
		return extracted(codReceived, listExpressoes);
	}

	private static boolean extracted(String codReceived, Set<ExpressaoRegular> listExpressoes) {
		return listExpressoes.stream().anyMatch(banana -> {
			Pattern teste = Pattern.compile(banana.getExpressao(), Pattern.MULTILINE);
			Matcher m = teste.matcher(codReceived);
			return m.matches();
		});
	}
	
}
