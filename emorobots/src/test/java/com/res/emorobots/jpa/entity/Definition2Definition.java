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
@Table(name="Definition2Definition")
@NamedQuery(name="Definition2Definition.findAll", query="SELECT d FROM Definition2Definition d")
public class Definition2Definition implements Serializable {
	private static final long serialVersionUID = 1L;
	private String definition2definitionId;
	private BigInteger candidateId;
	private BigInteger candidateNormId;
	private Date lastaccess;
	private BigInteger numaccess;
	private String text;
	private Definition definition1;
	private Definition definition2;
	private WeightNorm weightNorm;

	public Definition2Definition() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	public String getDefinition2definitionId() {
		return this.definition2definitionId;
	}

	public void setDefinition2definitionId(String definition2definitionId) {
		this.definition2definitionId = definition2definitionId;
	}


	@Column(nullable=false)
	public BigInteger getCandidateId() {
		return this.candidateId;
	}

	public void setCandidateId(BigInteger candidateId) {
		this.candidateId = candidateId;
	}


	@Column(nullable=false)
	public BigInteger getCandidateNormId() {
		return this.candidateNormId;
	}

	public void setCandidateNormId(BigInteger candidateNormId) {
		this.candidateNormId = candidateNormId;
	}


	@Temporal(TemporalType.TIMESTAMP)
	public Date getLastaccess() {
		return this.lastaccess;
	}

	public void setLastaccess(Date lastaccess) {
		this.lastaccess = lastaccess;
	}


	@Column(nullable=false)
	public BigInteger getNumaccess() {
		return this.numaccess;
	}

	public void setNumaccess(BigInteger numaccess) {
		this.numaccess = numaccess;
	}


	@Column(length=300)
	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}


	//bi-directional many-to-one association to Definition
	@ManyToOne
	@JoinColumn(name="definition2Id", nullable=false)
	public Definition getDefinition1() {
		return this.definition1;
	}

	public void setDefinition1(Definition definition1) {
		this.definition1 = definition1;
	}


	//bi-directional many-to-one association to Definition
	@ManyToOne
	@JoinColumn(name="definitionId", nullable=false)
	public Definition getDefinition2() {
		return this.definition2;
	}

	public void setDefinition2(Definition definition2) {
		this.definition2 = definition2;
	}


	//bi-directional many-to-one association to WeightNorm
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="definition2definitionId", referencedColumnName="entityNormId", nullable=false, insertable=false, updatable=false),
		@JoinColumn(name="entityName", referencedColumnName="entityName", nullable=false)
		})
	public WeightNorm getWeightNorm() {
		return this.weightNorm;
	}

	public void setWeightNorm(WeightNorm weightNorm) {
		this.weightNorm = weightNorm;
	}

}