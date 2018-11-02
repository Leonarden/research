package com.res.emorobots.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;
import java.util.List;


/**
 * The persistent class for the Subject database table.
 * 
 */
@Entity
@Table(name="Subject")
@NamedQuery(name="Subject.findAll", query="SELECT s FROM Subject s")
public class Subject implements Serializable {
	private static final long serialVersionUID = 1L;
	private String subjectId;
	private BigInteger applicationId;
	private BigInteger candidateId;
	private BigInteger candidateNormId;
	private Date lastaccess;
	private BigInteger numaccess;
	private String text;
	private List<Observer> observers;
	private WeightNorm weightNorm;
	private List<SubjectOrder> subjectOrders;

	public Subject() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	public String getSubjectId() {
		return this.subjectId;
	}

	public void setSubjectId(String subjectId) {
		this.subjectId = subjectId;
	}


	public BigInteger getApplicationId() {
		return this.applicationId;
	}

	public void setApplicationId(BigInteger applicationId) {
		this.applicationId = applicationId;
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


	//bi-directional many-to-one association to Observer
	@OneToMany(mappedBy="subject")
	public List<Observer> getObservers() {
		return this.observers;
	}

	public void setObservers(List<Observer> observers) {
		this.observers = observers;
	}

	public Observer addObserver(Observer observer) {
		getObservers().add(observer);
		observer.setSubject(this);

		return observer;
	}

	public Observer removeObserver(Observer observer) {
		getObservers().remove(observer);
		observer.setSubject(null);

		return observer;
	}


	//bi-directional many-to-one association to WeightNorm
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="entityName", referencedColumnName="entityName", nullable=false),
		@JoinColumn(name="subjectId", referencedColumnName="entityNormId", nullable=false, insertable=false, updatable=false)
		})
	public WeightNorm getWeightNorm() {
		return this.weightNorm;
	}

	public void setWeightNorm(WeightNorm weightNorm) {
		this.weightNorm = weightNorm;
	}


	//bi-directional many-to-one association to SubjectOrder
	@OneToMany(mappedBy="subject")
	public List<SubjectOrder> getSubjectOrders() {
		return this.subjectOrders;
	}

	public void setSubjectOrders(List<SubjectOrder> subjectOrders) {
		this.subjectOrders = subjectOrders;
	}

	public SubjectOrder addSubjectOrder(SubjectOrder subjectOrder) {
		getSubjectOrders().add(subjectOrder);
		subjectOrder.setSubject(this);

		return subjectOrder;
	}

	public SubjectOrder removeSubjectOrder(SubjectOrder subjectOrder) {
		getSubjectOrders().remove(subjectOrder);
		subjectOrder.setSubject(null);

		return subjectOrder;
	}

}