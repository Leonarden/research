package com.res.emorobot.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the SubjectProblem2SubjectProblem database table.
 * 
 */
@Entity
@NamedQuery(name="SubjectProblem2SubjectProblem.findAll", query="SELECT s FROM SubjectProblem2SubjectProblem s")
public class SubjectProblem2SubjectProblem implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SubjectProblem2SubjectProblemPK id;

	@Temporal(TemporalType.TIMESTAMP)
	private Date lastaccess;

	private BigInteger numaccess;

	private String text;

	//bi-directional many-to-one association to SubjectProblem
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="problem2Id", referencedColumnName="problemId"),
		@JoinColumn(name="subject2Id", referencedColumnName="subjectId")
		})
	private SubjectProblem subjectProblem;

	//bi-directional many-to-one association to WeightNorm
	@ManyToOne
	@JoinColumn(name="weightNormId")
	private WeightNorm weightNorm;

	public SubjectProblem2SubjectProblem() {
	}

	public SubjectProblem2SubjectProblemPK getId() {
		return this.id;
	}

	public void setId(SubjectProblem2SubjectProblemPK id) {
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

	public SubjectProblem getSubjectProblem() {
		return this.subjectProblem;
	}

	public void setSubjectProblem(SubjectProblem subjectProblem) {
		this.subjectProblem = subjectProblem;
	}

	public WeightNorm getWeightNorm() {
		return this.weightNorm;
	}

	public void setWeightNorm(WeightNorm weightNorm) {
		this.weightNorm = weightNorm;
	}

}