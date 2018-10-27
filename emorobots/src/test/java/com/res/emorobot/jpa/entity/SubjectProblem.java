package com.res.emorobot.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;
import java.util.List;


/**
 * The persistent class for the SubjectProblem database table.
 * 
 */
@Entity
@NamedQuery(name="SubjectProblem.findAll", query="SELECT s FROM SubjectProblem s")
public class SubjectProblem implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SubjectProblemPK id;

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

	//bi-directional many-to-one association to SubjectProblem2SubjectProblem
	@OneToMany(mappedBy="subjectProblem")
	private List<SubjectProblem2SubjectProblem> subjectProblem2subjectProblems;

	public SubjectProblem() {
	}

	public SubjectProblemPK getId() {
		return this.id;
	}

	public void setId(SubjectProblemPK id) {
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

	public List<SubjectProblem2SubjectProblem> getSubjectProblem2subjectProblems() {
		return this.subjectProblem2subjectProblems;
	}

	public void setSubjectProblem2subjectProblems(List<SubjectProblem2SubjectProblem> subjectProblem2subjectProblems) {
		this.subjectProblem2subjectProblems = subjectProblem2subjectProblems;
	}

	public SubjectProblem2SubjectProblem addSubjectProblem2subjectProblem(SubjectProblem2SubjectProblem subjectProblem2subjectProblem) {
		getSubjectProblem2subjectProblems().add(subjectProblem2subjectProblem);
		subjectProblem2subjectProblem.setSubjectProblem(this);

		return subjectProblem2subjectProblem;
	}

	public SubjectProblem2SubjectProblem removeSubjectProblem2subjectProblem(SubjectProblem2SubjectProblem subjectProblem2subjectProblem) {
		getSubjectProblem2subjectProblems().remove(subjectProblem2subjectProblem);
		subjectProblem2subjectProblem.setSubjectProblem(null);

		return subjectProblem2subjectProblem;
	}

}