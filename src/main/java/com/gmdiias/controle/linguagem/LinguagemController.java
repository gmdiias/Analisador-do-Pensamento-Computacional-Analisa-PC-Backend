package com.gmdiias.controle.linguagem;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gmdiias.basic.BasicController;

@RestController
@RequestMapping("api/linguagem")
public class LinguagemController extends BasicController<Linguagem, LinguagemRepository, LinguagemService> {

	@GetMapping("autocomplete/{filtro}")
	public ResponseEntity<List<Linguagem>> countAll(@PathVariable String filtro) {
		
		List<Linguagem> list = service.findByNomeLike(filtro);
		return ResponseEntity.ok().body(list);
	}
	
}
