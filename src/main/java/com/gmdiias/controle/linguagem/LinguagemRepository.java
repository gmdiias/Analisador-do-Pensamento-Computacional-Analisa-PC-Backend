package com.gmdiias.controle.linguagem;

import java.util.List;

import javax.transaction.Transactional;

import com.gmdiias.basic.BasicRepository;

@Transactional
public interface LinguagemRepository extends BasicRepository<Linguagem>  {

	List<Linguagem> findTop5ByNomeLikeIgnoreCase(String nome);

}
