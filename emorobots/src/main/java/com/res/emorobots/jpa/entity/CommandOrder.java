package com.res.emorobots.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;
import java.util.List;


/**
 * The persistent class for the CommandOrder database table.
 * 
 */
@Entity
@Table(name="CommandOrder")
@NamedQuery(name="CommandOrder.findAll", query="SELECT c FROM CommandOrder c")
public class CommandOrder implements Serializable {
	private static final long serialVersionUID = 1L;
	private String commandorderId;
	private BigInteger candidateId;
	private BigInteger candidateNormId;
	private Date lastaccess;
	private BigInteger numaccess;
	private String text;
	private Command command;
	private Order order;
	private WeightNorm weightNorm;
	private List<CommandOrder2CommandOrder> commandOrder2commandOrders1;
	private List<CommandOrder2CommandOrder> commandOrder2commandOrders2;

	public CommandOrder() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	public String getCommandorderId() {
		return this.commandorderId;
	}

	public void setCommandorderId(String commandorderId) {
		this.commandorderId = commandorderId;
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


	//bi-directional many-to-one association to Command
	@ManyToOne
	@JoinColumn(name="commandId", nullable=false)
	public Command getCommand() {
		return this.command;
	}

	public void setCommand(Command command) {
		this.command = command;
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
		@JoinColumn(name="commandorderId", referencedColumnName="entityNormId", nullable=false, insertable=false, updatable=false),
		@JoinColumn(name="entityName", referencedColumnName="entityName", nullable=false)
		})
	public WeightNorm getWeightNorm() {
		return this.weightNorm;
	}

	public void setWeightNorm(WeightNorm weightNorm) {
		this.weightNorm = weightNorm;
	}


	//bi-directional many-to-one association to CommandOrder2CommandOrder
	@OneToMany(mappedBy="commandOrder1")
	public List<CommandOrder2CommandOrder> getCommandOrder2commandOrders1() {
		return this.commandOrder2commandOrders1;
	}

	public void setCommandOrder2commandOrders1(List<CommandOrder2CommandOrder> commandOrder2commandOrders1) {
		this.commandOrder2commandOrders1 = commandOrder2commandOrders1;
	}

	public CommandOrder2CommandOrder addCommandOrder2commandOrders1(CommandOrder2CommandOrder commandOrder2commandOrders1) {
		getCommandOrder2commandOrders1().add(commandOrder2commandOrders1);
		commandOrder2commandOrders1.setCommandOrder1(this);

		return commandOrder2commandOrders1;
	}

	public CommandOrder2CommandOrder removeCommandOrder2commandOrders1(CommandOrder2CommandOrder commandOrder2commandOrders1) {
		getCommandOrder2commandOrders1().remove(commandOrder2commandOrders1);
		commandOrder2commandOrders1.setCommandOrder1(null);

		return commandOrder2commandOrders1;
	}


	//bi-directional many-to-one association to CommandOrder2CommandOrder
	@OneToMany(mappedBy="commandOrder2")
	public List<CommandOrder2CommandOrder> getCommandOrder2commandOrders2() {
		return this.commandOrder2commandOrders2;
	}

	public void setCommandOrder2commandOrders2(List<CommandOrder2CommandOrder> commandOrder2commandOrders2) {
		this.commandOrder2commandOrders2 = commandOrder2commandOrders2;
	}

	public CommandOrder2CommandOrder addCommandOrder2commandOrders2(CommandOrder2CommandOrder commandOrder2commandOrders2) {
		getCommandOrder2commandOrders2().add(commandOrder2commandOrders2);
		commandOrder2commandOrders2.setCommandOrder2(this);

		return commandOrder2commandOrders2;
	}

	public CommandOrder2CommandOrder removeCommandOrder2commandOrders2(CommandOrder2CommandOrder commandOrder2commandOrders2) {
		getCommandOrder2commandOrders2().remove(commandOrder2commandOrders2);
		commandOrder2commandOrders2.setCommandOrder2(null);

		return commandOrder2commandOrders2;
	}

}