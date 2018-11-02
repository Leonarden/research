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
@Table(name="Sentence2Sentence")
@NamedQuery(name="Sentence2Sentence.findAll", query="SELECT s FROM Sentence2Sentence s")
public class Sentence2Sentence implements Serializable {
	private static final long serialVersionUID = 1L;
	private String sentence2sentenceId;
	private BigInteger candidateId;
	private BigInteger candidateNormId;
	private Date lastaccess;
	private BigInteger numaccess;
	private String text;
	private WeightNorm weightNorm;
	private Sentence sentence1;
	private Sentence sentence2;

	public Sentence2Sentence() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	public String getSentence2sentenceId() {
		return this.sentence2sentenceId;
	}

	public void setSentence2sentenceId(String sentence2sentenceId) {
		this.sentence2sentenceId = sentence2sentenceId;
	}


	@Column(nullable=false)
	public BigInteger getCandidateId() {
		return this.candidateId;
	}

	public void setCandidateId(BigInteger candidateId) {
		this.candidateId = candidateId;
	}


	@Column(nullable=false)
	public BigInteger getCandidateNormId() {
		return this.candidateNormId;
	}

	public void setCandidateNormId(BigInteger candidateNormId) {
		this.candidateNormId = candidateNormId;
	}


	@Temporal(TemporalType.TIMESTAMP)
	public Date getLastaccess() {
		return this.lastaccess;
	}

	public void setLastaccess(Date lastaccess) {
		this.lastaccess = lastaccess;
	}


	@Column(nullable=false)
	public BigInteger getNumaccess() {
		return this.numaccess;
	}

	public void setNumaccess(BigInteger numaccess) {
		this.numaccess = numaccess;
	}


	@Column(length=20)
	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}


	//bi-directional many-to-one association to WeightNorm
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="entityName", referencedColumnName="entityName", nullable=false),
		@JoinColumn(name="sentence2sentenceId", referencedColumnName="entityNormId", nullable=false, insertable=false, updatable=false)
		})
	public WeightNorm getWeightNorm() {
		return this.weightNorm;
	}

	public void setWeightNorm(WeightNorm weightNorm) {
		this.weightNorm = weightNorm;
	}


	//bi-directional many-to-one association to Sentence
	@ManyToOne
	@JoinColumn(name="sentenceId", nullable=false)
	public Sentence getSentence1() {
		return this.sentence1;
	}

	public void setSentence1(Sentence sentence1) {
		this.sentence1 = sentence1;
	}


	//bi-directional many-to-one association to Sentence
	@ManyToOne
	@JoinColumn(name="sentence2Id", nullable=false)
	public Sentence getSentence2() {
		return this.sentence2;
	}

	public void setSentence2(Sentence sentence2) {
		this.sentence2 = sentence2;
	}

}