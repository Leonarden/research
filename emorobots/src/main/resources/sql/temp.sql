
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



