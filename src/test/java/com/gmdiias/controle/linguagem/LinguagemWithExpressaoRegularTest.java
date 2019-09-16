package com.gmdiias.controle.linguagem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Collections;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.gmdiias.controle.atributos.ExpressaoRegular;
import com.gmdiias.controle.avaliacao.AvaliacaoService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LinguagemWithExpressaoRegularTest {

	@Autowired
	LinguagemService lgService;
	
	@Test
	public void linguamgeTest() {

		Linguagem linguagemC = new Linguagem();
		ExpressaoRegular condicao = new ExpressaoRegular("(\\s+|^[\\W]*)[if]+\\s*[(]+");
		linguagemC.setCondicionais(Collections.singleton(condicao));
		Linguagem saved = lgService.save(linguagemC);
		
		assertNotNull(saved);
		assertNotNull(saved.getId());
		assertEquals(1, saved.getCondicionais().size());
		
		boolean result = AvaliacaoService.verificaCondicao(" if (", saved.getCondicionais());
		assertTrue(result);
		
		boolean result2 = AvaliacaoService.verificaCondicao(" if ", saved.getCondicionais());
		assertFalse(result2);
		
		boolean result3 = AvaliacaoService.verificaCondicao("if (", saved.getCondicionais());
		assertTrue(result3);
		
		boolean result4 = AvaliacaoService.verificaCondicao(" sif (", saved.getCondicionais());
		assertFalse(result4);
	}
}
