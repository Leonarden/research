package com.res.emorobot.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;
import java.util.List;


/**
 * The persistent class for the CommandProblem database table.
 * 
 */
@Entity
@NamedQuery(name="CommandProblem.findAll", query="SELECT c FROM CommandProblem c")
public class CommandProblem implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CommandProblemPK id;

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

	//bi-directional many-to-one association to CommandProblem2CommandProblem
	@OneToMany(mappedBy="commandProblem")
	private List<CommandProblem2CommandProblem> commandProblem2commandProblems;

	public CommandProblem() {
	}

	public CommandProblemPK getId() {
		return this.id;
	}

	public void setId(CommandProblemPK id) {
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

	public List<CommandProblem2CommandProblem> getCommandProblem2commandProblems() {
		return this.commandProblem2commandProblems;
	}

	public void setCommandProblem2commandProblems(List<CommandProblem2CommandProblem> commandProblem2commandProblems) {
		this.commandProblem2commandProblems = commandProblem2commandProblems;
	}

	public CommandProblem2CommandProblem addCommandProblem2commandProblem(CommandProblem2CommandProblem commandProblem2commandProblem) {
		getCommandProblem2commandProblems().add(commandProblem2commandProblem);
		commandProblem2commandProblem.setCommandProblem(this);

		return commandProblem2commandProblem;
	}

	public CommandProblem2CommandProblem removeCommandProblem2commandProblem(CommandProblem2CommandProblem commandProblem2commandProblem) {
		getCommandProblem2commandProblems().remove(commandProblem2commandProblem);
		commandProblem2commandProblem.setCommandProblem(null);

		return commandProblem2commandProblem;
	}

}