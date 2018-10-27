package com.res.emorobot.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the CommandProblem2CommandProblem database table.
 * 
 */
@Entity
@NamedQuery(name="CommandProblem2CommandProblem.findAll", query="SELECT c FROM CommandProblem2CommandProblem c")
public class CommandProblem2CommandProblem implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CommandProblem2CommandProblemPK id;

	@Temporal(TemporalType.TIMESTAMP)
	private Date lastaccess;

	private BigInteger numaccess;

	private String text;

	//bi-directional many-to-one association to CommandProblem
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="command2Id", referencedColumnName="commandId"),
		@JoinColumn(name="problem2Id", referencedColumnName="problemId")
		})
	private CommandProblem commandProblem;

	//bi-directional many-to-one association to WeightNorm
	@ManyToOne
	@JoinColumn(name="weightNormId")
	private WeightNorm weightNorm;

	public CommandProblem2CommandProblem() {
	}

	public CommandProblem2CommandProblemPK getId() {
		return this.id;
	}

	public void setId(CommandProblem2CommandProblemPK id) {
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

	public CommandProblem getCommandProblem() {
		return this.commandProblem;
	}

	public void setCommandProblem(CommandProblem commandProblem) {
		this.commandProblem = commandProblem;
	}

	public WeightNorm getWeightNorm() {
		return this.weightNorm;
	}

	public void setWeightNorm(WeightNorm weightNorm) {
		this.weightNorm = weightNorm;
	}

}