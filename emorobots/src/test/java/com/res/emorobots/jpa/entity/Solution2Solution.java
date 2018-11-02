package com.res.emorobots.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the Solution2Solution database table.
 * 
 */
@Entity
@Table(name="Solution2Solution")
@NamedQuery(name="Solution2Solution.findAll", query="SELECT s FROM Solution2Solution s")
public class Solution2Solution implements Serializable {
	private static final long serialVersionUID = 1L;
	private String solution2solutionId;
	private BigInteger candidateId;
	private BigInteger candidateNormId;
	private Date lastaccess;
	private BigInteger numaccess;
	private String text;
	private WeightNorm weightNorm;
	private Solution solution1;
	private Solution solution2;

	public Solution2Solution() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	public String getSolution2solutionId() {
		return this.solution2solutionId;
	}

	public void setSolution2solutionId(String solution2solutionId) {
		this.solution2solutionId = solution2solutionId;
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
		@JoinColumn(name="solution2solutionId", referencedColumnName="entityNormId", nullable=false, insertable=false, updatable=false)
		})
	public WeightNorm getWeightNorm() {
		return this.weightNorm;
	}

	public void setWeightNorm(WeightNorm weightNorm) {
		this.weightNorm = weightNorm;
	}


	//bi-directional many-to-one association to Solution
	@ManyToOne
	@JoinColumn(name="solutionId", nullable=false)
	public Solution getSolution1() {
		return this.solution1;
	}

	public void setSolution1(Solution solution1) {
		this.solution1 = solution1;
	}


	//bi-directional many-to-one association to Solution
	@ManyToOne
	@JoinColumn(name="solution2Id", nullable=false)
	public Solution getSolution2() {
		return this.solution2;
	}

	public void setSolution2(Solution solution2) {
		this.solution2 = solution2;
	}

}