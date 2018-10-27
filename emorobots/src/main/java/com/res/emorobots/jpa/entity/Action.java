package com.res.emorobots.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;
import java.util.List;


/**
 * The persistent class for the Action database table.
 * 
 */
@Entity
@NamedQuery(name="Action.findAll", query="SELECT a FROM Action a")
public class Action implements Serializable {
	private static final long serialVersionUID = 1L;
	private String actionId;
	private String entityName;
	private Date lastaccess;
	private BigInteger numaccess;
	private String text;
	private Command command;
	private List<ActionProblem> actionProblems;

	public Action() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public String getActionId() {
		return this.actionId;
	}

	public void setActionId(String actionId) {
		this.actionId = actionId;
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


	//bi-directional many-to-one association to Command
	@ManyToOne
	@JoinColumn(name="commandId")
	public Command getCommand() {
		return this.command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}


	//bi-directional many-to-one association to ActionProblem
	@OneToMany(mappedBy="action")
	public List<ActionProblem> getActionProblems() {
		return this.actionProblems;
	}

	public void setActionProblems(List<ActionProblem> actionProblems) {
		this.actionProblems = actionProblems;
	}

	public ActionProblem addActionProblem(ActionProblem actionProblem) {
		getActionProblems().add(actionProblem);
		actionProblem.setAction(this);

		return actionProblem;
	}

	public ActionProblem removeActionProblem(ActionProblem actionProblem) {
		getActionProblems().remove(actionProblem);
		actionProblem.setAction(null);

		return actionProblem;
	}

}