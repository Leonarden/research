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
	private String encoding;
	private float frequency;
	private int indexinchain;
	private String lang;
	private BigInteger numaccess;
	private String text;
	private Synonym synonym;
	private List<Synonym> synonyms;
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


	@Column(length=10)
	public String getEncoding() {
		return this.encoding;
	}

	public void setEncoding(String encoding) {
		this.encoding = encoding;
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


	@Column(length=10)
	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
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


	//bi-directional many-to-one association to Synonym
	@ManyToOne
	@JoinColumn(name="nextsynId")
	public Synonym getSynonym() {
		return this.synonym;
	}

	public void setSynonym(Synonym synonym) {
		this.synonym = synonym;
	}


	//bi-directional many-to-one association to Synonym
	@OneToMany(mappedBy="synonym")
	public List<Synonym> getSynonyms() {
		return this.synonyms;
	}

	public void setSynonyms(List<Synonym> synonyms) {
		this.synonyms = synonyms;
	}

	public Synonym addSynonym(Synonym synonym) {
		getSynonyms().add(synonym);
		synonym.setSynonym(this);

		return synonym;
	}

	public Synonym removeSynonym(Synonym synonym) {
		getSynonyms().remove(synonym);
		synonym.setSynonym(null);

		return synonym;
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