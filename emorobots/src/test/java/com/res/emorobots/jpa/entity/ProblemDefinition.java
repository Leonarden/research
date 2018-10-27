package com.res.emorobots.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;
import java.util.List;


/**
 * The persistent class for the ProblemDefinition database table.
 * 
 */
@Entity
@Table(name="ProblemDefinition")
@NamedQuery(name="ProblemDefinition.findAll", query="SELECT p FROM ProblemDefinition p")
public class ProblemDefinition implements Serializable {
	private static final long serialVersionUID = 1L;
	private String problemdefinitionId;
	private BigInteger candidateId;
	private BigInteger candidateNormId;
	private Date lastaccess;
	private BigInteger numaccess;
	private String text;
	private WeightNorm weightNorm;
	private Definition definition;
	private Problem problem;
	private List<ProblemDefinition2ProblemDefinition> problemDefinition2problemDefinitions1;
	private List<ProblemDefinition2ProblemDefinition> problemDefinition2problemDefinitions2;

	public ProblemDefinition() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	public String getProblemdefinitionId() {
		return this.problemdefinitionId;
	}

	public void setProblemdefinitionId(String problemdefinitionId) {
		this.problemdefinitionId = problemdefinitionId;
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
		@JoinColumn(name="problemdefinitionId", referencedColumnName="entityNormId", nullable=false, insertable=false, updatable=false)
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


	//bi-directional many-to-one association to Problem
	@ManyToOne
	@JoinColumn(name="problemId", nullable=false)
	public Problem getProblem() {
		return this.problem;
	}

	public void setProblem(Problem problem) {
		this.problem = problem;
	}


	//bi-directional many-to-one association to ProblemDefinition2ProblemDefinition
	@OneToMany(mappedBy="problemDefinition1")
	public List<ProblemDefinition2ProblemDefinition> getProblemDefinition2problemDefinitions1() {
		return this.problemDefinition2problemDefinitions1;
	}

	public void setProblemDefinition2problemDefinitions1(List<ProblemDefinition2ProblemDefinition> problemDefinition2problemDefinitions1) {
		this.problemDefinition2problemDefinitions1 = problemDefinition2problemDefinitions1;
	}

	public ProblemDefinition2ProblemDefinition addProblemDefinition2problemDefinitions1(ProblemDefinition2ProblemDefinition problemDefinition2problemDefinitions1) {
		getProblemDefinition2problemDefinitions1().add(problemDefinition2problemDefinitions1);
		problemDefinition2problemDefinitions1.setProblemDefinition1(this);

		return problemDefinition2problemDefinitions1;
	}

	public ProblemDefinition2ProblemDefinition removeProblemDefinition2problemDefinitions1(ProblemDefinition2ProblemDefinition problemDefinition2problemDefinitions1) {
		getProblemDefinition2problemDefinitions1().remove(problemDefinition2problemDefinitions1);
		problemDefinition2problemDefinitions1.setProblemDefinition1(null);

		return problemDefinition2problemDefinitions1;
	}


	//bi-directional many-to-one association to ProblemDefinition2ProblemDefinition
	@OneToMany(mappedBy="problemDefinition2")
	public List<ProblemDefinition2ProblemDefinition> getProblemDefinition2problemDefinitions2() {
		return this.problemDefinition2problemDefinitions2;
	}

	public void setProblemDefinition2problemDefinitions2(List<ProblemDefinition2ProblemDefinition> problemDefinition2problemDefinitions2) {
		this.problemDefinition2problemDefinitions2 = problemDefinition2problemDefinitions2;
	}

	public ProblemDefinition2ProblemDefinition addProblemDefinition2problemDefinitions2(ProblemDefinition2ProblemDefinition problemDefinition2problemDefinitions2) {
		getProblemDefinition2problemDefinitions2().add(problemDefinition2problemDefinitions2);
		problemDefinition2problemDefinitions2.setProblemDefinition2(this);

		return problemDefinition2problemDefinitions2;
	}

	public ProblemDefinition2ProblemDefinition removeProblemDefinition2problemDefinitions2(ProblemDefinition2ProblemDefinition problemDefinition2problemDefinitions2) {
		getProblemDefinition2problemDefinitions2().remove(problemDefinition2problemDefinitions2);
		problemDefinition2problemDefinitions2.setProblemDefinition2(null);

		return problemDefinition2problemDefinitions2;
	}

}