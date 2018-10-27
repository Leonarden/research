package com.res.emorobots.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;
import java.util.List;


/**
 * The persistent class for the ProblemSolution database table.
 * 
 */
@Entity
@Table(name="ProblemSolution")
@NamedQuery(name="ProblemSolution.findAll", query="SELECT p FROM ProblemSolution p")
public class ProblemSolution implements Serializable {
	private static final long serialVersionUID = 1L;
	private String problemsolutionId;
	private BigInteger candidateId;
	private BigInteger candidateNormId;
	private Date lastaccess;
	private BigInteger numaccess;
	private String text;
	private WeightNorm weightNorm;
	private Problem problem;
	private Solution solution;
	private List<ProblemSolution2ProblemSolution> problemSolution2problemSolutions1;
	private List<ProblemSolution2ProblemSolution> problemSolution2problemSolutions2;

	public ProblemSolution() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	public String getProblemsolutionId() {
		return this.problemsolutionId;
	}

	public void setProblemsolutionId(String problemsolutionId) {
		this.problemsolutionId = problemsolutionId;
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
		@JoinColumn(name="problemsolutionId", referencedColumnName="entityNormId", nullable=false, insertable=false, updatable=false)
		})
	public WeightNorm getWeightNorm() {
		return this.weightNorm;
	}

	public void setWeightNorm(WeightNorm weightNorm) {
		this.weightNorm = weightNorm;
	}


	//bi-directional many-to-one association to Problem
	@ManyToOne
	@JoinColumn(name="problemId", nullable=false)
	public Problem getProblem() {
		return this.problem;
	}

	public void setProblem(Problem problem) {
		this.problem = problem;
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


	//bi-directional many-to-one association to ProblemSolution2ProblemSolution
	@OneToMany(mappedBy="problemSolution1")
	public List<ProblemSolution2ProblemSolution> getProblemSolution2problemSolutions1() {
		return this.problemSolution2problemSolutions1;
	}

	public void setProblemSolution2problemSolutions1(List<ProblemSolution2ProblemSolution> problemSolution2problemSolutions1) {
		this.problemSolution2problemSolutions1 = problemSolution2problemSolutions1;
	}

	public ProblemSolution2ProblemSolution addProblemSolution2problemSolutions1(ProblemSolution2ProblemSolution problemSolution2problemSolutions1) {
		getProblemSolution2problemSolutions1().add(problemSolution2problemSolutions1);
		problemSolution2problemSolutions1.setProblemSolution1(this);

		return problemSolution2problemSolutions1;
	}

	public ProblemSolution2ProblemSolution removeProblemSolution2problemSolutions1(ProblemSolution2ProblemSolution problemSolution2problemSolutions1) {
		getProblemSolution2problemSolutions1().remove(problemSolution2problemSolutions1);
		problemSolution2problemSolutions1.setProblemSolution1(null);

		return problemSolution2problemSolutions1;
	}


	//bi-directional many-to-one association to ProblemSolution2ProblemSolution
	@OneToMany(mappedBy="problemSolution2")
	public List<ProblemSolution2ProblemSolution> getProblemSolution2problemSolutions2() {
		return this.problemSolution2problemSolutions2;
	}

	public void setProblemSolution2problemSolutions2(List<ProblemSolution2ProblemSolution> problemSolution2problemSolutions2) {
		this.problemSolution2problemSolutions2 = problemSolution2problemSolutions2;
	}

	public ProblemSolution2ProblemSolution addProblemSolution2problemSolutions2(ProblemSolution2ProblemSolution problemSolution2problemSolutions2) {
		getProblemSolution2problemSolutions2().add(problemSolution2problemSolutions2);
		problemSolution2problemSolutions2.setProblemSolution2(this);

		return problemSolution2problemSolutions2;
	}

	public ProblemSolution2ProblemSolution removeProblemSolution2problemSolutions2(ProblemSolution2ProblemSolution problemSolution2problemSolutions2) {
		getProblemSolution2problemSolutions2().remove(problemSolution2problemSolutions2);
		problemSolution2problemSolutions2.setProblemSolution2(null);

		return problemSolution2problemSolutions2;
	}

}