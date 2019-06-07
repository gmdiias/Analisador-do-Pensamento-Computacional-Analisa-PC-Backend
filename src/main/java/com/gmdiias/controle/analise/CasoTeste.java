package com.gmdiias.controle.analise;

import javax.persistence.Entity;

import com.gmdiias.basic.BasicEntity;
import com.gmdiias.controle.avaliacao.Resultado;
import com.gmdiias.controle.linguagem.Linguagem;

@Entity
public class CasoTeste extends BasicEntity {

	private static final long serialVersionUID = 1L;

	private Linguagem linguagem;
	private String codigo;
	private Resultado avaliacao;
	
	public CasoTeste() {
		
	}
	
	public Linguagem getLinguagem() {
		return linguagem;
	}
	
	public void setLinguagem(Linguagem linguagem) {
		this.linguagem = linguagem;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public Resultado getAvaliacao() {
		return avaliacao;
	}
	
	public void setAvaliacao(Resultado avaliacao) {
		this.avaliacao = avaliacao;
	}
	
	@Override
	public void mergeEntity(Object received) {
		// TODO Auto-generated method stub
		
	}

}
