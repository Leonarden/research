package com.res.emorobots.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the Weight database table.
 * 
 */
@Embeddable
public class WeightPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;
	private String weightId;
	private String entityId;
	private String entityName;

	public WeightPK() {
	}

	@Column(unique=true, nullable=false)
	public String getWeightId() {
		return this.weightId;
	}
	public void setWeightId(String weightId) {
		this.weightId = weightId;
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
		if (!(other instanceof WeightPK)) {
			return false;
		}
		WeightPK castOther = (WeightPK)other;
		return 
			this.weightId.equals(castOther.weightId)
			&& this.entityId.equals(castOther.entityId)
			&& this.entityName.equals(castOther.entityName);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.weightId.hashCode();
		hash = hash * prime + this.entityId.hashCode();
		hash = hash * prime + this.entityName.hashCode();
		
		return hash;
	}
}