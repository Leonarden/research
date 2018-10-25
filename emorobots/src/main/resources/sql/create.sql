123456789-TOKEN-12
drop table WeightNorm;
123456789-TOKEN-13

create table WeightNorm(
  
  weightNormId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  fear FLOAT NOT NULL DEFAULT 0,
  happy FLOAT NOT NULL DEFAULT 0,
  anger FLOAT NOT NULL DEFAULT 0,
  sad FLOAT NOT NULL DEFAULT 0,
  peace FLOAT NOT NULL DEFAULT 0
  love  FLOAT NOT NULL DEFAULT 0,
  lastAccess DATETIME NOT NULL

);

#123456789-TOKEN-0
drop table Word;
#123456789-TOKEN-1
create table Word(
  wordId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
   text  Varchar(20),
   weightNomId BIGINT UNSIGNED ,
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0 , 


CONSTRAINT WeightNom_Word_WeightNom FOREIGN KEY (weightNomId)
    REFERENCES WeightNom(weightNomId) ON DELETE CASCADE


);


#123456789-TOKEN-0
drop table Symbol;
#123456789-TOKEN-1
create table Symbol(
  symbolId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
   text  Varchar(20),
   weightNomId BIGINT UNSIGNED ,
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0 , 
lastaccess Datetime,

CONSTRAINT WeightNom_Symbol_WeightNom FOREIGN KEY (weightNomId)
    REFERENCES WeightNom(weightNomId) ON DELETE CASCADE



);


#123456789-TOKEN-0
drop table Sentence;
#123456789-TOKEN-1
create table Sentence(
  sentenceId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
   text  Varchar(20),
   weightNomId BIGINT UNSIGNED ,   
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0 , 
lastaccess Datetime,
CONSTRAINT WeightNom_Sentence_WeightNom FOREIGN KEY (weightNomId)
    REFERENCES WeightNom(weightNomId) ON DELETE CASCADE,


);

#123456789-TOKEN-0
drop table Sentence2Sentence;
#123456789-TOKEN-1
create table Sentence2Sentence(
  sentenceId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  sentence2Id BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
   text  Varchar(20),
   weightNomId BIGINT UNSIGNED ,   
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0 , 
lastaccess Datetime,
CONSTRAINT WeightNom_Sentence2Sentence_WeightNom FOREIGN KEY (weightNomId)
    REFERENCES WeightNom(weightNomId) ON DELETE CASCADE,

CONSTRAINT s_Sentence2Sentence_s FOREIGN KEY (sentence2Id)
    REFERENCES Sentence(sentenceId) ON DELETE CASCADE

);


#123456789-TOKEN-0
drop table Problem;
#123456789-TOKEN-1
create table Problem(
  problemId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
   text  Varchar(20),
   weightNomId BIGINT UNSIGNED ,   
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0 , 
lastaccess Datetime,
CONSTRAINT WeightNom_Problem_WeightNom FOREIGN KEY (weightNomId)
    REFERENCES WeightNom(weightNomId) ON DELETE CASCADE,


);


#123456789-TOKEN-0
drop table Definition;
#123456789-TOKEN-1
create table Definition(
  definitionId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
   problemId BIGINT UNSIGNED NOT NULL, 
  text  Varchar(20),
   weightNomId BIGINT UNSIGNED ,   
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0 , 
lastaccess Datetime,
CONSTRAINT WeightNom_Definition_WeightNom FOREIGN KEY (weightNomId)
    REFERENCES WeightNom(weightNomId) ON DELETE CASCADE,
 CONSTRAINT de_p_de FOREIGN KEY (problemId)
    REFERENCES Problem(problemId) ON DELETE CASCADE


);

#123456789-TOKEN-0
drop table Solution;
#123456789-TOKEN-1
create table Solution(
  solutionId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
   problemId BIGINT UNSIGNED NOT NULL, 
  text  Varchar(20),
   weightNomId BIGINT UNSIGNED ,   
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0 , 
lastaccess Datetime,
CONSTRAINT WeightNom_Solution_WeightNom FOREIGN KEY (weightNomId)
    REFERENCES WeightNom(weightNomId) ON DELETE CASCADE,

    CONSTRAINT p_s_p FOREIGN KEY (problemId)
    REFERENCES Problem(problemId) 

);


#123456789-TOKEN-10
drop table Problem2Problem;  
#123456789-TOKEN-11

create table Problem2Problem(
  
  problemId  BIGINT UNSIGNED NOT NULL,
  problem2Id  BIGINT UNSIGNED NOT NULL,
   text  Varchar2(300) ,
weightNormId BIGINT UNSIGNED,
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0
   lastaccess DATETIME,
   CONSTRAINT p2p_pk_p2p PRIMARY KEY(problemId,problem2Id),

   
  CONSTRAINT wnw_p2p_wnw FOREIGN KEY(weighNormId)
  REFERENCES WeightNorm(weighNormId),
  
    CONSTRAINT p_p2p_p FOREIGN KEY (problem2Id)
    REFERENCES Problem(problem2Id) 


);


#123456789-TOKEN-10
drop table Definition2Definition;  
#123456789-TOKEN-11

create table Definition2Definition(
  
  definitionId  BIGINT UNSIGNED NOT NULL,
  definition2Id  BIGINT UNSIGNED NOT NULL,
  problemId  BIGINT UNSIGNED NOT NULL,
  problem2Id  BIGINT UNSIGNED NOT NULL,
 
  text  Varchar2(300) ,
weightNormId BIGINT UNSIGNED,
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0
   lastaccess DATETIME,
   CONSTRAINT d2d_pk_d2d PRIMARY KEY(definitionId,problemId,definition2Id,problem2Id),

   
  CONSTRAINT wnw_de2de_wnw FOREIGN KEY(weighNormId)
  REFERENCES WeightNorm(weighNormId),
  
    CONSTRAINT d_de2de_d FOREIGN KEY (definition2Id)
    REFERENCES Definition(definitionId) ,
    
    CONSTRAINT p_de2de_p FOREIGN KEY (problem2Id)
    REFERENCES Problem(problemId) 


);


#123456789-TOKEN-10
drop table Solution2Solution;  
#123456789-TOKEN-11

create table Solution2Solution(
  
  solutionId  BIGINT UNSIGNED NOT NULL,
  solution2Id  BIGINT UNSIGNED NOT NULL,
  problemId  BIGINT UNSIGNED NOT NULL,
  problem2Id  BIGINT UNSIGNED NOT NULL,
 
  text  Varchar2(300) ,
weightNormId BIGINT UNSIGNED,
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0
   lastaccess DATETIME,
   CONSTRAINT d2d_pk_d2d PRIMARY KEY(solutionId,problemId,solution2Id,problem2Id),

   
  CONSTRAINT wnw_de2de_wnw FOREIGN KEY(weighNormId)
  REFERENCES WeightNorm(weighNormId),
  
    CONSTRAINT s_so2so_s FOREIGN KEY (solution2Id)
    REFERENCES Solution(solutionId) ,
    
    CONSTRAINT p_so2so_p FOREIGN KEY (problem2Id)
    REFERENCES Problem(problemId) 


);

#123456789-TOKEN-0
drop table Subject;
#123456789-TOKEN-1
create table Subject(
  subjectId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
   applicationId  BIGINT UNSIGNED,
   text  Varchar(20),
   weightNomId BIGINT UNSIGNED ,   
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0 , 
lastaccess Datetime,
CONSTRAINT WeightNom_Subject_WeightNom FOREIGN KEY (weightNomId)
    REFERENCES WeightNom(weightNomId) ON DELETE CASCADE,


);

#123456789-TOKEN-0
drop table Observer;
#123456789-TOKEN-1
create table Observer(
  observerId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  subjectId BIGINT UNSIGNED NOT NULL,
   text  Varchar(20),
   weightNomId BIGINT UNSIGNED ,   
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0 , 
lastaccess Datetime,
CONSTRAINT WeightNom_Observer_WeightNom FOREIGN KEY (weightNomId)
    REFERENCES WeightNom(weightNomId) ON DELETE CASCADE
CONSTRAINT o_s_o FOREIGN KEY (subjectId)
    REFERENCES Problem(subjectId) 

);
#123456789-TOKEN-0
drop table Command;
#123456789-TOKEN-1
create table Command(
  commandId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  observerId BIGINT UNSIGNED NOT NULL,
   text  Varchar(20),
   weightNomId BIGINT UNSIGNED ,   
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0 , 
lastaccess Datetime,
CONSTRAINT WeightNom_Command_WeightNom FOREIGN KEY (weightNomId)
    REFERENCES WeightNom(weightNomId) ON DELETE CASCADE
CONSTRAINT c_o_c FOREIGN KEY (observerId)
    REFERENCES Observer(observerId) 

);

#123456789-TOKEN-0
drop table Action;
#123456789-TOKEN-1
create table Action(
  actionId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  commandId BIGINT UNSIGNED NOT NULL,
   text  Varchar(20),
   weightNomId BIGINT UNSIGNED ,   
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0 , 
lastaccess Datetime,
CONSTRAINT WeightNom_Action_WeightNom FOREIGN KEY (weightNomId)
    REFERENCES WeightNom(weightNomId) ON DELETE CASCADE
CONSTRAINT a_c_a FOREIGN KEY (commandId)
    REFERENCES Command(commandId) 

);


123456789-TOKEN-10
drop table SubjectProblem;  
123456789-TOKEN-11

create table SubjectProblem(
  
  subjectId BIGINT UNSIGNED NOT NULL,
  problemId  BIGINT UNSIGNED NOT NULL,
   text  Varchar2(300) ,
weightNormId BIGINT UNSIGNED,
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0
   lastaccess DATETIME,
   CONSTRAINT ss_pk_ss PRIMARY KEY(subjectId,problemId),

   
  CONSTRAINT wnw_sp_wnw FOREIGN KEY(weighNormId)
  REFERENCES WeightNorm(weighNormId),
  
    CONSTRAINT p_sp_p FOREIGN KEY (problemId)
    REFERENCES Problem(problemId) ON DELETE CASCADE


);

123456789-TOKEN-10
drop table ObserverProblem;  
123456789-TOKEN-11

create table ObserverProblem(
  
  observerId BIGINT UNSIGNED NOT NULL,
  problemId  BIGINT UNSIGNED NOT NULL,
   text  Varchar2(300) ,
weightNormId BIGINT UNSIGNED,
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0
   lastaccess DATETIME,
   CONSTRAINT ss_pk_ss PRIMARY KEY(observerId,problemId),

   
  CONSTRAINT wnw_sp_wnw FOREIGN KEY(weighNormId)
  REFERENCES WeightNorm(weighNormId),
  
    CONSTRAINT p_sp_p FOREIGN KEY (problemId)
    REFERENCES Problem(problemId) ON DELETE CASCADE


);
123456789-TOKEN-10
drop table CommandProblem;  
123456789-TOKEN-11

create table CommandProblem(
  
  commandId BIGINT UNSIGNED NOT NULL,
  problemId  BIGINT UNSIGNED NOT NULL,
   text  Varchar2(300) ,
weightNormId BIGINT UNSIGNED,
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0
   lastaccess DATETIME,
   CONSTRAINT ss_pk_ss PRIMARY KEY(commandId,problemId),

   
  CONSTRAINT wnw_sp_wnw FOREIGN KEY(weighNormId)
  REFERENCES WeightNorm(weighNormId),
  
    CONSTRAINT p_sp_p FOREIGN KEY (problemId)
    REFERENCES Problem(problemId) ON DELETE CASCADE


);

123456789-TOKEN-10
drop table ActionProblem;  
123456789-TOKEN-11

create table ActionProblem(
  
  actionId BIGINT UNSIGNED NOT NULL,
  problemId  BIGINT UNSIGNED NOT NULL,
   text  Varchar2(300) ,
weightNormId BIGINT UNSIGNED,
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0
   lastaccess DATETIME,
   CONSTRAINT ss_pk_ss PRIMARY KEY(actionId,problemId),

   
  CONSTRAINT wnw_sp_wnw FOREIGN KEY(weighNormId)
  REFERENCES WeightNorm(weighNormId),
  
    CONSTRAINT p_act_p FOREIGN KEY (problemId)
    REFERENCES Problem(problemId) ON DELETE CASCADE


);



123456789-TOKEN-10
drop table SubjectProblem2SubjectProblem;  
123456789-TOKEN-11

create table SubjectProblem2SubjectProblem(
  
  subjectId BIGINT UNSIGNED NOT NULL,
  problemId  BIGINT UNSIGNED NOT NULL,
   subject2Id BIGINT UNSIGNED NOT NULL,
  problem2Id  BIGINT UNSIGNED NOT NULL,
   text  Varchar2(300) ,
weightNormId BIGINT UNSIGNED,
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0
   lastaccess DATETIME,
   CONSTRAINT sp_sp2sppk_sp PRIMARY KEY(subjectId,problemId,subject2Id,problem2Id),

   
  CONSTRAINT wnw_sp_wnw FOREIGN KEY(weighNormId)
  REFERENCES WeightNorm(weighNormId),
  
    CONSTRAINT sp_sp2sp_sp FOREIGN KEY (subject2Id,problem2Id)
    REFERENCES SubjectProblem(subjectId,problemId) 


);

123456789-TOKEN-10
drop table ObserverProblem2ObserverProblem;  
123456789-TOKEN-11

create table ObserverProblem2ObserverProblem(
  
  observerId BIGINT UNSIGNED NOT NULL,
  problemId  BIGINT UNSIGNED NOT NULL,
   observer2Id BIGINT UNSIGNED NOT NULL,
  problem2Id  BIGINT UNSIGNED NOT NULL,
   text  Varchar2(300) ,
weightNormId BIGINT UNSIGNED,
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0
   lastaccess DATETIME,
   CONSTRAINT op2_pk_op2 PRIMARY KEY(observerId,problemId,observer2Id,problem2Id),

   
  CONSTRAINT wnw_op2op_wnw FOREIGN KEY(weighNormId)
  REFERENCES WeightNorm(weighNormId),
  
    CONSTRAINT op_op2op_op FOREIGN KEY (observer2Id,problem2Id)
    REFERENCES ObserverProblem(observerId,problemId) 


);



123456789-TOKEN-10
drop table CommandProblem2CommandProblem;  
123456789-TOKEN-11

create table CommandProblem2CommandProblem(
  
  commandId BIGINT UNSIGNED NOT NULL,
  problemId  BIGINT UNSIGNED NOT NULL,
   command2Id BIGINT UNSIGNED NOT NULL,
  problem2Id  BIGINT UNSIGNED NOT NULL,
   text  Varchar2(300) ,
weightNormId BIGINT UNSIGNED,
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0
   lastaccess DATETIME,
   CONSTRAINT cp2_pk_cp2 PRIMARY KEY(commandId,problemId,command2Id,problem2Id),

   
  CONSTRAINT wnw_cp2cp_wnw FOREIGN KEY(weighNormId)
  REFERENCES WeightNorm(weighNormId),
  
    CONSTRAINT c_cp2cp_c FOREIGN KEY (command2Id,problem2Id)
    REFERENCES CommandProblem(commandId,problemId) 


);



123456789-TOKEN-10
drop table ActionProblem2ActionProblem;  
123456789-TOKEN-11

create table ActionProblem2ActionProblem(
  
  actionId BIGINT UNSIGNED NOT NULL,
  problemId  BIGINT UNSIGNED NOT NULL,
   action2Id BIGINT UNSIGNED NOT NULL,
  problem2Id  BIGINT UNSIGNED NOT NULL,
   text  Varchar2(300) ,
weightNormId BIGINT UNSIGNED,
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0
   lastaccess DATETIME,
   CONSTRAINT ap2_pk_ap2 PRIMARY KEY(actionId,problemId,action2Id,problem2Id),

   
  CONSTRAINT wnw_ap2ap_wnw FOREIGN KEY(weighNormId)
  REFERENCES WeightNorm(weighNormId),
  
    CONSTRAINT a_ap2ap_a FOREIGN KEY (action2Id,problem2Id)
    REFERENCES ActionProblem(actionId,problemId) 


);



/* for testing purposes */
123456789-TOKEN-10
drop table TestProblem;  
123456789-TOKEN-11

create table TestProblem(
  
  problemId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT ,
   text  Varchar2(300) ,
weightNormId BIGINT UNSIGNED,
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0
   lastaccess DATETIME,
   CONSTRAINT tp_pk_tp PRIMARY KEY(problemId),

   
  CONSTRAINT t_8_t FOREIGN KEY(weighNormId)
  REFERENCES WeightNorm(weighNormId)


);
123456789-TOKEN-10
drop table TestProblem2TestProblem;  
123456789-TOKEN-11

create table TestProblem2TestProblem(
  
  problemId BIGINT UNSIGNED NOT NULL,
  problem2Id BIGINT UNSIGNED NOT NULL,
  text  Varchar2(350) ,
weightNormId BIGINT UNSIGNED,
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0
   lastaccess DATETIME,
   CONSTRAINT tp2_pk_tp2 PRIMARY KEY(problemId,problem2Id),
 
  CONSTRAINT t_9_t FOREIGN KEY(problem2Id)
  REFERENCES TestProblem(problemId),

   
  CONSTRAINT t_10_t FOREIGN KEY(weighNormId)
  REFERENCES WeightNorm(weighNormId)


);



