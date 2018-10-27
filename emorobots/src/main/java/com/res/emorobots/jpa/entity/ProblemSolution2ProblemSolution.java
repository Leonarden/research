package com.res.emorobots.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the ProblemSolution2ProblemSolution database table.
 * 
 */
@Entity
@Table(name="ProblemSolution2ProblemSolution")
@NamedQuery(name="ProblemSolution2ProblemSolution.findAll", query="SELECT p FROM ProblemSolution2ProblemSolution p")
public class ProblemSolution2ProblemSolution implements Serializable {
	private static final long serialVersionUID = 1L;
	private String problemsolution2problemsolutionId;
	private BigInteger candidateId;
	private BigInteger candidateNormId;
	private Date lastaccess;
	private BigInteger numaccess;
	private String text;
	private WeightNorm weightNorm;
	private ProblemSolution problemSolution1;
	private ProblemSolution problemSolution2;

	public ProblemSolution2ProblemSolution() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	public String getProblemsolution2problemsolutionId() {
		return this.problemsolution2problemsolutionId;
	}

	public void setProblemsolution2problemsolutionId(String problemsolution2problemsolutionId) {
		this.problemsolution2problemsolutionId = problemsolution2problemsolutionId;
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


	//bi-directional many-to-one association to WeightNorm
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="entityName", referencedColumnName="entityName", nullable=false),
		@JoinColumn(name="problemsolution2problemsolutionId", referencedColumnName="entityNormId", nullable=false, insertable=false, updatable=false)
		})
	public WeightNorm getWeightNorm() {
		return this.weightNorm;
	}

	public void setWeightNorm(WeightNorm weightNorm) {
		this.weightNorm = weightNorm;
	}


	//bi-directional many-to-one association to ProblemSolution
	@ManyToOne
	@JoinColumn(name="problemsolution2Id", nullable=false)
	public ProblemSolution getProblemSolution1() {
		return this.problemSolution1;
	}

	public void setProblemSolution1(ProblemSolution problemSolution1) {
		this.problemSolution1 = problemSolution1;
	}


	//bi-directional many-to-one association to ProblemSolution
	@ManyToOne
	@JoinColumn(name="problemsolutionId", nullable=false)
	public ProblemSolution getProblemSolution2() {
		return this.problemSolution2;
	}

	public void setProblemSolution2(ProblemSolution problemSolution2) {
		this.problemSolution2 = problemSolution2;
	}

}