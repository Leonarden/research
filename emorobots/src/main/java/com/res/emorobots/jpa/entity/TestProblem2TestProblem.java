package com.res.emorobots.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the TestProblem2TestProblem database table.
 * 
 */
@Entity
@NamedQuery(name="TestProblem2TestProblem.findAll", query="SELECT t FROM TestProblem2TestProblem t")
public class TestProblem2TestProblem implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TestProblem2TestProblemPK id;

	@Temporal(TemporalType.TIMESTAMP)
	private Date lastaccess;

	private BigInteger numaccess;

	private String text;

	//bi-directional many-to-one association to TestProblem
	@ManyToOne
	@JoinColumn(name="problem2Id")
	private TestProblem testProblem;

	//bi-directional many-to-one association to WeightNorm
	@ManyToOne
	@JoinColumn(name="weightNormId")
	private WeightNorm weightNorm;

	public TestProblem2TestProblem() {
	}

	public TestProblem2TestProblemPK getId() {
		return this.id;
	}

	public void setId(TestProblem2TestProblemPK id) {
		this.id = id;
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

	public TestProblem getTestProblem() {
		return this.testProblem;
	}

	public void setTestProblem(TestProblem testProblem) {
		this.testProblem = testProblem;
	}

	public WeightNorm getWeightNorm() {
		return this.weightNorm;
	}

	public void setWeightNorm(WeightNorm weightNorm) {
		this.weightNorm = weightNorm;
	}

}