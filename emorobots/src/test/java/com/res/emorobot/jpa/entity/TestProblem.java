package com.res.emorobot.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;
import java.util.List;


/**
 * The persistent class for the TestProblem database table.
 * 
 */
@Entity
@NamedQuery(name="TestProblem.findAll", query="SELECT t FROM TestProblem t")
public class TestProblem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String problemId;

	@Temporal(TemporalType.TIMESTAMP)
	private Date lastaccess;

	private BigInteger numaccess;

	private String text;

	//bi-directional many-to-one association to WeightNorm
	@ManyToOne
	@JoinColumn(name="weightNormId")
	private WeightNorm weightNorm;

	//bi-directional many-to-one association to TestProblem2TestProblem
	@OneToMany(mappedBy="testProblem")
	private List<TestProblem2TestProblem> testProblem2testProblems;

	public TestProblem() {
	}

	public String getProblemId() {
		return this.problemId;
	}

	public void setProblemId(String problemId) {
		this.problemId = problemId;
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

	public WeightNorm getWeightNorm() {
		return this.weightNorm;
	}

	public void setWeightNorm(WeightNorm weightNorm) {
		this.weightNorm = weightNorm;
	}

	public List<TestProblem2TestProblem> getTestProblem2testProblems() {
		return this.testProblem2testProblems;
	}

	public void setTestProblem2testProblems(List<TestProblem2TestProblem> testProblem2testProblems) {
		this.testProblem2testProblems = testProblem2testProblems;
	}

	public TestProblem2TestProblem addTestProblem2testProblem(TestProblem2TestProblem testProblem2testProblem) {
		getTestProblem2testProblems().add(testProblem2testProblem);
		testProblem2testProblem.setTestProblem(this);

		return testProblem2testProblem;
	}

	public TestProblem2TestProblem removeTestProblem2testProblem(TestProblem2TestProblem testProblem2testProblem) {
		getTestProblem2testProblems().remove(testProblem2testProblem);
		testProblem2testProblem.setTestProblem(null);

		return testProblem2testProblem;
	}

}