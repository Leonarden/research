package com.res.emorobots.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the CommandOrder2CommandOrder database table.
 * 
 */
@Entity
@Table(name="CommandOrder2CommandOrder")
@NamedQuery(name="CommandOrder2CommandOrder.findAll", query="SELECT c FROM CommandOrder2CommandOrder c")
public class CommandOrder2CommandOrder implements Serializable {
	private static final long serialVersionUID = 1L;
	private String commandorder2commandorderId;
	private BigInteger candidateId;
	private BigInteger candidateNormId;
	private Date lastaccess;
	private BigInteger numaccess;
	private String text;
	private CommandOrder commandOrder1;
	private CommandOrder commandOrder2;
	private WeightNorm weightNorm;

	public CommandOrder2CommandOrder() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	public String getCommandorder2commandorderId() {
		return this.commandorder2commandorderId;
	}

	public void setCommandorder2commandorderId(String commandorder2commandorderId) {
		this.commandorder2commandorderId = commandorder2commandorderId;
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


	//bi-directional many-to-one association to CommandOrder
	@ManyToOne
	@JoinColumn(name="commandorder2Id", nullable=false)
	public CommandOrder getCommandOrder1() {
		return this.commandOrder1;
	}

	public void setCommandOrder1(CommandOrder commandOrder1) {
		this.commandOrder1 = commandOrder1;
	}


	//bi-directional many-to-one association to CommandOrder
	@ManyToOne
	@JoinColumn(name="commandorderId", nullable=false)
	public CommandOrder getCommandOrder2() {
		return this.commandOrder2;
	}

	public void setCommandOrder2(CommandOrder commandOrder2) {
		this.commandOrder2 = commandOrder2;
	}


	//bi-directional many-to-one association to WeightNorm
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="commandorder2commandorderId", referencedColumnName="entityNormId", nullable=false, insertable=false, updatable=false),
		@JoinColumn(name="entityName", referencedColumnName="entityName", nullable=false)
		})
	public WeightNorm getWeightNorm() {
		return this.weightNorm;
	}

	public void setWeightNorm(WeightNorm weightNorm) {
		this.weightNorm = weightNorm;
	}

}