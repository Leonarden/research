package com.res.emorobots.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;
import java.util.List;


/**
 * The persistent class for the SubjectOrder database table.
 * 
 */
@Entity
@Table(name="SubjectOrder")
@NamedQuery(name="SubjectOrder.findAll", query="SELECT s FROM SubjectOrder s")
public class SubjectOrder implements Serializable {
	private static final long serialVersionUID = 1L;
	private String subjectorderId;
	private BigInteger candidateId;
	private BigInteger candidateNormId;
	private Date lastaccess;
	private BigInteger numaccess;
	private String text;
	private Order order;
	private Subject subject;
	private WeightNorm weightNorm;
	private List<SubjectOrder2SubjectOrder> subjectOrder2subjectOrders1;
	private List<SubjectOrder2SubjectOrder> subjectOrder2subjectOrders2;

	public SubjectOrder() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	public String getSubjectorderId() {
		return this.subjectorderId;
	}

	public void setSubjectorderId(String subjectorderId) {
		this.subjectorderId = subjectorderId;
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


	//bi-directional many-to-one association to Order
	@ManyToOne
	@JoinColumn(name="orderId", nullable=false)
	public Order getOrder() {
		return this.order;
	}

	public void setOrder(Order order) {
		this.order = order;
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
		@JoinColumn(name="subjectorderId", referencedColumnName="entityNormId", nullable=false, insertable=false, updatable=false)
		})
	public WeightNorm getWeightNorm() {
		return this.weightNorm;
	}

	public void setWeightNorm(WeightNorm weightNorm) {
		this.weightNorm = weightNorm;
	}


	//bi-directional many-to-one association to SubjectOrder2SubjectOrder
	@OneToMany(mappedBy="subjectOrder1")
	public List<SubjectOrder2SubjectOrder> getSubjectOrder2subjectOrders1() {
		return this.subjectOrder2subjectOrders1;
	}

	public void setSubjectOrder2subjectOrders1(List<SubjectOrder2SubjectOrder> subjectOrder2subjectOrders1) {
		this.subjectOrder2subjectOrders1 = subjectOrder2subjectOrders1;
	}

	public SubjectOrder2SubjectOrder addSubjectOrder2subjectOrders1(SubjectOrder2SubjectOrder subjectOrder2subjectOrders1) {
		getSubjectOrder2subjectOrders1().add(subjectOrder2subjectOrders1);
		subjectOrder2subjectOrders1.setSubjectOrder1(this);

		return subjectOrder2subjectOrders1;
	}

	public SubjectOrder2SubjectOrder removeSubjectOrder2subjectOrders1(SubjectOrder2SubjectOrder subjectOrder2subjectOrders1) {
		getSubjectOrder2subjectOrders1().remove(subjectOrder2subjectOrders1);
		subjectOrder2subjectOrders1.setSubjectOrder1(null);

		return subjectOrder2subjectOrders1;
	}


	//bi-directional many-to-one association to SubjectOrder2SubjectOrder
	@OneToMany(mappedBy="subjectOrder2")
	public List<SubjectOrder2SubjectOrder> getSubjectOrder2subjectOrders2() {
		return this.subjectOrder2subjectOrders2;
	}

	public void setSubjectOrder2subjectOrders2(List<SubjectOrder2SubjectOrder> subjectOrder2subjectOrders2) {
		this.subjectOrder2subjectOrders2 = subjectOrder2subjectOrders2;
	}

	public SubjectOrder2SubjectOrder addSubjectOrder2subjectOrders2(SubjectOrder2SubjectOrder subjectOrder2subjectOrders2) {
		getSubjectOrder2subjectOrders2().add(subjectOrder2subjectOrders2);
		subjectOrder2subjectOrders2.setSubjectOrder2(this);

		return subjectOrder2subjectOrders2;
	}

	public SubjectOrder2SubjectOrder removeSubjectOrder2subjectOrders2(SubjectOrder2SubjectOrder subjectOrder2subjectOrders2) {
		getSubjectOrder2subjectOrders2().remove(subjectOrder2subjectOrders2);
		subjectOrder2subjectOrders2.setSubjectOrder2(null);

		return subjectOrder2subjectOrders2;
	}

}