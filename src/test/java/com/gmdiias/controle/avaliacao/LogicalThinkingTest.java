package com.gmdiias.controle.avaliacao;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Collections;
import java.util.Set;

import org.junit.Test;

import com.gmdiias.controle.atributos.ExpressaoRegular;

public class LogicalThinkingTest {

	@Test
	public void avaliacaoSemIfTest() {

		Set<ExpressaoRegular> analise = Collections.singleton(new ExpressaoRegular(" if "));
		
		StringBuilder codigo = new StringBuilder();
		codigo.append("void main()\r\n");
		codigo.append("{ \r\n");
		codigo.append("   int a;\r\n");
		codigo.append("   a = 3 + 2;\r\n");
		codigo.append("}");

		boolean response = AvaliacaoService.verificaCondicao(codigo.toString(), analise);
		assertFalse(response);
	}
	
	@Test
	public void avaliacaoErroIfTest() {
		
		Set<ExpressaoRegular> analise = Collections.singleton(new ExpressaoRegular(" if "));
		
		StringBuilder codigo = new StringBuilder();
		codigo.append("void main()\r\n");
		codigo.append("{ \r\n");
		codigo.append("   int a;\r\n");
		codigo.append("   a = 3 + 2;\r\n");
		codigo.append("   printf(\"iftestando %i\", a);\r\n");
		codigo.append("}");

		boolean response = AvaliacaoService.verificaCondicao(codigo.toString(), analise);
		assertFalse(response);
	}

	@Test
	public void avaliacaoComIfSimplesTest() {
		
		Set<ExpressaoRegular> analise = Collections.singleton(new ExpressaoRegular(" if "));
		
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

		boolean avalia = AvaliacaoService.verificaCondicao(codigo.toString(), analise);
		assertTrue(avalia);
	}
	
	@Test
	public void avaliacaoComIfElseTest() {
		Set<ExpressaoRegular> analise = Collections.singleton(new ExpressaoRegular(" else "));
		
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

		boolean avalia = AvaliacaoService.verificaCondicao(codigo.toString(), analise);
		assertTrue(avalia);
	}
	
	@Test
	public void avaliacaoOperador() {
		Set<ExpressaoRegular> analise = Collections.singleton(new ExpressaoRegular(" && "));
		
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
		
		boolean avalia = AvaliacaoService.verificaCondicao(codigo.toString(), analise);
		assertTrue(avalia);
	}

}
