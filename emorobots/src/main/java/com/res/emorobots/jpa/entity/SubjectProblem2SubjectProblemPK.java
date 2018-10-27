package com.res.emorobots.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the SubjectProblem2SubjectProblem database table.
 * 
 */
@Embeddable
public class SubjectProblem2SubjectProblemPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private String subjectId;

	private String problemId;

	@Column(insertable=false, updatable=false)
	private String subject2Id;

	@Column(insertable=false, updatable=false)
	private String problem2Id;

	public SubjectProblem2SubjectProblemPK() {
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
	public String getSubject2Id() {
		return this.subject2Id;
	}
	public void setSubject2Id(String subject2Id) {
		this.subject2Id = subject2Id;
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
		if (!(other instanceof SubjectProblem2SubjectProblemPK)) {
			return false;
		}
		SubjectProblem2SubjectProblemPK castOther = (SubjectProblem2SubjectProblemPK)other;
		return 
			this.subjectId.equals(castOther.subjectId)
			&& this.problemId.equals(castOther.problemId)
			&& this.subject2Id.equals(castOther.subject2Id)
			&& this.problem2Id.equals(castOther.problem2Id);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.subjectId.hashCode();
		hash = hash * prime + this.problemId.hashCode();
		hash = hash * prime + this.subject2Id.hashCode();
		hash = hash * prime + this.problem2Id.hashCode();
		
		return hash;
	}
}