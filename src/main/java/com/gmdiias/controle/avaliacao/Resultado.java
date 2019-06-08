package com.gmdiias.controle.avaliacao;

import javax.persistence.Entity;

import com.gmdiias.basic.BasicEntity;

@Entity
public class Resultado extends BasicEntity {

	private static final long serialVersionUID = 1L;
	
	private boolean hasCondicional;
	private boolean hasCondicionalComplexo;
	private boolean hasOperadores;
	
	public Resultado() {
	}
	
	public boolean getHasCondicional() {
		return hasCondicional;
	}
	
	public void setHasCondicional(boolean hasCondicional) {
		this.hasCondicional = hasCondicional;
	}

	public boolean isHasCondicionalComplexo() {
		return hasCondicionalComplexo;
	}

	public void setHasCondicionalComplexo(boolean hasCondicionalComplexo) {
		this.hasCondicionalComplexo = hasCondicionalComplexo;
	}

	public boolean isHasOperadores() {
		return hasOperadores;
	}

	public void setHasOperadores(boolean hasOperadores) {
		this.hasOperadores = hasOperadores;
	}
	
	public int getResultadoLogica() {
		int total = 0;
		total += hasOperadores ? 1 : 0;
		total += hasCondicional ? 1 : 0;
		total += hasCondicionalComplexo ? 1 : 0;
		return total;
	}

	@Override
	public void mergeEntity(Object received) {
		// TODO Auto-generated method stub
		
	}
	
	
}
