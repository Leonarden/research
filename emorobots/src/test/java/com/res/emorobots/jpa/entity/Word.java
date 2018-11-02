package com.res.emorobots.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;
import java.util.List;


/**
 * The persistent class for the Word database table.
 * 
 */
@Entity
@Table(name="Word")
@NamedQuery(name="Word.findAll", query="SELECT w FROM Word w")
public class Word implements Serializable {
	private static final long serialVersionUID = 1L;
	private String wordId;
	private BigInteger candidateId;
	private BigInteger candidateNormId;
	private String encoding;
	private String lang;
	private BigInteger numaccess;
	private String text;
	private WeightNorm weightNorm;
	private Synonym synonym;
	private List<WordSentence> wordSentences;

	public Word() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	public String getWordId() {
		return this.wordId;
	}

	public void setWordId(String wordId) {
		this.wordId = wordId;
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
		@JoinColumn(name="wordId", referencedColumnName="entityNormId", nullable=false, insertable=false, updatable=false)
		})
	public WeightNorm getWeightNorm() {
		return this.weightNorm;
	}

	public void setWeightNorm(WeightNorm weightNorm) {
		this.weightNorm = weightNorm;
	}


	//bi-directional many-to-one association to Synonym
	@ManyToOne
	@JoinColumn(name="synonymId")
	public Synonym getSynonym() {
		return this.synonym;
	}

	public void setSynonym(Synonym synonym) {
		this.synonym = synonym;
	}


	//bi-directional many-to-one association to WordSentence
	@OneToMany(mappedBy="word")
	public List<WordSentence> getWordSentences() {
		return this.wordSentences;
	}

	public void setWordSentences(List<WordSentence> wordSentences) {
		this.wordSentences = wordSentences;
	}

	public WordSentence addWordSentence(WordSentence wordSentence) {
		getWordSentences().add(wordSentence);
		wordSentence.setWord(this);

		return wordSentence;
	}

	public WordSentence removeWordSentence(WordSentence wordSentence) {
		getWordSentences().remove(wordSentence);
		wordSentence.setWord(null);

		return wordSentence;
	}

}