package com.gmdiias.linguagem;

import javax.transaction.Transactional;

import com.gmdiias.basic.BasicRepository;

@Transactional
public interface LinguagemRepository extends BasicRepository<Linguagem>  {

}
