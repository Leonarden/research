package com.res.emorobot.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;
import java.util.List;


/**
 * The persistent class for the Definition database table.
 * 
 */
@Entity
@NamedQuery(name="Definition.findAll", query="SELECT d FROM Definition d")
public class Definition implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String definitionId;

	@Temporal(TemporalType.TIMESTAMP)
	private Date lastaccess;

	private BigInteger numaccess;

	private String text;

	//bi-directional many-to-one association to Problem
	@ManyToOne
	@JoinColumn(name="problemId")
	private Problem problem;

	//bi-directional many-to-one association to WeightNorm
	@ManyToOne
	@JoinColumn(name="weightNormId")
	private WeightNorm weightNorm;

	//bi-directional many-to-one association to Definition2Definition
	@OneToMany(mappedBy="definition")
	private List<Definition2Definition> definition2definitions;

	public Definition() {
	}

	public String getDefinitionId() {
		return this.definitionId;
	}

	public void setDefinitionId(String definitionId) {
		this.definitionId = definitionId;
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

	public List<Definition2Definition> getDefinition2definitions() {
		return this.definition2definitions;
	}

	public void setDefinition2definitions(List<Definition2Definition> definition2definitions) {
		this.definition2definitions = definition2definitions;
	}

	public Definition2Definition addDefinition2definition(Definition2Definition definition2definition) {
		getDefinition2definitions().add(definition2definition);
		definition2definition.setDefinition(this);

		return definition2definition;
	}

	public Definition2Definition removeDefinition2definition(Definition2Definition definition2definition) {
		getDefinition2definitions().remove(definition2definition);
		definition2definition.setDefinition(null);

		return definition2definition;
	}

}