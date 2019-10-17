package com.gmdiias.controle.analise;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.gmdiias.basic.BasicEntity;
import com.gmdiias.controle.aluno.Aluno;
import com.gmdiias.controle.avaliacao.Resultado;
import com.gmdiias.controle.linguagem.Linguagem;

@Entity
public class CasoTeste extends BasicEntity {

	private static final long serialVersionUID = 1L;

	private String nome;
	@ManyToOne
	private Linguagem linguagem;
	@Column(length = 5000)
	private String codigo;
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Resultado avaliacao;
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Aluno aluno;
	
	public CasoTeste() {
		
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
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

	public Aluno getAluno() {
		return aluno;
	}
	
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
}
