package com.gmdiias.controle.avaliacao;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.gmdiias.controle.shared.StringsUtils;

public class AvaliacaoService {

	public static boolean verificaCondicao(String codReceived, String expressao) {
		
		if(expressao == null) {
			return false;
		}
		
		Pattern teste = Pattern.compile(expressao, Pattern.MULTILINE);
		Matcher m = teste.matcher(StringsUtils.removeStringSpecialCaracters(codReceived));
		return m.matches();
	}
}
