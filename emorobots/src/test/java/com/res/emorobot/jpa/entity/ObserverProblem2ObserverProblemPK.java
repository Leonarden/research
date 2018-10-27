package com.res.emorobot.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the ObserverProblem2ObserverProblem database table.
 * 
 */
@Embeddable
public class ObserverProblem2ObserverProblemPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private String observerId;

	private String problemId;

	@Column(insertable=false, updatable=false)
	private String observer2Id;

	@Column(insertable=false, updatable=false)
	private String problem2Id;

	public ObserverProblem2ObserverProblemPK() {
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
	public String getObserver2Id() {
		return this.observer2Id;
	}
	public void setObserver2Id(String observer2Id) {
		this.observer2Id = observer2Id;
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
		if (!(other instanceof ObserverProblem2ObserverProblemPK)) {
			return false;
		}
		ObserverProblem2ObserverProblemPK castOther = (ObserverProblem2ObserverProblemPK)other;
		return 
			this.observerId.equals(castOther.observerId)
			&& this.problemId.equals(castOther.problemId)
			&& this.observer2Id.equals(castOther.observer2Id)
			&& this.problem2Id.equals(castOther.problem2Id);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.observerId.hashCode();
		hash = hash * prime + this.problemId.hashCode();
		hash = hash * prime + this.observer2Id.hashCode();
		hash = hash * prime + this.problem2Id.hashCode();
		
		return hash;
	}
}