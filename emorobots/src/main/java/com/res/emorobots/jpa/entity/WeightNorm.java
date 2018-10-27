package com.res.emorobots.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the WeightNorm database table.
 * 
 */
@Entity
@NamedQuery(name="WeightNorm.findAll", query="SELECT w FROM WeightNorm w")
public class WeightNorm implements Serializable {
	private static final long serialVersionUID = 1L;
	private WeightNormPK id;
	private float anger;
	private float fear;
	private float happy;
	private Date lastAccess;
	private float love;
	private float peace;
	private float sad;

	public WeightNorm() {
	}


	@EmbeddedId
	public WeightNormPK getId() {
		return this.id;
	}

	public void setId(WeightNormPK id) {
		this.id = id;
	}


	public float getAnger() {
		return this.anger;
	}

	public void setAnger(float anger) {
		this.anger = anger;
	}


	public float getFear() {
		return this.fear;
	}

	public void setFear(float fear) {
		this.fear = fear;
	}


	public float getHappy() {
		return this.happy;
	}

	public void setHappy(float happy) {
		this.happy = happy;
	}


	@Temporal(TemporalType.TIMESTAMP)
	public Date getLastAccess() {
		return this.lastAccess;
	}

	public void setLastAccess(Date lastAccess) {
		this.lastAccess = lastAccess;
	}


	public float getLove() {
		return this.love;
	}

	public void setLove(float love) {
		this.love = love;
	}


	public float getPeace() {
		return this.peace;
	}

	public void setPeace(float peace) {
		this.peace = peace;
	}


	public float getSad() {
		return this.sad;
	}

	public void setSad(float sad) {
		this.sad = sad;
	}

}