package com.res.emorobots.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;
import java.math.BigInteger;
import java.util.List;


/**
 * The persistent class for the Context database table.
 * 
 */
@Entity
@Table(name="Context")
@NamedQuery(name="Context.findAll", query="SELECT c FROM Context c")
public class Context implements Serializable {
	private static final long serialVersionUID = 1L;
	private String contextId;
	private BigInteger candidateId;
	private BigInteger candidateNormId;
	private Timestamp ended;
	private Date lastaccess;
	private BigInteger numaccess;
	private String ownerName;
	private Timestamp started;
	private String status;
	private Timestamp telapsed;
	private String text;
	private WeightNorm weightNorm1;
	private WeightNorm weightNorm2;
	private List<ContextOrder> contextOrders;

	public Context() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	public String getContextId() {
		return this.contextId;
	}

	public void setContextId(String contextId) {
		this.contextId = contextId;
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
	public Timestamp getEnded() {
		return this.ended;
	}

	public void setEnded(Timestamp ended) {
		this.ended = ended;
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


	@Column(length=80)
	public String getOwnerName() {
		return this.ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}


	@Column(nullable=false)
	public Timestamp getStarted() {
		return this.started;
	}

	public void setStarted(Timestamp started) {
		this.started = started;
	}


	@Column(nullable=false, length=20)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


	@Column(nullable=false)
	public Timestamp getTelapsed() {
		return this.telapsed;
	}

	public void setTelapsed(Timestamp telapsed) {
		this.telapsed = telapsed;
	}


	@Column(length=200)
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
		@JoinColumn(name="ownerId", referencedColumnName="entityNormId")
		})
	public WeightNorm getWeightNorm1() {
		return this.weightNorm1;
	}

	public void setWeightNorm1(WeightNorm weightNorm1) {
		this.weightNorm1 = weightNorm1;
	}


	//bi-directional many-to-one association to WeightNorm
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="contextId", referencedColumnName="entityNormId", nullable=false, insertable=false, updatable=false),
		@JoinColumn(name="entityName", referencedColumnName="entityName", nullable=false)
		})
	public WeightNorm getWeightNorm2() {
		return this.weightNorm2;
	}

	public void setWeightNorm2(WeightNorm weightNorm2) {
		this.weightNorm2 = weightNorm2;
	}


	//bi-directional many-to-one association to ContextOrder
	@OneToMany(mappedBy="context")
	public List<ContextOrder> getContextOrders() {
		return this.contextOrders;
	}

	public void setContextOrders(List<ContextOrder> contextOrders) {
		this.contextOrders = contextOrders;
	}

	public ContextOrder addContextOrder(ContextOrder contextOrder) {
		getContextOrders().add(contextOrder);
		contextOrder.setContext(this);

		return contextOrder;
	}

	public ContextOrder removeContextOrder(ContextOrder contextOrder) {
		getContextOrders().remove(contextOrder);
		contextOrder.setContext(null);

		return contextOrder;
	}

}