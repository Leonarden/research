package com.res.emorobots.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;
import java.util.List;


/**
 * The persistent class for the ObserverProblem database table.
 * 
 */
@Entity
@Table(name="ObserverProblem")
@NamedQuery(name="ObserverProblem.findAll", query="SELECT o FROM ObserverProblem o")
public class ObserverProblem implements Serializable {
	private static final long serialVersionUID = 1L;
	private String observerproblemId;
	private BigInteger candidateId;
	private BigInteger candidateNormId;
	private Date lastaccess;
	private BigInteger numaccess;
	private String text;
	private Observer observer;
	private Problem problem;
	private WeightNorm weightNorm;
	private List<ObserverProblem2ObserverProblem> observerProblem2observerProblems1;
	private List<ObserverProblem2ObserverProblem> observerProblem2observerProblems2;

	public ObserverProblem() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	public String getObserverproblemId() {
		return this.observerproblemId;
	}

	public void setObserverproblemId(String observerproblemId) {
		this.observerproblemId = observerproblemId;
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


	//bi-directional many-to-one association to Observer
	@ManyToOne
	@JoinColumn(name="observerId", nullable=false)
	public Observer getObserver() {
		return this.observer;
	}

	public void setObserver(Observer observer) {
		this.observer = observer;
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


	//bi-directional many-to-one association to WeightNorm
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="entityName", referencedColumnName="entityName", nullable=false),
		@JoinColumn(name="observerproblemId", referencedColumnName="entityNormId", nullable=false, insertable=false, updatable=false)
		})
	public WeightNorm getWeightNorm() {
		return this.weightNorm;
	}

	public void setWeightNorm(WeightNorm weightNorm) {
		this.weightNorm = weightNorm;
	}


	//bi-directional many-to-one association to ObserverProblem2ObserverProblem
	@OneToMany(mappedBy="observerProblem1")
	public List<ObserverProblem2ObserverProblem> getObserverProblem2observerProblems1() {
		return this.observerProblem2observerProblems1;
	}

	public void setObserverProblem2observerProblems1(List<ObserverProblem2ObserverProblem> observerProblem2observerProblems1) {
		this.observerProblem2observerProblems1 = observerProblem2observerProblems1;
	}

	public ObserverProblem2ObserverProblem addObserverProblem2observerProblems1(ObserverProblem2ObserverProblem observerProblem2observerProblems1) {
		getObserverProblem2observerProblems1().add(observerProblem2observerProblems1);
		observerProblem2observerProblems1.setObserverProblem1(this);

		return observerProblem2observerProblems1;
	}

	public ObserverProblem2ObserverProblem removeObserverProblem2observerProblems1(ObserverProblem2ObserverProblem observerProblem2observerProblems1) {
		getObserverProblem2observerProblems1().remove(observerProblem2observerProblems1);
		observerProblem2observerProblems1.setObserverProblem1(null);

		return observerProblem2observerProblems1;
	}


	//bi-directional many-to-one association to ObserverProblem2ObserverProblem
	@OneToMany(mappedBy="observerProblem2")
	public List<ObserverProblem2ObserverProblem> getObserverProblem2observerProblems2() {
		return this.observerProblem2observerProblems2;
	}

	public void setObserverProblem2observerProblems2(List<ObserverProblem2ObserverProblem> observerProblem2observerProblems2) {
		this.observerProblem2observerProblems2 = observerProblem2observerProblems2;
	}

	public ObserverProblem2ObserverProblem addObserverProblem2observerProblems2(ObserverProblem2ObserverProblem observerProblem2observerProblems2) {
		getObserverProblem2observerProblems2().add(observerProblem2observerProblems2);
		observerProblem2observerProblems2.setObserverProblem2(this);

		return observerProblem2observerProblems2;
	}

	public ObserverProblem2ObserverProblem removeObserverProblem2observerProblems2(ObserverProblem2ObserverProblem observerProblem2observerProblems2) {
		getObserverProblem2observerProblems2().remove(observerProblem2observerProblems2);
		observerProblem2observerProblems2.setObserverProblem2(null);

		return observerProblem2observerProblems2;
	}

}