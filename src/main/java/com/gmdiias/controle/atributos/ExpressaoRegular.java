package com.gmdiias.controle.atributos;

import javax.persistence.Entity;

import com.gmdiias.basic.BasicEntity;

@Entity
public class ExpressaoRegular extends BasicEntity {

	private static final long serialVersionUID = 1L;

	private String expressao;
	
	public ExpressaoRegular() {
		
	}
	
	public ExpressaoRegular(String expressao) {
		this.expressao = expressao;
	}

	public String getExpressao() {
		return expressao;
	}
	
	public void setExpressao(String expressao) {
		this.expressao = expressao;
	}
	
	@Override
	public void mergeEntity(Object received) {
		// TODO Auto-generated method stub
		
	}

}
