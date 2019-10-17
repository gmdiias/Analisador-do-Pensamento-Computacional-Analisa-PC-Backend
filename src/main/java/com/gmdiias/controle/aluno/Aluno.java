package com.gmdiias.controle.aluno;

import javax.persistence.Entity;

import com.gmdiias.basic.BasicEntity;

@Entity
public class Aluno extends BasicEntity {
	
	private static final long serialVersionUID = 1L;
	private String nome;
	private String registro;
	
	public Aluno() {
		
	}
	
	public Aluno(String nome, String registro) {
		this.nome = nome;
		this.registro = registro;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getRegistro() {
		return registro;
	}
	
	public void setRegistro(String registro) {
		this.registro = registro;
	}

}
