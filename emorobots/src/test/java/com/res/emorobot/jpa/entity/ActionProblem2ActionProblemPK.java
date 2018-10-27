package com.res.emorobot.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the ActionProblem2ActionProblem database table.
 * 
 */
@Embeddable
public class ActionProblem2ActionProblemPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private String actionId;

	private String problemId;

	@Column(insertable=false, updatable=false)
	private String action2Id;

	@Column(insertable=false, updatable=false)
	private String problem2Id;

	public ActionProblem2ActionProblemPK() {
	}
	public String getActionId() {
		return this.actionId;
	}
	public void setActionId(String actionId) {
		this.actionId = actionId;
	}
	public String getProblemId() {
		return this.problemId;
	}
	public void setProblemId(String problemId) {
		this.problemId = problemId;
	}
	public String getAction2Id() {
		return this.action2Id;
	}
	public void setAction2Id(String action2Id) {
		this.action2Id = action2Id;
	}
	public String getProblem2Id() {
		return this.problem2Id;
	}
	public void setProblem2Id(String problem2Id) {
		this.problem2Id = problem2Id;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ActionProblem2ActionProblemPK)) {
			return false;
		}
		ActionProblem2ActionProblemPK castOther = (ActionProblem2ActionProblemPK)other;
		return 
			this.actionId.equals(castOther.actionId)
			&& this.problemId.equals(castOther.problemId)
			&& this.action2Id.equals(castOther.action2Id)
			&& this.problem2Id.equals(castOther.problem2Id);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.actionId.hashCode();
		hash = hash * prime + this.problemId.hashCode();
		hash = hash * prime + this.action2Id.hashCode();
		hash = hash * prime + this.problem2Id.hashCode();
		
		return hash;
	}
}