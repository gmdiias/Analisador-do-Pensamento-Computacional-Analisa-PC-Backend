package com.gmdiias.controle.aluno;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.gmdiias.basic.BasicService;

@Service
@Transactional
public class AlunoService extends BasicService<Aluno, AlunoRepository> {

}
