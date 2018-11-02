package com.res.emorobots.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the SubjectOrder2SubjectOrder database table.
 * 
 */
@Entity
@Table(name="SubjectOrder2SubjectOrder")
@NamedQuery(name="SubjectOrder2SubjectOrder.findAll", query="SELECT s FROM SubjectOrder2SubjectOrder s")
public class SubjectOrder2SubjectOrder implements Serializable {
	private static final long serialVersionUID = 1L;
	private String subjectorder2subjectorderId;
	private BigInteger candidateId;
	private BigInteger candidateNormId;
	private Date lastaccess;
	private BigInteger numaccess;
	private String text;
	private WeightNorm weightNorm;
	private SubjectOrder subjectOrder1;
	private SubjectOrder subjectOrder2;

	public SubjectOrder2SubjectOrder() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	public String getSubjectorder2subjectorderId() {
		return this.subjectorder2subjectorderId;
	}

	public void setSubjectorder2subjectorderId(String subjectorder2subjectorderId) {
		this.subjectorder2subjectorderId = subjectorder2subjectorderId;
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


	//bi-directional many-to-one association to WeightNorm
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="entityName", referencedColumnName="entityName", nullable=false),
		@JoinColumn(name="subjectorder2subjectorderId", referencedColumnName="entityNormId", nullable=false, insertable=false, updatable=false)
		})
	public WeightNorm getWeightNorm() {
		return this.weightNorm;
	}

	public void setWeightNorm(WeightNorm weightNorm) {
		this.weightNorm = weightNorm;
	}


	//bi-directional many-to-one association to SubjectOrder
	@ManyToOne
	@JoinColumn(name="subjectorder2Id", nullable=false)
	public SubjectOrder getSubjectOrder1() {
		return this.subjectOrder1;
	}

	public void setSubjectOrder1(SubjectOrder subjectOrder1) {
		this.subjectOrder1 = subjectOrder1;
	}


	//bi-directional many-to-one association to SubjectOrder
	@ManyToOne
	@JoinColumn(name="subjectorderId", nullable=false)
	public SubjectOrder getSubjectOrder2() {
		return this.subjectOrder2;
	}

	public void setSubjectOrder2(SubjectOrder subjectOrder2) {
		this.subjectOrder2 = subjectOrder2;
	}

}