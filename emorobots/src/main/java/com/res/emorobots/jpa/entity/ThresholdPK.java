package com.res.emorobots.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the Threshold database table.
 * 
 */
@Embeddable
public class ThresholdPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;
	private String thresholdId;
	private String entityId;
	private String entityName;

	public ThresholdPK() {
	}

	@Column(unique=true, nullable=false)
	public String getThresholdId() {
		return this.thresholdId;
	}
	public void setThresholdId(String thresholdId) {
		this.thresholdId = thresholdId;
	}

	@Column(unique=true, nullable=false)
	public String getEntityId() {
		return this.entityId;
	}
	public void setEntityId(String entityId) {
		this.entityId = entityId;
	}

	@Column(unique=true, nullable=false, length=30)
	public String getEntityName() {
		return this.entityName;
	}
	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ThresholdPK)) {
			return false;
		}
		ThresholdPK castOther = (ThresholdPK)other;
		return 
			this.thresholdId.equals(castOther.thresholdId)
			&& this.entityId.equals(castOther.entityId)
			&& this.entityName.equals(castOther.entityName);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.thresholdId.hashCode();
		hash = hash * prime + this.entityId.hashCode();
		hash = hash * prime + this.entityName.hashCode();
		
		return hash;
	}
}