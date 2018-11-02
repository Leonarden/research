package com.res.emorobots.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ThresProbChainItem4 database table.
 * 
 */
@Entity
@Table(name="ThresProbChainItem4")
@NamedQuery(name="ThresProbChainItem4.findAll", query="SELECT t FROM ThresProbChainItem4 t")
public class ThresProbChainItem4 implements Serializable {
	private static final long serialVersionUID = 1L;
	private String probchainItemId;
	private int anomaly;
	private int indexinchain;
	private float itemvalue;
	private ThresProbChainItem4 thresProbChainItem4;
	private List<ThresProbChainItem4> thresProbChainItem4s;

	public ThresProbChainItem4() {
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


	//bi-directional many-to-one association to ThresProbChainItem4
	@ManyToOne
	@JoinColumn(name="nextId")
	public ThresProbChainItem4 getThresProbChainItem4() {
		return this.thresProbChainItem4;
	}

	public void setThresProbChainItem4(ThresProbChainItem4 thresProbChainItem4) {
		this.thresProbChainItem4 = thresProbChainItem4;
	}


	//bi-directional many-to-one association to ThresProbChainItem4
	@OneToMany(mappedBy="thresProbChainItem4")
	public List<ThresProbChainItem4> getThresProbChainItem4s() {
		return this.thresProbChainItem4s;
	}

	public void setThresProbChainItem4s(List<ThresProbChainItem4> thresProbChainItem4s) {
		this.thresProbChainItem4s = thresProbChainItem4s;
	}

	public ThresProbChainItem4 addThresProbChainItem4(ThresProbChainItem4 thresProbChainItem4) {
		getThresProbChainItem4s().add(thresProbChainItem4);
		thresProbChainItem4.setThresProbChainItem4(this);

		return thresProbChainItem4;
	}

	public ThresProbChainItem4 removeThresProbChainItem4(ThresProbChainItem4 thresProbChainItem4) {
		getThresProbChainItem4s().remove(thresProbChainItem4);
		thresProbChainItem4.setThresProbChainItem4(null);

		return thresProbChainItem4;
	}

}