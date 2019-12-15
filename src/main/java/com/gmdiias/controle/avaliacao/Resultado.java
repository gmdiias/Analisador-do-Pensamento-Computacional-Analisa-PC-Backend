package com.gmdiias.controle.avaliacao;

import javax.persistence.Entity;

import com.gmdiias.basic.BasicEntity;

@Entity
public class Resultado extends BasicEntity {

	private static final long serialVersionUID = 1L;

	private boolean hasCondicional;
	private boolean hasCondicionalComplexo;
	private boolean hasOperadores;

	private boolean hasLoops;
	private boolean hasLoopsComplexo;
	private boolean hasSequencial;

	private boolean hasValoresFixos;
	private boolean hasVariaveis;
	private boolean hasListas;

	private boolean hasSequenciais;
	private boolean hasMultiFuncoes;
	private boolean hasModulos;

	public Resultado() {
	}

	public Resultado(boolean hasCondicional, boolean hasCondicionalComplexo, boolean hasOperadores, boolean hasLoops,
			boolean hasLoopsComplexo, boolean hasSequencial, boolean hasValoresFixos, boolean hasVariaveis,
			boolean hasListas, boolean hasSequenciais, boolean hasMultiFuncoes, boolean hasModulos) {
		super();
		this.hasCondicional = hasCondicional;
		this.hasCondicionalComplexo = hasCondicionalComplexo;
		this.hasOperadores = hasOperadores;
		this.hasLoops = hasLoops;
		this.hasLoopsComplexo = hasLoopsComplexo;
		this.hasSequencial = hasSequencial;
		this.hasValoresFixos = hasValoresFixos;
		this.hasVariaveis = hasVariaveis;
		this.hasListas = hasListas;
		this.hasSequenciais = hasSequenciais;
		this.hasMultiFuncoes = hasMultiFuncoes;
		this.hasModulos = hasModulos;
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

	public boolean isHasLoops() {
		return hasLoops;
	}

	public void setHasLoops(boolean hasLoops) {
		this.hasLoops = hasLoops;
	}

	public boolean isHasLoopsComplexo() {
		return hasLoopsComplexo;
	}

	public void setHasLoopsComplexo(boolean hasLoopsComplexo) {
		this.hasLoopsComplexo = hasLoopsComplexo;
	}

	public boolean isHasSequencial() {
		return hasSequencial;
	}

	public void setHasSequencial(boolean hasSequencial) {
		this.hasSequencial = hasSequencial;
	}

	public boolean isHasValoresFixos() {
		return hasValoresFixos;
	}

	public void setHasValoresFixos(boolean hasValoresFixos) {
		this.hasValoresFixos = hasValoresFixos;
	}

	public boolean isHasVariaveis() {
		return hasVariaveis;
	}

	public void setHasVariaveis(boolean hasVariaveis) {
		this.hasVariaveis = hasVariaveis;
	}

	public boolean isHasListas() {
		return hasListas;
	}

	public void setHasListas(boolean hasListas) {
		this.hasListas = hasListas;
	}

	public boolean isHasSequenciais() {
		return hasSequenciais;
	}

	public void setHasSequenciais(boolean hasSequenciais) {
		this.hasSequenciais = hasSequenciais;
	}

	public boolean isHasMultiFuncoes() {
		return hasMultiFuncoes;
	}

	public void setHasMultiFuncoes(boolean hasMultiFuncoes) {
		this.hasMultiFuncoes = hasMultiFuncoes;
	}

	public boolean isHasModulos() {
		return hasModulos;
	}

	public void setHasModulos(boolean hasModulos) {
		this.hasModulos = hasModulos;
	}

	public int getResultadoLogica() {
		int total = 0;
		total += hasOperadores ? 1 : 0;
		total += hasCondicional ? 1 : 0;
		total += hasCondicionalComplexo ? 1 : 0;
		return total;
	}

	public int getResultadoControleFluxo() {
		int total = 0;
		total += hasLoops ? 1 : 0;
		total += hasLoopsComplexo ? 1 : 0;
		total += hasSequencial ? 1 : 0;
		return total;
	}

	public int getResultadoRepresentacao() {
		int total = 0;
		total += hasValoresFixos ? 1 : 0;
		total += hasVariaveis ? 1 : 0;
		total += hasListas ? 1 : 0;
		return total;
	}

	public int getResultadoAbstracao() {
		int total = 0;
		total += hasSequenciais ? 1 : 0;
		total += hasMultiFuncoes ? 1 : 0;
		total += hasModulos ? 1 : 0;
		return total;
	}

	public int getResultadoGeral() {
		return getResultadoAbstracao() + getResultadoControleFluxo() + getResultadoLogica()
				+ getResultadoRepresentacao();
	}

}
