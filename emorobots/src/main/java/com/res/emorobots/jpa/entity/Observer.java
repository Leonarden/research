package com.res.emorobots.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;
import java.util.List;


/**
 * The persistent class for the Observer database table.
 * 
 */
@Entity
@Table(name="Observer")
@NamedQuery(name="Observer.findAll", query="SELECT o FROM Observer o")
public class Observer implements Serializable {
	private static final long serialVersionUID = 1L;
	private String observerId;
	private BigInteger candidateId;
	private BigInteger candidateNormId;
	private Date lastaccess;
	private BigInteger numaccess;
	private String text;
	private List<Command> commands;
	private Subject subject;
	private WeightNorm weightNorm;
	private List<ObserverOrder> observerOrders;
	private List<ObserverThreshold> observerThresholds;

	public Observer() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	public String getObserverId() {
		return this.observerId;
	}

	public void setObserverId(String observerId) {
		this.observerId = observerId;
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


	@Column(length=20)
	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}


	//bi-directional many-to-one association to Command
	@OneToMany(mappedBy="observer")
	public List<Command> getCommands() {
		return this.commands;
	}

	public void setCommands(List<Command> commands) {
		this.commands = commands;
	}

	public Command addCommand(Command command) {
		getCommands().add(command);
		command.setObserver(this);

		return command;
	}

	public Command removeCommand(Command command) {
		getCommands().remove(command);
		command.setObserver(null);

		return command;
	}


	//bi-directional many-to-one association to Subject
	@ManyToOne
	@JoinColumn(name="subjectId", nullable=false)
	public Subject getSubject() {
		return this.subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}


	//bi-directional many-to-one association to WeightNorm
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="entityName", referencedColumnName="entityName", nullable=false),
		@JoinColumn(name="observerId", referencedColumnName="entityNormId", nullable=false, insertable=false, updatable=false)
		})
	public WeightNorm getWeightNorm() {
		return this.weightNorm;
	}

	public void setWeightNorm(WeightNorm weightNorm) {
		this.weightNorm = weightNorm;
	}


	//bi-directional many-to-one association to ObserverOrder
	@OneToMany(mappedBy="observer")
	public List<ObserverOrder> getObserverOrders() {
		return this.observerOrders;
	}

	public void setObserverOrders(List<ObserverOrder> observerOrders) {
		this.observerOrders = observerOrders;
	}

	public ObserverOrder addObserverOrder(ObserverOrder observerOrder) {
		getObserverOrders().add(observerOrder);
		observerOrder.setObserver(this);

		return observerOrder;
	}

	public ObserverOrder removeObserverOrder(ObserverOrder observerOrder) {
		getObserverOrders().remove(observerOrder);
		observerOrder.setObserver(null);

		return observerOrder;
	}


	//bi-directional many-to-one association to ObserverThreshold
	@OneToMany(mappedBy="observer")
	public List<ObserverThreshold> getObserverThresholds() {
		return this.observerThresholds;
	}

	public void setObserverThresholds(List<ObserverThreshold> observerThresholds) {
		this.observerThresholds = observerThresholds;
	}

	public ObserverThreshold addObserverThreshold(ObserverThreshold observerThreshold) {
		getObserverThresholds().add(observerThreshold);
		observerThreshold.setObserver(this);

		return observerThreshold;
	}

	public ObserverThreshold removeObserverThreshold(ObserverThreshold observerThreshold) {
		getObserverThresholds().remove(observerThreshold);
		observerThreshold.setObserver(null);

		return observerThreshold;
	}

}