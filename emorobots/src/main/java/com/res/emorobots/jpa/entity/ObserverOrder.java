package com.res.emorobots.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;
import java.util.List;


/**
 * The persistent class for the ObserverOrder database table.
 * 
 */
@Entity
@Table(name="ObserverOrder")
@NamedQuery(name="ObserverOrder.findAll", query="SELECT o FROM ObserverOrder o")
public class ObserverOrder implements Serializable {
	private static final long serialVersionUID = 1L;
	private String observerorderId;
	private BigInteger candidateId;
	private BigInteger candidateNormId;
	private Date lastaccess;
	private BigInteger numaccess;
	private String text;
	private Observer observer;
	private Order order;
	private WeightNorm weightNorm;
	private List<ObserverOrder2ObserverOrder> observerOrder2observerOrders1;
	private List<ObserverOrder2ObserverOrder> observerOrder2observerOrders2;

	public ObserverOrder() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	public String getObserverorderId() {
		return this.observerorderId;
	}

	public void setObserverorderId(String observerorderId) {
		this.observerorderId = observerorderId;
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


	@Column(length=300)
	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}


	//bi-directional many-to-one association to Observer
	@ManyToOne
	@JoinColumn(name="observerId", nullable=false)
	public Observer getObserver() {
		return this.observer;
	}

	public void setObserver(Observer observer) {
		this.observer = observer;
	}


	//bi-directional many-to-one association to Order
	@ManyToOne
	@JoinColumn(name="orderId", nullable=false)
	public Order getOrder() {
		return this.order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}


	//bi-directional many-to-one association to WeightNorm
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="entityName", referencedColumnName="entityName", nullable=false),
		@JoinColumn(name="observerorderId", referencedColumnName="entityNormId", nullable=false, insertable=false, updatable=false)
		})
	public WeightNorm getWeightNorm() {
		return this.weightNorm;
	}

	public void setWeightNorm(WeightNorm weightNorm) {
		this.weightNorm = weightNorm;
	}


	//bi-directional many-to-one association to ObserverOrder2ObserverOrder
	@OneToMany(mappedBy="observerOrder1")
	public List<ObserverOrder2ObserverOrder> getObserverOrder2observerOrders1() {
		return this.observerOrder2observerOrders1;
	}

	public void setObserverOrder2observerOrders1(List<ObserverOrder2ObserverOrder> observerOrder2observerOrders1) {
		this.observerOrder2observerOrders1 = observerOrder2observerOrders1;
	}

	public ObserverOrder2ObserverOrder addObserverOrder2observerOrders1(ObserverOrder2ObserverOrder observerOrder2observerOrders1) {
		getObserverOrder2observerOrders1().add(observerOrder2observerOrders1);
		observerOrder2observerOrders1.setObserverOrder1(this);

		return observerOrder2observerOrders1;
	}

	public ObserverOrder2ObserverOrder removeObserverOrder2observerOrders1(ObserverOrder2ObserverOrder observerOrder2observerOrders1) {
		getObserverOrder2observerOrders1().remove(observerOrder2observerOrders1);
		observerOrder2observerOrders1.setObserverOrder1(null);

		return observerOrder2observerOrders1;
	}


	//bi-directional many-to-one association to ObserverOrder2ObserverOrder
	@OneToMany(mappedBy="observerOrder2")
	public List<ObserverOrder2ObserverOrder> getObserverOrder2observerOrders2() {
		return this.observerOrder2observerOrders2;
	}

	public void setObserverOrder2observerOrders2(List<ObserverOrder2ObserverOrder> observerOrder2observerOrders2) {
		this.observerOrder2observerOrders2 = observerOrder2observerOrders2;
	}

	public ObserverOrder2ObserverOrder addObserverOrder2observerOrders2(ObserverOrder2ObserverOrder observerOrder2observerOrders2) {
		getObserverOrder2observerOrders2().add(observerOrder2observerOrders2);
		observerOrder2observerOrders2.setObserverOrder2(this);

		return observerOrder2observerOrders2;
	}

	public ObserverOrder2ObserverOrder removeObserverOrder2observerOrders2(ObserverOrder2ObserverOrder observerOrder2observerOrders2) {
		getObserverOrder2observerOrders2().remove(observerOrder2observerOrders2);
		observerOrder2observerOrders2.setObserverOrder2(null);

		return observerOrder2observerOrders2;
	}

}