package com.res.emorobots.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ProbChainItem5 database table.
 * 
 */
@Entity
@Table(name="ProbChainItem5")
@NamedQuery(name="ProbChainItem5.findAll", query="SELECT p FROM ProbChainItem5 p")
public class ProbChainItem5 implements Serializable {
	private static final long serialVersionUID = 1L;
	private String probchainItemId;
	private int anomaly;
	private int indexinchain;
	private float itemvalue;
	private ProbChainItem5 probChainItem5;
	private List<ProbChainItem5> probChainItem5s;

	public ProbChainItem5() {
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


	//bi-directional many-to-one association to ProbChainItem5
	@ManyToOne
	@JoinColumn(name="nextId")
	public ProbChainItem5 getProbChainItem5() {
		return this.probChainItem5;
	}

	public void setProbChainItem5(ProbChainItem5 probChainItem5) {
		this.probChainItem5 = probChainItem5;
	}


	//bi-directional many-to-one association to ProbChainItem5
	@OneToMany(mappedBy="probChainItem5")
	public List<ProbChainItem5> getProbChainItem5s() {
		return this.probChainItem5s;
	}

	public void setProbChainItem5s(List<ProbChainItem5> probChainItem5s) {
		this.probChainItem5s = probChainItem5s;
	}

	public ProbChainItem5 addProbChainItem5(ProbChainItem5 probChainItem5) {
		getProbChainItem5s().add(probChainItem5);
		probChainItem5.setProbChainItem5(this);

		return probChainItem5;
	}

	public ProbChainItem5 removeProbChainItem5(ProbChainItem5 probChainItem5) {
		getProbChainItem5s().remove(probChainItem5);
		probChainItem5.setProbChainItem5(null);

		return probChainItem5;
	}

}