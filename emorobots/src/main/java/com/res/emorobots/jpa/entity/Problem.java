package com.res.emorobots.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;
import java.util.List;


/**
 * The persistent class for the Problem database table.
 * 
 */
@Entity
@NamedQuery(name="Problem.findAll", query="SELECT p FROM Problem p")
public class Problem implements Serializable {
	private static final long serialVersionUID = 1L;
	private String problemId;
	private String entityName;
	private Date lastaccess;
	private BigInteger numaccess;
	private String text;
	private List<ActionProblem> actionProblems;
	private List<CommandProblem> commandProblems;
	private List<Definition> definitions;
	private List<ObserverProblem> observerProblems;
	private List<Problem2Problem> problem2problems1;
	private List<Problem2Problem> problem2problems2;
	private List<Solution> solutions;
	private List<SubjectProblem> subjectProblems;

	public Problem() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public String getProblemId() {
		return this.problemId;
	}

	public void setProblemId(String problemId) {
		this.problemId = problemId;
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


	//bi-directional many-to-one association to ActionProblem
	@OneToMany(mappedBy="problem")
	public List<ActionProblem> getActionProblems() {
		return this.actionProblems;
	}

	public void setActionProblems(List<ActionProblem> actionProblems) {
		this.actionProblems = actionProblems;
	}

	public ActionProblem addActionProblem(ActionProblem actionProblem) {
		getActionProblems().add(actionProblem);
		actionProblem.setProblem(this);

		return actionProblem;
	}

	public ActionProblem removeActionProblem(ActionProblem actionProblem) {
		getActionProblems().remove(actionProblem);
		actionProblem.setProblem(null);

		return actionProblem;
	}


	//bi-directional many-to-one association to CommandProblem
	@OneToMany(mappedBy="problem")
	public List<CommandProblem> getCommandProblems() {
		return this.commandProblems;
	}

	public void setCommandProblems(List<CommandProblem> commandProblems) {
		this.commandProblems = commandProblems;
	}

	public CommandProblem addCommandProblem(CommandProblem commandProblem) {
		getCommandProblems().add(commandProblem);
		commandProblem.setProblem(this);

		return commandProblem;
	}

	public CommandProblem removeCommandProblem(CommandProblem commandProblem) {
		getCommandProblems().remove(commandProblem);
		commandProblem.setProblem(null);

		return commandProblem;
	}


	//bi-directional many-to-one association to Definition
	@OneToMany(mappedBy="problem")
	public List<Definition> getDefinitions() {
		return this.definitions;
	}

	public void setDefinitions(List<Definition> definitions) {
		this.definitions = definitions;
	}

	public Definition addDefinition(Definition definition) {
		getDefinitions().add(definition);
		definition.setProblem(this);

		return definition;
	}

	public Definition removeDefinition(Definition definition) {
		getDefinitions().remove(definition);
		definition.setProblem(null);

		return definition;
	}


	//bi-directional many-to-one association to ObserverProblem
	@OneToMany(mappedBy="problem")
	public List<ObserverProblem> getObserverProblems() {
		return this.observerProblems;
	}

	public void setObserverProblems(List<ObserverProblem> observerProblems) {
		this.observerProblems = observerProblems;
	}

	public ObserverProblem addObserverProblem(ObserverProblem observerProblem) {
		getObserverProblems().add(observerProblem);
		observerProblem.setProblem(this);

		return observerProblem;
	}

	public ObserverProblem removeObserverProblem(ObserverProblem observerProblem) {
		getObserverProblems().remove(observerProblem);
		observerProblem.setProblem(null);

		return observerProblem;
	}


	//bi-directional many-to-one association to Problem2Problem
	@OneToMany(mappedBy="problem1")
	public List<Problem2Problem> getProblem2problems1() {
		return this.problem2problems1;
	}

	public void setProblem2problems1(List<Problem2Problem> problem2problems1) {
		this.problem2problems1 = problem2problems1;
	}

	public Problem2Problem addProblem2problems1(Problem2Problem problem2problems1) {
		getProblem2problems1().add(problem2problems1);
		problem2problems1.setProblem1(this);

		return problem2problems1;
	}

	public Problem2Problem removeProblem2problems1(Problem2Problem problem2problems1) {
		getProblem2problems1().remove(problem2problems1);
		problem2problems1.setProblem1(null);

		return problem2problems1;
	}


	//bi-directional many-to-one association to Problem2Problem
	@OneToMany(mappedBy="problem2")
	public List<Problem2Problem> getProblem2problems2() {
		return this.problem2problems2;
	}

	public void setProblem2problems2(List<Problem2Problem> problem2problems2) {
		this.problem2problems2 = problem2problems2;
	}

	public Problem2Problem addProblem2problems2(Problem2Problem problem2problems2) {
		getProblem2problems2().add(problem2problems2);
		problem2problems2.setProblem2(this);

		return problem2problems2;
	}

	public Problem2Problem removeProblem2problems2(Problem2Problem problem2problems2) {
		getProblem2problems2().remove(problem2problems2);
		problem2problems2.setProblem2(null);

		return problem2problems2;
	}


	//bi-directional many-to-one association to Solution
	@OneToMany(mappedBy="problem")
	public List<Solution> getSolutions() {
		return this.solutions;
	}

	public void setSolutions(List<Solution> solutions) {
		this.solutions = solutions;
	}

	public Solution addSolution(Solution solution) {
		getSolutions().add(solution);
		solution.setProblem(this);

		return solution;
	}

	public Solution removeSolution(Solution solution) {
		getSolutions().remove(solution);
		solution.setProblem(null);

		return solution;
	}


	//bi-directional many-to-one association to SubjectProblem
	@OneToMany(mappedBy="problem")
	public List<SubjectProblem> getSubjectProblems() {
		return this.subjectProblems;
	}

	public void setSubjectProblems(List<SubjectProblem> subjectProblems) {
		this.subjectProblems = subjectProblems;
	}

	public SubjectProblem addSubjectProblem(SubjectProblem subjectProblem) {
		getSubjectProblems().add(subjectProblem);
		subjectProblem.setProblem(this);

		return subjectProblem;
	}

	public SubjectProblem removeSubjectProblem(SubjectProblem subjectProblem) {
		getSubjectProblems().remove(subjectProblem);
		subjectProblem.setProblem(null);

		return subjectProblem;
	}

}