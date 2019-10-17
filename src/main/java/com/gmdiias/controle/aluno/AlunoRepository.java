package com.gmdiias.controle.aluno;

import java.util.List;

import com.gmdiias.basic.BasicRepository;

public interface AlunoRepository extends BasicRepository<Aluno> {

	List<Aluno> findTop5ByNomeLikeIgnoreCaseOrRegistroLikeIgnoreCase(String nome, String registro);
	
}
