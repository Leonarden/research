package com.res.emorobots.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ProbChainItem2 database table.
 * 
 */
@Entity
@Table(name="ProbChainItem2")
@NamedQuery(name="ProbChainItem2.findAll", query="SELECT p FROM ProbChainItem2 p")
public class ProbChainItem2 implements Serializable {
	private static final long serialVersionUID = 1L;
	private String probchainItemId;
	private int anomaly;
	private int indexinchain;
	private float itemvalue;
	private ProbChainItem2 probChainItem2;
	private List<ProbChainItem2> probChainItem2s;

	public ProbChainItem2() {
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


	//bi-directional many-to-one association to ProbChainItem2
	@ManyToOne
	@JoinColumn(name="nextId")
	public ProbChainItem2 getProbChainItem2() {
		return this.probChainItem2;
	}

	public void setProbChainItem2(ProbChainItem2 probChainItem2) {
		this.probChainItem2 = probChainItem2;
	}


	//bi-directional many-to-one association to ProbChainItem2
	@OneToMany(mappedBy="probChainItem2")
	public List<ProbChainItem2> getProbChainItem2s() {
		return this.probChainItem2s;
	}

	public void setProbChainItem2s(List<ProbChainItem2> probChainItem2s) {
		this.probChainItem2s = probChainItem2s;
	}

	public ProbChainItem2 addProbChainItem2(ProbChainItem2 probChainItem2) {
		getProbChainItem2s().add(probChainItem2);
		probChainItem2.setProbChainItem2(this);

		return probChainItem2;
	}

	public ProbChainItem2 removeProbChainItem2(ProbChainItem2 probChainItem2) {
		getProbChainItem2s().remove(probChainItem2);
		probChainItem2.setProbChainItem2(null);

		return probChainItem2;
	}

}