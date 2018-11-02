package com.res.emorobots.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ThresProbChainItem5 database table.
 * 
 */
@Entity
@Table(name="ThresProbChainItem5")
@NamedQuery(name="ThresProbChainItem5.findAll", query="SELECT t FROM ThresProbChainItem5 t")
public class ThresProbChainItem5 implements Serializable {
	private static final long serialVersionUID = 1L;
	private String probchainItemId;
	private int anomaly;
	private int indexinchain;
	private float itemvalue;
	private ThresProbChainItem5 thresProbChainItem5;
	private List<ThresProbChainItem5> thresProbChainItem5s;

	public ThresProbChainItem5() {
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


	//bi-directional many-to-one association to ThresProbChainItem5
	@ManyToOne
	@JoinColumn(name="nextId")
	public ThresProbChainItem5 getThresProbChainItem5() {
		return this.thresProbChainItem5;
	}

	public void setThresProbChainItem5(ThresProbChainItem5 thresProbChainItem5) {
		this.thresProbChainItem5 = thresProbChainItem5;
	}


	//bi-directional many-to-one association to ThresProbChainItem5
	@OneToMany(mappedBy="thresProbChainItem5")
	public List<ThresProbChainItem5> getThresProbChainItem5s() {
		return this.thresProbChainItem5s;
	}

	public void setThresProbChainItem5s(List<ThresProbChainItem5> thresProbChainItem5s) {
		this.thresProbChainItem5s = thresProbChainItem5s;
	}

	public ThresProbChainItem5 addThresProbChainItem5(ThresProbChainItem5 thresProbChainItem5) {
		getThresProbChainItem5s().add(thresProbChainItem5);
		thresProbChainItem5.setThresProbChainItem5(this);

		return thresProbChainItem5;
	}

	public ThresProbChainItem5 removeThresProbChainItem5(ThresProbChainItem5 thresProbChainItem5) {
		getThresProbChainItem5s().remove(thresProbChainItem5);
		thresProbChainItem5.setThresProbChainItem5(null);

		return thresProbChainItem5;
	}

}