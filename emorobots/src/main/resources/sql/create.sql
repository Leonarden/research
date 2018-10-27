drop database if exists emorobots;
create database emorobots;
use emorobots;


##123456789-TOKEN-12
drop table if exists  WeightNorm;
##123456789-TOKEN-13

create table WeightNorm(
  weightNormId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
  entityNormId BIGINT UNSIGNED NOT NULL,
  entityName Varchar(30) NOT NULL,
  fear FLOAT NOT NULL DEFAULT 0,
  happy FLOAT NOT NULL DEFAULT 0,
  anger FLOAT NOT NULL DEFAULT 0,
  sad FLOAT NOT NULL DEFAULT 0,
  peace FLOAT NOT NULL DEFAULT 0,
  love  FLOAT NOT NULL DEFAULT 0,
  lastAccess DATETIME NOT NULL,
 PRIMARY KEY(weightNormId,entityNormId,entityName)

 );

###123456789-TOKEN-0
drop table if exists  Word;
###123456789-TOKEN-1
create table Word(
  wordId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
   text  Varchar(20),
   entityName Varchar(30) NOT NULL DEFAULT 'WORD',
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0


);


###123456789-TOKEN-0
drop table if exists  Symbol;
###123456789-TOKEN-1
create table Symbol(
  symbolId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
   text  Varchar(20),
  entityName Varchar(30) NOT NULL DEFAULT 'SYMBOL',
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
lastaccess Datetime


);


###123456789-TOKEN-0
drop table if exists  Sentence;
###123456789-TOKEN-1
create table Sentence(
  sentenceId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
   text  Varchar(300),
  entityName Varchar(30) NOT NULL DEFAULT 'SENTENCE',   
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
lastaccess Datetime

);

###123456789-TOKEN-0
drop table if exists  Sentence2Sentence;
###123456789-TOKEN-1
create table Sentence2Sentence(
sentence2sentenceId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    
sentenceId BIGINT UNSIGNED NOT NULL ,
  sentence2Id BIGINT UNSIGNED NOT NULL ,
   text  Varchar(20),
  entityName Varchar(30) NOT NULL DEFAULT 'Sentence2Sentence',   
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
lastaccess Datetime,
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
  entityName Varchar(30) NOT NULL DEFAULT 'Problem',   
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
lastaccess Datetime

);


###123456789-TOKEN-0
drop table if exists  Definition;
###123456789-TOKEN-1
create table Definition(
  definitionId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
   problemId BIGINT UNSIGNED NOT NULL, 
  text  Varchar(200),
  entityName Varchar(30) NOT NULL DEFAULT 'Definition',   
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
lastaccess Datetime,
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
  entityName Varchar(30) NOT NULL DEFAULT 'SOLUTION',   
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
lastaccess Datetime,

    CONSTRAINT p_s_p FOREIGN KEY (problemId)
    REFERENCES Problem(problemId) 

);


###123456789-TOKEN-10
drop table if exists  Problem2Problem;  
###123456789-TOKEN-11

create table Problem2Problem(
  problem2problemId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  
  problemId  BIGINT UNSIGNED NOT NULL,
  problem2Id  BIGINT UNSIGNED NOT NULL,
  entityName Varchar(50) default 'problem2problem',
   text  Varchar(300) ,
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
   lastaccess DATETIME,

  
    CONSTRAINT p_p2p_p FOREIGN KEY (problemId)
    REFERENCES Problem(problemId),
      CONSTRAINT p_p22p_p FOREIGN KEY (problem2Id)
    REFERENCES Problem(problemId) 



);


###123456789-TOKEN-10
drop table if exists  Definition2Definition;  
###123456789-TOKEN-11

create table Definition2Definition(
  definition2definitionId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  definitionId  BIGINT UNSIGNED NOT NULL,
  definition2Id  BIGINT UNSIGNED NOT NULL,
 
  text  Varchar(300) ,
entityName Varchar(50) NOT NULL DEFAULT 'definition2definition',
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
   lastaccess DATETIME,
  


    CONSTRAINT d1_de2de_d FOREIGN KEY (definitionId)
    REFERENCES Definition(definitionId) ,
    
    CONSTRAINT d2_de2de_d FOREIGN KEY (definition2Id)
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
  entityName Varchar(50) NOT NULL DEFAULT 'solution2solution',
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
   lastaccess DATETIME,
 
   

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
  entityName Varchar(30) NOT NULL DEFAULT 'subject',   
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
lastaccess Datetime

);

###123456789-TOKEN-0
drop table if exists  Observer;
###123456789-TOKEN-1
create table Observer(
  observerId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  subjectId BIGINT UNSIGNED NOT NULL,
   text  Varchar(20),
  entityName Varchar(50) NOT NULL DEFAULT 'observer',   
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
lastaccess Datetime,

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
  entityName Varchar(30) NOT NULL DEFAULT 'command',   
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
lastaccess Datetime,

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
  entityName Varchar(30) NOT NULL DEFAULT 'action',   
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
lastaccess Datetime,
CONSTRAINT a_c_a FOREIGN KEY (commandId)
    REFERENCES Command(commandId) 

);


##123456789-TOKEN-10
drop table if exists  SubjectProblem;  
##123456789-TOKEN-11

create table SubjectProblem(
  subjectproblemId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  subjectId BIGINT UNSIGNED NOT NULL,
  problemId  BIGINT UNSIGNED NOT NULL,
   text  Varchar(300) ,
entityName Varchar(50) NOT NULL DEFAULT 'subjectproblem',
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
   lastaccess DATETIME,
  
    
    CONSTRAINT p_sp_p FOREIGN KEY (problemId)
    REFERENCES Problem(problemId) ON DELETE CASCADE,
    CONSTRAINT s_sp_s FOREIGN KEY (subjectId)
    REFERENCES Subject(subjectId) ON DELETE CASCADE



);
##123456789-TOKEN-10
drop table if exists  ObserverProblem;  
##123456789-TOKEN-11

create table ObserverProblem(
  observerproblemId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  observerId BIGINT UNSIGNED NOT NULL,
  problemId  BIGINT UNSIGNED NOT NULL,
   text  Varchar(300) ,
entityName Varchar(50) NOT NULL DEFAULT 'Observerproblem',
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
   lastaccess DATETIME,
  
    
    CONSTRAINT p_op_p FOREIGN KEY (problemId)
    REFERENCES Problem(problemId) ON DELETE CASCADE,
    CONSTRAINT s_op_s FOREIGN KEY (ObserverId)
    REFERENCES Observer(ObserverId) ON DELETE CASCADE



);

##123456789-TOKEN-10
drop table if exists  CommandProblem;  
##123456789-TOKEN-11

create table CommandProblem(
  commandproblemId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  commandId BIGINT UNSIGNED NOT NULL,
  problemId  BIGINT UNSIGNED NOT NULL,
   text  Varchar(300) ,
entityName Varchar(50) NOT NULL DEFAULT 'Commandproblem',
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
   lastaccess DATETIME,
  
    
    CONSTRAINT p_comp_p FOREIGN KEY (problemId)
    REFERENCES Problem(problemId) ON DELETE CASCADE,
    CONSTRAINT s_cp_s FOREIGN KEY (CommandId)
    REFERENCES Command(CommandId) ON DELETE CASCADE



);

##123456789-TOKEN-10
drop table if exists  ActionProblem;  
##123456789-TOKEN-11

create table ActionProblem(
  actionproblemId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  actionId BIGINT UNSIGNED NOT NULL,
  problemId  BIGINT UNSIGNED NOT NULL,
   text  Varchar(300) ,
entityName Varchar(50) NOT NULL DEFAULT 'Actionproblem',
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
   lastaccess DATETIME,
  
    
    CONSTRAINT p_act_p FOREIGN KEY (problemId)
    REFERENCES Problem(problemId) ON DELETE CASCADE,
    CONSTRAINT a_act_a FOREIGN KEY (ActionId)
    REFERENCES Action(ActionId) ON DELETE CASCADE



);




##123456789-TOKEN-10
drop table if exists  SubjectProblem2SubjectProblem;  
##123456789-TOKEN-11

create table SubjectProblem2SubjectProblem(
 subjectproblem2subjectproblemId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
 subjectproblemId BIGINT UNSIGNED NOT NULL,
  subjectproblem2Id  BIGINT UNSIGNED NOT NULL,
   text  Varchar(300) ,
entityName Varchar(50) NOT NULL DEFAULT 'SubjectProblem2SubjectProblem',
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
   lastaccess DATETIME,
   

    
    CONSTRAINT sp_sp2sp_sp FOREIGN KEY (subjectproblemId)
    REFERENCES SubjectProblem(subjectproblemId) ON DELETE CASCADE,
    CONSTRAINT sp1_sp2sp_sp1 FOREIGN KEY (subjectproblem2Id)
    REFERENCES SubjectProblem(subjectproblemId) ON DELETE CASCADE
    

);

##123456789-TOKEN-10
drop table if exists  ObserverProblem2ObserverProblem;  
##123456789-TOKEN-11

create table ObserverProblem2ObserverProblem(
 observerproblem2observerproblemId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
 observerproblemId BIGINT UNSIGNED NOT NULL,
  observerproblem2Id  BIGINT UNSIGNED NOT NULL,
   text  Varchar(300) ,
entityName Varchar(50) NOT NULL DEFAULT 'ObserverProblem2ObserverProblem',
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
   lastaccess DATETIME,
   

    CONSTRAINT op_op2op_op FOREIGN KEY (observerproblemId)
    REFERENCES ObserverProblem(observerproblemId) ON DELETE CASCADE,
    CONSTRAINT op1_op2op_op1 FOREIGN KEY (observerproblem2Id)
    REFERENCES ObserverProblem(observerproblemId) ON DELETE CASCADE
    

);



##123456789-TOKEN-10
drop table if exists  CommandProblem2CommandProblem;  
##123456789-TOKEN-11

create table CommandProblem2CommandProblem(
 commandproblem2commandproblemId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
 commandproblemId BIGINT UNSIGNED NOT NULL,
  commandproblem2Id  BIGINT UNSIGNED NOT NULL,
   text  Varchar(300) ,
entityName Varchar(50) NOT NULL DEFAULT 'CommandProblem2CommandProblem',
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
   lastaccess DATETIME,
   
    
    CONSTRAINT cp_cp2cp_cp FOREIGN KEY (commandproblemId)
    REFERENCES CommandProblem(commandproblemId) ON DELETE CASCADE,
    CONSTRAINT cp1_cp2sp_cp1 FOREIGN KEY (commandproblem2Id)
    REFERENCES CommandProblem(commandproblemId) ON DELETE CASCADE
    

);




##123456789-TOKEN-10
drop table if exists  ActionProblem2ActionProblem;  
##123456789-TOKEN-11

create table ActionProblem2ActionProblem(
 actionproblem2actionproblemId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
 actionproblemId BIGINT UNSIGNED NOT NULL,
  actionproblem2Id  BIGINT UNSIGNED NOT NULL,
   text  Varchar(300) ,
entityName Varchar(50) NOT NULL DEFAULT 'ActionProblem2ActionProblem',
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
   lastaccess DATETIME,
   
    
    CONSTRAINT ap_cp2ap_cp FOREIGN KEY (actionproblemId)
    REFERENCES ActionProblem(actionproblemId) ON DELETE CASCADE,
    CONSTRAINT ap1_cp2sp_cp1 FOREIGN KEY (actionproblem2Id)
    REFERENCES ActionProblem(actionproblemId) ON DELETE CASCADE
    

);
