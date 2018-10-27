package com.res.emorobots.jpa.entity;

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
@Table(name="CommandProblem")
@NamedQuery(name="CommandProblem.findAll", query="SELECT c FROM CommandProblem c")
public class CommandProblem implements Serializable {
	private static final long serialVersionUID = 1L;
	private String commandproblemId;
	private BigInteger candidateId;
	private BigInteger candidateNormId;
	private Date lastaccess;
	private BigInteger numaccess;
	private String text;
	private Command command;
	private Problem problem;
	private WeightNorm weightNorm;
	private List<CommandProblem2CommandProblem> commandProblem2commandProblems1;
	private List<CommandProblem2CommandProblem> commandProblem2commandProblems2;

	public CommandProblem() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	public String getCommandproblemId() {
		return this.commandproblemId;
	}

	public void setCommandproblemId(String commandproblemId) {
		this.commandproblemId = commandproblemId;
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


	//bi-directional many-to-one association to Command
	@ManyToOne
	@JoinColumn(name="commandId", nullable=false)
	public Command getCommand() {
		return this.command;
	}

	public void setCommand(Command command) {
		this.command = command;
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
		@JoinColumn(name="commandproblemId", referencedColumnName="entityNormId", nullable=false, insertable=false, updatable=false),
		@JoinColumn(name="entityName", referencedColumnName="entityName", nullable=false)
		})
	public WeightNorm getWeightNorm() {
		return this.weightNorm;
	}

	public void setWeightNorm(WeightNorm weightNorm) {
		this.weightNorm = weightNorm;
	}


	//bi-directional many-to-one association to CommandProblem2CommandProblem
	@OneToMany(mappedBy="commandProblem1")
	public List<CommandProblem2CommandProblem> getCommandProblem2commandProblems1() {
		return this.commandProblem2commandProblems1;
	}

	public void setCommandProblem2commandProblems1(List<CommandProblem2CommandProblem> commandProblem2commandProblems1) {
		this.commandProblem2commandProblems1 = commandProblem2commandProblems1;
	}

	public CommandProblem2CommandProblem addCommandProblem2commandProblems1(CommandProblem2CommandProblem commandProblem2commandProblems1) {
		getCommandProblem2commandProblems1().add(commandProblem2commandProblems1);
		commandProblem2commandProblems1.setCommandProblem1(this);

		return commandProblem2commandProblems1;
	}

	public CommandProblem2CommandProblem removeCommandProblem2commandProblems1(CommandProblem2CommandProblem commandProblem2commandProblems1) {
		getCommandProblem2commandProblems1().remove(commandProblem2commandProblems1);
		commandProblem2commandProblems1.setCommandProblem1(null);

		return commandProblem2commandProblems1;
	}


	//bi-directional many-to-one association to CommandProblem2CommandProblem
	@OneToMany(mappedBy="commandProblem2")
	public List<CommandProblem2CommandProblem> getCommandProblem2commandProblems2() {
		return this.commandProblem2commandProblems2;
	}

	public void setCommandProblem2commandProblems2(List<CommandProblem2CommandProblem> commandProblem2commandProblems2) {
		this.commandProblem2commandProblems2 = commandProblem2commandProblems2;
	}

	public CommandProblem2CommandProblem addCommandProblem2commandProblems2(CommandProblem2CommandProblem commandProblem2commandProblems2) {
		getCommandProblem2commandProblems2().add(commandProblem2commandProblems2);
		commandProblem2commandProblems2.setCommandProblem2(this);

		return commandProblem2commandProblems2;
	}

	public CommandProblem2CommandProblem removeCommandProblem2commandProblems2(CommandProblem2CommandProblem commandProblem2commandProblems2) {
		getCommandProblem2commandProblems2().remove(commandProblem2commandProblems2);
		commandProblem2commandProblems2.setCommandProblem2(null);

		return commandProblem2commandProblems2;
	}

}