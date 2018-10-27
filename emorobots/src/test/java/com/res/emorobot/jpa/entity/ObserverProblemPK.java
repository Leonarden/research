package com.res.emorobot.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the ObserverProblem database table.
 * 
 */
@Embeddable
public class ObserverProblemPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private String observerId;

	@Column(insertable=false, updatable=false)
	private String problemId;

	public ObserverProblemPK() {
	}
	public String getObserverId() {
		return this.observerId;
	}
	public void setObserverId(String observerId) {
		this.observerId = observerId;
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
		if (!(other instanceof ObserverProblemPK)) {
			return false;
		}
		ObserverProblemPK castOther = (ObserverProblemPK)other;
		return 
			this.observerId.equals(castOther.observerId)
			&& this.problemId.equals(castOther.problemId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.observerId.hashCode();
		hash = hash * prime + this.problemId.hashCode();
		
		return hash;
	}
}