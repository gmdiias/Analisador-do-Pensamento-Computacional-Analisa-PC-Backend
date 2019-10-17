package com.gmdiias.controle.linguagem;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.gmdiias.basic.BasicService;

@Service
@Transactional
public class LinguagemService extends BasicService<Linguagem, LinguagemRepository>{

	public List<Linguagem> findByNomeLike(String nome){
		return repository.findTop5ByNomeLikeIgnoreCase("%" + nome + "%");
	}
	
}
