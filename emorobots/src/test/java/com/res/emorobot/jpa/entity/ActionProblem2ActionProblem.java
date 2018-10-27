package com.res.emorobot.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the ActionProblem2ActionProblem database table.
 * 
 */
@Entity
@NamedQuery(name="ActionProblem2ActionProblem.findAll", query="SELECT a FROM ActionProblem2ActionProblem a")
public class ActionProblem2ActionProblem implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ActionProblem2ActionProblemPK id;

	@Temporal(TemporalType.TIMESTAMP)
	private Date lastaccess;

	private BigInteger numaccess;

	private String text;

	//bi-directional many-to-one association to ActionProblem
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="action2Id", referencedColumnName="actionId"),
		@JoinColumn(name="problem2Id", referencedColumnName="problemId")
		})
	private ActionProblem actionProblem;

	//bi-directional many-to-one association to WeightNorm
	@ManyToOne
	@JoinColumn(name="weightNormId")
	private WeightNorm weightNorm;

	public ActionProblem2ActionProblem() {
	}

	public ActionProblem2ActionProblemPK getId() {
		return this.id;
	}

	public void setId(ActionProblem2ActionProblemPK id) {
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

	public ActionProblem getActionProblem() {
		return this.actionProblem;
	}

	public void setActionProblem(ActionProblem actionProblem) {
		this.actionProblem = actionProblem;
	}

	public WeightNorm getWeightNorm() {
		return this.weightNorm;
	}

	public void setWeightNorm(WeightNorm weightNorm) {
		this.weightNorm = weightNorm;
	}

}