package com.res.emorobots.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the Sentence2Sentence database table.
 * 
 */
@Entity
@NamedQuery(name="Sentence2Sentence.findAll", query="SELECT s FROM Sentence2Sentence s")
public class Sentence2Sentence implements Serializable {
	private static final long serialVersionUID = 1L;
	private String sentence2sentenceId;
	private Date lastaccess;
	private BigInteger numaccess;
	private String text;
	private Sentence sentence1;
	private Sentence sentence2;
	private WeightNorm weightNorm;

	public Sentence2Sentence() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public String getSentence2sentenceId() {
		return this.sentence2sentenceId;
	}

	public void setSentence2sentenceId(String sentence2sentenceId) {
		this.sentence2sentenceId = sentence2sentenceId;
	}


	@Temporal(TemporalType.TIMESTAMP)
	public Date getLastaccess() {
		return this.lastaccess;
	}

	public void setLastaccess(Date lastaccess) {
		this.lastaccess = lastaccess;
	}


	public BigInteger getNumaccess() {
		return this.numaccess;
	}

	public void setNumaccess(BigInteger numaccess) {
		this.numaccess = numaccess;
	}


	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}


	//bi-directional many-to-one association to Sentence
	@ManyToOne
	@JoinColumn(name="sentence2Id")
	public Sentence getSentence1() {
		return this.sentence1;
	}

	public void setSentence1(Sentence sentence1) {
		this.sentence1 = sentence1;
	}


	//bi-directional many-to-one association to Sentence
	@ManyToOne
	@JoinColumn(name="sentenceId")
	public Sentence getSentence2() {
		return this.sentence2;
	}

	public void setSentence2(Sentence sentence2) {
		this.sentence2 = sentence2;
	}


	//bi-directional many-to-one association to WeightNorm
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="entityName", referencedColumnName="entityName"),
		@JoinColumn(name="sentence2sentenceId", referencedColumnName="entityNormId")
		})
	public WeightNorm getWeightNorm() {
		return this.weightNorm;
	}

	public void setWeightNorm(WeightNorm weightNorm) {
		this.weightNorm = weightNorm;
	}

}