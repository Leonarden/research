package com.res.emorobot.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the ObserverProblem2ObserverProblem database table.
 * 
 */
@Entity
@NamedQuery(name="ObserverProblem2ObserverProblem.findAll", query="SELECT o FROM ObserverProblem2ObserverProblem o")
public class ObserverProblem2ObserverProblem implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ObserverProblem2ObserverProblemPK id;

	@Temporal(TemporalType.TIMESTAMP)
	private Date lastaccess;

	private BigInteger numaccess;

	private String text;

	//bi-directional many-to-one association to ObserverProblem
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="observer2Id", referencedColumnName="observerId"),
		@JoinColumn(name="problem2Id", referencedColumnName="problemId")
		})
	private ObserverProblem observerProblem;

	//bi-directional many-to-one association to WeightNorm
	@ManyToOne
	@JoinColumn(name="weightNormId")
	private WeightNorm weightNorm;

	public ObserverProblem2ObserverProblem() {
	}

	public ObserverProblem2ObserverProblemPK getId() {
		return this.id;
	}

	public void setId(ObserverProblem2ObserverProblemPK id) {
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

	public ObserverProblem getObserverProblem() {
		return this.observerProblem;
	}

	public void setObserverProblem(ObserverProblem observerProblem) {
		this.observerProblem = observerProblem;
	}

	public WeightNorm getWeightNorm() {
		return this.weightNorm;
	}

	public void setWeightNorm(WeightNorm weightNorm) {
		this.weightNorm = weightNorm;
	}

}