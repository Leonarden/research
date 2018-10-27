package com.res.emorobot.jpa.entity;

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
@NamedQuery(name="Solution.findAll", query="SELECT s FROM Solution s")
public class Solution implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String solutionId;

	@Temporal(TemporalType.TIMESTAMP)
	private Date lastaccess;

	private BigInteger numaccess;

	private String text;

	//bi-directional many-to-one association to Problem
	@ManyToOne
	@JoinColumn(name="problemId")
	private Problem problem;

	//bi-directional many-to-one association to WeightNorm
	@ManyToOne
	@JoinColumn(name="weightNormId")
	private WeightNorm weightNorm;

	//bi-directional many-to-one association to Solution2Solution
	@OneToMany(mappedBy="solution")
	private List<Solution2Solution> solution2solutions;

	public Solution() {
	}

	public String getSolutionId() {
		return this.solutionId;
	}

	public void setSolutionId(String solutionId) {
		this.solutionId = solutionId;
	}

	public Date getLastaccess() {
		return this.lastaccess;
	}

	public void setLastaccess(Date lastaccess) {
		this.lastaccess = lastaccess;
	}

	public BigInteger getNumaccess() {
		return this.numaccess;
	}

	public void setNumaccess(BigInteger numaccess) {
		this.numaccess = numaccess;
	}

	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Problem getProblem() {
		return this.problem;
	}

	public void setProblem(Problem problem) {
		this.problem = problem;
	}

	public WeightNorm getWeightNorm() {
		return this.weightNorm;
	}

	public void setWeightNorm(WeightNorm weightNorm) {
		this.weightNorm = weightNorm;
	}

	public List<Solution2Solution> getSolution2solutions() {
		return this.solution2solutions;
	}

	public void setSolution2solutions(List<Solution2Solution> solution2solutions) {
		this.solution2solutions = solution2solutions;
	}

	public Solution2Solution addSolution2solution(Solution2Solution solution2solution) {
		getSolution2solutions().add(solution2solution);
		solution2solution.setSolution(this);

		return solution2solution;
	}

	public Solution2Solution removeSolution2solution(Solution2Solution solution2solution) {
		getSolution2solutions().remove(solution2solution);
		solution2solution.setSolution(null);

		return solution2solution;
	}

}