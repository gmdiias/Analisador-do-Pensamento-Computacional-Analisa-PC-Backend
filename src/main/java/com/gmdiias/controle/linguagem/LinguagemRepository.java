package com.gmdiias.controle.linguagem;

import javax.transaction.Transactional;

import com.gmdiias.basic.BasicRepository;

@Transactional
public interface LinguagemRepository extends BasicRepository<Linguagem>  {

}
