package com.res.emorobots.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;
import java.util.List;


/**
 * The persistent class for the Command database table.
 * 
 */
@Entity
@Table(name="Command")
@NamedQuery(name="Command.findAll", query="SELECT c FROM Command c")
public class Command implements Serializable {
	private static final long serialVersionUID = 1L;
	private String commandId;
	private BigInteger candidateId;
	private BigInteger candidateNormId;
	private Date lastaccess;
	private BigInteger numaccess;
	private String text;
	private List<Action> actions;
	private Observer observer;
	private WeightNorm weightNorm;
	private List<CommandProblem> commandProblems;

	public Command() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	public String getCommandId() {
		return this.commandId;
	}

	public void setCommandId(String commandId) {
		this.commandId = commandId;
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


	//bi-directional many-to-one association to Action
	@OneToMany(mappedBy="command")
	public List<Action> getActions() {
		return this.actions;
	}

	public void setActions(List<Action> actions) {
		this.actions = actions;
	}

	public Action addAction(Action action) {
		getActions().add(action);
		action.setCommand(this);

		return action;
	}

	public Action removeAction(Action action) {
		getActions().remove(action);
		action.setCommand(null);

		return action;
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


	//bi-directional many-to-one association to WeightNorm
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="commandId", referencedColumnName="entityNormId", nullable=false, insertable=false, updatable=false),
		@JoinColumn(name="entityName", referencedColumnName="entityName", nullable=false)
		})
	public WeightNorm getWeightNorm() {
		return this.weightNorm;
	}

	public void setWeightNorm(WeightNorm weightNorm) {
		this.weightNorm = weightNorm;
	}


	//bi-directional many-to-one association to CommandProblem
	@OneToMany(mappedBy="command")
	public List<CommandProblem> getCommandProblems() {
		return this.commandProblems;
	}

	public void setCommandProblems(List<CommandProblem> commandProblems) {
		this.commandProblems = commandProblems;
	}

	public CommandProblem addCommandProblem(CommandProblem commandProblem) {
		getCommandProblems().add(commandProblem);
		commandProblem.setCommand(this);

		return commandProblem;
	}

	public CommandProblem removeCommandProblem(CommandProblem commandProblem) {
		getCommandProblems().remove(commandProblem);
		commandProblem.setCommand(null);

		return commandProblem;
	}

}