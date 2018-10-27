package com.res.emorobots.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the WeightNorm database table.
 * 
 */
@Embeddable
public class WeightNormPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;
	private String entityNormId;
	private String entityName;

	public WeightNormPK() {
	}

	public String getEntityNormId() {
		return this.entityNormId;
	}
	public void setEntityNormId(String entityNormId) {
		this.entityNormId = entityNormId;
	}

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
		if (!(other instanceof WeightNormPK)) {
			return false;
		}
		WeightNormPK castOther = (WeightNormPK)other;
		return 
			this.entityNormId.equals(castOther.entityNormId)
			&& this.entityName.equals(castOther.entityName);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.entityNormId.hashCode();
		hash = hash * prime + this.entityName.hashCode();
		
		return hash;
	}
}