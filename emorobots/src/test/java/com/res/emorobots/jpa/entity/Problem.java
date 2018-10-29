package com.res.emorobots.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;
import java.math.BigInteger;
import java.util.List;


/**
 * The persistent class for the Problem database table.
 * 
 */
@Entity
@Table(name="Problem")
@NamedQuery(name="Problem.findAll", query="SELECT p FROM Problem p")
public class Problem implements Serializable {
	private static final long serialVersionUID = 1L;
	private String problemId;
	private BigInteger candidateId;
	private BigInteger candidateNormId;
	private Timestamp ended;
	private Date lastaccess;
	private BigInteger numaccess;
	private Timestamp started;
	private String status;
	private Timestamp telapsed;
	private String text;
	private List<Definition> definitions;
	private WeightNorm weightNorm;
	private List<Problem2Problem> problem2problems1;
	private List<Problem2Problem> problem2problems2;
	private List<ProblemDefinition> problemDefinitions;
	private List<ProblemSolution> problemSolutions;
	private List<Solution> solutions;

	public Problem() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	public String getProblemId() {
		return this.problemId;
	}

	public void setProblemId(String problemId) {
		this.problemId = problemId;
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


	@Column(nullable=false)
	public Timestamp getEnded() {
		return this.ended;
	}

	public void setEnded(Timestamp ended) {
		this.ended = ended;
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


	@Column(nullable=false)
	public Timestamp getStarted() {
		return this.started;
	}

	public void setStarted(Timestamp started) {
		this.started = started;
	}


	@Column(length=30)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


	@Column(nullable=false)
	public Timestamp getTelapsed() {
		return this.telapsed;
	}

	public void setTelapsed(Timestamp telapsed) {
		this.telapsed = telapsed;
	}


	@Column(length=200)
	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}


	//bi-directional many-to-one association to Definition
	@OneToMany(mappedBy="problem")
	public List<Definition> getDefinitions() {
		return this.definitions;
	}

	public void setDefinitions(List<Definition> definitions) {
		this.definitions = definitions;
	}

	public Definition addDefinition(Definition definition) {
		getDefinitions().add(definition);
		definition.setProblem(this);

		return definition;
	}

	public Definition removeDefinition(Definition definition) {
		getDefinitions().remove(definition);
		definition.setProblem(null);

		return definition;
	}


	//bi-directional many-to-one association to WeightNorm
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="entityName", referencedColumnName="entityName", nullable=false),
		@JoinColumn(name="problemId", referencedColumnName="entityNormId", nullable=false, insertable=false, updatable=false)
		})
	public WeightNorm getWeightNorm() {
		return this.weightNorm;
	}

	public void setWeightNorm(WeightNorm weightNorm) {
		this.weightNorm = weightNorm;
	}


	//bi-directional many-to-one association to Problem2Problem
	@OneToMany(mappedBy="problem1")
	public List<Problem2Problem> getProblem2problems1() {
		return this.problem2problems1;
	}

	public void setProblem2problems1(List<Problem2Problem> problem2problems1) {
		this.problem2problems1 = problem2problems1;
	}

	public Problem2Problem addProblem2problems1(Problem2Problem problem2problems1) {
		getProblem2problems1().add(problem2problems1);
		problem2problems1.setProblem1(this);

		return problem2problems1;
	}

	public Problem2Problem removeProblem2problems1(Problem2Problem problem2problems1) {
		getProblem2problems1().remove(problem2problems1);
		problem2problems1.setProblem1(null);

		return problem2problems1;
	}


	//bi-directional many-to-one association to Problem2Problem
	@OneToMany(mappedBy="problem2")
	public List<Problem2Problem> getProblem2problems2() {
		return this.problem2problems2;
	}

	public void setProblem2problems2(List<Problem2Problem> problem2problems2) {
		this.problem2problems2 = problem2problems2;
	}

	public Problem2Problem addProblem2problems2(Problem2Problem problem2problems2) {
		getProblem2problems2().add(problem2problems2);
		problem2problems2.setProblem2(this);

		return problem2problems2;
	}

	public Problem2Problem removeProblem2problems2(Problem2Problem problem2problems2) {
		getProblem2problems2().remove(problem2problems2);
		problem2problems2.setProblem2(null);

		return problem2problems2;
	}


	//bi-directional many-to-one association to ProblemDefinition
	@OneToMany(mappedBy="problem")
	public List<ProblemDefinition> getProblemDefinitions() {
		return this.problemDefinitions;
	}

	public void setProblemDefinitions(List<ProblemDefinition> problemDefinitions) {
		this.problemDefinitions = problemDefinitions;
	}

	public ProblemDefinition addProblemDefinition(ProblemDefinition problemDefinition) {
		getProblemDefinitions().add(problemDefinition);
		problemDefinition.setProblem(this);

		return problemDefinition;
	}

	public ProblemDefinition removeProblemDefinition(ProblemDefinition problemDefinition) {
		getProblemDefinitions().remove(problemDefinition);
		problemDefinition.setProblem(null);

		return problemDefinition;
	}


	//bi-directional many-to-one association to ProblemSolution
	@OneToMany(mappedBy="problem")
	public List<ProblemSolution> getProblemSolutions() {
		return this.problemSolutions;
	}

	public void setProblemSolutions(List<ProblemSolution> problemSolutions) {
		this.problemSolutions = problemSolutions;
	}

	public ProblemSolution addProblemSolution(ProblemSolution problemSolution) {
		getProblemSolutions().add(problemSolution);
		problemSolution.setProblem(this);

		return problemSolution;
	}

	public ProblemSolution removeProblemSolution(ProblemSolution problemSolution) {
		getProblemSolutions().remove(problemSolution);
		problemSolution.setProblem(null);

		return problemSolution;
	}


	//bi-directional many-to-one association to Solution
	@OneToMany(mappedBy="problem")
	public List<Solution> getSolutions() {
		return this.solutions;
	}

	public void setSolutions(List<Solution> solutions) {
		this.solutions = solutions;
	}

	public Solution addSolution(Solution solution) {
		getSolutions().add(solution);
		solution.setProblem(this);

		return solution;
	}

	public Solution removeSolution(Solution solution) {
		getSolutions().remove(solution);
		solution.setProblem(null);

		return solution;
	}

}