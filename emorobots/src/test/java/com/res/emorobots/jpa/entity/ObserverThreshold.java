package com.res.emorobots.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;
import java.util.List;


/**
 * The persistent class for the ObserverThreshold database table.
 * 
 */
@Entity
@Table(name="ObserverThreshold")
@NamedQuery(name="ObserverThreshold.findAll", query="SELECT o FROM ObserverThreshold o")
public class ObserverThreshold implements Serializable {
	private static final long serialVersionUID = 1L;
	private String observerthresholdId;
	private BigInteger candidateId;
	private BigInteger candidateNormId;
	private Date lastaccess;
	private BigInteger numaccess;
	private String text;
	private WeightNorm weightNorm;
	private Observer observer;
	private Threshold threshold;
	private List<ObserverThreshold2ObserverThreshold> observerThreshold2observerThresholds1;
	private List<ObserverThreshold2ObserverThreshold> observerThreshold2observerThresholds2;

	public ObserverThreshold() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	public String getObserverthresholdId() {
		return this.observerthresholdId;
	}

	public void setObserverthresholdId(String observerthresholdId) {
		this.observerthresholdId = observerthresholdId;
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
		@JoinColumn(name="observerthresholdId", referencedColumnName="entityNormId", nullable=false, insertable=false, updatable=false)
		})
	public WeightNorm getWeightNorm() {
		return this.weightNorm;
	}

	public void setWeightNorm(WeightNorm weightNorm) {
		this.weightNorm = weightNorm;
	}


	//bi-directional many-to-one association to Observer
	@ManyToOne
	@JoinColumn(name="observerId", nullable=false)
	public Observer getObserver() {
		return this.observer;
	}

	public void setObserver(Observer observer) {
		this.observer = observer;
	}


	//bi-directional many-to-one association to Threshold
	@ManyToOne
	@JoinColumn(name="thresholdId", nullable=false)
	public Threshold getThreshold() {
		return this.threshold;
	}

	public void setThreshold(Threshold threshold) {
		this.threshold = threshold;
	}


	//bi-directional many-to-one association to ObserverThreshold2ObserverThreshold
	@OneToMany(mappedBy="observerThreshold1")
	public List<ObserverThreshold2ObserverThreshold> getObserverThreshold2observerThresholds1() {
		return this.observerThreshold2observerThresholds1;
	}

	public void setObserverThreshold2observerThresholds1(List<ObserverThreshold2ObserverThreshold> observerThreshold2observerThresholds1) {
		this.observerThreshold2observerThresholds1 = observerThreshold2observerThresholds1;
	}

	public ObserverThreshold2ObserverThreshold addObserverThreshold2observerThresholds1(ObserverThreshold2ObserverThreshold observerThreshold2observerThresholds1) {
		getObserverThreshold2observerThresholds1().add(observerThreshold2observerThresholds1);
		observerThreshold2observerThresholds1.setObserverThreshold1(this);

		return observerThreshold2observerThresholds1;
	}

	public ObserverThreshold2ObserverThreshold removeObserverThreshold2observerThresholds1(ObserverThreshold2ObserverThreshold observerThreshold2observerThresholds1) {
		getObserverThreshold2observerThresholds1().remove(observerThreshold2observerThresholds1);
		observerThreshold2observerThresholds1.setObserverThreshold1(null);

		return observerThreshold2observerThresholds1;
	}


	//bi-directional many-to-one association to ObserverThreshold2ObserverThreshold
	@OneToMany(mappedBy="observerThreshold2")
	public List<ObserverThreshold2ObserverThreshold> getObserverThreshold2observerThresholds2() {
		return this.observerThreshold2observerThresholds2;
	}

	public void setObserverThreshold2observerThresholds2(List<ObserverThreshold2ObserverThreshold> observerThreshold2observerThresholds2) {
		this.observerThreshold2observerThresholds2 = observerThreshold2observerThresholds2;
	}

	public ObserverThreshold2ObserverThreshold addObserverThreshold2observerThresholds2(ObserverThreshold2ObserverThreshold observerThreshold2observerThresholds2) {
		getObserverThreshold2observerThresholds2().add(observerThreshold2observerThresholds2);
		observerThreshold2observerThresholds2.setObserverThreshold2(this);

		return observerThreshold2observerThresholds2;
	}

	public ObserverThreshold2ObserverThreshold removeObserverThreshold2observerThresholds2(ObserverThreshold2ObserverThreshold observerThreshold2observerThresholds2) {
		getObserverThreshold2observerThresholds2().remove(observerThreshold2observerThresholds2);
		observerThreshold2observerThresholds2.setObserverThreshold2(null);

		return observerThreshold2observerThresholds2;
	}

}