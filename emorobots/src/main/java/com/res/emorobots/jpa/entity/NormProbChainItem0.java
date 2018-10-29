package com.res.emorobots.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the NormProbChainItem0 database table.
 * 
 */
@Entity
@Table(name="NormProbChainItem0")
@NamedQuery(name="NormProbChainItem0.findAll", query="SELECT n FROM NormProbChainItem0 n")
public class NormProbChainItem0 implements Serializable {
	private static final long serialVersionUID = 1L;
	private String probchainItemId;
	private int anomaly;
	private int indexinchain;
	private float itemvalue;
	private NormProbChainItem0 normProbChainItem0;
	private List<NormProbChainItem0> normProbChainItem0s;

	public NormProbChainItem0() {
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


	//bi-directional many-to-one association to NormProbChainItem0
	@ManyToOne
	@JoinColumn(name="nextId")
	public NormProbChainItem0 getNormProbChainItem0() {
		return this.normProbChainItem0;
	}

	public void setNormProbChainItem0(NormProbChainItem0 normProbChainItem0) {
		this.normProbChainItem0 = normProbChainItem0;
	}


	//bi-directional many-to-one association to NormProbChainItem0
	@OneToMany(mappedBy="normProbChainItem0")
	public List<NormProbChainItem0> getNormProbChainItem0s() {
		return this.normProbChainItem0s;
	}

	public void setNormProbChainItem0s(List<NormProbChainItem0> normProbChainItem0s) {
		this.normProbChainItem0s = normProbChainItem0s;
	}

	public NormProbChainItem0 addNormProbChainItem0(NormProbChainItem0 normProbChainItem0) {
		getNormProbChainItem0s().add(normProbChainItem0);
		normProbChainItem0.setNormProbChainItem0(this);

		return normProbChainItem0;
	}

	public NormProbChainItem0 removeNormProbChainItem0(NormProbChainItem0 normProbChainItem0) {
		getNormProbChainItem0s().remove(normProbChainItem0);
		normProbChainItem0.setNormProbChainItem0(null);

		return normProbChainItem0;
	}

}