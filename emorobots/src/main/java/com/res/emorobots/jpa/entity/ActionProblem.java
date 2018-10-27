package com.res.emorobots.jpa.entity;

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
	private String actionproblemId;
	private String entityName;
	private Date lastaccess;
	private BigInteger numaccess;
	private String text;
	private Action action;
	private Problem problem;
	private List<ActionProblem2ActionProblem> actionProblem2actionProblems1;
	private List<ActionProblem2ActionProblem> actionProblem2actionProblems2;

	public ActionProblem() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public String getActionproblemId() {
		return this.actionproblemId;
	}

	public void setActionproblemId(String actionproblemId) {
		this.actionproblemId = actionproblemId;
	}


	public String getEntityName() {
		return this.entityName;
	}

	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}


	@Temporal(TemporalType.TIMESTAMP)
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


	//bi-directional many-to-one association to Action
	@ManyToOne
	@JoinColumn(name="actionId")
	public Action getAction() {
		return this.action;
	}

	public void setAction(Action action) {
		this.action = action;
	}


	//bi-directional many-to-one association to Problem
	@ManyToOne
	@JoinColumn(name="problemId")
	public Problem getProblem() {
		return this.problem;
	}

	public void setProblem(Problem problem) {
		this.problem = problem;
	}


	//bi-directional many-to-one association to ActionProblem2ActionProblem
	@OneToMany(mappedBy="actionProblem1")
	public List<ActionProblem2ActionProblem> getActionProblem2actionProblems1() {
		return this.actionProblem2actionProblems1;
	}

	public void setActionProblem2actionProblems1(List<ActionProblem2ActionProblem> actionProblem2actionProblems1) {
		this.actionProblem2actionProblems1 = actionProblem2actionProblems1;
	}

	public ActionProblem2ActionProblem addActionProblem2actionProblems1(ActionProblem2ActionProblem actionProblem2actionProblems1) {
		getActionProblem2actionProblems1().add(actionProblem2actionProblems1);
		actionProblem2actionProblems1.setActionProblem1(this);

		return actionProblem2actionProblems1;
	}

	public ActionProblem2ActionProblem removeActionProblem2actionProblems1(ActionProblem2ActionProblem actionProblem2actionProblems1) {
		getActionProblem2actionProblems1().remove(actionProblem2actionProblems1);
		actionProblem2actionProblems1.setActionProblem1(null);

		return actionProblem2actionProblems1;
	}


	//bi-directional many-to-one association to ActionProblem2ActionProblem
	@OneToMany(mappedBy="actionProblem2")
	public List<ActionProblem2ActionProblem> getActionProblem2actionProblems2() {
		return this.actionProblem2actionProblems2;
	}

	public void setActionProblem2actionProblems2(List<ActionProblem2ActionProblem> actionProblem2actionProblems2) {
		this.actionProblem2actionProblems2 = actionProblem2actionProblems2;
	}

	public ActionProblem2ActionProblem addActionProblem2actionProblems2(ActionProblem2ActionProblem actionProblem2actionProblems2) {
		getActionProblem2actionProblems2().add(actionProblem2actionProblems2);
		actionProblem2actionProblems2.setActionProblem2(this);

		return actionProblem2actionProblems2;
	}

	public ActionProblem2ActionProblem removeActionProblem2actionProblems2(ActionProblem2ActionProblem actionProblem2actionProblems2) {
		getActionProblem2actionProblems2().remove(actionProblem2actionProblems2);
		actionProblem2actionProblems2.setActionProblem2(null);

		return actionProblem2actionProblems2;
	}

}