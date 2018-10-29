package com.res.emorobots.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the CommandProblem2CommandProblem database table.
 * 
 */
@Entity
@Table(name="CommandProblem2CommandProblem")
@NamedQuery(name="CommandProblem2CommandProblem.findAll", query="SELECT c FROM CommandProblem2CommandProblem c")
public class CommandProblem2CommandProblem implements Serializable {
	private static final long serialVersionUID = 1L;
	private String commandproblem2commandproblemId;
	private BigInteger candidateId;
	private BigInteger candidateNormId;
	private Date lastaccess;
	private BigInteger numaccess;
	private String text;
	private CommandProblem commandProblem1;
	private CommandProblem commandProblem2;
	private WeightNorm weightNorm;

	public CommandProblem2CommandProblem() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	public String getCommandproblem2commandproblemId() {
		return this.commandproblem2commandproblemId;
	}

	public void setCommandproblem2commandproblemId(String commandproblem2commandproblemId) {
		this.commandproblem2commandproblemId = commandproblem2commandproblemId;
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


	//bi-directional many-to-one association to CommandProblem
	@ManyToOne
	@JoinColumn(name="commandproblem2Id", nullable=false)
	public CommandProblem getCommandProblem1() {
		return this.commandProblem1;
	}

	public void setCommandProblem1(CommandProblem commandProblem1) {
		this.commandProblem1 = commandProblem1;
	}


	//bi-directional many-to-one association to CommandProblem
	@ManyToOne
	@JoinColumn(name="commandproblemId", nullable=false)
	public CommandProblem getCommandProblem2() {
		return this.commandProblem2;
	}

	public void setCommandProblem2(CommandProblem commandProblem2) {
		this.commandProblem2 = commandProblem2;
	}


	//bi-directional many-to-one association to WeightNorm
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="commandproblem2commandproblemId", referencedColumnName="entityNormId", nullable=false, insertable=false, updatable=false),
		@JoinColumn(name="entityName", referencedColumnName="entityName", nullable=false)
		})
	public WeightNorm getWeightNorm() {
		return this.weightNorm;
	}

	public void setWeightNorm(WeightNorm weightNorm) {
		this.weightNorm = weightNorm;
	}

}