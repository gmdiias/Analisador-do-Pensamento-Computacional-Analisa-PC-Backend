package com.gmdiias.controle.analise;

import javax.transaction.Transactional;

import com.gmdiias.basic.BasicRepository;

@Transactional
public interface CasoTesteRepository extends BasicRepository<CasoTeste> {

}
