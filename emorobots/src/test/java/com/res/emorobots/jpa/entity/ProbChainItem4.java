package com.res.emorobots.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ProbChainItem4 database table.
 * 
 */
@Entity
@Table(name="ProbChainItem4")
@NamedQuery(name="ProbChainItem4.findAll", query="SELECT p FROM ProbChainItem4 p")
public class ProbChainItem4 implements Serializable {
	private static final long serialVersionUID = 1L;
	private String probchainItemId;
	private int anomaly;
	private int indexinchain;
	private float itemvalue;
	private ProbChainItem4 probChainItem4;
	private List<ProbChainItem4> probChainItem4s;

	public ProbChainItem4() {
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


	//bi-directional many-to-one association to ProbChainItem4
	@ManyToOne
	@JoinColumn(name="nextId")
	public ProbChainItem4 getProbChainItem4() {
		return this.probChainItem4;
	}

	public void setProbChainItem4(ProbChainItem4 probChainItem4) {
		this.probChainItem4 = probChainItem4;
	}


	//bi-directional many-to-one association to ProbChainItem4
	@OneToMany(mappedBy="probChainItem4")
	public List<ProbChainItem4> getProbChainItem4s() {
		return this.probChainItem4s;
	}

	public void setProbChainItem4s(List<ProbChainItem4> probChainItem4s) {
		this.probChainItem4s = probChainItem4s;
	}

	public ProbChainItem4 addProbChainItem4(ProbChainItem4 probChainItem4) {
		getProbChainItem4s().add(probChainItem4);
		probChainItem4.setProbChainItem4(this);

		return probChainItem4;
	}

	public ProbChainItem4 removeProbChainItem4(ProbChainItem4 probChainItem4) {
		getProbChainItem4s().remove(probChainItem4);
		probChainItem4.setProbChainItem4(null);

		return probChainItem4;
	}

}