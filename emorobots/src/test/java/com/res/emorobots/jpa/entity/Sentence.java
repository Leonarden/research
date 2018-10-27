package com.res.emorobots.jpa.entity;

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
	private String sentenceId;
	private Date lastaccess;
	private BigInteger numaccess;
	private String text;
	private WeightNorm weightNorm;
	private List<Sentence2Sentence> sentence2sentences1;
	private List<Sentence2Sentence> sentence2sentences2;

	public Sentence() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public String getSentenceId() {
		return this.sentenceId;
	}

	public void setSentenceId(String sentenceId) {
		this.sentenceId = sentenceId;
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


	//bi-directional many-to-one association to WeightNorm
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="entityName", referencedColumnName="entityName"),
		@JoinColumn(name="sentenceId", referencedColumnName="entityNormId")
		})
	public WeightNorm getWeightNorm() {
		return this.weightNorm;
	}

	public void setWeightNorm(WeightNorm weightNorm) {
		this.weightNorm = weightNorm;
	}


	//bi-directional many-to-one association to Sentence2Sentence
	@OneToMany(mappedBy="sentence1")
	public List<Sentence2Sentence> getSentence2sentences1() {
		return this.sentence2sentences1;
	}

	public void setSentence2sentences1(List<Sentence2Sentence> sentence2sentences1) {
		this.sentence2sentences1 = sentence2sentences1;
	}

	public Sentence2Sentence addSentence2sentences1(Sentence2Sentence sentence2sentences1) {
		getSentence2sentences1().add(sentence2sentences1);
		sentence2sentences1.setSentence1(this);

		return sentence2sentences1;
	}

	public Sentence2Sentence removeSentence2sentences1(Sentence2Sentence sentence2sentences1) {
		getSentence2sentences1().remove(sentence2sentences1);
		sentence2sentences1.setSentence1(null);

		return sentence2sentences1;
	}


	//bi-directional many-to-one association to Sentence2Sentence
	@OneToMany(mappedBy="sentence2")
	public List<Sentence2Sentence> getSentence2sentences2() {
		return this.sentence2sentences2;
	}

	public void setSentence2sentences2(List<Sentence2Sentence> sentence2sentences2) {
		this.sentence2sentences2 = sentence2sentences2;
	}

	public Sentence2Sentence addSentence2sentences2(Sentence2Sentence sentence2sentences2) {
		getSentence2sentences2().add(sentence2sentences2);
		sentence2sentences2.setSentence2(this);

		return sentence2sentences2;
	}

	public Sentence2Sentence removeSentence2sentences2(Sentence2Sentence sentence2sentences2) {
		getSentence2sentences2().remove(sentence2sentences2);
		sentence2sentences2.setSentence2(null);

		return sentence2sentences2;
	}

}