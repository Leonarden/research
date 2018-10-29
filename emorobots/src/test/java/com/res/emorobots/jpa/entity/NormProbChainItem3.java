package com.res.emorobots.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the NormProbChainItem3 database table.
 * 
 */
@Entity
@Table(name="NormProbChainItem3")
@NamedQuery(name="NormProbChainItem3.findAll", query="SELECT n FROM NormProbChainItem3 n")
public class NormProbChainItem3 implements Serializable {
	private static final long serialVersionUID = 1L;
	private String probchainItemId;
	private int anomaly;
	private int indexinchain;
	private float itemvalue;
	private NormProbChainItem3 normProbChainItem3;
	private List<NormProbChainItem3> normProbChainItem3s;

	public NormProbChainItem3() {
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


	//bi-directional many-to-one association to NormProbChainItem3
	@ManyToOne
	@JoinColumn(name="nextId")
	public NormProbChainItem3 getNormProbChainItem3() {
		return this.normProbChainItem3;
	}

	public void setNormProbChainItem3(NormProbChainItem3 normProbChainItem3) {
		this.normProbChainItem3 = normProbChainItem3;
	}


	//bi-directional many-to-one association to NormProbChainItem3
	@OneToMany(mappedBy="normProbChainItem3")
	public List<NormProbChainItem3> getNormProbChainItem3s() {
		return this.normProbChainItem3s;
	}

	public void setNormProbChainItem3s(List<NormProbChainItem3> normProbChainItem3s) {
		this.normProbChainItem3s = normProbChainItem3s;
	}

	public NormProbChainItem3 addNormProbChainItem3(NormProbChainItem3 normProbChainItem3) {
		getNormProbChainItem3s().add(normProbChainItem3);
		normProbChainItem3.setNormProbChainItem3(this);

		return normProbChainItem3;
	}

	public NormProbChainItem3 removeNormProbChainItem3(NormProbChainItem3 normProbChainItem3) {
		getNormProbChainItem3s().remove(normProbChainItem3);
		normProbChainItem3.setNormProbChainItem3(null);

		return normProbChainItem3;
	}

}