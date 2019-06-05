package com.gmdiias.linguagem;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

import com.gmdiias.basic.BasicEntity;
import com.gmdiias.linguagem.logicalthinking.LogicalThinking;

@Entity
public class Linguagem extends BasicEntity { 

	private static final long serialVersionUID = 1L;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private LogicalThinking logicalThinking;
	
	public Linguagem() {
		
	}
	
	public LogicalThinking getLogicalThinking() {
		return logicalThinking;
	}
	
	public void setLogicalThinking(LogicalThinking logicalThinking) {
		this.logicalThinking = logicalThinking;
	}

	@Override
	public void mergeEntity(Object received) {
		// TODO Auto-generated method stub
		
	}

}
