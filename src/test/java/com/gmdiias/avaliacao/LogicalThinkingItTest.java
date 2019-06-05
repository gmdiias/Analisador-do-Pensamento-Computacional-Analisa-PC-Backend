package com.gmdiias.avaliacao;

import static org.junit.Assert.assertFalse;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.gmdiias.linguagem.logicalthinking.LogicalThinkingService;

public class LogicalThinkingItTest {

	@Autowired
	LogicalThinkingService ltService;
	
	
	@Before
	public void criaLogicalThinking() {
		
	}
	
	@Test
	public void testeDeCriacao() {
		assertFalse(ltService.findAll().isEmpty());
	}
	
}
