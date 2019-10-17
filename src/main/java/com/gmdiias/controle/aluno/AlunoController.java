package com.gmdiias.controle.aluno;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gmdiias.basic.BasicController;

@RestController
@RequestMapping("api/aluno")
public class AlunoController extends BasicController<Aluno, AlunoRepository, AlunoService> {

}
