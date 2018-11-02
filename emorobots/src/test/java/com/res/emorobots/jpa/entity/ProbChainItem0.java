package com.res.emorobots.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ProbChainItem0 database table.
 * 
 */
@Entity
@Table(name="ProbChainItem0")
@NamedQuery(name="ProbChainItem0.findAll", query="SELECT p FROM ProbChainItem0 p")
public class ProbChainItem0 implements Serializable {
	private static final long serialVersionUID = 1L;
	private String probchainItemId;
	private int anomaly;
	private int indexinchain;
	private float itemvalue;
	private ProbChainItem0 probChainItem0;
	private List<ProbChainItem0> probChainItem0s;
	private List<ProbChainItem1> probChainItem1s;

	public ProbChainItem0() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
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


	//bi-directional many-to-one association to ProbChainItem0
	@OneToMany(mappedBy="probChainItem0")
	public List<ProbChainItem0> getProbChainItem0s() {
		return this.probChainItem0s;
	}

	public void setProbChainItem0s(List<ProbChainItem0> probChainItem0s) {
		this.probChainItem0s = probChainItem0s;
	}

	public ProbChainItem0 addProbChainItem0(ProbChainItem0 probChainItem0) {
		getProbChainItem0s().add(probChainItem0);
		probChainItem0.setProbChainItem0(this);

		return probChainItem0;
	}

	public ProbChainItem0 removeProbChainItem0(ProbChainItem0 probChainItem0) {
		getProbChainItem0s().remove(probChainItem0);
		probChainItem0.setProbChainItem0(null);

		return probChainItem0;
	}


	//bi-directional many-to-one association to ProbChainItem1
	@OneToMany(mappedBy="probChainItem0")
	public List<ProbChainItem1> getProbChainItem1s() {
		return this.probChainItem1s;
	}

	public void setProbChainItem1s(List<ProbChainItem1> probChainItem1s) {
		this.probChainItem1s = probChainItem1s;
	}

	public ProbChainItem1 addProbChainItem1(ProbChainItem1 probChainItem1) {
		getProbChainItem1s().add(probChainItem1);
		probChainItem1.setProbChainItem0(this);

		return probChainItem1;
	}

	public ProbChainItem1 removeProbChainItem1(ProbChainItem1 probChainItem1) {
		getProbChainItem1s().remove(probChainItem1);
		probChainItem1.setProbChainItem0(null);

		return probChainItem1;
	}

}