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
@Table(name="SubjectProblem2SubjectProblem")
@NamedQuery(name="SubjectProblem2SubjectProblem.findAll", query="SELECT s FROM SubjectProblem2SubjectProblem s")
public class SubjectProblem2SubjectProblem implements Serializable {
	private static final long serialVersionUID = 1L;
	private String subjectproblem2subjectproblemId;
	private BigInteger candidateId;
	private BigInteger candidateNormId;
	private Date lastaccess;
	private BigInteger numaccess;
	private String text;
	private SubjectProblem subjectProblem1;
	private SubjectProblem subjectProblem2;
	private WeightNorm weightNorm;

	public SubjectProblem2SubjectProblem() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	public String getSubjectproblem2subjectproblemId() {
		return this.subjectproblem2subjectproblemId;
	}

	public void setSubjectproblem2subjectproblemId(String subjectproblem2subjectproblemId) {
		this.subjectproblem2subjectproblemId = subjectproblem2subjectproblemId;
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


	@Column(length=300)
	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}


	//bi-directional many-to-one association to SubjectProblem
	@ManyToOne
	@JoinColumn(name="subjectproblem2Id", nullable=false)
	public SubjectProblem getSubjectProblem1() {
		return this.subjectProblem1;
	}

	public void setSubjectProblem1(SubjectProblem subjectProblem1) {
		this.subjectProblem1 = subjectProblem1;
	}


	//bi-directional many-to-one association to SubjectProblem
	@ManyToOne
	@JoinColumn(name="subjectproblemId", nullable=false)
	public SubjectProblem getSubjectProblem2() {
		return this.subjectProblem2;
	}

	public void setSubjectProblem2(SubjectProblem subjectProblem2) {
		this.subjectProblem2 = subjectProblem2;
	}


	//bi-directional many-to-one association to WeightNorm
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="entityName", referencedColumnName="entityName", nullable=false),
		@JoinColumn(name="subjectproblem2subjectproblemId", referencedColumnName="entityNormId", nullable=false, insertable=false, updatable=false)
		})
	public WeightNorm getWeightNorm() {
		return this.weightNorm;
	}

	public void setWeightNorm(WeightNorm weightNorm) {
		this.weightNorm = weightNorm;
	}

}