package com.res.emorobots.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the Weight database table.
 * 
 */
@Entity
@Table(name="Weight")
@NamedQuery(name="Weight.findAll", query="SELECT w FROM Weight w")
public class Weight implements Serializable {
	private static final long serialVersionUID = 1L;
	private String weightId;
	private BigInteger candidateId;
	private float candidatethreshold;
	private BigInteger entityId;
	private String entityName;
	private float item0Id;
	private float item1Id;
	private float item2Id;
	private float item3Id;
	private float item4Id;
	private float item5Id;
	private Date lastAccess;
	private BigInteger numaccess;

	public Weight() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	public String getWeightId() {
		return this.weightId;
	}

	public void setWeightId(String weightId) {
		this.weightId = weightId;
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


	@Column(nullable=false)
	public BigInteger getEntityId() {
		return this.entityId;
	}

	public void setEntityId(BigInteger entityId) {
		this.entityId = entityId;
	}


	@Column(nullable=false, length=80)
	public String getEntityName() {
		return this.entityName;
	}

	public void setEntityName(String entityName) {
		this.entityName = entityName;
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

}