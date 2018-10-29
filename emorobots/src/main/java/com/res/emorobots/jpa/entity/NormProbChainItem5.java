package com.res.emorobots.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the NormProbChainItem5 database table.
 * 
 */
@Entity
@Table(name="NormProbChainItem5")
@NamedQuery(name="NormProbChainItem5.findAll", query="SELECT n FROM NormProbChainItem5 n")
public class NormProbChainItem5 implements Serializable {
	private static final long serialVersionUID = 1L;
	private String probchainItemId;
	private int anomaly;
	private int indexinchain;
	private float itemvalue;
	private NormProbChainItem5 normProbChainItem5;
	private List<NormProbChainItem5> normProbChainItem5s;

	public NormProbChainItem5() {
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


	//bi-directional many-to-one association to NormProbChainItem5
	@ManyToOne
	@JoinColumn(name="nextId")
	public NormProbChainItem5 getNormProbChainItem5() {
		return this.normProbChainItem5;
	}

	public void setNormProbChainItem5(NormProbChainItem5 normProbChainItem5) {
		this.normProbChainItem5 = normProbChainItem5;
	}


	//bi-directional many-to-one association to NormProbChainItem5
	@OneToMany(mappedBy="normProbChainItem5")
	public List<NormProbChainItem5> getNormProbChainItem5s() {
		return this.normProbChainItem5s;
	}

	public void setNormProbChainItem5s(List<NormProbChainItem5> normProbChainItem5s) {
		this.normProbChainItem5s = normProbChainItem5s;
	}

	public NormProbChainItem5 addNormProbChainItem5(NormProbChainItem5 normProbChainItem5) {
		getNormProbChainItem5s().add(normProbChainItem5);
		normProbChainItem5.setNormProbChainItem5(this);

		return normProbChainItem5;
	}

	public NormProbChainItem5 removeNormProbChainItem5(NormProbChainItem5 normProbChainItem5) {
		getNormProbChainItem5s().remove(normProbChainItem5);
		normProbChainItem5.setNormProbChainItem5(null);

		return normProbChainItem5;
	}

}