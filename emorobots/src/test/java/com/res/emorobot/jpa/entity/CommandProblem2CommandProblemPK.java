package com.res.emorobot.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the CommandProblem2CommandProblem database table.
 * 
 */
@Embeddable
public class CommandProblem2CommandProblemPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private String commandId;

	private String problemId;

	@Column(insertable=false, updatable=false)
	private String command2Id;

	@Column(insertable=false, updatable=false)
	private String problem2Id;

	public CommandProblem2CommandProblemPK() {
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
	public String getCommand2Id() {
		return this.command2Id;
	}
	public void setCommand2Id(String command2Id) {
		this.command2Id = command2Id;
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
		if (!(other instanceof CommandProblem2CommandProblemPK)) {
			return false;
		}
		CommandProblem2CommandProblemPK castOther = (CommandProblem2CommandProblemPK)other;
		return 
			this.commandId.equals(castOther.commandId)
			&& this.problemId.equals(castOther.problemId)
			&& this.command2Id.equals(castOther.command2Id)
			&& this.problem2Id.equals(castOther.problem2Id);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.commandId.hashCode();
		hash = hash * prime + this.problemId.hashCode();
		hash = hash * prime + this.command2Id.hashCode();
		hash = hash * prime + this.problem2Id.hashCode();
		
		return hash;
	}
}