package com.res.emorobots.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the DefinitionInterpretation database table.
 * 
 */
@Entity
@Table(name="DefinitionInterpretation")
@NamedQuery(name="DefinitionInterpretation.findAll", query="SELECT d FROM DefinitionInterpretation d")
public class DefinitionInterpretation implements Serializable {
	private static final long serialVersionUID = 1L;
	private String definitioninterpretationId;
	private BigInteger candidateId;
	private float candidatethreshold;
	private String content;
	private Date lastaccess;
	private BigInteger numaccess;
	private WeightNorm weightNorm;
	private Definition definition;

	public DefinitionInterpretation() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	public String getDefinitioninterpretationId() {
		return this.definitioninterpretationId;
	}

	public void setDefinitioninterpretationId(String definitioninterpretationId) {
		this.definitioninterpretationId = definitioninterpretationId;
	}


	@Column(nullable=false)
	public BigInteger getCandidateId() {
		return this.candidateId;
	}

	public void setCandidateId(BigInteger candidateId) {
		this.candidateId = candidateId;
	}


	@Column(nullable=false)
	public float getCandidatethreshold() {
		return this.candidatethreshold;
	}

	public void setCandidatethreshold(float candidatethreshold) {
		this.candidatethreshold = candidatethreshold;
	}


	@Column(length=4096)
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
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


	//bi-directional many-to-one association to WeightNorm
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="definitioninterpretationId", referencedColumnName="entityNormId", nullable=false, insertable=false, updatable=false),
		@JoinColumn(name="entityName", referencedColumnName="entityName", nullable=false)
		})
	public WeightNorm getWeightNorm() {
		return this.weightNorm;
	}

	public void setWeightNorm(WeightNorm weightNorm) {
		this.weightNorm = weightNorm;
	}


	//bi-directional many-to-one association to Definition
	@ManyToOne
	@JoinColumn(name="definitionId", nullable=false)
	public Definition getDefinition() {
		return this.definition;
	}

	public void setDefinition(Definition definition) {
		this.definition = definition;
	}

}