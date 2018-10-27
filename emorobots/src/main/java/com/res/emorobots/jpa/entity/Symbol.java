package com.res.emorobots.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the Symbol database table.
 * 
 */
@Entity
@NamedQuery(name="Symbol.findAll", query="SELECT s FROM Symbol s")
public class Symbol implements Serializable {
	private static final long serialVersionUID = 1L;
	private String symbolId;
	private String entityName;
	private Date lastaccess;
	private BigInteger numaccess;
	private String text;

	public Symbol() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public String getSymbolId() {
		return this.symbolId;
	}

	public void setSymbolId(String symbolId) {
		this.symbolId = symbolId;
	}


	public String getEntityName() {
		return this.entityName;
	}

	public void setEntityName(String entityName) {
		this.entityName = entityName;
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

}