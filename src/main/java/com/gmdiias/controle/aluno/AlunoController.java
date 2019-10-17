package com.gmdiias.controle.aluno;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gmdiias.basic.BasicController;

@RestController
@RequestMapping("api/aluno")
public class AlunoController extends BasicController<Aluno, AlunoRepository, AlunoService> {

	@GetMapping("autocomplete/{filtro}")
	public ResponseEntity<List<Aluno>> autocomplete(@PathVariable String filtro) {
		
		List<Aluno> list = service.findAutocomplete(filtro);
		return ResponseEntity.ok().body(list);
	}
	
}
