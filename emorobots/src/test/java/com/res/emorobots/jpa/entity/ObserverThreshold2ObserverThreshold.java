package com.res.emorobots.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the ObserverThreshold2ObserverThreshold database table.
 * 
 */
@Entity
@Table(name="ObserverThreshold2ObserverThreshold")
@NamedQuery(name="ObserverThreshold2ObserverThreshold.findAll", query="SELECT o FROM ObserverThreshold2ObserverThreshold o")
public class ObserverThreshold2ObserverThreshold implements Serializable {
	private static final long serialVersionUID = 1L;
	private String observerthreshold2observerthresholdId;
	private BigInteger candidateId;
	private BigInteger candidateNormId;
	private Date lastaccess;
	private BigInteger numaccess;
	private String text;
	private WeightNorm weightNorm;
	private ObserverThreshold observerThreshold1;
	private ObserverThreshold observerThreshold2;

	public ObserverThreshold2ObserverThreshold() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	public String getObserverthreshold2observerthresholdId() {
		return this.observerthreshold2observerthresholdId;
	}

	public void setObserverthreshold2observerthresholdId(String observerthreshold2observerthresholdId) {
		this.observerthreshold2observerthresholdId = observerthreshold2observerthresholdId;
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


	@Column(length=20)
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
		@JoinColumn(name="observerthreshold2observerthresholdId", referencedColumnName="entityNormId", nullable=false, insertable=false, updatable=false)
		})
	public WeightNorm getWeightNorm() {
		return this.weightNorm;
	}

	public void setWeightNorm(WeightNorm weightNorm) {
		this.weightNorm = weightNorm;
	}


	//bi-directional many-to-one association to ObserverThreshold
	@ManyToOne
	@JoinColumn(name="observerthreshold2Id", nullable=false)
	public ObserverThreshold getObserverThreshold1() {
		return this.observerThreshold1;
	}

	public void setObserverThreshold1(ObserverThreshold observerThreshold1) {
		this.observerThreshold1 = observerThreshold1;
	}


	//bi-directional many-to-one association to ObserverThreshold
	@ManyToOne
	@JoinColumn(name="observerthresholdId", nullable=false)
	public ObserverThreshold getObserverThreshold2() {
		return this.observerThreshold2;
	}

	public void setObserverThreshold2(ObserverThreshold observerThreshold2) {
		this.observerThreshold2 = observerThreshold2;
	}

}