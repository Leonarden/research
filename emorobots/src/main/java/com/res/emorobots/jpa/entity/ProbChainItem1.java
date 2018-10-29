package com.res.emorobots.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ProbChainItem1 database table.
 * 
 */
@Entity
@Table(name="ProbChainItem1")
@NamedQuery(name="ProbChainItem1.findAll", query="SELECT p FROM ProbChainItem1 p")
public class ProbChainItem1 implements Serializable {
	private static final long serialVersionUID = 1L;
	private String probchainItemId;
	private int anomaly;
	private int indexinchain;
	private float itemvalue;
	private ProbChainItem0 probChainItem0;

	public ProbChainItem1() {
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


	public int getIndexinchain() {
		return this.indexinchain;
	}

	public void setIndexinchain(int indexinchain) {
		this.indexinchain = indexinchain;
	}


	@Column(nullable=false)
	public float getItemvalue() {
		return this.itemvalue;
	}

	public void setItemvalue(float itemvalue) {
		this.itemvalue = itemvalue;
	}


	//bi-directional many-to-one association to ProbChainItem0
	@ManyToOne
	@JoinColumn(name="nextId")
	public ProbChainItem0 getProbChainItem0() {
		return this.probChainItem0;
	}

	public void setProbChainItem0(ProbChainItem0 probChainItem0) {
		this.probChainItem0 = probChainItem0;
	}

}