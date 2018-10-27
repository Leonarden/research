package com.res.emorobot.jpa.entity;

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

	@EmbeddedId
	private Definition2DefinitionPK id;

	@Temporal(TemporalType.TIMESTAMP)
	private Date lastaccess;

	private BigInteger numaccess;

	private String text;

	//bi-directional many-to-one association to Definition
	@ManyToOne
	@JoinColumn(name="definition2Id")
	private Definition definition;

	//bi-directional many-to-one association to Problem
	@ManyToOne
	@JoinColumn(name="problem2Id")
	private Problem problem;

	//bi-directional many-to-one association to WeightNorm
	@ManyToOne
	@JoinColumn(name="weightNormId")
	private WeightNorm weightNorm;

	public Definition2Definition() {
	}

	public Definition2DefinitionPK getId() {
		return this.id;
	}

	public void setId(Definition2DefinitionPK id) {
		this.id = id;
	}

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

	public Definition getDefinition() {
		return this.definition;
	}

	public void setDefinition(Definition definition) {
		this.definition = definition;
	}

	public Problem getProblem() {
		return this.problem;
	}

	public void setProblem(Problem problem) {
		this.problem = problem;
	}

	public WeightNorm getWeightNorm() {
		return this.weightNorm;
	}

	public void setWeightNorm(WeightNorm weightNorm) {
		this.weightNorm = weightNorm;
	}

}