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
@NamedQuery(name="Solution.findAll", query="SELECT s FROM Solution s")
public class Solution implements Serializable {
	private static final long serialVersionUID = 1L;
	private String solutionId;
	private String entityName;
	private Date lastaccess;
	private BigInteger numaccess;
	private String text;
	private Problem problem;
	private List<Solution2Solution> solution2solutions1;
	private List<Solution2Solution> solution2solutions2;

	public Solution() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public String getSolutionId() {
		return this.solutionId;
	}

	public void setSolutionId(String solutionId) {
		this.solutionId = solutionId;
	}


	public String getEntityName() {
		return this.entityName;
	}

	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}


	@Temporal(TemporalType.TIMESTAMP)
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


	//bi-directional many-to-one association to Problem
	@ManyToOne
	@JoinColumn(name="problemId")
	public Problem getProblem() {
		return this.problem;
	}

	public void setProblem(Problem problem) {
		this.problem = problem;
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