package com.res.emorobots.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ThresProbChainItem3 database table.
 * 
 */
@Entity
@Table(name="ThresProbChainItem3")
@NamedQuery(name="ThresProbChainItem3.findAll", query="SELECT t FROM ThresProbChainItem3 t")
public class ThresProbChainItem3 implements Serializable {
	private static final long serialVersionUID = 1L;
	private String probchainItemId;
	private int anomaly;
	private int indexinchain;
	private float itemvalue;
	private ThresProbChainItem3 thresProbChainItem3;
	private List<ThresProbChainItem3> thresProbChainItem3s;

	public ThresProbChainItem3() {
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


	//bi-directional many-to-one association to ThresProbChainItem3
	@ManyToOne
	@JoinColumn(name="nextId")
	public ThresProbChainItem3 getThresProbChainItem3() {
		return this.thresProbChainItem3;
	}

	public void setThresProbChainItem3(ThresProbChainItem3 thresProbChainItem3) {
		this.thresProbChainItem3 = thresProbChainItem3;
	}


	//bi-directional many-to-one association to ThresProbChainItem3
	@OneToMany(mappedBy="thresProbChainItem3")
	public List<ThresProbChainItem3> getThresProbChainItem3s() {
		return this.thresProbChainItem3s;
	}

	public void setThresProbChainItem3s(List<ThresProbChainItem3> thresProbChainItem3s) {
		this.thresProbChainItem3s = thresProbChainItem3s;
	}

	public ThresProbChainItem3 addThresProbChainItem3(ThresProbChainItem3 thresProbChainItem3) {
		getThresProbChainItem3s().add(thresProbChainItem3);
		thresProbChainItem3.setThresProbChainItem3(this);

		return thresProbChainItem3;
	}

	public ThresProbChainItem3 removeThresProbChainItem3(ThresProbChainItem3 thresProbChainItem3) {
		getThresProbChainItem3s().remove(thresProbChainItem3);
		thresProbChainItem3.setThresProbChainItem3(null);

		return thresProbChainItem3;
	}

}