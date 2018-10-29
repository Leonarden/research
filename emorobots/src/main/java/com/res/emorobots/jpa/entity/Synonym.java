package com.res.emorobots.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;
import java.util.List;


/**
 * The persistent class for the Synonym database table.
 * 
 */
@Entity
@Table(name="Synonym")
@NamedQuery(name="Synonym.findAll", query="SELECT s FROM Synonym s")
public class Synonym implements Serializable {
	private static final long serialVersionUID = 1L;
	private String synonymId;
	private BigInteger candidateId;
	private BigInteger candidateNormId;
	private float frequency;
	private int indexinchain;
	private BigInteger nextsynId;
	private BigInteger numaccess;
	private String text;
	private WeightNorm weightNorm;
	private List<Word> words;

	public Synonym() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	public String getSynonymId() {
		return this.synonymId;
	}

	public void setSynonymId(String synonymId) {
		this.synonymId = synonymId;
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


	@Column(nullable=false)
	public float getFrequency() {
		return this.frequency;
	}

	public void setFrequency(float frequency) {
		this.frequency = frequency;
	}


	public int getIndexinchain() {
		return this.indexinchain;
	}

	public void setIndexinchain(int indexinchain) {
		this.indexinchain = indexinchain;
	}


	public BigInteger getNextsynId() {
		return this.nextsynId;
	}

	public void setNextsynId(BigInteger nextsynId) {
		this.nextsynId = nextsynId;
	}


	@Column(nullable=false)
	public BigInteger getNumaccess() {
		return this.numaccess;
	}

	public void setNumaccess(BigInteger numaccess) {
		this.numaccess = numaccess;
	}


	@Column(length=35)
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
		@JoinColumn(name="synonymId", referencedColumnName="entityNormId", nullable=false, insertable=false, updatable=false)
		})
	public WeightNorm getWeightNorm() {
		return this.weightNorm;
	}

	public void setWeightNorm(WeightNorm weightNorm) {
		this.weightNorm = weightNorm;
	}


	//bi-directional many-to-one association to Word
	@OneToMany(mappedBy="synonym")
	public List<Word> getWords() {
		return this.words;
	}

	public void setWords(List<Word> words) {
		this.words = words;
	}

	public Word addWord(Word word) {
		getWords().add(word);
		word.setSynonym(this);

		return word;
	}

	public Word removeWord(Word word) {
		getWords().remove(word);
		word.setSynonym(null);

		return word;
	}

}