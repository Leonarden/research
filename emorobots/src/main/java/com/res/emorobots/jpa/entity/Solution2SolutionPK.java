package com.res.emorobots.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the Solution2Solution database table.
 * 
 */
@Embeddable
public class Solution2SolutionPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private String solutionId;

	private String problemId;

	@Column(insertable=false, updatable=false)
	private String solution2Id;

	@Column(insertable=false, updatable=false)
	private String problem2Id;

	public Solution2SolutionPK() {
	}
	public String getSolutionId() {
		return this.solutionId;
	}
	public void setSolutionId(String solutionId) {
		this.solutionId = solutionId;
	}
	public String getProblemId() {
		return this.problemId;
	}
	public void setProblemId(String problemId) {
		this.problemId = problemId;
	}
	public String getSolution2Id() {
		return this.solution2Id;
	}
	public void setSolution2Id(String solution2Id) {
		this.solution2Id = solution2Id;
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
		if (!(other instanceof Solution2SolutionPK)) {
			return false;
		}
		Solution2SolutionPK castOther = (Solution2SolutionPK)other;
		return 
			this.solutionId.equals(castOther.solutionId)
			&& this.problemId.equals(castOther.problemId)
			&& this.solution2Id.equals(castOther.solution2Id)
			&& this.problem2Id.equals(castOther.problem2Id);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.solutionId.hashCode();
		hash = hash * prime + this.problemId.hashCode();
		hash = hash * prime + this.solution2Id.hashCode();
		hash = hash * prime + this.problem2Id.hashCode();
		
		return hash;
	}
}