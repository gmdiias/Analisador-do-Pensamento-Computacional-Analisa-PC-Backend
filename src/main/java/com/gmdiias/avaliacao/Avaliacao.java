package com.gmdiias.avaliacao;

import java.util.List;

public class Avaliacao {

	public static boolean validaCondicao(String codReceived, List<String> listBanana) {
		return listBanana.stream().anyMatch(banana -> codReceived.contains(banana));
	}
	
}
