package com.gmdiias.avaliacao;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class LogicalThinkingTest {

	@Test
	public void avaliacaoSemIfTest() {

		List<String> analise = Arrays.asList(" if ");
		
		StringBuilder codigo = new StringBuilder();
		codigo.append("void main()\r\n");
		codigo.append("{ \r\n");
		codigo.append("   int a;\r\n");
		codigo.append("   a = 3 + 2;\r\n");
		codigo.append("}");

		boolean response = Avaliacao.validaCondicao(codigo.toString(), analise);
		assertFalse(response);
	}
	
	@Test
	public void avaliacaoErroIfTest() {
		
		List<String> analise = Arrays.asList(" if ");
		
		StringBuilder codigo = new StringBuilder();
		codigo.append("void main()\r\n");
		codigo.append("{ \r\n");
		codigo.append("   int a;\r\n");
		codigo.append("   a = 3 + 2;\r\n");
		codigo.append("   printf(\"iftestando %i\", a);\r\n");
		codigo.append("}");

		boolean response = Avaliacao.validaCondicao(codigo.toString(), analise);
		assertFalse(response);
	}

	@Test
	public void avaliacaoComIfSimplesTest() {
		
		List<String> analise = Arrays.asList(" if ");
		
		StringBuilder codigo = new StringBuilder();
		codigo.append("void main()\r\n");
		codigo.append("{ \r\n");
		codigo.append("   int a;\r\n");
		codigo.append("   a = 3 + 2;\r\n");
		codigo.append("   if (a == 0){\r\n");
		codigo.append("   	a++;\r\n");
		codigo.append("   }\r\n");
		codigo.append("   printf(\"%i\", a);\r\n");
		codigo.append("}");

		boolean avalia = Avaliacao.validaCondicao(codigo.toString(), analise);
		assertTrue(avalia);
	}
	
	@Test
	public void avaliacaoComIfElseTest() {
		List<String> analise = Arrays.asList(" else ");
		
		StringBuilder codigo = new StringBuilder();
		codigo.append("void main()\r\n");
		codigo.append("{ \r\n");
		codigo.append("   int a;\r\n");
		codigo.append("   a = 3 + 2;\r\n");
		codigo.append("   if(a == 0){\r\n");
		codigo.append("   	a++;\r\n");
		codigo.append("   }\r\n");
		codigo.append("   else {\r\n");
		codigo.append("     a--;\r\n");
		codigo.append("   }\r\n");
		codigo.append("   printf(\"%i\", a);\r\n");
		codigo.append("}");

		boolean avalia = Avaliacao.validaCondicao(codigo.toString(), analise);
		assertTrue(avalia);
	}
	
	@Test
	public void avaliacaoOperador() {
		List<String> analise = Arrays.asList(" && ", " || ", "!");
		
		StringBuilder codigo = new StringBuilder();
		codigo.append("void main()\r\n");
		codigo.append("{ \r\n");
		codigo.append("   int a;\r\n");
		codigo.append("   a = 3 + 2;\r\n");
		codigo.append("   if(a == 0 && a > 0){\r\n");
		codigo.append("   	a++;\r\n");
		codigo.append("   }\r\n");
		codigo.append("   else {\r\n");
		codigo.append("     a--;\r\n");
		codigo.append("   }\r\n");
		codigo.append("   printf(\"%i\", a);\r\n");
		codigo.append("}");
		
		boolean avalia = Avaliacao.validaCondicao(codigo.toString(), analise);
		assertTrue(avalia);
	}

}
