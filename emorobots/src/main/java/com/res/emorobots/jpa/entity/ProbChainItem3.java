package com.res.emorobots.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ProbChainItem3 database table.
 * 
 */
@Entity
@Table(name="ProbChainItem3")
@NamedQuery(name="ProbChainItem3.findAll", query="SELECT p FROM ProbChainItem3 p")
public class ProbChainItem3 implements Serializable {
	private static final long serialVersionUID = 1L;
	private String probchainItemId;
	private int anomaly;
	private int indexinchain;
	private float itemvalue;
	private ProbChainItem3 probChainItem3;
	private List<ProbChainItem3> probChainItem3s;

	public ProbChainItem3() {
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


	//bi-directional many-to-one association to ProbChainItem3
	@ManyToOne
	@JoinColumn(name="nextId")
	public ProbChainItem3 getProbChainItem3() {
		return this.probChainItem3;
	}

	public void setProbChainItem3(ProbChainItem3 probChainItem3) {
		this.probChainItem3 = probChainItem3;
	}


	//bi-directional many-to-one association to ProbChainItem3
	@OneToMany(mappedBy="probChainItem3")
	public List<ProbChainItem3> getProbChainItem3s() {
		return this.probChainItem3s;
	}

	public void setProbChainItem3s(List<ProbChainItem3> probChainItem3s) {
		this.probChainItem3s = probChainItem3s;
	}

	public ProbChainItem3 addProbChainItem3(ProbChainItem3 probChainItem3) {
		getProbChainItem3s().add(probChainItem3);
		probChainItem3.setProbChainItem3(this);

		return probChainItem3;
	}

	public ProbChainItem3 removeProbChainItem3(ProbChainItem3 probChainItem3) {
		getProbChainItem3s().remove(probChainItem3);
		probChainItem3.setProbChainItem3(null);

		return probChainItem3;
	}

}