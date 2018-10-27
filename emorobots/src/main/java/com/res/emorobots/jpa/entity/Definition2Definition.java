package com.res.emorobots.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the Definition2Definition database table.
 * 
 */
@Entity
@NamedQuery(name="Definition2Definition.findAll", query="SELECT d FROM Definition2Definition d")
public class Definition2Definition implements Serializable {
	private static final long serialVersionUID = 1L;
	private String definition2definitionId;
	private String entityName;
	private Date lastaccess;
	private BigInteger numaccess;
	private String text;
	private Definition definition1;
	private Definition definition2;

	public Definition2Definition() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public String getDefinition2definitionId() {
		return this.definition2definitionId;
	}

	public void setDefinition2definitionId(String definition2definitionId) {
		this.definition2definitionId = definition2definitionId;
	}


	public String getEntityName() {
		return this.entityName;
	}

	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}


	@Temporal(TemporalType.TIMESTAMP)
	public Date getLastaccess() {
		return this.lastaccess;
	}

	public void setLastaccess(Date lastaccess) {
		this.lastaccess = lastaccess;
	}


	public BigInteger getNumaccess() {
		return this.numaccess;
	}

	public void setNumaccess(BigInteger numaccess) {
		this.numaccess = numaccess;
	}


	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}


	//bi-directional many-to-one association to Definition
	@ManyToOne
	@JoinColumn(name="definition2Id")
	public Definition getDefinition1() {
		return this.definition1;
	}

	public void setDefinition1(Definition definition1) {
		this.definition1 = definition1;
	}


	//bi-directional many-to-one association to Definition
	@ManyToOne
	@JoinColumn(name="definitionId")
	public Definition getDefinition2() {
		return this.definition2;
	}

	public void setDefinition2(Definition definition2) {
		this.definition2 = definition2;
	}

}