package com.res.emorobots.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ThresProbChainItem1 database table.
 * 
 */
@Entity
@Table(name="ThresProbChainItem1")
@NamedQuery(name="ThresProbChainItem1.findAll", query="SELECT t FROM ThresProbChainItem1 t")
public class ThresProbChainItem1 implements Serializable {
	private static final long serialVersionUID = 1L;
	private String probchainItemId;
	private int anomaly;
	private int indexinchain;
	private float itemvalue;
	private ThresProbChainItem1 thresProbChainItem1;
	private List<ThresProbChainItem1> thresProbChainItem1s;

	public ThresProbChainItem1() {
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


	//bi-directional many-to-one association to ThresProbChainItem1
	@ManyToOne
	@JoinColumn(name="nextId")
	public ThresProbChainItem1 getThresProbChainItem1() {
		return this.thresProbChainItem1;
	}

	public void setThresProbChainItem1(ThresProbChainItem1 thresProbChainItem1) {
		this.thresProbChainItem1 = thresProbChainItem1;
	}


	//bi-directional many-to-one association to ThresProbChainItem1
	@OneToMany(mappedBy="thresProbChainItem1")
	public List<ThresProbChainItem1> getThresProbChainItem1s() {
		return this.thresProbChainItem1s;
	}

	public void setThresProbChainItem1s(List<ThresProbChainItem1> thresProbChainItem1s) {
		this.thresProbChainItem1s = thresProbChainItem1s;
	}

	public ThresProbChainItem1 addThresProbChainItem1(ThresProbChainItem1 thresProbChainItem1) {
		getThresProbChainItem1s().add(thresProbChainItem1);
		thresProbChainItem1.setThresProbChainItem1(this);

		return thresProbChainItem1;
	}

	public ThresProbChainItem1 removeThresProbChainItem1(ThresProbChainItem1 thresProbChainItem1) {
		getThresProbChainItem1s().remove(thresProbChainItem1);
		thresProbChainItem1.setThresProbChainItem1(null);

		return thresProbChainItem1;
	}

}