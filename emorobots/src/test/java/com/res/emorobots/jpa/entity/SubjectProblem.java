package com.res.emorobots.jpa.entity;

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
@Table(name="SubjectProblem")
@NamedQuery(name="SubjectProblem.findAll", query="SELECT s FROM SubjectProblem s")
public class SubjectProblem implements Serializable {
	private static final long serialVersionUID = 1L;
	private String subjectproblemId;
	private BigInteger candidateId;
	private BigInteger candidateNormId;
	private Date lastaccess;
	private BigInteger numaccess;
	private String text;
	private Problem problem;
	private Subject subject;
	private WeightNorm weightNorm;
	private List<SubjectProblem2SubjectProblem> subjectProblem2subjectProblems1;
	private List<SubjectProblem2SubjectProblem> subjectProblem2subjectProblems2;

	public SubjectProblem() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	public String getSubjectproblemId() {
		return this.subjectproblemId;
	}

	public void setSubjectproblemId(String subjectproblemId) {
		this.subjectproblemId = subjectproblemId;
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


	//bi-directional many-to-one association to Problem
	@ManyToOne
	@JoinColumn(name="problemId", nullable=false)
	public Problem getProblem() {
		return this.problem;
	}

	public void setProblem(Problem problem) {
		this.problem = problem;
	}


	//bi-directional many-to-one association to Subject
	@ManyToOne
	@JoinColumn(name="subjectId", nullable=false)
	public Subject getSubject() {
		return this.subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}


	//bi-directional many-to-one association to WeightNorm
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="entityName", referencedColumnName="entityName", nullable=false),
		@JoinColumn(name="subjectproblemId", referencedColumnName="entityNormId", nullable=false, insertable=false, updatable=false)
		})
	public WeightNorm getWeightNorm() {
		return this.weightNorm;
	}

	public void setWeightNorm(WeightNorm weightNorm) {
		this.weightNorm = weightNorm;
	}


	//bi-directional many-to-one association to SubjectProblem2SubjectProblem
	@OneToMany(mappedBy="subjectProblem1")
	public List<SubjectProblem2SubjectProblem> getSubjectProblem2subjectProblems1() {
		return this.subjectProblem2subjectProblems1;
	}

	public void setSubjectProblem2subjectProblems1(List<SubjectProblem2SubjectProblem> subjectProblem2subjectProblems1) {
		this.subjectProblem2subjectProblems1 = subjectProblem2subjectProblems1;
	}

	public SubjectProblem2SubjectProblem addSubjectProblem2subjectProblems1(SubjectProblem2SubjectProblem subjectProblem2subjectProblems1) {
		getSubjectProblem2subjectProblems1().add(subjectProblem2subjectProblems1);
		subjectProblem2subjectProblems1.setSubjectProblem1(this);

		return subjectProblem2subjectProblems1;
	}

	public SubjectProblem2SubjectProblem removeSubjectProblem2subjectProblems1(SubjectProblem2SubjectProblem subjectProblem2subjectProblems1) {
		getSubjectProblem2subjectProblems1().remove(subjectProblem2subjectProblems1);
		subjectProblem2subjectProblems1.setSubjectProblem1(null);

		return subjectProblem2subjectProblems1;
	}


	//bi-directional many-to-one association to SubjectProblem2SubjectProblem
	@OneToMany(mappedBy="subjectProblem2")
	public List<SubjectProblem2SubjectProblem> getSubjectProblem2subjectProblems2() {
		return this.subjectProblem2subjectProblems2;
	}

	public void setSubjectProblem2subjectProblems2(List<SubjectProblem2SubjectProblem> subjectProblem2subjectProblems2) {
		this.subjectProblem2subjectProblems2 = subjectProblem2subjectProblems2;
	}

	public SubjectProblem2SubjectProblem addSubjectProblem2subjectProblems2(SubjectProblem2SubjectProblem subjectProblem2subjectProblems2) {
		getSubjectProblem2subjectProblems2().add(subjectProblem2subjectProblems2);
		subjectProblem2subjectProblems2.setSubjectProblem2(this);

		return subjectProblem2subjectProblems2;
	}

	public SubjectProblem2SubjectProblem removeSubjectProblem2subjectProblems2(SubjectProblem2SubjectProblem subjectProblem2subjectProblems2) {
		getSubjectProblem2subjectProblems2().remove(subjectProblem2subjectProblems2);
		subjectProblem2subjectProblems2.setSubjectProblem2(null);

		return subjectProblem2subjectProblems2;
	}

}