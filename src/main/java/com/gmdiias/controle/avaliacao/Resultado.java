package com.gmdiias.controle.avaliacao;

import javax.persistence.Entity;

import com.gmdiias.basic.BasicEntity;

@Entity
public class Resultado extends BasicEntity {

	private static final long serialVersionUID = 1L;
	
	private int avaliacao;
	
	public Resultado() {
	}
	
	public int getCondicional() {
		return avaliacao;
	}
	
	public void setCondicional(int condicional) {
		this.avaliacao = condicional;
	}

	@Override
	public void mergeEntity(Object received) {
		// TODO Auto-generated method stub
		
	}
	
	
}
