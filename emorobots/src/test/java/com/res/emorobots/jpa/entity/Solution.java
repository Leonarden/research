package com.res.emorobots.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;
import java.util.List;


/**
 * The persistent class for the Solution database table.
 * 
 */
@Entity
@Table(name="Solution")
@NamedQuery(name="Solution.findAll", query="SELECT s FROM Solution s")
public class Solution implements Serializable {
	private static final long serialVersionUID = 1L;
	private String solutionId;
	private BigInteger candidateId;
	private float candidatethreshold;
	private Date lastaccess;
	private BigInteger numaccess;
	private String text;
	private List<ProblemSolution> problemSolutions;
	private Problem problem;
	private WeightNorm weightNorm;
	private List<Solution2Solution> solution2solutions1;
	private List<Solution2Solution> solution2solutions2;

	public Solution() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	public String getSolutionId() {
		return this.solutionId;
	}

	public void setSolutionId(String solutionId) {
		this.solutionId = solutionId;
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


	//bi-directional many-to-one association to ProblemSolution
	@OneToMany(mappedBy="solution")
	public List<ProblemSolution> getProblemSolutions() {
		return this.problemSolutions;
	}

	public void setProblemSolutions(List<ProblemSolution> problemSolutions) {
		this.problemSolutions = problemSolutions;
	}

	public ProblemSolution addProblemSolution(ProblemSolution problemSolution) {
		getProblemSolutions().add(problemSolution);
		problemSolution.setSolution(this);

		return problemSolution;
	}

	public ProblemSolution removeProblemSolution(ProblemSolution problemSolution) {
		getProblemSolutions().remove(problemSolution);
		problemSolution.setSolution(null);

		return problemSolution;
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


	//bi-directional many-to-one association to WeightNorm
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="entityName", referencedColumnName="entityName", nullable=false),
		@JoinColumn(name="solutionId", referencedColumnName="entityNormId", nullable=false, insertable=false, updatable=false)
		})
	public WeightNorm getWeightNorm() {
		return this.weightNorm;
	}

	public void setWeightNorm(WeightNorm weightNorm) {
		this.weightNorm = weightNorm;
	}


	//bi-directional many-to-one association to Solution2Solution
	@OneToMany(mappedBy="solution1")
	public List<Solution2Solution> getSolution2solutions1() {
		return this.solution2solutions1;
	}

	public void setSolution2solutions1(List<Solution2Solution> solution2solutions1) {
		this.solution2solutions1 = solution2solutions1;
	}

	public Solution2Solution addSolution2solutions1(Solution2Solution solution2solutions1) {
		getSolution2solutions1().add(solution2solutions1);
		solution2solutions1.setSolution1(this);

		return solution2solutions1;
	}

	public Solution2Solution removeSolution2solutions1(Solution2Solution solution2solutions1) {
		getSolution2solutions1().remove(solution2solutions1);
		solution2solutions1.setSolution1(null);

		return solution2solutions1;
	}


	//bi-directional many-to-one association to Solution2Solution
	@OneToMany(mappedBy="solution2")
	public List<Solution2Solution> getSolution2solutions2() {
		return this.solution2solutions2;
	}

	public void setSolution2solutions2(List<Solution2Solution> solution2solutions2) {
		this.solution2solutions2 = solution2solutions2;
	}

	public Solution2Solution addSolution2solutions2(Solution2Solution solution2solutions2) {
		getSolution2solutions2().add(solution2solutions2);
		solution2solutions2.setSolution2(this);

		return solution2solutions2;
	}

	public Solution2Solution removeSolution2solutions2(Solution2Solution solution2solutions2) {
		getSolution2solutions2().remove(solution2solutions2);
		solution2solutions2.setSolution2(null);

		return solution2solutions2;
	}

}