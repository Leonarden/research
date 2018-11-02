package com.res.emorobots.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;
import java.math.BigInteger;


/**
 * The persistent class for the ContextOrder database table.
 * 
 */
@Entity
@Table(name="ContextOrder")
@NamedQuery(name="ContextOrder.findAll", query="SELECT c FROM ContextOrder c")
public class ContextOrder implements Serializable {
	private static final long serialVersionUID = 1L;
	private String contextorderId;
	private BigInteger candidateId;
	private BigInteger candidateNormId;
	private Timestamp ended;
	private Date lastaccess;
	private BigInteger numaccess;
	private int priority;
	private Timestamp started;
	private String status;
	private Timestamp telapsed;
	private String text;
	private WeightNorm weightNorm;
	private Context context;
	private Order order;

	public ContextOrder() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	public String getContextorderId() {
		return this.contextorderId;
	}

	public void setContextorderId(String contextorderId) {
		this.contextorderId = contextorderId;
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


	public int getPriority() {
		return this.priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
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
		@JoinColumn(name="contextorderId", referencedColumnName="entityNormId", nullable=false, insertable=false, updatable=false),
		@JoinColumn(name="entityName", referencedColumnName="entityName", nullable=false)
		})
	public WeightNorm getWeightNorm() {
		return this.weightNorm;
	}

	public void setWeightNorm(WeightNorm weightNorm) {
		this.weightNorm = weightNorm;
	}


	//bi-directional many-to-one association to Context
	@ManyToOne
	@JoinColumn(name="contextId")
	public Context getContext() {
		return this.context;
	}

	public void setContext(Context context) {
		this.context = context;
	}


	//bi-directional many-to-one association to Order
	@ManyToOne
	@JoinColumn(name="orderId")
	public Order getOrder() {
		return this.order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

}