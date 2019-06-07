package com.gmdiias.controle.linguagem;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.gmdiias.basic.BasicService;

@Service
@Transactional
public class LinguagemService extends BasicService<Linguagem, LinguagemRepository>{

}
