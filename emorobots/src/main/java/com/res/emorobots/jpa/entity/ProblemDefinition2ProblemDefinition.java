package com.res.emorobots.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the ProblemDefinition2ProblemDefinition database table.
 * 
 */
@Entity
@Table(name="ProblemDefinition2ProblemDefinition")
@NamedQuery(name="ProblemDefinition2ProblemDefinition.findAll", query="SELECT p FROM ProblemDefinition2ProblemDefinition p")
public class ProblemDefinition2ProblemDefinition implements Serializable {
	private static final long serialVersionUID = 1L;
	private String problemdefinition2problemdefinitionId;
	private BigInteger candidateId;
	private BigInteger candidateNormId;
	private Date lastaccess;
	private BigInteger numaccess;
	private String text;
	private ProblemDefinition problemDefinition1;
	private ProblemDefinition problemDefinition2;
	private WeightNorm weightNorm;

	public ProblemDefinition2ProblemDefinition() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	public String getProblemdefinition2problemdefinitionId() {
		return this.problemdefinition2problemdefinitionId;
	}

	public void setProblemdefinition2problemdefinitionId(String problemdefinition2problemdefinitionId) {
		this.problemdefinition2problemdefinitionId = problemdefinition2problemdefinitionId;
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


	//bi-directional many-to-one association to ProblemDefinition
	@ManyToOne
	@JoinColumn(name="problemdefinition2Id", nullable=false)
	public ProblemDefinition getProblemDefinition1() {
		return this.problemDefinition1;
	}

	public void setProblemDefinition1(ProblemDefinition problemDefinition1) {
		this.problemDefinition1 = problemDefinition1;
	}


	//bi-directional many-to-one association to ProblemDefinition
	@ManyToOne
	@JoinColumn(name="problemdefinitionId", nullable=false)
	public ProblemDefinition getProblemDefinition2() {
		return this.problemDefinition2;
	}

	public void setProblemDefinition2(ProblemDefinition problemDefinition2) {
		this.problemDefinition2 = problemDefinition2;
	}


	//bi-directional many-to-one association to WeightNorm
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="entityName", referencedColumnName="entityName", nullable=false),
		@JoinColumn(name="problemdefinition2problemdefinitionId", referencedColumnName="entityNormId", nullable=false, insertable=false, updatable=false)
		})
	public WeightNorm getWeightNorm() {
		return this.weightNorm;
	}

	public void setWeightNorm(WeightNorm weightNorm) {
		this.weightNorm = weightNorm;
	}

}