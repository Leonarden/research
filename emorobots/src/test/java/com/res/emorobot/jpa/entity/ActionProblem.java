package com.res.emorobot.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;
import java.util.List;


/**
 * The persistent class for the ActionProblem database table.
 * 
 */
@Entity
@NamedQuery(name="ActionProblem.findAll", query="SELECT a FROM ActionProblem a")
public class ActionProblem implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ActionProblemPK id;

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

	//bi-directional many-to-one association to ActionProblem2ActionProblem
	@OneToMany(mappedBy="actionProblem")
	private List<ActionProblem2ActionProblem> actionProblem2actionProblems;

	public ActionProblem() {
	}

	public ActionProblemPK getId() {
		return this.id;
	}

	public void setId(ActionProblemPK id) {
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

	public List<ActionProblem2ActionProblem> getActionProblem2actionProblems() {
		return this.actionProblem2actionProblems;
	}

	public void setActionProblem2actionProblems(List<ActionProblem2ActionProblem> actionProblem2actionProblems) {
		this.actionProblem2actionProblems = actionProblem2actionProblems;
	}

	public ActionProblem2ActionProblem addActionProblem2actionProblem(ActionProblem2ActionProblem actionProblem2actionProblem) {
		getActionProblem2actionProblems().add(actionProblem2actionProblem);
		actionProblem2actionProblem.setActionProblem(this);

		return actionProblem2actionProblem;
	}

	public ActionProblem2ActionProblem removeActionProblem2actionProblem(ActionProblem2ActionProblem actionProblem2actionProblem) {
		getActionProblem2actionProblems().remove(actionProblem2actionProblem);
		actionProblem2actionProblem.setActionProblem(null);

		return actionProblem2actionProblem;
	}

}