package com.res.emorobots.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the NormProbChainItem4 database table.
 * 
 */
@Entity
@Table(name="NormProbChainItem4")
@NamedQuery(name="NormProbChainItem4.findAll", query="SELECT n FROM NormProbChainItem4 n")
public class NormProbChainItem4 implements Serializable {
	private static final long serialVersionUID = 1L;
	private String probchainItemId;
	private int anomaly;
	private int indexinchain;
	private float itemvalue;
	private NormProbChainItem4 normProbChainItem4;
	private List<NormProbChainItem4> normProbChainItem4s;

	public NormProbChainItem4() {
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


	//bi-directional many-to-one association to NormProbChainItem4
	@ManyToOne
	@JoinColumn(name="nextId")
	public NormProbChainItem4 getNormProbChainItem4() {
		return this.normProbChainItem4;
	}

	public void setNormProbChainItem4(NormProbChainItem4 normProbChainItem4) {
		this.normProbChainItem4 = normProbChainItem4;
	}


	//bi-directional many-to-one association to NormProbChainItem4
	@OneToMany(mappedBy="normProbChainItem4")
	public List<NormProbChainItem4> getNormProbChainItem4s() {
		return this.normProbChainItem4s;
	}

	public void setNormProbChainItem4s(List<NormProbChainItem4> normProbChainItem4s) {
		this.normProbChainItem4s = normProbChainItem4s;
	}

	public NormProbChainItem4 addNormProbChainItem4(NormProbChainItem4 normProbChainItem4) {
		getNormProbChainItem4s().add(normProbChainItem4);
		normProbChainItem4.setNormProbChainItem4(this);

		return normProbChainItem4;
	}

	public NormProbChainItem4 removeNormProbChainItem4(NormProbChainItem4 normProbChainItem4) {
		getNormProbChainItem4s().remove(normProbChainItem4);
		normProbChainItem4.setNormProbChainItem4(null);

		return normProbChainItem4;
	}

}