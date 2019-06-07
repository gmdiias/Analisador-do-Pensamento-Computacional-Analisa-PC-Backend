package com.gmdiias.controle.linguagem;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.gmdiias.basic.BasicEntity;
import com.gmdiias.controle.atributos.ExpressaoRegular;

@Entity
public class Linguagem extends BasicEntity { 

	private static final long serialVersionUID = 1L;
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "condicionais") 
	private Set<ExpressaoRegular> condicionais;
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "condicionais_complexos") 
	private Set<ExpressaoRegular> condicionaisComplexos;
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "operadores") 
	private Set<ExpressaoRegular> operadoresLogicos;
	
	public Linguagem() {
		
	}
	
	public Set<ExpressaoRegular> getCondicionais() {
		return condicionais;
	}

	public void setCondicionais(Set<ExpressaoRegular> condicionais) {
		this.condicionais = condicionais;
	}

	public Set<ExpressaoRegular> getCondicionaisComplexos() {
		return condicionaisComplexos;
	}

	public void setCondicionaisComplexos(Set<ExpressaoRegular> condicionaisComplexos) {
		this.condicionaisComplexos = condicionaisComplexos;
	}

	public Set<ExpressaoRegular> getOperadoresLogicos() {
		return operadoresLogicos;
	}

	public void setOperadoresLogicos(Set<ExpressaoRegular> operadoresLogicos) {
		this.operadoresLogicos = operadoresLogicos;
	}

	@Override
	public void mergeEntity(Object received) {
		// TODO Auto-generated method stub
		
	}

}
