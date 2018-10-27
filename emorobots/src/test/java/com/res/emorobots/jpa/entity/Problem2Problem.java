package com.res.emorobots.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the Problem2Problem database table.
 * 
 */
@Entity
@NamedQuery(name="Problem2Problem.findAll", query="SELECT p FROM Problem2Problem p")
public class Problem2Problem implements Serializable {
	private static final long serialVersionUID = 1L;
	private String problem2problemId;
	private Date lastaccess;
	private BigInteger numaccess;
	private String text;
	private Problem problem1;
	private Problem problem2;
	private WeightNorm weightNorm;

	public Problem2Problem() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public String getProblem2problemId() {
		return this.problem2problemId;
	}

	public void setProblem2problemId(String problem2problemId) {
		this.problem2problemId = problem2problemId;
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
	@JoinColumn(name="problem2Id")
	public Problem getProblem1() {
		return this.problem1;
	}

	public void setProblem1(Problem problem1) {
		this.problem1 = problem1;
	}


	//bi-directional many-to-one association to Problem
	@ManyToOne
	@JoinColumn(name="problemId")
	public Problem getProblem2() {
		return this.problem2;
	}

	public void setProblem2(Problem problem2) {
		this.problem2 = problem2;
	}


	//bi-directional many-to-one association to WeightNorm
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="entityName", referencedColumnName="entityName"),
		@JoinColumn(name="problem2problemId", referencedColumnName="entityNormId")
		})
	public WeightNorm getWeightNorm() {
		return this.weightNorm;
	}

	public void setWeightNorm(WeightNorm weightNorm) {
		this.weightNorm = weightNorm;
	}

}