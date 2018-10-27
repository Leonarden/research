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
@NamedQuery(name="ActionProblem2ActionProblem.findAll", query="SELECT a FROM ActionProblem2ActionProblem a")
public class ActionProblem2ActionProblem implements Serializable {
	private static final long serialVersionUID = 1L;
	private String actionproblem2actionproblemId;
	private String entityName;
	private Date lastaccess;
	private BigInteger numaccess;
	private String text;
	private ActionProblem actionProblem1;
	private ActionProblem actionProblem2;

	public ActionProblem2ActionProblem() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public String getActionproblem2actionproblemId() {
		return this.actionproblem2actionproblemId;
	}

	public void setActionproblem2actionproblemId(String actionproblem2actionproblemId) {
		this.actionproblem2actionproblemId = actionproblem2actionproblemId;
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


	//bi-directional many-to-one association to ActionProblem
	@ManyToOne
	@JoinColumn(name="actionproblem2Id")
	public ActionProblem getActionProblem1() {
		return this.actionProblem1;
	}

	public void setActionProblem1(ActionProblem actionProblem1) {
		this.actionProblem1 = actionProblem1;
	}


	//bi-directional many-to-one association to ActionProblem
	@ManyToOne
	@JoinColumn(name="actionproblemId")
	public ActionProblem getActionProblem2() {
		return this.actionProblem2;
	}

	public void setActionProblem2(ActionProblem actionProblem2) {
		this.actionProblem2 = actionProblem2;
	}

}