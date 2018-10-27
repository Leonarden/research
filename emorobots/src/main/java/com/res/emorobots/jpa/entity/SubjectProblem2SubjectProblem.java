package com.res.emorobots.jpa.entity;

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
	private String subjectproblem2subjectproblemId;
	private String entityName;
	private Date lastaccess;
	private BigInteger numaccess;
	private String text;
	private SubjectProblem subjectProblem1;
	private SubjectProblem subjectProblem2;

	public SubjectProblem2SubjectProblem() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public String getSubjectproblem2subjectproblemId() {
		return this.subjectproblem2subjectproblemId;
	}

	public void setSubjectproblem2subjectproblemId(String subjectproblem2subjectproblemId) {
		this.subjectproblem2subjectproblemId = subjectproblem2subjectproblemId;
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


	//bi-directional many-to-one association to SubjectProblem
	@ManyToOne
	@JoinColumn(name="subjectproblem2Id")
	public SubjectProblem getSubjectProblem1() {
		return this.subjectProblem1;
	}

	public void setSubjectProblem1(SubjectProblem subjectProblem1) {
		this.subjectProblem1 = subjectProblem1;
	}


	//bi-directional many-to-one association to SubjectProblem
	@ManyToOne
	@JoinColumn(name="subjectproblemId")
	public SubjectProblem getSubjectProblem2() {
		return this.subjectProblem2;
	}

	public void setSubjectProblem2(SubjectProblem subjectProblem2) {
		this.subjectProblem2 = subjectProblem2;
	}

}