package com.res.emorobot.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the Sentence2Sentence database table.
 * 
 */
@Embeddable
public class Sentence2SentencePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private String sentenceId;

	@Column(insertable=false, updatable=false)
	private String sentence2Id;

	public Sentence2SentencePK() {
	}
	public String getSentenceId() {
		return this.sentenceId;
	}
	public void setSentenceId(String sentenceId) {
		this.sentenceId = sentenceId;
	}
	public String getSentence2Id() {
		return this.sentence2Id;
	}
	public void setSentence2Id(String sentence2Id) {
		this.sentence2Id = sentence2Id;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof Sentence2SentencePK)) {
			return false;
		}
		Sentence2SentencePK castOther = (Sentence2SentencePK)other;
		return 
			this.sentenceId.equals(castOther.sentenceId)
			&& this.sentence2Id.equals(castOther.sentence2Id);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.sentenceId.hashCode();
		hash = hash * prime + this.sentence2Id.hashCode();
		
		return hash;
	}
}