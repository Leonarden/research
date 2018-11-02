package com.res.emorobots.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the SolutionInterpretation database table.
 * 
 */
@Entity
@Table(name="SolutionInterpretation")
@NamedQuery(name="SolutionInterpretation.findAll", query="SELECT s FROM SolutionInterpretation s")
public class SolutionInterpretation implements Serializable {
	private static final long serialVersionUID = 1L;
	private String solutioninterpretationId;
	private BigInteger candidateId;
	private float candidatethreshold;
	private String content;
	private Date lastaccess;
	private BigInteger numaccess;
	private WeightNorm weightNorm;
	private Solution solution;

	public SolutionInterpretation() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	public String getSolutioninterpretationId() {
		return this.solutioninterpretationId;
	}

	public void setSolutioninterpretationId(String solutioninterpretationId) {
		this.solutioninterpretationId = solutioninterpretationId;
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
		@JoinColumn(name="entityName", referencedColumnName="entityName", nullable=false),
		@JoinColumn(name="solutioninterpretationId", referencedColumnName="entityNormId", nullable=false, insertable=false, updatable=false)
		})
	public WeightNorm getWeightNorm() {
		return this.weightNorm;
	}

	public void setWeightNorm(WeightNorm weightNorm) {
		this.weightNorm = weightNorm;
	}


	//bi-directional many-to-one association to Solution
	@ManyToOne
	@JoinColumn(name="solutionId", nullable=false)
	public Solution getSolution() {
		return this.solution;
	}

	public void setSolution(Solution solution) {
		this.solution = solution;
	}

}