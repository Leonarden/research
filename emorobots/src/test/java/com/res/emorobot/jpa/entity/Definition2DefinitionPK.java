package com.res.emorobot.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the Definition2Definition database table.
 * 
 */
@Embeddable
public class Definition2DefinitionPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private String definitionId;

	private String problemId;

	@Column(insertable=false, updatable=false)
	private String definition2Id;

	@Column(insertable=false, updatable=false)
	private String problem2Id;

	public Definition2DefinitionPK() {
	}
	public String getDefinitionId() {
		return this.definitionId;
	}
	public void setDefinitionId(String definitionId) {
		this.definitionId = definitionId;
	}
	public String getProblemId() {
		return this.problemId;
	}
	public void setProblemId(String problemId) {
		this.problemId = problemId;
	}
	public String getDefinition2Id() {
		return this.definition2Id;
	}
	public void setDefinition2Id(String definition2Id) {
		this.definition2Id = definition2Id;
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
		if (!(other instanceof Definition2DefinitionPK)) {
			return false;
		}
		Definition2DefinitionPK castOther = (Definition2DefinitionPK)other;
		return 
			this.definitionId.equals(castOther.definitionId)
			&& this.problemId.equals(castOther.problemId)
			&& this.definition2Id.equals(castOther.definition2Id)
			&& this.problem2Id.equals(castOther.problem2Id);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.definitionId.hashCode();
		hash = hash * prime + this.problemId.hashCode();
		hash = hash * prime + this.definition2Id.hashCode();
		hash = hash * prime + this.problem2Id.hashCode();
		
		return hash;
	}
}