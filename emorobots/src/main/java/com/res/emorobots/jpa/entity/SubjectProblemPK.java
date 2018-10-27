package com.res.emorobots.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the SubjectProblem database table.
 * 
 */
@Embeddable
public class SubjectProblemPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private String subjectId;

	@Column(insertable=false, updatable=false)
	private String problemId;

	public SubjectProblemPK() {
	}
	public String getSubjectId() {
		return this.subjectId;
	}
	public void setSubjectId(String subjectId) {
		this.subjectId = subjectId;
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
		if (!(other instanceof SubjectProblemPK)) {
			return false;
		}
		SubjectProblemPK castOther = (SubjectProblemPK)other;
		return 
			this.subjectId.equals(castOther.subjectId)
			&& this.problemId.equals(castOther.problemId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.subjectId.hashCode();
		hash = hash * prime + this.problemId.hashCode();
		
		return hash;
	}
}