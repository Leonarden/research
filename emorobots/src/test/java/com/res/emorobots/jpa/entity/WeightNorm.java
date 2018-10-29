package com.res.emorobots.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;
import java.util.List;


/**
 * The persistent class for the WeightNorm database table.
 * 
 */
@Entity
@Table(name="WeightNorm")
@NamedQuery(name="WeightNorm.findAll", query="SELECT w FROM WeightNorm w")
public class WeightNorm implements Serializable {
	private static final long serialVersionUID = 1L;
	private WeightNormPK id;
	private BigInteger candidateId;
	private float candidatethreshold;
	private float item0Id;
	private float item1Id;
	private float item2Id;
	private float item3Id;
	private float item4Id;
	private float item5Id;
	private Date lastAccess;
	private BigInteger numaccess;
	private List<Action> actions;
	private List<ActionProblem> actionProblems;
	private List<ActionProblem2ActionProblem> actionProblem2actionProblems;
	private List<Command> commands;
	private List<CommandProblem> commandProblems;
	private List<CommandProblem2CommandProblem> commandProblem2commandProblems;
	private List<Definition> definitions;
	private List<Definition2Definition> definition2definitions;
	private List<Observer> observers;
	private List<ObserverProblem> observerProblems;
	private List<ObserverProblem2ObserverProblem> observerProblem2observerProblems;
	private List<ObserverThreshold> observerThresholds;
	private List<ObserverThreshold2ObserverThreshold> observerThreshold2observerThresholds;
	private List<Problem> problems;
	private List<Problem2Problem> problem2problems;
	private List<ProblemDefinition> problemDefinitions;
	private List<ProblemDefinition2ProblemDefinition> problemDefinition2problemDefinitions;
	private List<ProblemSolution> problemSolutions;
	private List<ProblemSolution2ProblemSolution> problemSolution2problemSolutions;
	private List<Sentence> sentences;
	private List<Sentence2Sentence> sentence2sentences;
	private List<Solution> solutions;
	private List<Solution2Solution> solution2solutions;
	private List<Subject> subjects;
	private List<SubjectProblem> subjectProblems;
	private List<SubjectProblem2SubjectProblem> subjectProblem2subjectProblems;
	private List<Symbol> symbols;
	private List<Word> words;
	private List<Synonym> synonyms;

	public WeightNorm() {
	}


	@EmbeddedId
	public WeightNormPK getId() {
		return this.id;
	}

	public void setId(WeightNormPK id) {
		this.id = id;
	}


	@Column(nullable=false)
	public BigInteger getCandidateId() {
		return this.candidateId;
	}

	public void setCandidateId(BigInteger candidateId) {
		this.candidateId = candidateId;
	}


	@Column(nullable=false)
	public float getCandidatethreshold() {
		return this.candidatethreshold;
	}

	public void setCandidatethreshold(float candidatethreshold) {
		this.candidatethreshold = candidatethreshold;
	}


	@Column(nullable=false)
	public float getItem0Id() {
		return this.item0Id;
	}

	public void setItem0Id(float item0Id) {
		this.item0Id = item0Id;
	}


	@Column(nullable=false)
	public float getItem1Id() {
		return this.item1Id;
	}

	public void setItem1Id(float item1Id) {
		this.item1Id = item1Id;
	}


	@Column(nullable=false)
	public float getItem2Id() {
		return this.item2Id;
	}

	public void setItem2Id(float item2Id) {
		this.item2Id = item2Id;
	}


	@Column(nullable=false)
	public float getItem3Id() {
		return this.item3Id;
	}

	public void setItem3Id(float item3Id) {
		this.item3Id = item3Id;
	}


	@Column(nullable=false)
	public float getItem4Id() {
		return this.item4Id;
	}

	public void setItem4Id(float item4Id) {
		this.item4Id = item4Id;
	}


	@Column(nullable=false)
	public float getItem5Id() {
		return this.item5Id;
	}

	public void setItem5Id(float item5Id) {
		this.item5Id = item5Id;
	}


	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable=false)
	public Date getLastAccess() {
		return this.lastAccess;
	}

	public void setLastAccess(Date lastAccess) {
		this.lastAccess = lastAccess;
	}


	@Column(nullable=false)
	public BigInteger getNumaccess() {
		return this.numaccess;
	}

	public void setNumaccess(BigInteger numaccess) {
		this.numaccess = numaccess;
	}


	//bi-directional many-to-one association to Action
	@OneToMany(mappedBy="weightNorm")
	public List<Action> getActions() {
		return this.actions;
	}

	public void setActions(List<Action> actions) {
		this.actions = actions;
	}

	public Action addAction(Action action) {
		getActions().add(action);
		action.setWeightNorm(this);

		return action;
	}

	public Action removeAction(Action action) {
		getActions().remove(action);
		action.setWeightNorm(null);

		return action;
	}


	//bi-directional many-to-one association to ActionProblem
	@OneToMany(mappedBy="weightNorm")
	public List<ActionProblem> getActionProblems() {
		return this.actionProblems;
	}

	public void setActionProblems(List<ActionProblem> actionProblems) {
		this.actionProblems = actionProblems;
	}

	public ActionProblem addActionProblem(ActionProblem actionProblem) {
		getActionProblems().add(actionProblem);
		actionProblem.setWeightNorm(this);

		return actionProblem;
	}

	public ActionProblem removeActionProblem(ActionProblem actionProblem) {
		getActionProblems().remove(actionProblem);
		actionProblem.setWeightNorm(null);

		return actionProblem;
	}


	//bi-directional many-to-one association to ActionProblem2ActionProblem
	@OneToMany(mappedBy="weightNorm")
	public List<ActionProblem2ActionProblem> getActionProblem2actionProblems() {
		return this.actionProblem2actionProblems;
	}

	public void setActionProblem2actionProblems(List<ActionProblem2ActionProblem> actionProblem2actionProblems) {
		this.actionProblem2actionProblems = actionProblem2actionProblems;
	}

	public ActionProblem2ActionProblem addActionProblem2actionProblem(ActionProblem2ActionProblem actionProblem2actionProblem) {
		getActionProblem2actionProblems().add(actionProblem2actionProblem);
		actionProblem2actionProblem.setWeightNorm(this);

		return actionProblem2actionProblem;
	}

	public ActionProblem2ActionProblem removeActionProblem2actionProblem(ActionProblem2ActionProblem actionProblem2actionProblem) {
		getActionProblem2actionProblems().remove(actionProblem2actionProblem);
		actionProblem2actionProblem.setWeightNorm(null);

		return actionProblem2actionProblem;
	}


	//bi-directional many-to-one association to Command
	@OneToMany(mappedBy="weightNorm")
	public List<Command> getCommands() {
		return this.commands;
	}

	public void setCommands(List<Command> commands) {
		this.commands = commands;
	}

	public Command addCommand(Command command) {
		getCommands().add(command);
		command.setWeightNorm(this);

		return command;
	}

	public Command removeCommand(Command command) {
		getCommands().remove(command);
		command.setWeightNorm(null);

		return command;
	}


	//bi-directional many-to-one association to CommandProblem
	@OneToMany(mappedBy="weightNorm")
	public List<CommandProblem> getCommandProblems() {
		return this.commandProblems;
	}

	public void setCommandProblems(List<CommandProblem> commandProblems) {
		this.commandProblems = commandProblems;
	}

	public CommandProblem addCommandProblem(CommandProblem commandProblem) {
		getCommandProblems().add(commandProblem);
		commandProblem.setWeightNorm(this);

		return commandProblem;
	}

	public CommandProblem removeCommandProblem(CommandProblem commandProblem) {
		getCommandProblems().remove(commandProblem);
		commandProblem.setWeightNorm(null);

		return commandProblem;
	}


	//bi-directional many-to-one association to CommandProblem2CommandProblem
	@OneToMany(mappedBy="weightNorm")
	public List<CommandProblem2CommandProblem> getCommandProblem2commandProblems() {
		return this.commandProblem2commandProblems;
	}

	public void setCommandProblem2commandProblems(List<CommandProblem2CommandProblem> commandProblem2commandProblems) {
		this.commandProblem2commandProblems = commandProblem2commandProblems;
	}

	public CommandProblem2CommandProblem addCommandProblem2commandProblem(CommandProblem2CommandProblem commandProblem2commandProblem) {
		getCommandProblem2commandProblems().add(commandProblem2commandProblem);
		commandProblem2commandProblem.setWeightNorm(this);

		return commandProblem2commandProblem;
	}

	public CommandProblem2CommandProblem removeCommandProblem2commandProblem(CommandProblem2CommandProblem commandProblem2commandProblem) {
		getCommandProblem2commandProblems().remove(commandProblem2commandProblem);
		commandProblem2commandProblem.setWeightNorm(null);

		return commandProblem2commandProblem;
	}


	//bi-directional many-to-one association to Definition
	@OneToMany(mappedBy="weightNorm")
	public List<Definition> getDefinitions() {
		return this.definitions;
	}

	public void setDefinitions(List<Definition> definitions) {
		this.definitions = definitions;
	}

	public Definition addDefinition(Definition definition) {
		getDefinitions().add(definition);
		definition.setWeightNorm(this);

		return definition;
	}

	public Definition removeDefinition(Definition definition) {
		getDefinitions().remove(definition);
		definition.setWeightNorm(null);

		return definition;
	}


	//bi-directional many-to-one association to Definition2Definition
	@OneToMany(mappedBy="weightNorm")
	public List<Definition2Definition> getDefinition2definitions() {
		return this.definition2definitions;
	}

	public void setDefinition2definitions(List<Definition2Definition> definition2definitions) {
		this.definition2definitions = definition2definitions;
	}

	public Definition2Definition addDefinition2definition(Definition2Definition definition2definition) {
		getDefinition2definitions().add(definition2definition);
		definition2definition.setWeightNorm(this);

		return definition2definition;
	}

	public Definition2Definition removeDefinition2definition(Definition2Definition definition2definition) {
		getDefinition2definitions().remove(definition2definition);
		definition2definition.setWeightNorm(null);

		return definition2definition;
	}


	//bi-directional many-to-one association to Observer
	@OneToMany(mappedBy="weightNorm")
	public List<Observer> getObservers() {
		return this.observers;
	}

	public void setObservers(List<Observer> observers) {
		this.observers = observers;
	}

	public Observer addObserver(Observer observer) {
		getObservers().add(observer);
		observer.setWeightNorm(this);

		return observer;
	}

	public Observer removeObserver(Observer observer) {
		getObservers().remove(observer);
		observer.setWeightNorm(null);

		return observer;
	}


	//bi-directional many-to-one association to ObserverProblem
	@OneToMany(mappedBy="weightNorm")
	public List<ObserverProblem> getObserverProblems() {
		return this.observerProblems;
	}

	public void setObserverProblems(List<ObserverProblem> observerProblems) {
		this.observerProblems = observerProblems;
	}

	public ObserverProblem addObserverProblem(ObserverProblem observerProblem) {
		getObserverProblems().add(observerProblem);
		observerProblem.setWeightNorm(this);

		return observerProblem;
	}

	public ObserverProblem removeObserverProblem(ObserverProblem observerProblem) {
		getObserverProblems().remove(observerProblem);
		observerProblem.setWeightNorm(null);

		return observerProblem;
	}


	//bi-directional many-to-one association to ObserverProblem2ObserverProblem
	@OneToMany(mappedBy="weightNorm")
	public List<ObserverProblem2ObserverProblem> getObserverProblem2observerProblems() {
		return this.observerProblem2observerProblems;
	}

	public void setObserverProblem2observerProblems(List<ObserverProblem2ObserverProblem> observerProblem2observerProblems) {
		this.observerProblem2observerProblems = observerProblem2observerProblems;
	}

	public ObserverProblem2ObserverProblem addObserverProblem2observerProblem(ObserverProblem2ObserverProblem observerProblem2observerProblem) {
		getObserverProblem2observerProblems().add(observerProblem2observerProblem);
		observerProblem2observerProblem.setWeightNorm(this);

		return observerProblem2observerProblem;
	}

	public ObserverProblem2ObserverProblem removeObserverProblem2observerProblem(ObserverProblem2ObserverProblem observerProblem2observerProblem) {
		getObserverProblem2observerProblems().remove(observerProblem2observerProblem);
		observerProblem2observerProblem.setWeightNorm(null);

		return observerProblem2observerProblem;
	}


	//bi-directional many-to-one association to ObserverThreshold
	@OneToMany(mappedBy="weightNorm")
	public List<ObserverThreshold> getObserverThresholds() {
		return this.observerThresholds;
	}

	public void setObserverThresholds(List<ObserverThreshold> observerThresholds) {
		this.observerThresholds = observerThresholds;
	}

	public ObserverThreshold addObserverThreshold(ObserverThreshold observerThreshold) {
		getObserverThresholds().add(observerThreshold);
		observerThreshold.setWeightNorm(this);

		return observerThreshold;
	}

	public ObserverThreshold removeObserverThreshold(ObserverThreshold observerThreshold) {
		getObserverThresholds().remove(observerThreshold);
		observerThreshold.setWeightNorm(null);

		return observerThreshold;
	}


	//bi-directional many-to-one association to ObserverThreshold2ObserverThreshold
	@OneToMany(mappedBy="weightNorm")
	public List<ObserverThreshold2ObserverThreshold> getObserverThreshold2observerThresholds() {
		return this.observerThreshold2observerThresholds;
	}

	public void setObserverThreshold2observerThresholds(List<ObserverThreshold2ObserverThreshold> observerThreshold2observerThresholds) {
		this.observerThreshold2observerThresholds = observerThreshold2observerThresholds;
	}

	public ObserverThreshold2ObserverThreshold addObserverThreshold2observerThreshold(ObserverThreshold2ObserverThreshold observerThreshold2observerThreshold) {
		getObserverThreshold2observerThresholds().add(observerThreshold2observerThreshold);
		observerThreshold2observerThreshold.setWeightNorm(this);

		return observerThreshold2observerThreshold;
	}

	public ObserverThreshold2ObserverThreshold removeObserverThreshold2observerThreshold(ObserverThreshold2ObserverThreshold observerThreshold2observerThreshold) {
		getObserverThreshold2observerThresholds().remove(observerThreshold2observerThreshold);
		observerThreshold2observerThreshold.setWeightNorm(null);

		return observerThreshold2observerThreshold;
	}


	//bi-directional many-to-one association to Problem
	@OneToMany(mappedBy="weightNorm")
	public List<Problem> getProblems() {
		return this.problems;
	}

	public void setProblems(List<Problem> problems) {
		this.problems = problems;
	}

	public Problem addProblem(Problem problem) {
		getProblems().add(problem);
		problem.setWeightNorm(this);

		return problem;
	}

	public Problem removeProblem(Problem problem) {
		getProblems().remove(problem);
		problem.setWeightNorm(null);

		return problem;
	}


	//bi-directional many-to-one association to Problem2Problem
	@OneToMany(mappedBy="weightNorm")
	public List<Problem2Problem> getProblem2problems() {
		return this.problem2problems;
	}

	public void setProblem2problems(List<Problem2Problem> problem2problems) {
		this.problem2problems = problem2problems;
	}

	public Problem2Problem addProblem2problem(Problem2Problem problem2problem) {
		getProblem2problems().add(problem2problem);
		problem2problem.setWeightNorm(this);

		return problem2problem;
	}

	public Problem2Problem removeProblem2problem(Problem2Problem problem2problem) {
		getProblem2problems().remove(problem2problem);
		problem2problem.setWeightNorm(null);

		return problem2problem;
	}


	//bi-directional many-to-one association to ProblemDefinition
	@OneToMany(mappedBy="weightNorm")
	public List<ProblemDefinition> getProblemDefinitions() {
		return this.problemDefinitions;
	}

	public void setProblemDefinitions(List<ProblemDefinition> problemDefinitions) {
		this.problemDefinitions = problemDefinitions;
	}

	public ProblemDefinition addProblemDefinition(ProblemDefinition problemDefinition) {
		getProblemDefinitions().add(problemDefinition);
		problemDefinition.setWeightNorm(this);

		return problemDefinition;
	}

	public ProblemDefinition removeProblemDefinition(ProblemDefinition problemDefinition) {
		getProblemDefinitions().remove(problemDefinition);
		problemDefinition.setWeightNorm(null);

		return problemDefinition;
	}


	//bi-directional many-to-one association to ProblemDefinition2ProblemDefinition
	@OneToMany(mappedBy="weightNorm")
	public List<ProblemDefinition2ProblemDefinition> getProblemDefinition2problemDefinitions() {
		return this.problemDefinition2problemDefinitions;
	}

	public void setProblemDefinition2problemDefinitions(List<ProblemDefinition2ProblemDefinition> problemDefinition2problemDefinitions) {
		this.problemDefinition2problemDefinitions = problemDefinition2problemDefinitions;
	}

	public ProblemDefinition2ProblemDefinition addProblemDefinition2problemDefinition(ProblemDefinition2ProblemDefinition problemDefinition2problemDefinition) {
		getProblemDefinition2problemDefinitions().add(problemDefinition2problemDefinition);
		problemDefinition2problemDefinition.setWeightNorm(this);

		return problemDefinition2problemDefinition;
	}

	public ProblemDefinition2ProblemDefinition removeProblemDefinition2problemDefinition(ProblemDefinition2ProblemDefinition problemDefinition2problemDefinition) {
		getProblemDefinition2problemDefinitions().remove(problemDefinition2problemDefinition);
		problemDefinition2problemDefinition.setWeightNorm(null);

		return problemDefinition2problemDefinition;
	}


	//bi-directional many-to-one association to ProblemSolution
	@OneToMany(mappedBy="weightNorm")
	public List<ProblemSolution> getProblemSolutions() {
		return this.problemSolutions;
	}

	public void setProblemSolutions(List<ProblemSolution> problemSolutions) {
		this.problemSolutions = problemSolutions;
	}

	public ProblemSolution addProblemSolution(ProblemSolution problemSolution) {
		getProblemSolutions().add(problemSolution);
		problemSolution.setWeightNorm(this);

		return problemSolution;
	}

	public ProblemSolution removeProblemSolution(ProblemSolution problemSolution) {
		getProblemSolutions().remove(problemSolution);
		problemSolution.setWeightNorm(null);

		return problemSolution;
	}


	//bi-directional many-to-one association to ProblemSolution2ProblemSolution
	@OneToMany(mappedBy="weightNorm")
	public List<ProblemSolution2ProblemSolution> getProblemSolution2problemSolutions() {
		return this.problemSolution2problemSolutions;
	}

	public void setProblemSolution2problemSolutions(List<ProblemSolution2ProblemSolution> problemSolution2problemSolutions) {
		this.problemSolution2problemSolutions = problemSolution2problemSolutions;
	}

	public ProblemSolution2ProblemSolution addProblemSolution2problemSolution(ProblemSolution2ProblemSolution problemSolution2problemSolution) {
		getProblemSolution2problemSolutions().add(problemSolution2problemSolution);
		problemSolution2problemSolution.setWeightNorm(this);

		return problemSolution2problemSolution;
	}

	public ProblemSolution2ProblemSolution removeProblemSolution2problemSolution(ProblemSolution2ProblemSolution problemSolution2problemSolution) {
		getProblemSolution2problemSolutions().remove(problemSolution2problemSolution);
		problemSolution2problemSolution.setWeightNorm(null);

		return problemSolution2problemSolution;
	}


	//bi-directional many-to-one association to Sentence
	@OneToMany(mappedBy="weightNorm")
	public List<Sentence> getSentences() {
		return this.sentences;
	}

	public void setSentences(List<Sentence> sentences) {
		this.sentences = sentences;
	}

	public Sentence addSentence(Sentence sentence) {
		getSentences().add(sentence);
		sentence.setWeightNorm(this);

		return sentence;
	}

	public Sentence removeSentence(Sentence sentence) {
		getSentences().remove(sentence);
		sentence.setWeightNorm(null);

		return sentence;
	}


	//bi-directional many-to-one association to Sentence2Sentence
	@OneToMany(mappedBy="weightNorm")
	public List<Sentence2Sentence> getSentence2sentences() {
		return this.sentence2sentences;
	}

	public void setSentence2sentences(List<Sentence2Sentence> sentence2sentences) {
		this.sentence2sentences = sentence2sentences;
	}

	public Sentence2Sentence addSentence2sentence(Sentence2Sentence sentence2sentence) {
		getSentence2sentences().add(sentence2sentence);
		sentence2sentence.setWeightNorm(this);

		return sentence2sentence;
	}

	public Sentence2Sentence removeSentence2sentence(Sentence2Sentence sentence2sentence) {
		getSentence2sentences().remove(sentence2sentence);
		sentence2sentence.setWeightNorm(null);

		return sentence2sentence;
	}


	//bi-directional many-to-one association to Solution
	@OneToMany(mappedBy="weightNorm")
	public List<Solution> getSolutions() {
		return this.solutions;
	}

	public void setSolutions(List<Solution> solutions) {
		this.solutions = solutions;
	}

	public Solution addSolution(Solution solution) {
		getSolutions().add(solution);
		solution.setWeightNorm(this);

		return solution;
	}

	public Solution removeSolution(Solution solution) {
		getSolutions().remove(solution);
		solution.setWeightNorm(null);

		return solution;
	}


	//bi-directional many-to-one association to Solution2Solution
	@OneToMany(mappedBy="weightNorm")
	public List<Solution2Solution> getSolution2solutions() {
		return this.solution2solutions;
	}

	public void setSolution2solutions(List<Solution2Solution> solution2solutions) {
		this.solution2solutions = solution2solutions;
	}

	public Solution2Solution addSolution2solution(Solution2Solution solution2solution) {
		getSolution2solutions().add(solution2solution);
		solution2solution.setWeightNorm(this);

		return solution2solution;
	}

	public Solution2Solution removeSolution2solution(Solution2Solution solution2solution) {
		getSolution2solutions().remove(solution2solution);
		solution2solution.setWeightNorm(null);

		return solution2solution;
	}


	//bi-directional many-to-one association to Subject
	@OneToMany(mappedBy="weightNorm")
	public List<Subject> getSubjects() {
		return this.subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}

	public Subject addSubject(Subject subject) {
		getSubjects().add(subject);
		subject.setWeightNorm(this);

		return subject;
	}

	public Subject removeSubject(Subject subject) {
		getSubjects().remove(subject);
		subject.setWeightNorm(null);

		return subject;
	}


	//bi-directional many-to-one association to SubjectProblem
	@OneToMany(mappedBy="weightNorm")
	public List<SubjectProblem> getSubjectProblems() {
		return this.subjectProblems;
	}

	public void setSubjectProblems(List<SubjectProblem> subjectProblems) {
		this.subjectProblems = subjectProblems;
	}

	public SubjectProblem addSubjectProblem(SubjectProblem subjectProblem) {
		getSubjectProblems().add(subjectProblem);
		subjectProblem.setWeightNorm(this);

		return subjectProblem;
	}

	public SubjectProblem removeSubjectProblem(SubjectProblem subjectProblem) {
		getSubjectProblems().remove(subjectProblem);
		subjectProblem.setWeightNorm(null);

		return subjectProblem;
	}


	//bi-directional many-to-one association to SubjectProblem2SubjectProblem
	@OneToMany(mappedBy="weightNorm")
	public List<SubjectProblem2SubjectProblem> getSubjectProblem2subjectProblems() {
		return this.subjectProblem2subjectProblems;
	}

	public void setSubjectProblem2subjectProblems(List<SubjectProblem2SubjectProblem> subjectProblem2subjectProblems) {
		this.subjectProblem2subjectProblems = subjectProblem2subjectProblems;
	}

	public SubjectProblem2SubjectProblem addSubjectProblem2subjectProblem(SubjectProblem2SubjectProblem subjectProblem2subjectProblem) {
		getSubjectProblem2subjectProblems().add(subjectProblem2subjectProblem);
		subjectProblem2subjectProblem.setWeightNorm(this);

		return subjectProblem2subjectProblem;
	}

	public SubjectProblem2SubjectProblem removeSubjectProblem2subjectProblem(SubjectProblem2SubjectProblem subjectProblem2subjectProblem) {
		getSubjectProblem2subjectProblems().remove(subjectProblem2subjectProblem);
		subjectProblem2subjectProblem.setWeightNorm(null);

		return subjectProblem2subjectProblem;
	}


	//bi-directional many-to-one association to Symbol
	@OneToMany(mappedBy="weightNorm")
	public List<Symbol> getSymbols() {
		return this.symbols;
	}

	public void setSymbols(List<Symbol> symbols) {
		this.symbols = symbols;
	}

	public Symbol addSymbol(Symbol symbol) {
		getSymbols().add(symbol);
		symbol.setWeightNorm(this);

		return symbol;
	}

	public Symbol removeSymbol(Symbol symbol) {
		getSymbols().remove(symbol);
		symbol.setWeightNorm(null);

		return symbol;
	}


	//bi-directional many-to-one association to Word
	@OneToMany(mappedBy="weightNorm")
	public List<Word> getWords() {
		return this.words;
	}

	public void setWords(List<Word> words) {
		this.words = words;
	}

	public Word addWord(Word word) {
		getWords().add(word);
		word.setWeightNorm(this);

		return word;
	}

	public Word removeWord(Word word) {
		getWords().remove(word);
		word.setWeightNorm(null);

		return word;
	}


	//bi-directional many-to-one association to Synonym
	@OneToMany(mappedBy="weightNorm")
	public List<Synonym> getSynonyms() {
		return this.synonyms;
	}

	public void setSynonyms(List<Synonym> synonyms) {
		this.synonyms = synonyms;
	}

	public Synonym addSynonym(Synonym synonym) {
		getSynonyms().add(synonym);
		synonym.setWeightNorm(this);

		return synonym;
	}

	public Synonym removeSynonym(Synonym synonym) {
		getSynonyms().remove(synonym);
		synonym.setWeightNorm(null);

		return synonym;
	}

}