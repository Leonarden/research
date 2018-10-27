package com.res.emorobots.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the ActionProblem2ActionProblem database table.
 * 
 */
@Entity
@Table(name="ActionProblem2ActionProblem")
@NamedQuery(name="ActionProblem2ActionProblem.findAll", query="SELECT a FROM ActionProblem2ActionProblem a")
public class ActionProblem2ActionProblem implements Serializable {
	private static final long serialVersionUID = 1L;
	private String actionproblem2actionproblemId;
	private BigInteger candidateId;
	private BigInteger candidateNormId;
	private Date lastaccess;
	private BigInteger numaccess;
	private String text;
	private ActionProblem actionProblem1;
	private ActionProblem actionProblem2;
	private WeightNorm weightNorm;

	public ActionProblem2ActionProblem() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	public String getActionproblem2actionproblemId() {
		return this.actionproblem2actionproblemId;
	}

	public void setActionproblem2actionproblemId(String actionproblem2actionproblemId) {
		this.actionproblem2actionproblemId = actionproblem2actionproblemId;
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


	//bi-directional many-to-one association to ActionProblem
	@ManyToOne
	@JoinColumn(name="actionproblem2Id", nullable=false)
	public ActionProblem getActionProblem1() {
		return this.actionProblem1;
	}

	public void setActionProblem1(ActionProblem actionProblem1) {
		this.actionProblem1 = actionProblem1;
	}


	//bi-directional many-to-one association to ActionProblem
	@ManyToOne
	@JoinColumn(name="actionproblemId", nullable=false)
	public ActionProblem getActionProblem2() {
		return this.actionProblem2;
	}

	public void setActionProblem2(ActionProblem actionProblem2) {
		this.actionProblem2 = actionProblem2;
	}


	//bi-directional many-to-one association to WeightNorm
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="actionproblem2actionproblemId", referencedColumnName="entityNormId", nullable=false, insertable=false, updatable=false),
		@JoinColumn(name="entityName", referencedColumnName="entityName", nullable=false)
		})
	public WeightNorm getWeightNorm() {
		return this.weightNorm;
	}

	public void setWeightNorm(WeightNorm weightNorm) {
		this.weightNorm = weightNorm;
	}

}