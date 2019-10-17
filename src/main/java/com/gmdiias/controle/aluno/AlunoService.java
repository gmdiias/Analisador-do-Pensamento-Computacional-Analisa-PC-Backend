package com.gmdiias.controle.aluno;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.gmdiias.basic.BasicService;

@Service
@Transactional
public class AlunoService extends BasicService<Aluno, AlunoRepository> {

	public List<Aluno> findAutocomplete(String search) {
		search = "%" + search + "%";
		return repository.findTop5ByNomeLikeIgnoreCaseOrRegistroLikeIgnoreCase(search, search);
	}
	
}
