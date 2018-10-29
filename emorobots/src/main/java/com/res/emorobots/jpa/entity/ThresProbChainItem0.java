package com.res.emorobots.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ThresProbChainItem0 database table.
 * 
 */
@Entity
@Table(name="ThresProbChainItem0")
@NamedQuery(name="ThresProbChainItem0.findAll", query="SELECT t FROM ThresProbChainItem0 t")
public class ThresProbChainItem0 implements Serializable {
	private static final long serialVersionUID = 1L;
	private String probchainItemId;
	private int anomaly;
	private int indexinchain;
	private float itemvalue;
	private ThresProbChainItem0 thresProbChainItem0;
	private List<ThresProbChainItem0> thresProbChainItem0s;

	public ThresProbChainItem0() {
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


	//bi-directional many-to-one association to ThresProbChainItem0
	@ManyToOne
	@JoinColumn(name="nextId")
	public ThresProbChainItem0 getThresProbChainItem0() {
		return this.thresProbChainItem0;
	}

	public void setThresProbChainItem0(ThresProbChainItem0 thresProbChainItem0) {
		this.thresProbChainItem0 = thresProbChainItem0;
	}


	//bi-directional many-to-one association to ThresProbChainItem0
	@OneToMany(mappedBy="thresProbChainItem0")
	public List<ThresProbChainItem0> getThresProbChainItem0s() {
		return this.thresProbChainItem0s;
	}

	public void setThresProbChainItem0s(List<ThresProbChainItem0> thresProbChainItem0s) {
		this.thresProbChainItem0s = thresProbChainItem0s;
	}

	public ThresProbChainItem0 addThresProbChainItem0(ThresProbChainItem0 thresProbChainItem0) {
		getThresProbChainItem0s().add(thresProbChainItem0);
		thresProbChainItem0.setThresProbChainItem0(this);

		return thresProbChainItem0;
	}

	public ThresProbChainItem0 removeThresProbChainItem0(ThresProbChainItem0 thresProbChainItem0) {
		getThresProbChainItem0s().remove(thresProbChainItem0);
		thresProbChainItem0.setThresProbChainItem0(null);

		return thresProbChainItem0;
	}

}