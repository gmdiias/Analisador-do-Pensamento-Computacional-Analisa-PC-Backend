package com.gmdiias.linguagem;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gmdiias.basic.BasicController;

@RestController
@RequestMapping("api/linguagem")
public class LinguagemController extends BasicController<Linguagem, LinguagemRepository, LinguagemService> {

}
