package com.res.emorobots.jpa.entity;

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
@Table(name="Definition")
@NamedQuery(name="Definition.findAll", query="SELECT d FROM Definition d")
public class Definition implements Serializable {
	private static final long serialVersionUID = 1L;
	private String definitionId;
	private BigInteger candidateId;
	private float candidatethreshold;
	private Date lastaccess;
	private BigInteger numaccess;
	private String text;
	private WeightNorm weightNorm;
	private Problem problem;
	private List<Definition2Definition> definition2definitions1;
	private List<Definition2Definition> definition2definitions2;
	private List<DefinitionInterpretation> definitionInterpretations;
	private List<ProblemDefinition> problemDefinitions;

	public Definition() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	public String getDefinitionId() {
		return this.definitionId;
	}

	public void setDefinitionId(String definitionId) {
		this.definitionId = definitionId;
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


	@Column(length=200)
	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}


	//bi-directional many-to-one association to WeightNorm
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="definitionId", referencedColumnName="entityNormId", nullable=false, insertable=false, updatable=false),
		@JoinColumn(name="entityName", referencedColumnName="entityName", nullable=false)
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


	//bi-directional many-to-one association to Definition2Definition
	@OneToMany(mappedBy="definition1")
	public List<Definition2Definition> getDefinition2definitions1() {
		return this.definition2definitions1;
	}

	public void setDefinition2definitions1(List<Definition2Definition> definition2definitions1) {
		this.definition2definitions1 = definition2definitions1;
	}

	public Definition2Definition addDefinition2definitions1(Definition2Definition definition2definitions1) {
		getDefinition2definitions1().add(definition2definitions1);
		definition2definitions1.setDefinition1(this);

		return definition2definitions1;
	}

	public Definition2Definition removeDefinition2definitions1(Definition2Definition definition2definitions1) {
		getDefinition2definitions1().remove(definition2definitions1);
		definition2definitions1.setDefinition1(null);

		return definition2definitions1;
	}


	//bi-directional many-to-one association to Definition2Definition
	@OneToMany(mappedBy="definition2")
	public List<Definition2Definition> getDefinition2definitions2() {
		return this.definition2definitions2;
	}

	public void setDefinition2definitions2(List<Definition2Definition> definition2definitions2) {
		this.definition2definitions2 = definition2definitions2;
	}

	public Definition2Definition addDefinition2definitions2(Definition2Definition definition2definitions2) {
		getDefinition2definitions2().add(definition2definitions2);
		definition2definitions2.setDefinition2(this);

		return definition2definitions2;
	}

	public Definition2Definition removeDefinition2definitions2(Definition2Definition definition2definitions2) {
		getDefinition2definitions2().remove(definition2definitions2);
		definition2definitions2.setDefinition2(null);

		return definition2definitions2;
	}


	//bi-directional many-to-one association to DefinitionInterpretation
	@OneToMany(mappedBy="definition")
	public List<DefinitionInterpretation> getDefinitionInterpretations() {
		return this.definitionInterpretations;
	}

	public void setDefinitionInterpretations(List<DefinitionInterpretation> definitionInterpretations) {
		this.definitionInterpretations = definitionInterpretations;
	}

	public DefinitionInterpretation addDefinitionInterpretation(DefinitionInterpretation definitionInterpretation) {
		getDefinitionInterpretations().add(definitionInterpretation);
		definitionInterpretation.setDefinition(this);

		return definitionInterpretation;
	}

	public DefinitionInterpretation removeDefinitionInterpretation(DefinitionInterpretation definitionInterpretation) {
		getDefinitionInterpretations().remove(definitionInterpretation);
		definitionInterpretation.setDefinition(null);

		return definitionInterpretation;
	}


	//bi-directional many-to-one association to ProblemDefinition
	@OneToMany(mappedBy="definition")
	public List<ProblemDefinition> getProblemDefinitions() {
		return this.problemDefinitions;
	}

	public void setProblemDefinitions(List<ProblemDefinition> problemDefinitions) {
		this.problemDefinitions = problemDefinitions;
	}

	public ProblemDefinition addProblemDefinition(ProblemDefinition problemDefinition) {
		getProblemDefinitions().add(problemDefinition);
		problemDefinition.setDefinition(this);

		return problemDefinition;
	}

	public ProblemDefinition removeProblemDefinition(ProblemDefinition problemDefinition) {
		getProblemDefinitions().remove(problemDefinition);
		problemDefinition.setDefinition(null);

		return problemDefinition;
	}

}