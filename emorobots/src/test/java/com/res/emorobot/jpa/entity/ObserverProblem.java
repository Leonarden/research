package com.res.emorobot.jpa.entity;

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
@NamedQuery(name="ObserverProblem.findAll", query="SELECT o FROM ObserverProblem o")
public class ObserverProblem implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ObserverProblemPK id;

	@Temporal(TemporalType.TIMESTAMP)
	private Date lastaccess;

	private BigInteger numaccess;

	private String text;

	//bi-directional many-to-one association to Problem
	@ManyToOne
	@JoinColumn(name="problemId")
	private Problem problem;

	//bi-directional many-to-one association to WeightNorm
	@ManyToOne
	@JoinColumn(name="weightNormId")
	private WeightNorm weightNorm;

	//bi-directional many-to-one association to ObserverProblem2ObserverProblem
	@OneToMany(mappedBy="observerProblem")
	private List<ObserverProblem2ObserverProblem> observerProblem2observerProblems;

	public ObserverProblem() {
	}

	public ObserverProblemPK getId() {
		return this.id;
	}

	public void setId(ObserverProblemPK id) {
		this.id = id;
	}

	public Date getLastaccess() {
		return this.lastaccess;
	}

	public void setLastaccess(Date lastaccess) {
		this.lastaccess = lastaccess;
	}

	public BigInteger getNumaccess() {
		return this.numaccess;
	}

	public void setNumaccess(BigInteger numaccess) {
		this.numaccess = numaccess;
	}

	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Problem getProblem() {
		return this.problem;
	}

	public void setProblem(Problem problem) {
		this.problem = problem;
	}

	public WeightNorm getWeightNorm() {
		return this.weightNorm;
	}

	public void setWeightNorm(WeightNorm weightNorm) {
		this.weightNorm = weightNorm;
	}

	public List<ObserverProblem2ObserverProblem> getObserverProblem2observerProblems() {
		return this.observerProblem2observerProblems;
	}

	public void setObserverProblem2observerProblems(List<ObserverProblem2ObserverProblem> observerProblem2observerProblems) {
		this.observerProblem2observerProblems = observerProblem2observerProblems;
	}

	public ObserverProblem2ObserverProblem addObserverProblem2observerProblem(ObserverProblem2ObserverProblem observerProblem2observerProblem) {
		getObserverProblem2observerProblems().add(observerProblem2observerProblem);
		observerProblem2observerProblem.setObserverProblem(this);

		return observerProblem2observerProblem;
	}

	public ObserverProblem2ObserverProblem removeObserverProblem2observerProblem(ObserverProblem2ObserverProblem observerProblem2observerProblem) {
		getObserverProblem2observerProblems().remove(observerProblem2observerProblem);
		observerProblem2observerProblem.setObserverProblem(null);

		return observerProblem2observerProblem;
	}

}