package com.res.emorobots.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the ObserverProblem2ObserverProblem database table.
 * 
 */
@Entity
@Table(name="ObserverProblem2ObserverProblem")
@NamedQuery(name="ObserverProblem2ObserverProblem.findAll", query="SELECT o FROM ObserverProblem2ObserverProblem o")
public class ObserverProblem2ObserverProblem implements Serializable {
	private static final long serialVersionUID = 1L;
	private String observerproblem2observerproblemId;
	private BigInteger candidateId;
	private BigInteger candidateNormId;
	private Date lastaccess;
	private BigInteger numaccess;
	private String text;
	private ObserverProblem observerProblem1;
	private ObserverProblem observerProblem2;
	private WeightNorm weightNorm;

	public ObserverProblem2ObserverProblem() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	public String getObserverproblem2observerproblemId() {
		return this.observerproblem2observerproblemId;
	}

	public void setObserverproblem2observerproblemId(String observerproblem2observerproblemId) {
		this.observerproblem2observerproblemId = observerproblem2observerproblemId;
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


	//bi-directional many-to-one association to ObserverProblem
	@ManyToOne
	@JoinColumn(name="observerproblem2Id", nullable=false)
	public ObserverProblem getObserverProblem1() {
		return this.observerProblem1;
	}

	public void setObserverProblem1(ObserverProblem observerProblem1) {
		this.observerProblem1 = observerProblem1;
	}


	//bi-directional many-to-one association to ObserverProblem
	@ManyToOne
	@JoinColumn(name="observerproblemId", nullable=false)
	public ObserverProblem getObserverProblem2() {
		return this.observerProblem2;
	}

	public void setObserverProblem2(ObserverProblem observerProblem2) {
		this.observerProblem2 = observerProblem2;
	}


	//bi-directional many-to-one association to WeightNorm
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="entityName", referencedColumnName="entityName", nullable=false),
		@JoinColumn(name="observerproblem2observerproblemId", referencedColumnName="entityNormId", nullable=false, insertable=false, updatable=false)
		})
	public WeightNorm getWeightNorm() {
		return this.weightNorm;
	}

	public void setWeightNorm(WeightNorm weightNorm) {
		this.weightNorm = weightNorm;
	}

}