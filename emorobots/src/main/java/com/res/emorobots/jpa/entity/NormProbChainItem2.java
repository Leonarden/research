package com.res.emorobots.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the NormProbChainItem2 database table.
 * 
 */
@Entity
@Table(name="NormProbChainItem2")
@NamedQuery(name="NormProbChainItem2.findAll", query="SELECT n FROM NormProbChainItem2 n")
public class NormProbChainItem2 implements Serializable {
	private static final long serialVersionUID = 1L;
	private String probchainItemId;
	private int anomaly;
	private int indexinchain;
	private float itemvalue;
	private NormProbChainItem2 normProbChainItem2;
	private List<NormProbChainItem2> normProbChainItem2s;

	public NormProbChainItem2() {
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


	//bi-directional many-to-one association to NormProbChainItem2
	@ManyToOne
	@JoinColumn(name="nextId")
	public NormProbChainItem2 getNormProbChainItem2() {
		return this.normProbChainItem2;
	}

	public void setNormProbChainItem2(NormProbChainItem2 normProbChainItem2) {
		this.normProbChainItem2 = normProbChainItem2;
	}


	//bi-directional many-to-one association to NormProbChainItem2
	@OneToMany(mappedBy="normProbChainItem2")
	public List<NormProbChainItem2> getNormProbChainItem2s() {
		return this.normProbChainItem2s;
	}

	public void setNormProbChainItem2s(List<NormProbChainItem2> normProbChainItem2s) {
		this.normProbChainItem2s = normProbChainItem2s;
	}

	public NormProbChainItem2 addNormProbChainItem2(NormProbChainItem2 normProbChainItem2) {
		getNormProbChainItem2s().add(normProbChainItem2);
		normProbChainItem2.setNormProbChainItem2(this);

		return normProbChainItem2;
	}

	public NormProbChainItem2 removeNormProbChainItem2(NormProbChainItem2 normProbChainItem2) {
		getNormProbChainItem2s().remove(normProbChainItem2);
		normProbChainItem2.setNormProbChainItem2(null);

		return normProbChainItem2;
	}

}