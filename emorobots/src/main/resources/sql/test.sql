drop table  if exists WeightNorm;

create table WeightNorm (
  
  weightNormId INT  NOT NULL AUTO_INCREMENT ,
  fear FLOAT NOT NULL DEFAULT 0,
  happy FLOAT NOT NULL DEFAULT 0,
  anger FLOAT NOT NULL DEFAULT 0,
  sad FLOAT NOT NULL DEFAULT 0,
  peace FLOAT NOT NULL DEFAULT 0,
  love  FLOAT NOT NULL DEFAULT 0,
   numaccess  INT  NOT NULL DEFAULT 0,
   lastaccess DATETIME,
  
 PRIMARY KEY(weightNormId)

);


drop table  if exists TestProblem;  


create table TestProblem (
  
  problemId INT  NOT NULL  AUTO_INCREMENT,
   text  Varchar(300) ,
weightNormId INT NOT NULL ,
   numaccess  INT  NOT NULL DEFAULT 0,
   lastaccess DATETIME,
   PRIMARY KEY(problemId),

   
  CONSTRAINT t_8_t FOREIGN KEY(weighNormId)
  REFERENCES WeightNorm(weighNormId)


);

drop table  if exists TestProblem2TestProblem;
create table TestProblem2TestProblem (
  
  problemId INT  NOT NULL,
  problem2Id INT  NOT NULL,
  text  Varchar(300) ,
weightNormId INT NOT NULL,
   numaccess  INT  NOT NULL DEFAULT 0,
   lastaccess DATETIME,
    PRIMARY KEY(problemId,problem2Id),
 
  CONSTRAINT t_9_t FOREIGN KEY(problem2Id)
  REFERENCES TestProblem(problemId),

   
  CONSTRAINT t_10_t FOREIGN KEY(weighNormId)
  REFERENCES WeightNorm(weighNormId)


);

