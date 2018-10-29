package com.res.emorobots.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;
import java.util.List;


/**
 * The persistent class for the ActionOrder database table.
 * 
 */
@Entity
@Table(name="ActionOrder")
@NamedQuery(name="ActionOrder.findAll", query="SELECT a FROM ActionOrder a")
public class ActionOrder implements Serializable {
	private static final long serialVersionUID = 1L;
	private String actionorderId;
	private BigInteger candidateId;
	private BigInteger candidateNormId;
	private Date lastaccess;
	private BigInteger numaccess;
	private String text;
	private Action action;
	private Order order;
	private WeightNorm weightNorm;
	private List<ActionOrder2ActionOrder> actionOrder2actionOrders1;
	private List<ActionOrder2ActionOrder> actionOrder2actionOrders2;

	public ActionOrder() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	public String getActionorderId() {
		return this.actionorderId;
	}

	public void setActionorderId(String actionorderId) {
		this.actionorderId = actionorderId;
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


	//bi-directional many-to-one association to Action
	@ManyToOne
	@JoinColumn(name="actionId", nullable=false)
	public Action getAction() {
		return this.action;
	}

	public void setAction(Action action) {
		this.action = action;
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
		@JoinColumn(name="actionorderId", referencedColumnName="entityNormId", nullable=false, insertable=false, updatable=false),
		@JoinColumn(name="entityName", referencedColumnName="entityName", nullable=false)
		})
	public WeightNorm getWeightNorm() {
		return this.weightNorm;
	}

	public void setWeightNorm(WeightNorm weightNorm) {
		this.weightNorm = weightNorm;
	}


	//bi-directional many-to-one association to ActionOrder2ActionOrder
	@OneToMany(mappedBy="actionOrder1")
	public List<ActionOrder2ActionOrder> getActionOrder2actionOrders1() {
		return this.actionOrder2actionOrders1;
	}

	public void setActionOrder2actionOrders1(List<ActionOrder2ActionOrder> actionOrder2actionOrders1) {
		this.actionOrder2actionOrders1 = actionOrder2actionOrders1;
	}

	public ActionOrder2ActionOrder addActionOrder2actionOrders1(ActionOrder2ActionOrder actionOrder2actionOrders1) {
		getActionOrder2actionOrders1().add(actionOrder2actionOrders1);
		actionOrder2actionOrders1.setActionOrder1(this);

		return actionOrder2actionOrders1;
	}

	public ActionOrder2ActionOrder removeActionOrder2actionOrders1(ActionOrder2ActionOrder actionOrder2actionOrders1) {
		getActionOrder2actionOrders1().remove(actionOrder2actionOrders1);
		actionOrder2actionOrders1.setActionOrder1(null);

		return actionOrder2actionOrders1;
	}


	//bi-directional many-to-one association to ActionOrder2ActionOrder
	@OneToMany(mappedBy="actionOrder2")
	public List<ActionOrder2ActionOrder> getActionOrder2actionOrders2() {
		return this.actionOrder2actionOrders2;
	}

	public void setActionOrder2actionOrders2(List<ActionOrder2ActionOrder> actionOrder2actionOrders2) {
		this.actionOrder2actionOrders2 = actionOrder2actionOrders2;
	}

	public ActionOrder2ActionOrder addActionOrder2actionOrders2(ActionOrder2ActionOrder actionOrder2actionOrders2) {
		getActionOrder2actionOrders2().add(actionOrder2actionOrders2);
		actionOrder2actionOrders2.setActionOrder2(this);

		return actionOrder2actionOrders2;
	}

	public ActionOrder2ActionOrder removeActionOrder2actionOrders2(ActionOrder2ActionOrder actionOrder2actionOrders2) {
		getActionOrder2actionOrders2().remove(actionOrder2actionOrders2);
		actionOrder2actionOrders2.setActionOrder2(null);

		return actionOrder2actionOrders2;
	}

}