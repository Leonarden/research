drop database if exists emorobots;
create database emorobots;
use emorobots;


##123456789-TOKEN-12
drop table if exists  WeightNorm;
##123456789-TOKEN-13

create table WeightNorm(
  weightNormId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  entityWNormId BIGINT UNSIGNED,
  fear FLOAT NOT NULL DEFAULT 0,
  happy FLOAT NOT NULL DEFAULT 0,
  anger FLOAT NOT NULL DEFAULT 0,
  sad FLOAT NOT NULL DEFAULT 0,
  peace FLOAT NOT NULL DEFAULT 0,
  love  FLOAT NOT NULL DEFAULT 0,
  lastAccess DATETIME NOT NULL,


);

###123456789-TOKEN-0
drop table if exists  Word;
###123456789-TOKEN-1
create table Word(
  wordId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
   text  Varchar(20),
   entityNormId BIGINT UNSIGNED ,
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,


CONSTRAINT WeightNorm_Word_WeightNorm FOREIGN KEY (entityNormId)
    REFERENCES WeightNorm(entityNormId) ON DELETE CASCADE


);


###123456789-TOKEN-0
drop table if exists  Symbol;
###123456789-TOKEN-1
create table Symbol(
  symbolId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
   text  Varchar(20),
   entityNormId BIGINT UNSIGNED ,
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
lastaccess Datetime,

CONSTRAINT WeightNorm_Symbol_WeightNorm FOREIGN KEY (entityNormId)
    REFERENCES WeightNorm(entityNormId) ON DELETE CASCADE



);


###123456789-TOKEN-0
drop table if exists  Sentence;
###123456789-TOKEN-1
create table Sentence(
  sentenceId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
   text  Varchar(300),
   entityNormId BIGINT UNSIGNED ,   
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
lastaccess Datetime,
CONSTRAINT WeightNorm_Sentence_WeightNorm FOREIGN KEY (entityNormId)
    REFERENCES WeightNorm(entityNormId) ON DELETE CASCADE


);

###123456789-TOKEN-0
drop table if exists  Sentence2Sentence;
###123456789-TOKEN-1
create table Sentence2Sentence(
  sentenceId BIGINT UNSIGNED NOT NULL ,
  sentence2Id BIGINT UNSIGNED NOT NULL ,
   text  Varchar(20),
   entityNormId BIGINT UNSIGNED ,   
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
lastaccess Datetime,
PRIMARY KEY(sentenceId,sentence2Id),
CONSTRAINT WeightNorm_Sentence2Sentence_WeightNorm FOREIGN KEY (entityNormId)
    REFERENCES WeightNorm(entityNormId) ON DELETE CASCADE,

CONSTRAINT s_Sentence2Sentence_s FOREIGN KEY (sentence2Id)
    REFERENCES Sentence(sentenceId) ON DELETE CASCADE

);


###123456789-TOKEN-0
drop table if exists  Problem;
###123456789-TOKEN-1
create table Problem(
  problemId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
   text  Varchar(200),
   entityNormId BIGINT UNSIGNED ,   
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
lastaccess Datetime,
CONSTRAINT WeightNorm_Problem_WeightNorm FOREIGN KEY (entityNormId)
    REFERENCES WeightNorm(entityNormId) ON DELETE CASCADE


);


###123456789-TOKEN-0
drop table if exists  Definition;
###123456789-TOKEN-1
create table Definition(
  definitionId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
   problemId BIGINT UNSIGNED NOT NULL, 
  text  Varchar(200),
   entityNormId BIGINT UNSIGNED ,   
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
lastaccess Datetime,
CONSTRAINT WeightNorm_Definition_WeightNorm FOREIGN KEY (entityNormId)
    REFERENCES WeightNorm(entityNormId) ON DELETE CASCADE,
 CONSTRAINT de_p_de FOREIGN KEY (problemId)
    REFERENCES Problem(problemId) ON DELETE CASCADE


);

###123456789-TOKEN-0
drop table if exists  Solution;
###123456789-TOKEN-1
create table Solution(
  solutionId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
   problemId BIGINT UNSIGNED NOT NULL, 
  text  Varchar(200),
   entityNormId BIGINT UNSIGNED ,   
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
lastaccess Datetime,
CONSTRAINT WeightNorm_Solution_WeightNorm FOREIGN KEY (entityNormId)
    REFERENCES WeightNorm(entityNormId) ON DELETE CASCADE,

    CONSTRAINT p_s_p FOREIGN KEY (problemId)
    REFERENCES Problem(problemId) 

);


###123456789-TOKEN-10
drop table if exists  Problem2Problem;  
###123456789-TOKEN-11

create table Problem2Problem(
  
  problemId  BIGINT UNSIGNED NOT NULL,
  problem2Id  BIGINT UNSIGNED NOT NULL,
  entityNormId BIGINT UNSIGNED,
   text  Varchar(300) ,
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
   lastaccess DATETIME,
    PRIMARY KEY(problemId,problem2Id),

   
  CONSTRAINT wnw_p2p_wnw FOREIGN KEY(entityNormId)
  REFERENCES WeightNorm(entityNormId),
  
    CONSTRAINT p_p2p_p FOREIGN KEY (problem2Id)
    REFERENCES Problem(problemId) 


);


###123456789-TOKEN-10
drop table if exists  Definition2Definition;  
###123456789-TOKEN-11

create table Definition2Definition(
  
  definitionId  BIGINT UNSIGNED NOT NULL,
  definition2Id  BIGINT UNSIGNED NOT NULL,
  problemId  BIGINT UNSIGNED NOT NULL,
  problem2Id  BIGINT UNSIGNED NOT NULL,
 
  text  Varchar(300) ,
entityNormId BIGINT UNSIGNED,
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
   lastaccess DATETIME,
    PRIMARY KEY(definitionId,problemId,definition2Id,problem2Id),

   
  CONSTRAINT wnw_de2de_wnw FOREIGN KEY(entityNormId)
  REFERENCES WeightNorm(entityNormId),
  
    CONSTRAINT d_de2de_d FOREIGN KEY (definition2Id)
    REFERENCES Definition(definitionId) ,
    
    CONSTRAINT p_de2de_p FOREIGN KEY (problem2Id)
    REFERENCES Problem(problemId) 


);


###123456789-TOKEN-10
drop table if exists  Solution2Solution;  
###123456789-TOKEN-11

create table Solution2Solution(
  
  solutionId  BIGINT UNSIGNED NOT NULL,
  solution2Id  BIGINT UNSIGNED NOT NULL,
  problemId  BIGINT UNSIGNED NOT NULL,
  problem2Id  BIGINT UNSIGNED NOT NULL,
  text  Varchar(300) ,
entityNormId BIGINT UNSIGNED,
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
   lastaccess DATETIME,
   PRIMARY KEY(solutionId,problemId,solution2Id,problem2Id),

   
  CONSTRAINT wnw_so2so_wnw FOREIGN KEY(entityNormId)
  REFERENCES WeightNorm(entityNormId),
  
    CONSTRAINT s_so2so_s FOREIGN KEY (solution2Id)
    REFERENCES Solution(solutionId) ,
    
    CONSTRAINT p_so2so_p FOREIGN KEY (problem2Id)
    REFERENCES Problem(problemId) 


);

###123456789-TOKEN-0
drop table if exists  Subject;
###123456789-TOKEN-1
create table Subject(
  subjectId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
   applicationId  BIGINT UNSIGNED,
   text  Varchar(20),
   entityNormId BIGINT UNSIGNED ,   
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
lastaccess Datetime,
CONSTRAINT WeightNorm_Subject_WeightNorm FOREIGN KEY (entityNormId)
    REFERENCES WeightNorm(entityNormId) ON DELETE CASCADE


);

###123456789-TOKEN-0
drop table if exists  Observer;
###123456789-TOKEN-1
create table Observer(
  observerId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  subjectId BIGINT UNSIGNED NOT NULL,
   text  Varchar(20),
   entityNormId BIGINT UNSIGNED ,   
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
lastaccess Datetime,
CONSTRAINT WeightNorm_Observer_WeightNorm FOREIGN KEY (entityNormId)
    REFERENCES WeightNorm(entityNormId) ON DELETE CASCADE,
CONSTRAINT o_s_o FOREIGN KEY (subjectId)
    REFERENCES Subject(subjectId) 

);
###123456789-TOKEN-0
drop table if exists  Command;
###123456789-TOKEN-1
create table Command(
  commandId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  observerId BIGINT UNSIGNED NOT NULL,
   text  Varchar(20),
   entityNormId BIGINT UNSIGNED ,   
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
lastaccess Datetime,
CONSTRAINT WeightNorm_Command_WeightNorm FOREIGN KEY (entityNormId)
    REFERENCES WeightNorm(entityNormId) ON DELETE CASCADE,
CONSTRAINT c_o_c FOREIGN KEY (observerId)
    REFERENCES Observer(observerId) 

);

###123456789-TOKEN-0
drop table if exists  Action;
###123456789-TOKEN-1
create table Action(
  actionId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  commandId BIGINT UNSIGNED NOT NULL,
   text  Varchar(20),
   entityNormId BIGINT UNSIGNED ,   
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
lastaccess Datetime,
CONSTRAINT WeightNorm_Action_WeightNorm FOREIGN KEY (entityNormId)
    REFERENCES WeightNorm(entityNormId) ON DELETE CASCADE,
CONSTRAINT a_c_a FOREIGN KEY (commandId)
    REFERENCES Command(commandId) 

);


##123456789-TOKEN-10
drop table if exists  SubjectProblem;  
##123456789-TOKEN-11

create table SubjectProblem(
  
  subjectId BIGINT UNSIGNED NOT NULL,
  problemId  BIGINT UNSIGNED NOT NULL,
   text  Varchar(300) ,
entityNormId BIGINT UNSIGNED,
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
   lastaccess DATETIME,
    PRIMARY KEY(subjectId,problemId),

   
  CONSTRAINT wnw_sp_wnw FOREIGN KEY(entityNormId)
  REFERENCES WeightNorm(entityNormId),
  
    CONSTRAINT p_sp_p FOREIGN KEY (problemId)
    REFERENCES Problem(problemId) ON DELETE CASCADE


);

##123456789-TOKEN-10
drop table if exists  ObserverProblem;  
##123456789-TOKEN-11

create table ObserverProblem(
  
  observerId BIGINT UNSIGNED NOT NULL,
  problemId  BIGINT UNSIGNED NOT NULL,
   text  Varchar(300) ,
entityNormId BIGINT UNSIGNED,
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
   lastaccess DATETIME,
   PRIMARY KEY(observerId,problemId),

   
  CONSTRAINT wnw_op_wnw FOREIGN KEY(entityNormId)
  REFERENCES WeightNorm(entityNormId),
  
    CONSTRAINT p_op_p FOREIGN KEY (problemId)
    REFERENCES Problem(problemId) ON DELETE CASCADE


);
##123456789-TOKEN-10
drop table if exists  CommandProblem;  
##123456789-TOKEN-11

create table CommandProblem(
  
  commandId BIGINT UNSIGNED NOT NULL,
  problemId  BIGINT UNSIGNED NOT NULL,
   text  Varchar(300) ,
entityNormId BIGINT UNSIGNED,
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
   lastaccess DATETIME,
   PRIMARY KEY(commandId,problemId),

   
  CONSTRAINT wnw_cp_wnw FOREIGN KEY(entityNormId)
  REFERENCES WeightNorm(entityNormId),
  
    CONSTRAINT p_cp_p FOREIGN KEY (problemId)
    REFERENCES Problem(problemId) ON DELETE CASCADE


);

##123456789-TOKEN-10
drop table if exists  ActionProblem;  
##123456789-TOKEN-11

create table ActionProblem(
  
  actionId BIGINT UNSIGNED NOT NULL,
  problemId  BIGINT UNSIGNED NOT NULL,
   text  Varchar(300) ,
entityNormId BIGINT UNSIGNED,
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
   lastaccess DATETIME,
   PRIMARY KEY(actionId,problemId),

   
  CONSTRAINT wnw_ap_wnw FOREIGN KEY(entityNormId)
  REFERENCES WeightNorm(entityNormId),
  
    CONSTRAINT p_act_p FOREIGN KEY (problemId)
    REFERENCES Problem(problemId) ON DELETE CASCADE


);



##123456789-TOKEN-10
drop table if exists  SubjectProblem2SubjectProblem;  
##123456789-TOKEN-11

create table SubjectProblem2SubjectProblem(
  
  subjectId BIGINT UNSIGNED NOT NULL,
  problemId  BIGINT UNSIGNED NOT NULL,
   subject2Id BIGINT UNSIGNED NOT NULL,
  problem2Id  BIGINT UNSIGNED NOT NULL,
   text  Varchar(300) ,
entityNormId BIGINT UNSIGNED,
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
   lastaccess DATETIME,
   PRIMARY KEY(subjectId,problemId,subject2Id,problem2Id),

   
  CONSTRAINT wnw_s2p2_wnw FOREIGN KEY(entityNormId)
  REFERENCES WeightNorm(entityNormId),
  
    CONSTRAINT sp_sp2sp_sp FOREIGN KEY (subject2Id,problem2Id)
    REFERENCES SubjectProblem(subjectId,problemId) 


);

##123456789-TOKEN-10
drop table if exists  ObserverProblem2ObserverProblem;  
##123456789-TOKEN-11

create table ObserverProblem2ObserverProblem(
  
  observerId BIGINT UNSIGNED NOT NULL,
  problemId  BIGINT UNSIGNED NOT NULL,
   observer2Id BIGINT UNSIGNED NOT NULL,
  problem2Id  BIGINT UNSIGNED NOT NULL,
   text  Varchar(300) ,
entityNormId BIGINT UNSIGNED,
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
   lastaccess DATETIME,
    PRIMARY KEY(observerId,problemId,observer2Id,problem2Id),

   
  CONSTRAINT wnw_op2op_wnw FOREIGN KEY(entityNormId)
  REFERENCES WeightNorm(entityNormId),
  
    CONSTRAINT op_op2op_op FOREIGN KEY (observer2Id,problem2Id)
    REFERENCES ObserverProblem(observerId,problemId) 


);



##123456789-TOKEN-10
drop table if exists  CommandProblem2CommandProblem;  
##123456789-TOKEN-11

create table CommandProblem2CommandProblem(
  
  commandId BIGINT UNSIGNED NOT NULL,
  problemId  BIGINT UNSIGNED NOT NULL,
   command2Id BIGINT UNSIGNED NOT NULL,
  problem2Id  BIGINT UNSIGNED NOT NULL,
   text  Varchar(300) ,
entityNormId BIGINT UNSIGNED,
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
   lastaccess DATETIME,
   PRIMARY KEY(commandId,problemId,command2Id,problem2Id),

   
  CONSTRAINT wnw_cp2cp_wnw FOREIGN KEY(entityNormId)
  REFERENCES WeightNorm(entityNormId),
  
    CONSTRAINT c_cp2cp_c FOREIGN KEY (command2Id,problem2Id)
    REFERENCES CommandProblem(commandId,problemId) 


);



##123456789-TOKEN-10
drop table if exists  ActionProblem2ActionProblem;  
##123456789-TOKEN-11

create table ActionProblem2ActionProblem(
  
  actionId BIGINT UNSIGNED NOT NULL,
  problemId  BIGINT UNSIGNED NOT NULL,
   action2Id BIGINT UNSIGNED NOT NULL,
  problem2Id  BIGINT UNSIGNED NOT NULL,
   text  Varchar(300) ,
entityNormId BIGINT UNSIGNED,
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
   lastaccess DATETIME,
    PRIMARY KEY(actionId,problemId,action2Id,problem2Id),

   
  CONSTRAINT wnw_ap2ap_wnw FOREIGN KEY(entityNormId)
  REFERENCES WeightNorm(entityNormId),
  
    CONSTRAINT a_ap2ap_a FOREIGN KEY (action2Id,problem2Id)
    REFERENCES ActionProblem(actionId,problemId) 


);



/* for testing purposes */
##123456789-TOKEN-10
drop table if exists  TestProblem;  
##123456789-TOKEN-11

create table TestProblem(
  
  problemId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT ,
   text  Varchar(300) ,
entityNormId BIGINT UNSIGNED,
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
   lastaccess DATETIME,
   PRIMARY KEY(problemId),

   
  CONSTRAINT t_8_t FOREIGN KEY(entityNormId)
  REFERENCES WeightNorm(entityNormId)


);
##123456789-TOKEN-10
drop table if exists  TestProblem2TestProblem;  
##123456789-TOKEN-11

create table TestProblem2TestProblem(
  
  problemId BIGINT UNSIGNED NOT NULL,
  problem2Id BIGINT UNSIGNED NOT NULL,
  text  Varchar(350) ,
entityNormId BIGINT UNSIGNED,
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
   lastaccess DATETIME,
   PRIMARY KEY(problemId,problem2Id),
 
  CONSTRAINT  t_9_t FOREIGN KEY(problem2Id)
  REFERENCES TestProblem(problemId),

   
  CONSTRAINT  t_10_t FOREIGN KEY(entityNormId)
  REFERENCES WeightNorm(entityNormId)


);



