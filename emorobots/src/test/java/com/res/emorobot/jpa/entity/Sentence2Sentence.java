package com.res.emorobot.jpa.entity;

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

	@EmbeddedId
	private Sentence2SentencePK id;

	@Temporal(TemporalType.TIMESTAMP)
	private Date lastaccess;

	private BigInteger numaccess;

	private String text;

	//bi-directional many-to-one association to Sentence
	@ManyToOne
	@JoinColumn(name="sentence2Id")
	private Sentence sentence;

	//bi-directional many-to-one association to WeightNorm
	@ManyToOne
	@JoinColumn(name="weightNormId")
	private WeightNorm weightNorm;

	public Sentence2Sentence() {
	}

	public Sentence2SentencePK getId() {
		return this.id;
	}

	public void setId(Sentence2SentencePK id) {
		this.id = id;
	}

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

	public Sentence getSentence() {
		return this.sentence;
	}

	public void setSentence(Sentence sentence) {
		this.sentence = sentence;
	}

	public WeightNorm getWeightNorm() {
		return this.weightNorm;
	}

	public void setWeightNorm(WeightNorm weightNorm) {
		this.weightNorm = weightNorm;
	}

}