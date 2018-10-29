package com.res.emorobots.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;
import java.math.BigInteger;
import java.util.List;


/**
 * The persistent class for the Order database table.
 * 
 */
@Entity
@Table(name="Order")
@NamedQuery(name="Order.findAll", query="SELECT o FROM Order o")
public class Order implements Serializable {
	private static final long serialVersionUID = 1L;
	private String orderId;
	private BigInteger candidateId;
	private BigInteger candidateNormId;
	private BigInteger contextId;
	private Timestamp ended;
	private Date lastaccess;
	private BigInteger numaccess;
	private Timestamp started;
	private String status;
	private Timestamp telapsed;
	private String text;
	private List<ActionOrder> actionOrders;
	private List<CommandOrder> commandOrders;
	private List<ContextOrder> contextOrders;
	private List<ObserverOrder> observerOrders;
	private OrderType orderType;
	private WeightNorm weightNorm;
	private List<SubjectOrder> subjectOrders;

	public Order() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	public String getOrderId() {
		return this.orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
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
	public BigInteger getContextId() {
		return this.contextId;
	}

	public void setContextId(BigInteger contextId) {
		this.contextId = contextId;
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


	//bi-directional many-to-one association to ActionOrder
	@OneToMany(mappedBy="order")
	public List<ActionOrder> getActionOrders() {
		return this.actionOrders;
	}

	public void setActionOrders(List<ActionOrder> actionOrders) {
		this.actionOrders = actionOrders;
	}

	public ActionOrder addActionOrder(ActionOrder actionOrder) {
		getActionOrders().add(actionOrder);
		actionOrder.setOrder(this);

		return actionOrder;
	}

	public ActionOrder removeActionOrder(ActionOrder actionOrder) {
		getActionOrders().remove(actionOrder);
		actionOrder.setOrder(null);

		return actionOrder;
	}


	//bi-directional many-to-one association to CommandOrder
	@OneToMany(mappedBy="order")
	public List<CommandOrder> getCommandOrders() {
		return this.commandOrders;
	}

	public void setCommandOrders(List<CommandOrder> commandOrders) {
		this.commandOrders = commandOrders;
	}

	public CommandOrder addCommandOrder(CommandOrder commandOrder) {
		getCommandOrders().add(commandOrder);
		commandOrder.setOrder(this);

		return commandOrder;
	}

	public CommandOrder removeCommandOrder(CommandOrder commandOrder) {
		getCommandOrders().remove(commandOrder);
		commandOrder.setOrder(null);

		return commandOrder;
	}


	//bi-directional many-to-one association to ContextOrder
	@OneToMany(mappedBy="order")
	public List<ContextOrder> getContextOrders() {
		return this.contextOrders;
	}

	public void setContextOrders(List<ContextOrder> contextOrders) {
		this.contextOrders = contextOrders;
	}

	public ContextOrder addContextOrder(ContextOrder contextOrder) {
		getContextOrders().add(contextOrder);
		contextOrder.setOrder(this);

		return contextOrder;
	}

	public ContextOrder removeContextOrder(ContextOrder contextOrder) {
		getContextOrders().remove(contextOrder);
		contextOrder.setOrder(null);

		return contextOrder;
	}


	//bi-directional many-to-one association to ObserverOrder
	@OneToMany(mappedBy="order")
	public List<ObserverOrder> getObserverOrders() {
		return this.observerOrders;
	}

	public void setObserverOrders(List<ObserverOrder> observerOrders) {
		this.observerOrders = observerOrders;
	}

	public ObserverOrder addObserverOrder(ObserverOrder observerOrder) {
		getObserverOrders().add(observerOrder);
		observerOrder.setOrder(this);

		return observerOrder;
	}

	public ObserverOrder removeObserverOrder(ObserverOrder observerOrder) {
		getObserverOrders().remove(observerOrder);
		observerOrder.setOrder(null);

		return observerOrder;
	}


	//bi-directional many-to-one association to OrderType
	@ManyToOne
	@JoinColumn(name="ordertypeId", nullable=false)
	public OrderType getOrderType() {
		return this.orderType;
	}

	public void setOrderType(OrderType orderType) {
		this.orderType = orderType;
	}


	//bi-directional many-to-one association to WeightNorm
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="entityName", referencedColumnName="entityName", nullable=false),
		@JoinColumn(name="orderId", referencedColumnName="entityNormId", nullable=false, insertable=false, updatable=false)
		})
	public WeightNorm getWeightNorm() {
		return this.weightNorm;
	}

	public void setWeightNorm(WeightNorm weightNorm) {
		this.weightNorm = weightNorm;
	}


	//bi-directional many-to-one association to SubjectOrder
	@OneToMany(mappedBy="order")
	public List<SubjectOrder> getSubjectOrders() {
		return this.subjectOrders;
	}

	public void setSubjectOrders(List<SubjectOrder> subjectOrders) {
		this.subjectOrders = subjectOrders;
	}

	public SubjectOrder addSubjectOrder(SubjectOrder subjectOrder) {
		getSubjectOrders().add(subjectOrder);
		subjectOrder.setOrder(this);

		return subjectOrder;
	}

	public SubjectOrder removeSubjectOrder(SubjectOrder subjectOrder) {
		getSubjectOrders().remove(subjectOrder);
		subjectOrder.setOrder(null);

		return subjectOrder;
	}

}