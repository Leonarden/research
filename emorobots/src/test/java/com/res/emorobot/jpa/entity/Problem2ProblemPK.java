package com.res.emorobot.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the Problem2Problem database table.
 * 
 */
@Embeddable
public class Problem2ProblemPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private String problemId;

	@Column(insertable=false, updatable=false)
	private String problem2Id;

	public Problem2ProblemPK() {
	}
	public String getProblemId() {
		return this.problemId;
	}
	public void setProblemId(String problemId) {
		this.problemId = problemId;
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
		if (!(other instanceof Problem2ProblemPK)) {
			return false;
		}
		Problem2ProblemPK castOther = (Problem2ProblemPK)other;
		return 
			this.problemId.equals(castOther.problemId)
			&& this.problem2Id.equals(castOther.problem2Id);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.problemId.hashCode();
		hash = hash * prime + this.problem2Id.hashCode();
		
		return hash;
	}
}