package com.res.emorobots.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the ObserverOrder2ObserverOrder database table.
 * 
 */
@Entity
@Table(name="ObserverOrder2ObserverOrder")
@NamedQuery(name="ObserverOrder2ObserverOrder.findAll", query="SELECT o FROM ObserverOrder2ObserverOrder o")
public class ObserverOrder2ObserverOrder implements Serializable {
	private static final long serialVersionUID = 1L;
	private String observerorder2observerorderId;
	private BigInteger candidateId;
	private BigInteger candidateNormId;
	private Date lastaccess;
	private BigInteger numaccess;
	private String text;
	private WeightNorm weightNorm;
	private ObserverOrder observerOrder1;
	private ObserverOrder observerOrder2;

	public ObserverOrder2ObserverOrder() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	public String getObserverorder2observerorderId() {
		return this.observerorder2observerorderId;
	}

	public void setObserverorder2observerorderId(String observerorder2observerorderId) {
		this.observerorder2observerorderId = observerorder2observerorderId;
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
		@JoinColumn(name="observerorder2observerorderId", referencedColumnName="entityNormId", nullable=false, insertable=false, updatable=false)
		})
	public WeightNorm getWeightNorm() {
		return this.weightNorm;
	}

	public void setWeightNorm(WeightNorm weightNorm) {
		this.weightNorm = weightNorm;
	}


	//bi-directional many-to-one association to ObserverOrder
	@ManyToOne
	@JoinColumn(name="observerorderId", nullable=false)
	public ObserverOrder getObserverOrder1() {
		return this.observerOrder1;
	}

	public void setObserverOrder1(ObserverOrder observerOrder1) {
		this.observerOrder1 = observerOrder1;
	}


	//bi-directional many-to-one association to ObserverOrder
	@ManyToOne
	@JoinColumn(name="observerorder2Id", nullable=false)
	public ObserverOrder getObserverOrder2() {
		return this.observerOrder2;
	}

	public void setObserverOrder2(ObserverOrder observerOrder2) {
		this.observerOrder2 = observerOrder2;
	}

}