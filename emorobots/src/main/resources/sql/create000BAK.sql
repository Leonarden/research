drop database if exists emorobots;
create database emorobots;
use emorobots;

##Weight structure is for the purpose of the application: a better design would let implement your own computation tables
## Here we work with probabilites FLOAT of having that emotion but it could be Money costs, probs, compositions of a product...

##123456789-TOKEN-12
drop table if exists  WeightNorm;
##123456789-TOKEN-13

create table WeightNorm(
  /*weightNormId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,*/
  entityNormId BIGINT UNSIGNED NOT NULL,
  entityName Varchar(80) NOT NULL,
  
  item0Id FLOAT NOT NULL DEFAULT 0, /*fear*/
  item1Id FLOAT NOT NULL DEFAULT 0, /*happy */
  item2Id FLOAT NOT NULL DEFAULT 0, /* anger */
  item3Id FLOAT NOT NULL DEFAULT 0,   /* sad */
  item4Id FLOAT NOT NULL DEFAULT 0,  /* peace */
  item5Id  FLOAT NOT NULL DEFAULT 0,  /* love */
  
  /* itemiId  FLOAT NOT NULL DEFAULT 0, */ /* ???? */
  
  numaccess BIGINT UNSIGNED NOT NULL default 0,
  lastAccess DATETIME NOT NULL,
 
 candidateId BIGINT NOT NULL DEFAULT 0,
 candidatethreshold FLOAT NOT NULL DEFAULT 0,
  PRIMARY KEY(entityNormId,entityName)

 );

 
##123456789-TOKEN-12
drop table if exists  NormProbChainItem0;
##123456789-TOKEN-13

create table NormProbChainItem0(
  probchainItemId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  itemvalue  FLOAT NOT NULL DEFAULT 0,
  anomaly INT NOT NULL DEFAULT 0,
 indexinchain INT, 
 nextId BIGINT UNSIGNED, 
 CONSTRAINT next_0_next FOREIGN KEY(nextId) REFERENCES NormProbChainItem0(probchainItemId) ON DELETE CASCADE
  
 );

 
##123456789-TOKEN-12
drop table if exists  NormProbChainItem1;
##123456789-TOKEN-13

create table NormProbChainItem1(
  probchainItemId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  itemvalue  FLOAT NOT NULL DEFAULT 0,
  anomaly INT NOT NULL DEFAULT 0,
 indexinchain INT, 
 nextId BIGINT UNSIGNED,
 CONSTRAINT next_1_next FOREIGN KEY(nextId) REFERENCES NormProbChainItem1(probchainItemId) ON DELETE CASCADE
  
 );

 
##123456789-TOKEN-12
drop table if exists  NormProbChainItem2;
##123456789-TOKEN-13

create table NormProbChainItem2(
  probchainItemId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  itemvalue  FLOAT NOT NULL DEFAULT 0,
  anomaly INT NOT NULL DEFAULT 0,
 indexinchain INT, 
 nextId BIGINT UNSIGNED, 
 CONSTRAINT next_2_next FOREIGN KEY(nextId) REFERENCES NormProbChainItem2(probchainItemId) ON DELETE CASCADE
  
 );

 
##123456789-TOKEN-12
drop table if exists  NormProbChainItem3;
##123456789-TOKEN-13

create table NormProbChainItem3(
  probchainItemId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  itemvalue  FLOAT NOT NULL DEFAULT 0,
  anomaly INT NOT NULL DEFAULT 0,
 indexinchain INT, 
 nextId BIGINT UNSIGNED, 
 CONSTRAINT next_3_next FOREIGN KEY(nextId) REFERENCES NormProbChainItem3(probchainItemId) ON DELETE CASCADE
  
 );

 
##123456789-TOKEN-12
drop table if exists  NormProbChainItem4;
##123456789-TOKEN-13

create table NormProbChainItem4(
  probchainItemId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  itemvalue  FLOAT NOT NULL DEFAULT 0,
  anomaly INT NOT NULL DEFAULT 0,
 indexinchain INT, nextId BIGINT UNSIGNED, CONSTRAINT next_4_next FOREIGN KEY(nextId) REFERENCES NormProbChainItem4(probchainItemId) ON DELETE CASCADE
  
 );

 
##123456789-TOKEN-12
drop table if exists  NormProbChainItem5;
##123456789-TOKEN-13

create table NormProbChainItem5(
  probchainItemId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  itemvalue  FLOAT NOT NULL DEFAULT 0,
  anomaly INT NOT NULL DEFAULT 0,
 indexinchain INT, nextId BIGINT UNSIGNED, CONSTRAINT next_5_next FOREIGN KEY(nextId) REFERENCES NormProbChainItem5(probchainItemId) ON DELETE CASCADE
  
 );

 
##123456789-TOKEN-12
drop table if exists  Weight;
##123456789-TOKEN-13

create table Weight(
  weightId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  entityId BIGINT UNSIGNED NOT NULL,
  entityName Varchar(80) NOT NULL,
  
  item0Id FLOAT NOT NULL DEFAULT 0, /*fear*/
  item1Id FLOAT NOT NULL DEFAULT 0, /*happy */
  item2Id FLOAT NOT NULL DEFAULT 0, /* anger */
  item3Id FLOAT NOT NULL DEFAULT 0,   /* sad */
  item4Id FLOAT NOT NULL DEFAULT 0,  /* peace */
  item5Id  FLOAT NOT NULL DEFAULT 0,  /* love */
  /* itemiId  FLOAT NOT NULL DEFAULT 0, */
  numaccess BIGINT UNSIGNED NOT NULL default 0,
  lastAccess DATETIME NOT NULL,
 
 candidateId BIGINT NOT NULL DEFAULT 0,
 candidatethreshold FLOAT NOT NULL DEFAULT 0

 );

 
##123456789-TOKEN-12
drop table if exists  ProbChainItem0;
##123456789-TOKEN-13

create table ProbChainItem0(
  probchainItemId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  itemvalue  FLOAT NOT NULL DEFAULT 0,
  anomaly INT NOT NULL DEFAULT 0,
 indexinchain INT, nextId BIGINT UNSIGNED, CONSTRAINT next_W0_next FOREIGN KEY(nextId) REFERENCES ProbChainItem0(probchainItemId) ON DELETE CASCADE
  
 );

 
##123456789-TOKEN-12
drop table if exists  ProbChainItem1;
##123456789-TOKEN-13

create table ProbChainItem1(
  probchainItemId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  itemvalue  FLOAT NOT NULL DEFAULT 0,
  anomaly INT NOT NULL DEFAULT 0,
 indexinchain INT, nextId BIGINT UNSIGNED, CONSTRAINT next_w1_next FOREIGN KEY(nextId) REFERENCES ProbChainItem0(probchainItemId) ON DELETE CASCADE
  
 );

 
##123456789-TOKEN-12
drop table if exists  ProbChainItem2;
##123456789-TOKEN-13

create table ProbChainItem2(
  probchainItemId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  itemvalue  FLOAT NOT NULL DEFAULT 0,
  anomaly INT NOT NULL DEFAULT 0,
 indexinchain INT, nextId BIGINT UNSIGNED, CONSTRAINT next_w2_next FOREIGN KEY(nextId) REFERENCES ProbChainItem2(probchainItemId) ON DELETE CASCADE
  
 );

 
##123456789-TOKEN-12
drop table if exists  ProbChainItem3;
##123456789-TOKEN-13

create table ProbChainItem3(
  probchainItemId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  itemvalue  FLOAT NOT NULL DEFAULT 0,
  anomaly INT NOT NULL DEFAULT 0,
 indexinchain INT, nextId BIGINT UNSIGNED, CONSTRAINT next_w3_next FOREIGN KEY(nextId) REFERENCES ProbChainItem3(probchainItemId) ON DELETE CASCADE
  
 );

 
##123456789-TOKEN-12
drop table if exists  ProbChainItem4;
##123456789-TOKEN-13

create table ProbChainItem4(
  probchainItemId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  itemvalue  FLOAT NOT NULL DEFAULT 0,
  anomaly INT NOT NULL DEFAULT 0,
 indexinchain INT, nextId BIGINT UNSIGNED, CONSTRAINT next_w4_next FOREIGN KEY(nextId) REFERENCES ProbChainItem4(probchainItemId) ON DELETE CASCADE
  
 );

 
##123456789-TOKEN-12
drop table if exists  ProbChainItem5;
##123456789-TOKEN-13

create table ProbChainItem5(
  probchainItemId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  itemvalue  FLOAT NOT NULL DEFAULT 0,
  anomaly INT NOT NULL DEFAULT 0,
 indexinchain INT, nextId BIGINT UNSIGNED, CONSTRAINT next_w5_next FOREIGN KEY(nextId) REFERENCES ProbChainItem5(probchainItemId) ON DELETE CASCADE
  
 );

 

 
 
 
##123456789-TOKEN-12
drop table if exists  Threshold;
##123456789-TOKEN-13

create table Threshold(
  thresholdId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  entityNormId BIGINT UNSIGNED NOT NULL,
  entityName Varchar(80) NOT NULL,
  
  item0Id FLOAT NOT NULL DEFAULT 0, /*fear*/
  item1Id FLOAT NOT NULL DEFAULT 0, /*happy */
  item2Id FLOAT NOT NULL DEFAULT 0, /* anger */
  item3Id FLOAT NOT NULL DEFAULT 0,   /* sad */
  item4Id FLOAT NOT NULL DEFAULT 0,  /* peace */
  item5Id  FLOAT NOT NULL DEFAULT 0,  /* love */
  /* itemiId  FLOAT NOT NULL DEFAULT 0, */
  numaccess BIGINT UNSIGNED NOT NULL default 0,
  lastAccess DATETIME NOT NULL,
 
 candidateId BIGINT NOT NULL DEFAULT 0,
 candidatethreshold FLOAT NOT NULL DEFAULT 0

 );

 
##123456789-TOKEN-12
drop table if exists  ThresProbChainItem0;
##123456789-TOKEN-13

create table ThresProbChainItem0(
  probchainItemId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  itemvalue  FLOAT NOT NULL DEFAULT 0,
  anomaly INT NOT NULL DEFAULT 0,
 indexinchain INT, nextId BIGINT UNSIGNED, CONSTRAINT next_t0_next FOREIGN KEY(nextId) REFERENCES ThresProbChainItem0(probchainItemId) ON DELETE CASCADE
  
 );

 
##123456789-TOKEN-12
drop table if exists  ThresProbChainItem1;
##123456789-TOKEN-13

create table ThresProbChainItem1(
  probchainItemId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  itemvalue  FLOAT NOT NULL DEFAULT 0,
  anomaly INT NOT NULL DEFAULT 0,
 indexinchain INT, nextId BIGINT UNSIGNED, CONSTRAINT next_t1_next FOREIGN KEY(nextId) REFERENCES ThresProbChainItem1(probchainItemId) ON DELETE CASCADE
  
 );

 
##123456789-TOKEN-12
drop table if exists  ThresProbChainItem2;
##123456789-TOKEN-13

create table ThresProbChainItem2(
  probchainItemId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  itemvalue  FLOAT NOT NULL DEFAULT 0,
  anomaly INT NOT NULL DEFAULT 0,
 indexinchain INT, nextId BIGINT UNSIGNED, CONSTRAINT next_t2_next FOREIGN KEY(nextId) REFERENCES ThresProbChainItem2(probchainItemId) ON DELETE CASCADE
  
 );

 
##123456789-TOKEN-12
drop table if exists  ThresProbChainItem3;
##123456789-TOKEN-13

create table ThresProbChainItem3(
  probchainItemId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  itemvalue  FLOAT NOT NULL DEFAULT 0,
  anomaly INT NOT NULL DEFAULT 0,
 indexinchain INT, nextId BIGINT UNSIGNED, CONSTRAINT next_t3_next FOREIGN KEY(nextId) REFERENCES ThresProbChainItem3(probchainItemId) ON DELETE CASCADE
  
 );

 
##123456789-TOKEN-12
drop table if exists  ThresProbChainItem4;
##123456789-TOKEN-13

create table ThresProbChainItem4(
  probchainItemId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  itemvalue  FLOAT NOT NULL DEFAULT 0,
  anomaly INT NOT NULL DEFAULT 0,
 indexinchain INT, nextId BIGINT UNSIGNED, CONSTRAINT next_t4_next FOREIGN KEY(nextId) REFERENCES ThresProbChainItem4(probchainItemId) ON DELETE CASCADE
  
 );

##123456789-TOKEN-12
drop table if exists  ThresProbChainItem5;
##123456789-TOKEN-13

create table ThresProbChainItem5(
  probchainItemId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  itemvalue  FLOAT NOT NULL DEFAULT 0,
  anomaly INT NOT NULL DEFAULT 0,
 indexinchain INT, nextId BIGINT UNSIGNED,
 CONSTRAINT next_t5_next FOREIGN KEY(nextId) REFERENCES ThresProbChainItem5(probchainItemId) ON DELETE CASCADE
  
 );
 

 ###123456789-TOKEN-0
drop table if exists  Synonym;
###123456789-TOKEN-1
create table Synonym(
  synonymId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
   text  Varchar(35),
   lang Varchar(10),
   encoding Varchar(10),
   entityName Varchar(80) NOT NULL DEFAULT 'Synonym',
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
   frequency FLOAT NOT NULL DEFAULT 0, /* we want an estimation of % of use of this word*/
    nextsynId BIGINT UNSIGNED,
 indexinchain INT,
 candidateId BIGINT NOT NULL default 0,
 candidateNormId BIGINT NOT NULL default 0,
CONSTRAINT WeightNorm_Synonym1_WeightNorm FOREIGN KEY (synonymId,entityName)
    REFERENCES WeightNorm(entityNormId,entityName) ON DELETE CASCADE,
    
    CONSTRAINT syn1_Syn1_syn1 FOREIGN KEY (nextsynId)
    REFERENCES Synonym(synonymId) 

    

);

  
 ###123456789-TOKEN-0
drop table if exists  Word;
###123456789-TOKEN-1
create table Word(
  wordId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
   synonymId BIGINT UNSIGNED,
   text  Varchar(20),
   entityName Varchar(80) NOT NULL DEFAULT 'WORD',
   lang Varchar(10),
   encoding Varchar(10),
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
 candidateId BIGINT NOT NULL default 0,
 candidateNormId BIGINT NOT NULL default 0,
CONSTRAINT WeightNorm_Word_WeightNorm FOREIGN KEY (wordId,entityName)
    REFERENCES WeightNorm(entityNormId,entityName) ON DELETE CASCADE,
       
    CONSTRAINT syn1_word_syn1 FOREIGN KEY (synonymId)
    REFERENCES Synonym(synonymId)



);




###123456789-TOKEN-0
drop table if exists  Symbol;
###123456789-TOKEN-1
create table Symbol(
  symbolId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
   text  Varchar(20),
   lang Varchar(10),
   encoding Varchar(10),
  entityName Varchar(80) NOT NULL DEFAULT 'SYMBOL',
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
lastaccess Datetime,
 
 candidateId BIGINT NOT NULL default 0,
 candidateNormId BIGINT NOT NULL default 0,
CONSTRAINT WeightNorm_SY_WeightNorm FOREIGN KEY (symbolId,entityName)
    REFERENCES WeightNorm(entityNormId,entityName) ON DELETE CASCADE



);


###123456789-TOKEN-0
drop table if exists  Sentence;
###123456789-TOKEN-1
create table Sentence(
  sentenceId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
   text  Varchar(300),
   lang Varchar(10),
   encoding Varchar(10),
  entityName Varchar(80) NOT NULL DEFAULT 'SENTENCE',   
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
lastaccess Datetime,

 candidateId BIGINT NOT NULL default 0,
 candidateNormId BIGINT NOT NULL default 0,
CONSTRAINT WeightNorm_SE_WeightNorm FOREIGN KEY (sentenceId,entityName)
    REFERENCES WeightNorm(entityNormId,entityName) ON DELETE CASCADE


);


###123456789-TOKEN-0
drop table if exists  WordSentence;
###123456789-TOKEN-1
create table WordSentence(
  wordsentenceId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  wordId BIGINT UNSIGNED,
  sentenceId BIGINT UNSIGNED,
   text  Varchar(20),
   lang Varchar(10),
   encoding Varchar(10),
  entityName Varchar(80) NOT NULL DEFAULT 'WORDSENTENCE',   
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
lastaccess Datetime,

 candidateId BIGINT NOT NULL default 0,
 candidateNormId BIGINT NOT NULL default 0,
CONSTRAINT WeightNorm_WOSE_WeightNorm FOREIGN KEY (wordsentenceId,entityName)
    REFERENCES WeightNorm(entityNormId,entityName) ON DELETE CASCADE,

     CONSTRAINT sen_wsen_sen FOREIGN KEY (sentenceId)
    REFERENCES Sentence(sentenceId), 


     CONSTRAINT wo_wsen_wo FOREIGN KEY (wordId)
    REFERENCES Word(wordId) 
    

);


###123456789-TOKEN-0
drop table if exists  SymbolSentence;
###123456789-TOKEN-1
create table SymbolSentence(
  symbolsentenceId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  symbolId BIGINT UNSIGNED,
  sentenceId BIGINT UNSIGNED,
   text  Varchar(20),
   lang Varchar(10),
   encoding Varchar(10),
  entityName Varchar(80) NOT NULL DEFAULT 'SYMBOLSENTENCE',   
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
lastaccess Datetime,

 candidateId BIGINT NOT NULL default 0,
 candidateNormId BIGINT NOT NULL default 0,
CONSTRAINT WeightNorm_symbSE_WeightNorm FOREIGN KEY (symbolsentenceId,entityName)
    REFERENCES WeightNorm(entityNormId,entityName) ON DELETE CASCADE,

     CONSTRAINT sen_sysen_sen FOREIGN KEY (sentenceId)
    REFERENCES Sentence(sentenceId), 


     CONSTRAINT sym_sysen_sym FOREIGN KEY (symbolId)
    REFERENCES Symbol(symbolId) 
    

);

    
    

###123456789-TOKEN-0
drop table if exists  Sentence2Sentence;
###123456789-TOKEN-1
create table Sentence2Sentence(
sentence2sentenceId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    
sentenceId BIGINT UNSIGNED NOT NULL ,
  sentence2Id BIGINT UNSIGNED NOT NULL ,
   text  Varchar(20),
  entityName Varchar(80) NOT NULL DEFAULT 'Sentence2Sentence',   
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
lastaccess Datetime,

 candidateId BIGINT NOT NULL default 0,
 candidateNormId BIGINT NOT NULL default 0,
CONSTRAINT WeightNorm_SE2SE_WeightNorm FOREIGN KEY (sentence2sentenceId,entityName)
    REFERENCES WeightNorm(entityNormId,entityName), 

CONSTRAINT s_Sentence21Sentence_s FOREIGN KEY (sentenceId)
    REFERENCES Sentence(sentenceId) ON DELETE CASCADE,

    
CONSTRAINT s_Sentence2Sentence_s FOREIGN KEY (sentence2Id)
    REFERENCES Sentence(sentenceId) ON DELETE CASCADE

);



###123456789-TOKEN-0
drop table if exists  Problem;
###123456789-TOKEN-1
create table Problem(
  problemId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
   text  Varchar(200),
  entityName Varchar(80) NOT NULL DEFAULT 'Problem',   
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
status Varchar(30) , /*  solved, unsolved. null = not processed*/
  lastaccess Datetime,
started TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
ended TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
telapsed TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
 candidateId BIGINT NOT NULL default 0,
 candidateNormId BIGINT NOT NULL default 0,
CONSTRAINT WeightNorm_P_WeightNorm FOREIGN KEY (problemId,entityName)
    REFERENCES WeightNorm(entityNormId,entityName) 


);


###123456789-TOKEN-0
drop table if exists  Definition;
###123456789-TOKEN-1
create table Definition(
  definitionId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
   problemId BIGINT UNSIGNED NOT NULL, 
  candidateId BIGINT NOT NULL default 0,     
  candidatethreshold FLOAT NOT NULL DEFAULT 0, /* this is a kind of "reverse" */
  
   text  Varchar(200),
  entityName Varchar(80) NOT NULL DEFAULT 'Definition',   
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
lastaccess Datetime,

CONSTRAINT WeightNorm_def_WeightNorm FOREIGN KEY (definitionId,entityName)
    REFERENCES WeightNorm(entityNormId,entityName), 
 CONSTRAINT de_p_de FOREIGN KEY (problemId)
    REFERENCES Problem(problemId) ON DELETE CASCADE


);


###123456789-TOKEN-0
drop table if exists  DefinitionInterpretation;
###123456789-TOKEN-1
create table DefinitionInterpretation(
  
  definitioninterpretationId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
   definitionId BIGINT UNSIGNED NOT NULL, 
  candidateId BIGINT NOT NULL default 0,     
  candidatethreshold FLOAT NOT NULL DEFAULT 0, /* this is a kind of "reverse" */
  content  Varchar(4096),
  entityName Varchar(80) NOT NULL DEFAULT 'DefinitionInterpretation',   
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
lastaccess Datetime,

CONSTRAINT WeightNorm_defint_WeightNorm FOREIGN KEY (definitioninterpretationId,entityName)
    REFERENCES WeightNorm(entityNormId,entityName), 
 CONSTRAINT dein_def_dein FOREIGN KEY (definitionId)
    REFERENCES Definition(definitionId) 


);



###123456789-TOKEN-0
drop table if exists  Solution;
###123456789-TOKEN-1
create table Solution(
  solutionId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
   problemId BIGINT UNSIGNED NOT NULL, 
   candidateId BIGINT NOT NULL default 0,     
  candidatethreshold FLOAT NOT NULL DEFAULT 0, /* needed */
  
  text  Varchar(200),
  entityName Varchar(80) NOT NULL DEFAULT 'SOLUTION',   
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
lastaccess Datetime,

CONSTRAINT WeightNorm_sol_WeightNorm FOREIGN KEY (solutionId,entityName)
    REFERENCES WeightNorm(entityNormId,entityName), 

    CONSTRAINT p_s_p FOREIGN KEY (problemId)
    REFERENCES Problem(problemId) 

);


###123456789-TOKEN-0
drop table if exists  SolutionInterpretation;
###123456789-TOKEN-1
create table SolutionInterpretation(
  
  solutioninterpretationId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
   solutionId BIGINT UNSIGNED NOT NULL, 
  candidateId BIGINT NOT NULL default 0,     
  candidatethreshold FLOAT NOT NULL DEFAULT 0, /* this is a kind of "reverse" */
  content  Varchar(4096),
  entityName Varchar(80) NOT NULL DEFAULT 'SolutionInterpretation',   
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
lastaccess Datetime,

CONSTRAINT WeightNorm_solI_WeightNorm FOREIGN KEY (solutioninterpretationId,entityName)
    REFERENCES WeightNorm(entityNormId,entityName), 
 CONSTRAINT soin_so_soin FOREIGN KEY (solutionId)
    REFERENCES Solution(solutionId) ON DELETE CASCADE


);





###123456789-TOKEN-10
drop table if exists  Problem2Problem;  
###123456789-TOKEN-11

create table Problem2Problem(
  problem2problemId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  
  problemId  BIGINT UNSIGNED NOT NULL,
  problem2Id  BIGINT UNSIGNED NOT NULL,
  entityName Varchar(80) default 'problem2problem',
   text  Varchar(300) ,
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
   lastaccess DATETIME,


 candidateId BIGINT NOT NULL default 0,
 candidateNormId BIGINT NOT NULL default 0,
   
CONSTRAINT WeightNorm_p2p_WeightNorm FOREIGN KEY (problem2problemId,entityName)
    REFERENCES WeightNorm(entityNormId,entityName), 
  
    CONSTRAINT p_p2p_p FOREIGN KEY (problemId)
    REFERENCES Problem(problemId),
      CONSTRAINT p_p22p_p FOREIGN KEY (problem2Id)
    REFERENCES Problem(problemId) 



);
##
drop table if exists  Definition2Definition;  
###123456789-TOKEN-11

create table Definition2Definition(
  definition2definitionId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  definitionId  BIGINT UNSIGNED NOT NULL,
  definition2Id  BIGINT UNSIGNED NOT NULL,
 
  text  Varchar(300) ,
entityName Varchar(80) NOT NULL DEFAULT 'definition2definition',
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
   lastaccess DATETIME,
  
   
 candidateId BIGINT NOT NULL default 0,
 candidateNormId BIGINT NOT NULL default 0,
   CONSTRAINT WeightNorm_de2de_WeightNorm FOREIGN KEY (definition2definitionId,entityName)
    REFERENCES WeightNorm(entityNormId,entityName), 

    CONSTRAINT d_def2def_d FOREIGN KEY (definitionId)
    REFERENCES Definition(definitionId) ,
    
    CONSTRAINT d_de2de2_d FOREIGN KEY (definition2Id)
    REFERENCES Definition(definitionId) 
   

);


###123456789-TOKEN-10
drop table if exists  Solution2Solution;  
###123456789-TOKEN-11

create table Solution2Solution(
  solution2solutionId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  
  solutionId  BIGINT UNSIGNED NOT NULL,
  solution2Id  BIGINT UNSIGNED NOT NULL,
  text  Varchar(300) ,
  entityName Varchar(80) NOT NULL DEFAULT 'solution2solution',
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
   lastaccess DATETIME,
 
   
 candidateId BIGINT NOT NULL default 0,
 candidateNormId BIGINT NOT NULL default 0,

   CONSTRAINT WeightNorm_so2so_WeightNorm FOREIGN KEY (solution2solutionId,entityName)
    REFERENCES WeightNorm(entityNormId,entityName), 
  
    CONSTRAINT s_so2so_s FOREIGN KEY (solution2Id)
    REFERENCES Solution(solutionId) ,
    
    CONSTRAINT s_so2so1_s FOREIGN KEY (solutionId)
    REFERENCES Solution(solutionId) 
    
 

);

###123456789-TOKEN-0
drop table if exists  Subject;
###123456789-TOKEN-1
create table Subject(
  subjectId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
   applicationId  BIGINT UNSIGNED,
   text  Varchar(20),
  entityName Varchar(80) NOT NULL DEFAULT 'subject',   
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
lastaccess Datetime,

 candidateId BIGINT NOT NULL default 0,
 candidateNormId BIGINT NOT NULL default 0,
   CONSTRAINT WeightNorm_sub_WeightNorm FOREIGN KEY (subjectId,entityName)
    REFERENCES WeightNorm(entityNormId,entityName)


);

###123456789-TOKEN-0
drop table if exists  Observer;
###123456789-TOKEN-1
create table Observer(
  observerId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  subjectId BIGINT UNSIGNED NOT NULL,
   text  Varchar(20),
  entityName Varchar(80) NOT NULL DEFAULT 'observer',   
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
lastaccess Datetime,

 candidateId BIGINT NOT NULL default 0,
 candidateNormId BIGINT NOT NULL default 0,
   CONSTRAINT WeightNorm_obs_WeightNorm FOREIGN KEY (observerId,entityName)
    REFERENCES WeightNorm(entityNormId,entityName), 

    CONSTRAINT o_s_o FOREIGN KEY (subjectId)
    REFERENCES Subject(subjectId) 

);
###123456789-TOKEN-0
## stress at work? :)

drop table if exists  ObserverThreshold;
###123456789-TOKEN-1
create table ObserverThreshold(
  observerthresholdId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  observerId BIGINT UNSIGNED NOT NULL,
  thresholdId BIGINT UNSIGNED NOT NULL,  
   text  Varchar(20),
  entityName Varchar(80) NOT NULL DEFAULT 'observerthreshold',   
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
lastaccess Datetime,

 candidateId BIGINT NOT NULL default 0,
 candidateNormId BIGINT NOT NULL default 0,
   CONSTRAINT WeightNorm_ot1_WeightNorm FOREIGN KEY (observerthresholdId,entityName)
    REFERENCES WeightNorm(entityNormId,entityName), 

    CONSTRAINT ot1_o_ot1 FOREIGN KEY (observerId)
    REFERENCES Observer(observerId), 
CONSTRAINT ot2_t_ot2 FOREIGN KEY (thresholdId)
    REFERENCES Threshold(thresholdId)
);

###123456789-TOKEN-0
## how about your colleagues?

drop table if exists  ObserverThreshold2ObserverThreshold;
###123456789-TOKEN-1
create table ObserverThreshold2ObserverThreshold(
  observerthreshold2observerthresholdId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  observerthresholdId BIGINT UNSIGNED NOT NULL,
  observerthreshold2Id BIGINT UNSIGNED NOT NULL,  
   text  Varchar(20),
  entityName Varchar(80) NOT NULL DEFAULT 'ObserverThreshold2ObserverThreshold',   
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
lastaccess Datetime,

 candidateId BIGINT NOT NULL default 0,
 candidateNormId BIGINT NOT NULL default 0,
   CONSTRAINT WeightNorm_ot2ot_WeightNorm FOREIGN KEY (observerthreshold2observerthresholdId,entityName)
    REFERENCES WeightNorm(entityNormId,entityName), 

    CONSTRAINT ot_ot2ot_ot FOREIGN KEY (observerthresholdId)
    REFERENCES ObserverThreshold(observerthresholdId), 
CONSTRAINT ot1__ot2ot_ot1 FOREIGN KEY (observerthreshold2Id)
    REFERENCES ObserverThreshold(observerThresholdId)
);



###123456789-TOKEN-0
drop table if exists  Command;
###123456789-TOKEN-1
create table Command(
  commandId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  observerId BIGINT UNSIGNED NOT NULL,
   text  Varchar(20),
  entityName Varchar(80) NOT NULL DEFAULT 'command',   
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
lastaccess Datetime,

 candidateId BIGINT NOT NULL default 0,
 candidateNormId BIGINT NOT NULL default 0,
   CONSTRAINT WeightNorm_com_WeightNorm FOREIGN KEY (commandId,entityName)
    REFERENCES WeightNorm(entityNormId,entityName), 
CONSTRAINT c_o_c FOREIGN KEY (observerId)
    REFERENCES Observer(observerId) 

);

###123456789-TOKEN-0
drop table if exists  `Action`;
###123456789-TOKEN-1
create table `Action`(
  actionId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  commandId BIGINT UNSIGNED NOT NULL,
   text  Varchar(20),
  entityName Varchar(80) NOT NULL DEFAULT 'action',   
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
lastaccess Datetime,

 candidateId BIGINT NOT NULL default 0,
 candidateNormId BIGINT NOT NULL default 0,
   CONSTRAINT WeightNorm_act_WeightNorm FOREIGN KEY (actionId,entityName)
    REFERENCES WeightNorm(entityNormId,entityName), 
CONSTRAINT a_c_a FOREIGN KEY (commandId)
    REFERENCES Command(commandId) 

);

##123456789-TOKEN-10
drop table if exists  ProblemDefinition;  
##123456789-TOKEN-11

create table ProblemDefinition(
  problemdefinitionId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  definitionId BIGINT UNSIGNED NOT NULL,
  problemId  BIGINT UNSIGNED NOT NULL,
   text  Varchar(300) ,
entityName Varchar(80) NOT NULL DEFAULT 'Problemdefinion',
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
   lastaccess DATETIME,
  

 candidateId BIGINT NOT NULL default 0,
 candidateNormId BIGINT NOT NULL default 0,
    CONSTRAINT WeightNorm_pd_WeightNorm FOREIGN KEY (problemdefinitionId,entityName)
    REFERENCES WeightNorm(entityNormId,entityName),
    
    CONSTRAINT p_pdef_p FOREIGN KEY (problemId)
    REFERENCES Problem(problemId) ON DELETE CASCADE ,
    
    CONSTRAINT def_pd_def FOREIGN KEY (definitionId)  REFERENCES  Definition(definitionId)
    
    
);

##123456789-TOKEN-10
drop table if exists  ProblemDefinition2ProblemDefinition;  
##123456789-TOKEN-11

create table ProblemDefinition2ProblemDefinition(
 problemdefinition2problemdefinitionId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
 problemdefinitionId BIGINT UNSIGNED NOT NULL,
  problemdefinition2Id  BIGINT UNSIGNED NOT NULL,
   text  Varchar(300) ,
entityName Varchar(80) NOT NULL DEFAULT 'ProblemDefinition2ProblemDefinition',
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
   lastaccess DATETIME,
   
 candidateId BIGINT NOT NULL default 0,
 candidateNormId BIGINT NOT NULL default 0,

    CONSTRAINT WeightNorm_pd2pd_WeightNorm FOREIGN KEY (problemdefinition2problemdefinitionId,entityName)
    REFERENCES WeightNorm(entityNormId,entityName),
    
    CONSTRAINT pd_pd2pd_pd FOREIGN KEY (problemdefinitionId)
    REFERENCES ProblemDefinition(problemdefinitionId) ON DELETE CASCADE ,
    CONSTRAINT pd1_pd2pd_pd1 FOREIGN KEY (problemdefinition2Id)
    REFERENCES ProblemDefinition(problemdefinitionId) ON DELETE CASCADE 
    

);

#On of the main tables
##123456789-TOKEN-10
drop table if exists  ProblemSolution;  
##123456789-TOKEN-11

create table ProblemSolution(
  problemsolutionId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  solutionId BIGINT UNSIGNED NOT NULL,
  problemId  BIGINT UNSIGNED NOT NULL,
   text  Varchar(300) ,
entityName Varchar(80) NOT NULL DEFAULT 'Problemdefinion',
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
   lastaccess DATETIME,
  

 candidateId BIGINT NOT NULL default 0,
 candidateNormId BIGINT NOT NULL default 0,
    CONSTRAINT WeightNorm_psol_WeightNorm FOREIGN KEY (problemsolutionId,entityName)
    REFERENCES WeightNorm(entityNormId,entityName),
    
    CONSTRAINT p_ps_p FOREIGN KEY (problemId)
    REFERENCES Problem(problemId) ON DELETE CASCADE ,
    
    CONSTRAINT s_p1_s FOREIGN KEY (solutionId)  REFERENCES  Solution(solutionId)
    
    
);

##123456789-TOKEN-10
drop table if exists  ProblemSolution2ProblemSolution;  
##123456789-TOKEN-11

create table ProblemSolution2ProblemSolution(
 problemsolution2problemsolutionId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
 problemsolutionId BIGINT UNSIGNED NOT NULL,
  problemsolution2Id  BIGINT UNSIGNED NOT NULL,
   text  Varchar(300) ,
entityName Varchar(80) NOT NULL DEFAULT 'ProblemSolution2ProblemSolution',
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
   lastaccess DATETIME,
   
 candidateId BIGINT NOT NULL default 0,
 candidateNormId BIGINT NOT NULL default 0,

    CONSTRAINT WeightNorm_ps2ps_WeightNorm FOREIGN KEY (problemsolution2problemsolutionId,entityName)
    REFERENCES WeightNorm(entityNormId,entityName),
    
    CONSTRAINT ps_ps2ps_ps FOREIGN KEY (problemsolutionId)
    REFERENCES ProblemSolution(problemsolutionId) ON DELETE CASCADE ,
    CONSTRAINT ps1_ps2ps_ps1 FOREIGN KEY (problemsolution2Id)
    REFERENCES ProblemSolution(problemsolutionId) ON DELETE CASCADE 
    

);

####

###123456789-TOKEN-0
drop table if exists OrderType;
###123456789-TOKEN-1
create table OrderType(
  ordertypeId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  typeName Varchar(30) NOT NULL,
  text  Varchar(200),
  entityName Varchar(80) NOT NULL DEFAULT 'OrderType',   
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
lastaccess Datetime

);




###123456789-TOKEN-0
drop table if exists  `Order`;
###123456789-TOKEN-1
create table `Order`(
  orderId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  contextId BIGINT UNSIGNED NOT NULL DEFAULT 0,
  ordertypeId BIGINT UNSIGNED NOT NULL DEFAULT 0,
  text  Varchar(200),
  status Varchar(20) NOT NULL, /* completed, deprecated, unknown */
  entityName Varchar(80) NOT NULL DEFAULT 'Order',   
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
lastaccess Datetime,
started TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
ended TIMESTAMP DEFAULT CURRENT_TIMESTAMP ,
telapsed TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
 candidateId BIGINT NOT NULL default 0,
 candidateNormId BIGINT NOT NULL default 0,
CONSTRAINT WeightNorm_Order_WeightNorm FOREIGN KEY (orderId,entityName)
    REFERENCES WeightNorm(entityNormId,entityName),
    
CONSTRAINT ot_Order_ot FOREIGN KEY (ordertypeId)
    REFERENCES OrderType(ordertypeId)

    
    

);


###123456789-TOKEN-0
drop table if exists OrderProblem;
###123456789-TOKEN-1
create table OrderProblem(
  orderproblemId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY, 
  orderId BIGINT ,
  problemId BIGINT,
  priority INT DEFAULT 0,
  text  Varchar(200),
  status Varchar(20) NOT NULL, /*  */
  entityName Varchar(80) NOT NULL DEFAULT 'OrderProblem',   
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
lastaccess Datetime,
started TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
ended TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
telapsed TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
 candidateId BIGINT NOT NULL default 0,
 candidateNormId BIGINT NOT NULL default 0,
CONSTRAINT WeightNorm_op11_WeightNorm FOREIGN KEY (orderproblemId,entityName)
    REFERENCES WeightNorm(entityNormId,entityName)

   /* CONSTRAINT pro1_Opro1_pro1 FOREIGN KEY (problemId) REFERENCES Problem(problemId), 
	
    
    CONSTRAINT ord2_Opro2_ord2 FOREIGN KEY (orderId) REFERENCES `Order`(orderId) 
*/
        


);


/*
###123456789-TOKEN-0
drop table if exists  ContextOwner;
###123456789-TOKEN-1
create table ContextOwner(
  contextownerId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  ownerId BIGINT UNSIGNED,  
  ownerName Varchar(80),
  text  Varchar(200),
  status Varchar(20) NOT NULL, 
  entityName Varchar(80) NOT NULL DEFAULT 'ContextOwner',   
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
lastaccess Datetime,
started TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
ended TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
telapsed TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
 candidateId BIGINT NOT NULL default 0,
 candidateNormId BIGINT NOT NULL default 0,
CONSTRAINT WeightNorm_Context_WeightNorm FOREIGN KEY (orderId,entityName)
    REFERENCES WeightNorm(entityNormId,entityName)
 
  
    

);
*/


###123456789-TOKEN-0
drop table if exists  Context;
###123456789-TOKEN-1
create table Context(
  contextId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY, 
  ownerId BIGINT UNSIGNED ,  /* may be created and not assigned */ 
  ownerName Varchar(80) ,
  text  Varchar(200),
  status Varchar(20) NOT NULL, 
  /* Analysys pend */
  entityName Varchar(80) NOT NULL DEFAULT 'Context',   
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
lastaccess Datetime,
started TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
ended TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
telapsed TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
 candidateId BIGINT NOT NULL default 0,
 candidateNormId BIGINT NOT NULL default 0,
CONSTRAINT WeightNorm_Context1_WeightNorm FOREIGN KEY (contextId,entityName)
    REFERENCES WeightNorm(entityNormId,entityName)
    
   
);

###123456789-TOKEN-0
drop table if exists  ContextOrder;
###123456789-TOKEN-1
create table ContextOrder(
  contextorderId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY, 
  contextId BIGINT UNSIGNED ,  
  orderId BIGINT UNSIGNED,
  priority INT DEFAULT 0,
  /* Analysys pend */
  text  Varchar(200),
  status Varchar(20) NOT NULL, /*  */
  entityName Varchar(80) NOT NULL DEFAULT 'ContextOrder',   
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
lastaccess Datetime,
started TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
ended TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
telapsed TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
 candidateId BIGINT NOT NULL default 0,
 candidateNormId BIGINT NOT NULL default 0,
CONSTRAINT WeightNorm_ContextO2_WeightNorm FOREIGN KEY (contextorderId,entityName)
    REFERENCES WeightNorm(entityNormId,entityName),
     CONSTRAINT c1_co1_c1 FOREIGN KEY (contextId) REFERENCES Context(contextId),
    CONSTRAINT o1_co1_o1 FOREIGN KEY (orderId) REFERENCES `Order`(orderId)

    
   
);




##123456789-TOKEN-10
drop table if exists  SubjectOrder;  
##123456789-TOKEN-11

create table SubjectOrder(
  subjectorderId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  subjectId BIGINT UNSIGNED NOT NULL,
  orderId  BIGINT UNSIGNED NOT NULL,
   text  Varchar(300) ,
entityName Varchar(80) NOT NULL DEFAULT 'subjectorder',
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
   lastaccess DATETIME,
  
 candidateId BIGINT NOT NULL default 0,
 candidateNormId BIGINT NOT NULL default 0,

    CONSTRAINT WeightNorm_sord_WeightNorm FOREIGN KEY (subjectorderId,entityName)
    REFERENCES WeightNorm(entityNormId,entityName),
    
    CONSTRAINT o_suo_o FOREIGN KEY (orderId)
    REFERENCES `Order`(orderId)  ,
    CONSTRAINT s_suo_s FOREIGN KEY (subjectId)
    REFERENCES Subject(subjectId)  

);
##123456789-TOKEN-10
drop table if exists  ObserverOrder;  
##123456789-TOKEN-11

create table ObserverOrder(
  observerorderId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  observerId BIGINT UNSIGNED NOT NULL,
  orderId  BIGINT UNSIGNED NOT NULL,
   text  Varchar(300) ,
entityName Varchar(80) NOT NULL DEFAULT 'Observerorder',
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
   lastaccess DATETIME,
  

 candidateId BIGINT NOT NULL default 0,
 candidateNormId BIGINT NOT NULL default 0,
    CONSTRAINT WeightNorm_obsord_WeightNorm FOREIGN KEY (observerorderId,entityName)
    REFERENCES WeightNorm(entityNormId,entityName),
    
    CONSTRAINT ord_obs_ord FOREIGN KEY (orderId)
    REFERENCES `Order`(orderId)  ,
    CONSTRAINT ord_obs1_ord FOREIGN KEY (ObserverId)
    REFERENCES Observer(ObserverId)  



);

##123456789-TOKEN-10
drop table if exists  CommandOrder;  
##123456789-TOKEN-11

create table CommandOrder(
  commandorderId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  commandId BIGINT UNSIGNED NOT NULL,
  orderId  BIGINT UNSIGNED NOT NULL,
   text  Varchar(300) ,
entityName Varchar(80) NOT NULL DEFAULT 'CommandOrder',
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
   lastaccess DATETIME,
  

 candidateId BIGINT NOT NULL default 0,
 candidateNormId BIGINT NOT NULL default 0,
    CONSTRAINT WeightNorm_cord_WeightNorm FOREIGN KEY (commandorderId,entityName)
    REFERENCES WeightNorm(entityNormId,entityName),
    
    CONSTRAINT o_cord_o FOREIGN KEY (orderId)
    REFERENCES `Order`(orderId) ,
    CONSTRAINT c_cord_c FOREIGN KEY (CommandId)
    REFERENCES Command(CommandId)  



);

##123456789-TOKEN-10
drop table if exists  ActionOrder;  
##123456789-TOKEN-11

create table ActionOrder(
  actionorderId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  actionId BIGINT UNSIGNED NOT NULL,
  orderId  BIGINT UNSIGNED NOT NULL,
   text  Varchar(300) ,
entityName Varchar(80) NOT NULL DEFAULT 'Actionorder',
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
   lastaccess DATETIME,
  

 candidateId BIGINT NOT NULL default 0,
 candidateNormId BIGINT NOT NULL default 0,
    CONSTRAINT WeightNorm_acord_WeightNorm FOREIGN KEY (actionorderId,entityName)
    REFERENCES WeightNorm(entityNormId,entityName),
    
    CONSTRAINT o_aord_o FOREIGN KEY (orderId)
    REFERENCES `Order`(orderId)  ,
    CONSTRAINT a_aord_a FOREIGN KEY (actionId)  REFERENCES  `Action`(actionId) 

);




##123456789-TOKEN-10
drop table if exists  SubjectOrder2SubjectOrder;  
##123456789-TOKEN-11

create table SubjectOrder2SubjectOrder(
 subjectorder2subjectorderId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
 subjectorderId BIGINT UNSIGNED NOT NULL,
  subjectorder2Id  BIGINT UNSIGNED NOT NULL,
   text  Varchar(300) ,
entityName Varchar(80) NOT NULL DEFAULT 'SubjectOrder2SubjectOrder',
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
   lastaccess DATETIME,
   

 candidateId BIGINT NOT NULL default 0,
 candidateNormId BIGINT NOT NULL default 0,
    CONSTRAINT WeightNorm_sord2sord_WeightNorm FOREIGN KEY (subjectorder2subjectorderId,entityName)
    REFERENCES WeightNorm(entityNormId,entityName),
    
    CONSTRAINT sord_sord2sord_sord FOREIGN KEY (subjectorderId)
    REFERENCES SubjectOrder(subjectorderId) ON DELETE CASCADE ,
    CONSTRAINT sord1_sord2sord_sord1 FOREIGN KEY (subjectorder2Id)
    REFERENCES SubjectOrder(subjectorderId) ON DELETE CASCADE 
    

);

##123456789-TOKEN-10
drop table if exists  ObserverOrder2ObserverOrder;  
##123456789-TOKEN-11

create table ObserverOrder2ObserverOrder(
 observerorder2observerorderId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
 observerorderId BIGINT UNSIGNED NOT NULL,
  observerorder2Id  BIGINT UNSIGNED NOT NULL,
   text  Varchar(300) ,
entityName Varchar(80) NOT NULL DEFAULT 'ObserverOrder2ObserverOrder',
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
   lastaccess DATETIME,
   

 candidateId BIGINT NOT NULL default 0,
 candidateNormId BIGINT NOT NULL default 0,
    CONSTRAINT WeightNorm_oob2oo_WeightNorm FOREIGN KEY (observerorder2observerorderId,entityName)
    REFERENCES WeightNorm(entityNormId,entityName),
    
    CONSTRAINT oo1_oo2oo_op1 FOREIGN KEY (observerorderId)
    REFERENCES ObserverOrder(observerorderId) ON DELETE CASCADE ,
    CONSTRAINT oo2_oo2oo_op2 FOREIGN KEY (observerorder2Id)
    REFERENCES ObserverOrder(observerorderId) ON DELETE CASCADE 
    

);



##123456789-TOKEN-10
drop table if exists  CommandOrder2CommandOrder;  
##123456789-TOKEN-11

create table CommandOrder2CommandOrder(
 commandorder2commandorderId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
 commandorderId BIGINT UNSIGNED NOT NULL,
  commandorder2Id  BIGINT UNSIGNED NOT NULL,
   text  Varchar(300) ,
entityName Varchar(80) NOT NULL DEFAULT 'CommandOrder2CommandOrder',
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
   lastaccess DATETIME,
   
 candidateId BIGINT NOT NULL default 0,
 candidateNormId BIGINT NOT NULL default 0,

    CONSTRAINT WeightNorm_cord2cord_WeightNorm FOREIGN KEY (commandorder2commandorderId,entityName)
    REFERENCES WeightNorm(entityNormId,entityName),
    
    CONSTRAINT cord_co2co_cord FOREIGN KEY (commandorderId)
    REFERENCES CommandOrder(commandorderId) ON DELETE CASCADE ,
    CONSTRAINT cord1_co2co_cord1 FOREIGN KEY (commandorder2Id)
    REFERENCES CommandOrder(commandorderId) ON DELETE CASCADE 
    

);




##123456789-TOKEN-10
drop table if exists  ActionOrder2ActionOrder;  
##123456789-TOKEN-11

create table ActionOrder2ActionOrder(
 actionorder2actionorderId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
 actionorderId BIGINT UNSIGNED NOT NULL,
  actionorder2Id  BIGINT UNSIGNED NOT NULL,
   text  Varchar(300) ,
entityName Varchar(80) NOT NULL DEFAULT 'ActionOrder2ActionOrder',
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
   lastaccess DATETIME,
   
 candidateId BIGINT NOT NULL default 0,
 candidateNormId BIGINT NOT NULL default 0,

    CONSTRAINT WeightNorm_ao2ao_WeightNorm FOREIGN KEY (actionorder2actionorderId,entityName)
    REFERENCES WeightNorm(entityNormId,entityName),
    
    CONSTRAINT ao_ao2ao_ao FOREIGN KEY (actionorderId)
    REFERENCES ActionOrder(actionorderId) ON DELETE CASCADE ,
    CONSTRAINT ao1_ao2ao_ao1 FOREIGN KEY (actionorder2Id)
    REFERENCES ActionOrder(actionorderId) ON DELETE CASCADE 
    

);

