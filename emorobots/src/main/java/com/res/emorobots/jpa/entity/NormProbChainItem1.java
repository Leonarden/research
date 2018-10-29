package com.res.emorobots.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


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
	private int indexinchain;
	private float itemvalue;
	private NormProbChainItem1 normProbChainItem1;
	private List<NormProbChainItem1> normProbChainItem1s;

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


	//bi-directional many-to-one association to NormProbChainItem1
	@ManyToOne
	@JoinColumn(name="nextId")
	public NormProbChainItem1 getNormProbChainItem1() {
		return this.normProbChainItem1;
	}

	public void setNormProbChainItem1(NormProbChainItem1 normProbChainItem1) {
		this.normProbChainItem1 = normProbChainItem1;
	}


	//bi-directional many-to-one association to NormProbChainItem1
	@OneToMany(mappedBy="normProbChainItem1")
	public List<NormProbChainItem1> getNormProbChainItem1s() {
		return this.normProbChainItem1s;
	}

	public void setNormProbChainItem1s(List<NormProbChainItem1> normProbChainItem1s) {
		this.normProbChainItem1s = normProbChainItem1s;
	}

	public NormProbChainItem1 addNormProbChainItem1(NormProbChainItem1 normProbChainItem1) {
		getNormProbChainItem1s().add(normProbChainItem1);
		normProbChainItem1.setNormProbChainItem1(this);

		return normProbChainItem1;
	}

	public NormProbChainItem1 removeNormProbChainItem1(NormProbChainItem1 normProbChainItem1) {
		getNormProbChainItem1s().remove(normProbChainItem1);
		normProbChainItem1.setNormProbChainItem1(null);

		return normProbChainItem1;
	}

}