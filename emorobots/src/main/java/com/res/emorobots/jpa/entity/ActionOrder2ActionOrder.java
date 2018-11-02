package com.res.emorobots.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the ActionOrder2ActionOrder database table.
 * 
 */
@Entity
@Table(name="ActionOrder2ActionOrder")
@NamedQuery(name="ActionOrder2ActionOrder.findAll", query="SELECT a FROM ActionOrder2ActionOrder a")
public class ActionOrder2ActionOrder implements Serializable {
	private static final long serialVersionUID = 1L;
	private String actionorder2actionorderId;
	private BigInteger candidateId;
	private BigInteger candidateNormId;
	private Date lastaccess;
	private BigInteger numaccess;
	private String text;
	private WeightNorm weightNorm;
	private ActionOrder actionOrder1;
	private ActionOrder actionOrder2;

	public ActionOrder2ActionOrder() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	public String getActionorder2actionorderId() {
		return this.actionorder2actionorderId;
	}

	public void setActionorder2actionorderId(String actionorder2actionorderId) {
		this.actionorder2actionorderId = actionorder2actionorderId;
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


	//bi-directional many-to-one association to WeightNorm
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="actionorder2actionorderId", referencedColumnName="entityNormId", nullable=false, insertable=false, updatable=false),
		@JoinColumn(name="entityName", referencedColumnName="entityName", nullable=false)
		})
	public WeightNorm getWeightNorm() {
		return this.weightNorm;
	}

	public void setWeightNorm(WeightNorm weightNorm) {
		this.weightNorm = weightNorm;
	}


	//bi-directional many-to-one association to ActionOrder
	@ManyToOne
	@JoinColumn(name="actionorder2Id", nullable=false)
	public ActionOrder getActionOrder1() {
		return this.actionOrder1;
	}

	public void setActionOrder1(ActionOrder actionOrder1) {
		this.actionOrder1 = actionOrder1;
	}


	//bi-directional many-to-one association to ActionOrder
	@ManyToOne
	@JoinColumn(name="actionorderId", nullable=false)
	public ActionOrder getActionOrder2() {
		return this.actionOrder2;
	}

	public void setActionOrder2(ActionOrder actionOrder2) {
		this.actionOrder2 = actionOrder2;
	}

}