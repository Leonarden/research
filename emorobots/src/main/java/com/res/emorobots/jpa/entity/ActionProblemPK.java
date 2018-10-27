package com.res.emorobots.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the ActionProblem database table.
 * 
 */
@Embeddable
public class ActionProblemPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private String actionId;

	@Column(insertable=false, updatable=false)
	private String problemId;

	public ActionProblemPK() {
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

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ActionProblemPK)) {
			return false;
		}
		ActionProblemPK castOther = (ActionProblemPK)other;
		return 
			this.actionId.equals(castOther.actionId)
			&& this.problemId.equals(castOther.problemId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.actionId.hashCode();
		hash = hash * prime + this.problemId.hashCode();
		
		return hash;
	}
}