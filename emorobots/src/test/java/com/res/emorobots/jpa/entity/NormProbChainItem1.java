package com.res.emorobots.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;


/**
 * The persistent class for the NormProbChainItem1 database table.
 * 
 */
@Entity
@Table(name="NormProbChainItem1")
@NamedQuery(name="NormProbChainItem1.findAll", query="SELECT n FROM NormProbChainItem1 n")
public class NormProbChainItem1 implements Serializable {
	private static final long serialVersionUID = 1L;
	private String probchainItemId;
	private int anomaly;
	private float itemvalue;
	private BigInteger next;

	public NormProbChainItem1() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	public String getProbchainItemId() {
		return this.probchainItemId;
	}

	public void setProbchainItemId(String probchainItemId) {
		this.probchainItemId = probchainItemId;
	}


	@Column(nullable=false)
	public int getAnomaly() {
		return this.anomaly;
	}

	public void setAnomaly(int anomaly) {
		this.anomaly = anomaly;
	}


	@Column(nullable=false)
	public float getItemvalue() {
		return this.itemvalue;
	}

	public void setItemvalue(float itemvalue) {
		this.itemvalue = itemvalue;
	}


	public BigInteger getNext() {
		return this.next;
	}

	public void setNext(BigInteger next) {
		this.next = next;
	}

}