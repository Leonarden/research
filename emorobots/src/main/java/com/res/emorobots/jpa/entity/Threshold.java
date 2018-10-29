package com.res.emorobots.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;
import java.util.List;


/**
 * The persistent class for the Threshold database table.
 * 
 */
@Entity
@Table(name="Threshold")
@NamedQuery(name="Threshold.findAll", query="SELECT t FROM Threshold t")
public class Threshold implements Serializable {
	private static final long serialVersionUID = 1L;
	private String thresholdId;
	private BigInteger candidateId;
	private float candidatethreshold;
	private String entityName;
	private BigInteger entityNormId;
	private float item0Id;
	private float item1Id;
	private float item2Id;
	private float item3Id;
	private float item4Id;
	private float item5Id;
	private Date lastAccess;
	private BigInteger numaccess;
	private List<ObserverThreshold> observerThresholds;

	public Threshold() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	public String getThresholdId() {
		return this.thresholdId;
	}

	public void setThresholdId(String thresholdId) {
		this.thresholdId = thresholdId;
	}


	@Column(nullable=false)
	public BigInteger getCandidateId() {
		return this.candidateId;
	}

	public void setCandidateId(BigInteger candidateId) {
		this.candidateId = candidateId;
	}


	@Column(nullable=false)
	public float getCandidatethreshold() {
		return this.candidatethreshold;
	}

	public void setCandidatethreshold(float candidatethreshold) {
		this.candidatethreshold = candidatethreshold;
	}


	@Column(nullable=false, length=80)
	public String getEntityName() {
		return this.entityName;
	}

	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}


	@Column(nullable=false)
	public BigInteger getEntityNormId() {
		return this.entityNormId;
	}

	public void setEntityNormId(BigInteger entityNormId) {
		this.entityNormId = entityNormId;
	}


	@Column(nullable=false)
	public float getItem0Id() {
		return this.item0Id;
	}

	public void setItem0Id(float item0Id) {
		this.item0Id = item0Id;
	}


	@Column(nullable=false)
	public float getItem1Id() {
		return this.item1Id;
	}

	public void setItem1Id(float item1Id) {
		this.item1Id = item1Id;
	}


	@Column(nullable=false)
	public float getItem2Id() {
		return this.item2Id;
	}

	public void setItem2Id(float item2Id) {
		this.item2Id = item2Id;
	}


	@Column(nullable=false)
	public float getItem3Id() {
		return this.item3Id;
	}

	public void setItem3Id(float item3Id) {
		this.item3Id = item3Id;
	}


	@Column(nullable=false)
	public float getItem4Id() {
		return this.item4Id;
	}

	public void setItem4Id(float item4Id) {
		this.item4Id = item4Id;
	}


	@Column(nullable=false)
	public float getItem5Id() {
		return this.item5Id;
	}

	public void setItem5Id(float item5Id) {
		this.item5Id = item5Id;
	}


	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable=false)
	public Date getLastAccess() {
		return this.lastAccess;
	}

	public void setLastAccess(Date lastAccess) {
		this.lastAccess = lastAccess;
	}


	@Column(nullable=false)
	public BigInteger getNumaccess() {
		return this.numaccess;
	}

	public void setNumaccess(BigInteger numaccess) {
		this.numaccess = numaccess;
	}


	//bi-directional many-to-one association to ObserverThreshold
	@OneToMany(mappedBy="threshold")
	public List<ObserverThreshold> getObserverThresholds() {
		return this.observerThresholds;
	}

	public void setObserverThresholds(List<ObserverThreshold> observerThresholds) {
		this.observerThresholds = observerThresholds;
	}

	public ObserverThreshold addObserverThreshold(ObserverThreshold observerThreshold) {
		getObserverThresholds().add(observerThreshold);
		observerThreshold.setThreshold(this);

		return observerThreshold;
	}

	public ObserverThreshold removeObserverThreshold(ObserverThreshold observerThreshold) {
		getObserverThresholds().remove(observerThreshold);
		observerThreshold.setThreshold(null);

		return observerThreshold;
	}

}