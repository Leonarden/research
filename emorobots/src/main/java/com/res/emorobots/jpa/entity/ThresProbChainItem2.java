package com.res.emorobots.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ThresProbChainItem2 database table.
 * 
 */
@Entity
@Table(name="ThresProbChainItem2")
@NamedQuery(name="ThresProbChainItem2.findAll", query="SELECT t FROM ThresProbChainItem2 t")
public class ThresProbChainItem2 implements Serializable {
	private static final long serialVersionUID = 1L;
	private String probchainItemId;
	private int anomaly;
	private int indexinchain;
	private float itemvalue;
	private ThresProbChainItem2 thresProbChainItem2;
	private List<ThresProbChainItem2> thresProbChainItem2s;

	public ThresProbChainItem2() {
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


	//bi-directional many-to-one association to ThresProbChainItem2
	@ManyToOne
	@JoinColumn(name="nextId")
	public ThresProbChainItem2 getThresProbChainItem2() {
		return this.thresProbChainItem2;
	}

	public void setThresProbChainItem2(ThresProbChainItem2 thresProbChainItem2) {
		this.thresProbChainItem2 = thresProbChainItem2;
	}


	//bi-directional many-to-one association to ThresProbChainItem2
	@OneToMany(mappedBy="thresProbChainItem2")
	public List<ThresProbChainItem2> getThresProbChainItem2s() {
		return this.thresProbChainItem2s;
	}

	public void setThresProbChainItem2s(List<ThresProbChainItem2> thresProbChainItem2s) {
		this.thresProbChainItem2s = thresProbChainItem2s;
	}

	public ThresProbChainItem2 addThresProbChainItem2(ThresProbChainItem2 thresProbChainItem2) {
		getThresProbChainItem2s().add(thresProbChainItem2);
		thresProbChainItem2.setThresProbChainItem2(this);

		return thresProbChainItem2;
	}

	public ThresProbChainItem2 removeThresProbChainItem2(ThresProbChainItem2 thresProbChainItem2) {
		getThresProbChainItem2s().remove(thresProbChainItem2);
		thresProbChainItem2.setThresProbChainItem2(null);

		return thresProbChainItem2;
	}

}