package com.gmdiias.controle.analise;

import static org.junit.Assert.assertEquals;

import java.util.Collections;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.gmdiias.controle.atributos.ExpressaoRegular;
import com.gmdiias.controle.linguagem.Linguagem;
import com.gmdiias.controle.linguagem.LinguagemService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CasoTesteTest {

	@Autowired
	CasoTesteService ctService;
	
	@Autowired
	LinguagemService lgService;
	
	@Test
	public void casoTesteTest() {
		
		StringBuilder codigo = new StringBuilder();
		codigo.append("void main()\r\n");
		codigo.append("{ \r\n");
		codigo.append("   int a;\r\n");
		codigo.append("   a = 3 + 2;\r\n");
		codigo.append("   if (a == 0 && a > 0){\r\n");
		codigo.append("   	a++;\r\n");
		codigo.append("   }\r\n");
		codigo.append("   else {\r\n");
		codigo.append("     a--;\r\n");
		codigo.append("   }\r\n");
		codigo.append("   printf(\"%i\", a);\r\n");
		codigo.append("}");
		
		Linguagem linguagemC = new Linguagem();
		ExpressaoRegular condicao = new ExpressaoRegular(" if ");
		ExpressaoRegular condicaoComplexa = new ExpressaoRegular(" else ");
		ExpressaoRegular operadores = new ExpressaoRegular(" && ");
		linguagemC.setCondicionais(Collections.singleton(condicao));
		linguagemC.setCondicionaisComplexos(Collections.singleton(condicaoComplexa));
		linguagemC.setOperadoresLogicos(Collections.singleton(operadores));
		Linguagem saved = lgService.save(linguagemC);
		
		CasoTeste caso = new CasoTeste();
		caso.setLinguagem(saved);
		caso.setCodigo(codigo.toString());
		
		caso.setAvaliacao(ctService.realizaAvaliacaoDoCasoDeTeste(caso));
		CasoTeste salvo = ctService.save(caso);
		
		assertEquals(3, salvo.getAvaliacao().getResultadoLogica());
		
	}
	
}
