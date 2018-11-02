package com.res.emorobots.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;
import java.util.List;


/**
 * The persistent class for the Symbol database table.
 * 
 */
@Entity
@Table(name="Symbol")
@NamedQuery(name="Symbol.findAll", query="SELECT s FROM Symbol s")
public class Symbol implements Serializable {
	private static final long serialVersionUID = 1L;
	private String symbolId;
	private BigInteger candidateId;
	private BigInteger candidateNormId;
	private String encoding;
	private String lang;
	private Date lastaccess;
	private BigInteger numaccess;
	private String text;
	private WeightNorm weightNorm;
	private List<SymbolSentence> symbolSentences;

	public Symbol() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	public String getSymbolId() {
		return this.symbolId;
	}

	public void setSymbolId(String symbolId) {
		this.symbolId = symbolId;
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
		@JoinColumn(name="symbolId", referencedColumnName="entityNormId", nullable=false, insertable=false, updatable=false)
		})
	public WeightNorm getWeightNorm() {
		return this.weightNorm;
	}

	public void setWeightNorm(WeightNorm weightNorm) {
		this.weightNorm = weightNorm;
	}


	//bi-directional many-to-one association to SymbolSentence
	@OneToMany(mappedBy="symbol")
	public List<SymbolSentence> getSymbolSentences() {
		return this.symbolSentences;
	}

	public void setSymbolSentences(List<SymbolSentence> symbolSentences) {
		this.symbolSentences = symbolSentences;
	}

	public SymbolSentence addSymbolSentence(SymbolSentence symbolSentence) {
		getSymbolSentences().add(symbolSentence);
		symbolSentence.setSymbol(this);

		return symbolSentence;
	}

	public SymbolSentence removeSymbolSentence(SymbolSentence symbolSentence) {
		getSymbolSentences().remove(symbolSentence);
		symbolSentence.setSymbol(null);

		return symbolSentence;
	}

}