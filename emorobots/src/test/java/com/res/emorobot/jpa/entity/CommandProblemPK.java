package com.res.emorobot.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the CommandProblem database table.
 * 
 */
@Embeddable
public class CommandProblemPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private String commandId;

	@Column(insertable=false, updatable=false)
	private String problemId;

	public CommandProblemPK() {
	}
	public String getCommandId() {
		return this.commandId;
	}
	public void setCommandId(String commandId) {
		this.commandId = commandId;
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
		if (!(other instanceof CommandProblemPK)) {
			return false;
		}
		CommandProblemPK castOther = (CommandProblemPK)other;
		return 
			this.commandId.equals(castOther.commandId)
			&& this.problemId.equals(castOther.problemId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.commandId.hashCode();
		hash = hash * prime + this.problemId.hashCode();
		
		return hash;
	}
}