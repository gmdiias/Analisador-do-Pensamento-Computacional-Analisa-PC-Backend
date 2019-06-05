package com.gmdiias.avaliacao;

public class Avaliacao {
	
	
	
	
	
	public static int validaCondicao(String codReceived) {
		if(codReceived.contains("if")) {
			return 1;
		}
		return 0;
	}
}
