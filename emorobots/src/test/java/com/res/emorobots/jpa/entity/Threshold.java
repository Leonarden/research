package com.res.emorobots.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the Threshold database table.
 * 
 */
@Entity
@Table(name="Threshold")
@NamedQuery(name="Threshold.findAll", query="SELECT t FROM Threshold t")
public class Threshold implements Serializable {
	private static final long serialVersionUID = 1L;
	private ThresholdPK id;
	private float anger;
	private float fear;
	private float happy;
	private Date lastAccess;
	private float love;
	private BigInteger numaccess;
	private float peace;
	private float sad;

	public Threshold() {
	}


	@EmbeddedId
	public ThresholdPK getId() {
		return this.id;
	}

	public void setId(ThresholdPK id) {
		this.id = id;
	}


	@Column(nullable=false)
	public float getAnger() {
		return this.anger;
	}

	public void setAnger(float anger) {
		this.anger = anger;
	}


	@Column(nullable=false)
	public float getFear() {
		return this.fear;
	}

	public void setFear(float fear) {
		this.fear = fear;
	}


	@Column(nullable=false)
	public float getHappy() {
		return this.happy;
	}

	public void setHappy(float happy) {
		this.happy = happy;
	}


	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable=false)
	public Date getLastAccess() {
		return this.lastAccess;
	}

	public void setLastAccess(Date lastAccess) {
		this.lastAccess = lastAccess;
	}


	@Column(nullable=false)
	public float getLove() {
		return this.love;
	}

	public void setLove(float love) {
		this.love = love;
	}


	@Column(nullable=false)
	public BigInteger getNumaccess() {
		return this.numaccess;
	}

	public void setNumaccess(BigInteger numaccess) {
		this.numaccess = numaccess;
	}


	@Column(nullable=false)
	public float getPeace() {
		return this.peace;
	}

	public void setPeace(float peace) {
		this.peace = peace;
	}


	@Column(nullable=false)
	public float getSad() {
		return this.sad;
	}

	public void setSad(float sad) {
		this.sad = sad;
	}

}