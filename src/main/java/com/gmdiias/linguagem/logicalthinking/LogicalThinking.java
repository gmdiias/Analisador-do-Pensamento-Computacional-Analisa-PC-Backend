package com.gmdiias.linguagem.logicalthinking;

import java.util.List;

import javax.persistence.Entity;

import com.gmdiias.basic.BasicEntity;

@Entity
public class LogicalThinking extends BasicEntity {

	private static final long serialVersionUID = 1L;
	
	private List<String> condicionais;
	private List<String> condicionaisComplexos;
	private List<String> operadoresLogicos;
	
	public LogicalThinking() {
		
	}
	
	public LogicalThinking(List<String> condicionais, List<String> condicionaisComplexos,
			List<String> operadoresLogicos) {
		this.condicionais = condicionais;
		this.condicionaisComplexos = condicionaisComplexos;
		this.operadoresLogicos = operadoresLogicos;
	}

	public List<String> getCondicionais() {
		return condicionais;
	}
	
	public void setCondicionais(List<String> condicionais) {
		this.condicionais = condicionais;
	}
	
	public List<String> getCondicionaisComplexos() {
		return condicionaisComplexos;
	}
	
	public void setCondicionaisComplexos(List<String> condicionaisComplexos) {
		this.condicionaisComplexos = condicionaisComplexos;
	}
	
	public List<String> getOperadoresLogicos() {
		return operadoresLogicos;
	}
	
	public void setOperadoresLogicos(List<String> operadoresLogicos) {
		this.operadoresLogicos = operadoresLogicos;
	}
	
	@Override
	public void mergeEntity(Object received) {
		// TODO Auto-generated method stub
	}
	
}
