package com.gmdiias.controle.analise;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gmdiias.basic.BasicController;

@RestController
@RequestMapping("api/casoteste")
public class CasoTesteController extends BasicController<CasoTeste, CasoTesteRepository, CasoTesteService> {

}
