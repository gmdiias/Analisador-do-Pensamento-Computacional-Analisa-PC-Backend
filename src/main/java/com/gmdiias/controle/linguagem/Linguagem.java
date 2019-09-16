package com.gmdiias.controle.linguagem;

import javax.persistence.Entity;

import com.gmdiias.basic.BasicEntity;

@Entity
public class Linguagem extends BasicEntity {

	private static final long serialVersionUID = 1L;

	private String nome;

	// Esta parte refere-se a avaliacao da Logica
	private String condicional;
	private String condicionalComplexo;
	private String operadorLogico;

	// Esta parte refere-se a Controle de Fluxo
	private String sequencial;
	private String loop;
	private String loopComplexo;

	// Esta parte refere-se a Representação de Dados
	private String valorFixo;
	private String variavel;
	private String lista;

	// Esta parte refere-se a Abstração e Decomposição
	private String sequenciais;
	private String multiFuncoes;
	private String modulos;

	public Linguagem() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCondicional() {
		return condicional;
	}

	public void setCondicional(String condicional) {
		this.condicional = condicional;
	}

	public String getCondicionalComplexo() {
		return condicionalComplexo;
	}

	public void setCondicionalComplexo(String condicionalComplexo) {
		this.condicionalComplexo = condicionalComplexo;
	}

	public String getOperadorLogico() {
		return operadorLogico;
	}

	public void setOperadorLogico(String operadorLogico) {
		this.operadorLogico = operadorLogico;
	}

	public String getSequencial() {
		return sequencial;
	}

	public void setSequencial(String sequencial) {
		this.sequencial = sequencial;
	}

	public String getLoop() {
		return loop;
	}

	public void setLoop(String loop) {
		this.loop = loop;
	}

	public String getLoopComplexo() {
		return loopComplexo;
	}

	public void setLoopComplexo(String loopComplexo) {
		this.loopComplexo = loopComplexo;
	}

	public String getValorFixo() {
		return valorFixo;
	}

	public void setValorFixo(String valorFixo) {
		this.valorFixo = valorFixo;
	}

	public String getVariavel() {
		return variavel;
	}

	public void setVariavel(String variavel) {
		this.variavel = variavel;
	}

	public String getLista() {
		return lista;
	}

	public void setLista(String lista) {
		this.lista = lista;
	}

	public String getSequenciais() {
		return sequenciais;
	}

	public void setSequenciais(String sequenciais) {
		this.sequenciais = sequenciais;
	}

	public String getMultiFuncoes() {
		return multiFuncoes;
	}

	public void setMultiFuncoes(String multiFuncoes) {
		this.multiFuncoes = multiFuncoes;
	}

	public String getModulos() {
		return modulos;
	}

	public void setModulos(String modulos) {
		this.modulos = modulos;
	}

	@Override
	public void mergeEntity(Object received) {
		// TODO Auto-generated method stub

	}

}
