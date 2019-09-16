package com.gmdiias.controle.shared;

public class StringsUtils {

	public static String removeStringSpecialCaracters(String entrada) {
		String retorno = entrada;

		retorno = retorno.replaceAll("\n", " ");
		retorno = retorno.replaceAll("\t", " ");
		return retorno;
	}

}
