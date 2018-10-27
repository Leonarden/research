package com.res.emorobot.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;
import java.util.List;


/**
 * The persistent class for the Sentence database table.
 * 
 */
@Entity
@NamedQuery(name="Sentence.findAll", query="SELECT s FROM Sentence s")
public class Sentence implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String sentenceId;

	@Temporal(TemporalType.TIMESTAMP)
	private Date lastaccess;

	private BigInteger numaccess;

	private String text;

	//bi-directional many-to-one association to WeightNorm
	@ManyToOne
	@JoinColumn(name="weightNormId")
	private WeightNorm weightNorm;

	//bi-directional many-to-one association to Sentence2Sentence
	@OneToMany(mappedBy="sentence")
	private List<Sentence2Sentence> sentence2sentences;

	public Sentence() {
	}

	public String getSentenceId() {
		return this.sentenceId;
	}

	public void setSentenceId(String sentenceId) {
		this.sentenceId = sentenceId;
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

	public WeightNorm getWeightNorm() {
		return this.weightNorm;
	}

	public void setWeightNorm(WeightNorm weightNorm) {
		this.weightNorm = weightNorm;
	}

	public List<Sentence2Sentence> getSentence2sentences() {
		return this.sentence2sentences;
	}

	public void setSentence2sentences(List<Sentence2Sentence> sentence2sentences) {
		this.sentence2sentences = sentence2sentences;
	}

	public Sentence2Sentence addSentence2sentence(Sentence2Sentence sentence2sentence) {
		getSentence2sentences().add(sentence2sentence);
		sentence2sentence.setSentence(this);

		return sentence2sentence;
	}

	public Sentence2Sentence removeSentence2sentence(Sentence2Sentence sentence2sentence) {
		getSentence2sentences().remove(sentence2sentence);
		sentence2sentence.setSentence(null);

		return sentence2sentence;
	}

}