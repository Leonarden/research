package com.res.emorobots.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;


/**
 * The persistent class for the Word database table.
 * 
 */
@Entity
@NamedQuery(name="Word.findAll", query="SELECT w FROM Word w")
public class Word implements Serializable {
	private static final long serialVersionUID = 1L;
	private String wordId;
	private String entityName;
	private BigInteger numaccess;
	private String text;

	public Word() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public String getWordId() {
		return this.wordId;
	}

	public void setWordId(String wordId) {
		this.wordId = wordId;
	}


	public String getEntityName() {
		return this.entityName;
	}

	public void setEntityName(String entityName) {
		this.entityName = entityName;
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

}