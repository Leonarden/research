package com.res.emorobot.jpa.entity;

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

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String problemId;

	@Temporal(TemporalType.TIMESTAMP)
	private Date lastaccess;

	private BigInteger numaccess;

	private String text;

	//bi-directional many-to-one association to ActionProblem
	@OneToMany(mappedBy="problem")
	private List<ActionProblem> actionProblems;

	//bi-directional many-to-one association to CommandProblem
	@OneToMany(mappedBy="problem")
	private List<CommandProblem> commandProblems;

	//bi-directional many-to-one association to Definition
	@OneToMany(mappedBy="problem")
	private List<Definition> definitions;

	//bi-directional many-to-one association to Definition2Definition
	@OneToMany(mappedBy="problem")
	private List<Definition2Definition> definition2definitions;

	//bi-directional many-to-one association to ObserverProblem
	@OneToMany(mappedBy="problem")
	private List<ObserverProblem> observerProblems;

	//bi-directional many-to-one association to WeightNorm
	@ManyToOne
	@JoinColumn(name="weightNormId")
	private WeightNorm weightNorm;

	//bi-directional many-to-one association to Problem2Problem
	@OneToMany(mappedBy="problem")
	private List<Problem2Problem> problem2problems;

	//bi-directional many-to-one association to Solution
	@OneToMany(mappedBy="problem")
	private List<Solution> solutions;

	//bi-directional many-to-one association to Solution2Solution
	@OneToMany(mappedBy="problem")
	private List<Solution2Solution> solution2solutions;

	//bi-directional many-to-one association to SubjectProblem
	@OneToMany(mappedBy="problem")
	private List<SubjectProblem> subjectProblems;

	public Problem() {
	}

	public String getProblemId() {
		return this.problemId;
	}

	public void setProblemId(String problemId) {
		this.problemId = problemId;
	}

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

	public List<Definition2Definition> getDefinition2definitions() {
		return this.definition2definitions;
	}

	public void setDefinition2definitions(List<Definition2Definition> definition2definitions) {
		this.definition2definitions = definition2definitions;
	}

	public Definition2Definition addDefinition2definition(Definition2Definition definition2definition) {
		getDefinition2definitions().add(definition2definition);
		definition2definition.setProblem(this);

		return definition2definition;
	}

	public Definition2Definition removeDefinition2definition(Definition2Definition definition2definition) {
		getDefinition2definitions().remove(definition2definition);
		definition2definition.setProblem(null);

		return definition2definition;
	}

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

	public WeightNorm getWeightNorm() {
		return this.weightNorm;
	}

	public void setWeightNorm(WeightNorm weightNorm) {
		this.weightNorm = weightNorm;
	}

	public List<Problem2Problem> getProblem2problems() {
		return this.problem2problems;
	}

	public void setProblem2problems(List<Problem2Problem> problem2problems) {
		this.problem2problems = problem2problems;
	}

	public Problem2Problem addProblem2problem(Problem2Problem problem2problem) {
		getProblem2problems().add(problem2problem);
		problem2problem.setProblem(this);

		return problem2problem;
	}

	public Problem2Problem removeProblem2problem(Problem2Problem problem2problem) {
		getProblem2problems().remove(problem2problem);
		problem2problem.setProblem(null);

		return problem2problem;
	}

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

	public List<Solution2Solution> getSolution2solutions() {
		return this.solution2solutions;
	}

	public void setSolution2solutions(List<Solution2Solution> solution2solutions) {
		this.solution2solutions = solution2solutions;
	}

	public Solution2Solution addSolution2solution(Solution2Solution solution2solution) {
		getSolution2solutions().add(solution2solution);
		solution2solution.setProblem(this);

		return solution2solution;
	}

	public Solution2Solution removeSolution2solution(Solution2Solution solution2solution) {
		getSolution2solutions().remove(solution2solution);
		solution2solution.setProblem(null);

		return solution2solution;
	}

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