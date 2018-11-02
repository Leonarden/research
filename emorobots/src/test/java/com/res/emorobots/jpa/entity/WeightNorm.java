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
	private List<ActionOrder> actionOrders;
	private List<ActionOrder2ActionOrder> actionOrder2actionOrders;
	private List<Command> commands;
	private List<CommandOrder> commandOrders;
	private List<CommandOrder2CommandOrder> commandOrder2commandOrders;
	private List<Context> contexts;
	private List<ContextOrder> contextOrders;
	private List<Definition> definitions;
	private List<Definition2Definition> definition2definitions;
	private List<DefinitionInterpretation> definitionInterpretations;
	private List<Observer> observers;
	private List<ObserverOrder> observerOrders;
	private List<ObserverOrder2ObserverOrder> observerOrder2observerOrders;
	private List<ObserverThreshold> observerThresholds;
	private List<ObserverThreshold2ObserverThreshold> observerThreshold2observerThresholds;
	private List<Order> orders;
	private List<OrderProblem> orderProblems;
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
	private List<SolutionInterpretation> solutionInterpretations;
	private List<Subject> subjects;
	private List<SubjectOrder> subjectOrders;
	private List<SubjectOrder2SubjectOrder> subjectOrder2subjectOrders;
	private List<Symbol> symbols;
	private List<SymbolSentence> symbolSentences;
	private List<Synonym> synonyms;
	private List<Word> words;
	private List<WordSentence> wordSentences;

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


	//bi-directional many-to-one association to ActionOrder
	@OneToMany(mappedBy="weightNorm")
	public List<ActionOrder> getActionOrders() {
		return this.actionOrders;
	}

	public void setActionOrders(List<ActionOrder> actionOrders) {
		this.actionOrders = actionOrders;
	}

	public ActionOrder addActionOrder(ActionOrder actionOrder) {
		getActionOrders().add(actionOrder);
		actionOrder.setWeightNorm(this);

		return actionOrder;
	}

	public ActionOrder removeActionOrder(ActionOrder actionOrder) {
		getActionOrders().remove(actionOrder);
		actionOrder.setWeightNorm(null);

		return actionOrder;
	}


	//bi-directional many-to-one association to ActionOrder2ActionOrder
	@OneToMany(mappedBy="weightNorm")
	public List<ActionOrder2ActionOrder> getActionOrder2actionOrders() {
		return this.actionOrder2actionOrders;
	}

	public void setActionOrder2actionOrders(List<ActionOrder2ActionOrder> actionOrder2actionOrders) {
		this.actionOrder2actionOrders = actionOrder2actionOrders;
	}

	public ActionOrder2ActionOrder addActionOrder2actionOrder(ActionOrder2ActionOrder actionOrder2actionOrder) {
		getActionOrder2actionOrders().add(actionOrder2actionOrder);
		actionOrder2actionOrder.setWeightNorm(this);

		return actionOrder2actionOrder;
	}

	public ActionOrder2ActionOrder removeActionOrder2actionOrder(ActionOrder2ActionOrder actionOrder2actionOrder) {
		getActionOrder2actionOrders().remove(actionOrder2actionOrder);
		actionOrder2actionOrder.setWeightNorm(null);

		return actionOrder2actionOrder;
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


	//bi-directional many-to-one association to CommandOrder
	@OneToMany(mappedBy="weightNorm")
	public List<CommandOrder> getCommandOrders() {
		return this.commandOrders;
	}

	public void setCommandOrders(List<CommandOrder> commandOrders) {
		this.commandOrders = commandOrders;
	}

	public CommandOrder addCommandOrder(CommandOrder commandOrder) {
		getCommandOrders().add(commandOrder);
		commandOrder.setWeightNorm(this);

		return commandOrder;
	}

	public CommandOrder removeCommandOrder(CommandOrder commandOrder) {
		getCommandOrders().remove(commandOrder);
		commandOrder.setWeightNorm(null);

		return commandOrder;
	}


	//bi-directional many-to-one association to CommandOrder2CommandOrder
	@OneToMany(mappedBy="weightNorm")
	public List<CommandOrder2CommandOrder> getCommandOrder2commandOrders() {
		return this.commandOrder2commandOrders;
	}

	public void setCommandOrder2commandOrders(List<CommandOrder2CommandOrder> commandOrder2commandOrders) {
		this.commandOrder2commandOrders = commandOrder2commandOrders;
	}

	public CommandOrder2CommandOrder addCommandOrder2commandOrder(CommandOrder2CommandOrder commandOrder2commandOrder) {
		getCommandOrder2commandOrders().add(commandOrder2commandOrder);
		commandOrder2commandOrder.setWeightNorm(this);

		return commandOrder2commandOrder;
	}

	public CommandOrder2CommandOrder removeCommandOrder2commandOrder(CommandOrder2CommandOrder commandOrder2commandOrder) {
		getCommandOrder2commandOrders().remove(commandOrder2commandOrder);
		commandOrder2commandOrder.setWeightNorm(null);

		return commandOrder2commandOrder;
	}


	//bi-directional many-to-one association to Context
	@OneToMany(mappedBy="weightNorm")
	public List<Context> getContexts() {
		return this.contexts;
	}

	public void setContexts(List<Context> contexts) {
		this.contexts = contexts;
	}

	public Context addContext(Context context) {
		getContexts().add(context);
		context.setWeightNorm(this);

		return context;
	}

	public Context removeContext(Context context) {
		getContexts().remove(context);
		context.setWeightNorm(null);

		return context;
	}


	//bi-directional many-to-one association to ContextOrder
	@OneToMany(mappedBy="weightNorm")
	public List<ContextOrder> getContextOrders() {
		return this.contextOrders;
	}

	public void setContextOrders(List<ContextOrder> contextOrders) {
		this.contextOrders = contextOrders;
	}

	public ContextOrder addContextOrder(ContextOrder contextOrder) {
		getContextOrders().add(contextOrder);
		contextOrder.setWeightNorm(this);

		return contextOrder;
	}

	public ContextOrder removeContextOrder(ContextOrder contextOrder) {
		getContextOrders().remove(contextOrder);
		contextOrder.setWeightNorm(null);

		return contextOrder;
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


	//bi-directional many-to-one association to DefinitionInterpretation
	@OneToMany(mappedBy="weightNorm")
	public List<DefinitionInterpretation> getDefinitionInterpretations() {
		return this.definitionInterpretations;
	}

	public void setDefinitionInterpretations(List<DefinitionInterpretation> definitionInterpretations) {
		this.definitionInterpretations = definitionInterpretations;
	}

	public DefinitionInterpretation addDefinitionInterpretation(DefinitionInterpretation definitionInterpretation) {
		getDefinitionInterpretations().add(definitionInterpretation);
		definitionInterpretation.setWeightNorm(this);

		return definitionInterpretation;
	}

	public DefinitionInterpretation removeDefinitionInterpretation(DefinitionInterpretation definitionInterpretation) {
		getDefinitionInterpretations().remove(definitionInterpretation);
		definitionInterpretation.setWeightNorm(null);

		return definitionInterpretation;
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


	//bi-directional many-to-one association to ObserverOrder
	@OneToMany(mappedBy="weightNorm")
	public List<ObserverOrder> getObserverOrders() {
		return this.observerOrders;
	}

	public void setObserverOrders(List<ObserverOrder> observerOrders) {
		this.observerOrders = observerOrders;
	}

	public ObserverOrder addObserverOrder(ObserverOrder observerOrder) {
		getObserverOrders().add(observerOrder);
		observerOrder.setWeightNorm(this);

		return observerOrder;
	}

	public ObserverOrder removeObserverOrder(ObserverOrder observerOrder) {
		getObserverOrders().remove(observerOrder);
		observerOrder.setWeightNorm(null);

		return observerOrder;
	}


	//bi-directional many-to-one association to ObserverOrder2ObserverOrder
	@OneToMany(mappedBy="weightNorm")
	public List<ObserverOrder2ObserverOrder> getObserverOrder2observerOrders() {
		return this.observerOrder2observerOrders;
	}

	public void setObserverOrder2observerOrders(List<ObserverOrder2ObserverOrder> observerOrder2observerOrders) {
		this.observerOrder2observerOrders = observerOrder2observerOrders;
	}

	public ObserverOrder2ObserverOrder addObserverOrder2observerOrder(ObserverOrder2ObserverOrder observerOrder2observerOrder) {
		getObserverOrder2observerOrders().add(observerOrder2observerOrder);
		observerOrder2observerOrder.setWeightNorm(this);

		return observerOrder2observerOrder;
	}

	public ObserverOrder2ObserverOrder removeObserverOrder2observerOrder(ObserverOrder2ObserverOrder observerOrder2observerOrder) {
		getObserverOrder2observerOrders().remove(observerOrder2observerOrder);
		observerOrder2observerOrder.setWeightNorm(null);

		return observerOrder2observerOrder;
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


	//bi-directional many-to-one association to Order
	@OneToMany(mappedBy="weightNorm")
	public List<Order> getOrders() {
		return this.orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public Order addOrder(Order order) {
		getOrders().add(order);
		order.setWeightNorm(this);

		return order;
	}

	public Order removeOrder(Order order) {
		getOrders().remove(order);
		order.setWeightNorm(null);

		return order;
	}


	//bi-directional many-to-one association to OrderProblem
	@OneToMany(mappedBy="weightNorm")
	public List<OrderProblem> getOrderProblems() {
		return this.orderProblems;
	}

	public void setOrderProblems(List<OrderProblem> orderProblems) {
		this.orderProblems = orderProblems;
	}

	public OrderProblem addOrderProblem(OrderProblem orderProblem) {
		getOrderProblems().add(orderProblem);
		orderProblem.setWeightNorm(this);

		return orderProblem;
	}

	public OrderProblem removeOrderProblem(OrderProblem orderProblem) {
		getOrderProblems().remove(orderProblem);
		orderProblem.setWeightNorm(null);

		return orderProblem;
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


	//bi-directional many-to-one association to SolutionInterpretation
	@OneToMany(mappedBy="weightNorm")
	public List<SolutionInterpretation> getSolutionInterpretations() {
		return this.solutionInterpretations;
	}

	public void setSolutionInterpretations(List<SolutionInterpretation> solutionInterpretations) {
		this.solutionInterpretations = solutionInterpretations;
	}

	public SolutionInterpretation addSolutionInterpretation(SolutionInterpretation solutionInterpretation) {
		getSolutionInterpretations().add(solutionInterpretation);
		solutionInterpretation.setWeightNorm(this);

		return solutionInterpretation;
	}

	public SolutionInterpretation removeSolutionInterpretation(SolutionInterpretation solutionInterpretation) {
		getSolutionInterpretations().remove(solutionInterpretation);
		solutionInterpretation.setWeightNorm(null);

		return solutionInterpretation;
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


	//bi-directional many-to-one association to SubjectOrder
	@OneToMany(mappedBy="weightNorm")
	public List<SubjectOrder> getSubjectOrders() {
		return this.subjectOrders;
	}

	public void setSubjectOrders(List<SubjectOrder> subjectOrders) {
		this.subjectOrders = subjectOrders;
	}

	public SubjectOrder addSubjectOrder(SubjectOrder subjectOrder) {
		getSubjectOrders().add(subjectOrder);
		subjectOrder.setWeightNorm(this);

		return subjectOrder;
	}

	public SubjectOrder removeSubjectOrder(SubjectOrder subjectOrder) {
		getSubjectOrders().remove(subjectOrder);
		subjectOrder.setWeightNorm(null);

		return subjectOrder;
	}


	//bi-directional many-to-one association to SubjectOrder2SubjectOrder
	@OneToMany(mappedBy="weightNorm")
	public List<SubjectOrder2SubjectOrder> getSubjectOrder2subjectOrders() {
		return this.subjectOrder2subjectOrders;
	}

	public void setSubjectOrder2subjectOrders(List<SubjectOrder2SubjectOrder> subjectOrder2subjectOrders) {
		this.subjectOrder2subjectOrders = subjectOrder2subjectOrders;
	}

	public SubjectOrder2SubjectOrder addSubjectOrder2subjectOrder(SubjectOrder2SubjectOrder subjectOrder2subjectOrder) {
		getSubjectOrder2subjectOrders().add(subjectOrder2subjectOrder);
		subjectOrder2subjectOrder.setWeightNorm(this);

		return subjectOrder2subjectOrder;
	}

	public SubjectOrder2SubjectOrder removeSubjectOrder2subjectOrder(SubjectOrder2SubjectOrder subjectOrder2subjectOrder) {
		getSubjectOrder2subjectOrders().remove(subjectOrder2subjectOrder);
		subjectOrder2subjectOrder.setWeightNorm(null);

		return subjectOrder2subjectOrder;
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


	//bi-directional many-to-one association to SymbolSentence
	@OneToMany(mappedBy="weightNorm")
	public List<SymbolSentence> getSymbolSentences() {
		return this.symbolSentences;
	}

	public void setSymbolSentences(List<SymbolSentence> symbolSentences) {
		this.symbolSentences = symbolSentences;
	}

	public SymbolSentence addSymbolSentence(SymbolSentence symbolSentence) {
		getSymbolSentences().add(symbolSentence);
		symbolSentence.setWeightNorm(this);

		return symbolSentence;
	}

	public SymbolSentence removeSymbolSentence(SymbolSentence symbolSentence) {
		getSymbolSentences().remove(symbolSentence);
		symbolSentence.setWeightNorm(null);

		return symbolSentence;
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


	//bi-directional many-to-one association to WordSentence
	@OneToMany(mappedBy="weightNorm")
	public List<WordSentence> getWordSentences() {
		return this.wordSentences;
	}

	public void setWordSentences(List<WordSentence> wordSentences) {
		this.wordSentences = wordSentences;
	}

	public WordSentence addWordSentence(WordSentence wordSentence) {
		getWordSentences().add(wordSentence);
		wordSentence.setWeightNorm(this);

		return wordSentence;
	}

	public WordSentence removeWordSentence(WordSentence wordSentence) {
		getWordSentences().remove(wordSentence);
		wordSentence.setWeightNorm(null);

		return wordSentence;
	}

}