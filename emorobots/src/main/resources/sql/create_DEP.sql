123456789-TOKEN-0
drop table Word;
123456789-TOKEN-1
create table Word(
  wordId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  wordCategoryId UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  text  Varchar2(20),
  language Varchar2(5),
  weightNormId BIGINT UNSIGNED ,
  lastacces DATETIME,
  numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0 

  CONSTRAINT wnw_w_wnw FOREIGN KEY(weighNormId)
  REFERENCES WeightNorm(weightNormId)
  );

123456789-TOKEN-0
drop table WordCategory;
123456789-TOKEN-1
create table WordCategory(
  wordCategoryId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  text  Varchar2(20),
  weightNormId BIGINT UNSIGNED ,
  lastacces DATETIME,
  numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0 

  CONSTRAINT wnw_w_wnw FOREIGN KEY(weighNormid)
  REFERENCES WeightNorm(weightNormId)
  );


123456789-TOKEN-2
drop table Synonim;
123456789-TOKEN-3
create table Synonim(
  synonimId BIGINT UNSIGNED NOT NULL,
  wordId BIGINT UNSIGNED NOT NULL,
   numaccess  BIGINT UNSIGNED,
    lastaccess DATETIME,
CONSTRAINT s_pk_s PRIMARY KEY(sinonimId,wordId)
);
123456789-TOKEN-4
drop table Sentence;
123456789-TOKEN-5

create table Sentence(
  
  sentenceId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  text  Varchar2(100),
   weightNormId BIGINT UNSIGNED NOT NULL,
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
   lastaccess DATETIME,

  CONSTRAINT wsw_w_wsw FOREIGN KEY(weighNormId)
  REFERENCES WeightNorm(weighNormId)
  
);
123456789-TOKEN-6
drop table Subject;
123456789-TOKEN-7

create table Subject(
   subjectId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
   text  Varchar2(250) ,
   className Varchar2(50)
   weightNormId BIGINT UNSIGNED ,
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
   lastaccess Datetime,

  CONSTRAINT wsuw_su_wsuw FOREIGN KEY(weighNormId)
  REFERENCES WeightNorm(weighNormId)

);

123456789-TOKEN-6
drop table Worker;
123456789-TOKEN-7

create table Worker(
   workerId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
   text  Varchar2(250) ,
   className Varchar2(50)
   weightNormId BIGINT UNSIGNED ,
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
   lastaccess Datetime,

  CONSTRAINT wnw_w_wnw FOREIGN KEY(weighNormId)
  REFERENCES WeightNorm(weighNormId)

);

123456789-TOKEN-6
drop table Observer;
123456789-TOKEN-7

create table Observer(
  observerId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
   text  Varchar2(250) ,
   className Varchar2(50)
   weightNormId BIGINT UNSIGNED ,
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
   lastaccess Datetime,

  CONSTRAINT wow_w_wow FOREIGN KEY(weighNormId)
  REFERENCES WeightNorm(weighNormId)

);
123456789-TOKEN-8
drop table Command;
123456789-TOKEN-9

create table Command(
  
  commandId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
   text  Varchar2(250) ,
   classname Varchar2(50),
   weightNormId BIGINT UNSIGNED NOT NULL,
    numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
    lastaccess DATETIME,

  CONSTRAINT wcw_w_wcw FOREIGN KEY(weighNormId)
  REFERENCES WeightNorm(weighNormId)

);
123456789-TOKEN-10
drop table Action;
123456789-TOKEN-11

create table Action(
  
  actionId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
   text  Varchar2(250) ,
   weightNormId BIGINT UNSIGNED NOT NULL,
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
   lastaccess DATETIME,

  CONSTRAINT wnw_a_wnw FOREIGN KEY(weighNormId)
  REFERENCES WeightNorm(weighNormId)


);

123456789-TOKEN-10
drop table SubjectWorkers;  

123456789-TOKEN-11

create table SubjectWorkers(
  
  subjectId BIGINT UNSIGNED NOT NULL,
  workerId  BIGINT UNSIGNED NOT NULL,
   text  Varchar2(250) ,
   weightNormId BIGINT UNSIGNED NOT NULL,
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0
   lastaccess DATETIME,
   CONSTRAINT sw_pk_sw PRIMARY KEY(subjectId,workerId),

   
  CONSTRAINT wnw_sw_wnw FOREIGN KEY(weighNormId)
  REFERENCES WeightNorm(weighNormId)


);


123456789-TOKEN-10
drop table SubjectObservers;  
123456789-TOKEN-11

create table SubjectWorkers(
  
  subjectId BIGINT UNSIGNED NOT NULL,
  observerId  BIGINT UNSIGNED NOT NULL,
   text  Varchar2(250) ,
   weightNormId BIGINT UNSIGNED NOT NULL,
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0
   lastaccess DATETIME,
   CONSTRAINT sw_pk_sw PRIMARY KEY(subjectId,observerId),

   
  CONSTRAINT wnw_sw_wnw FOREIGN KEY(weighNormId)
  REFERENCES WeightNorm(weighNormId)


);

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
  lastAccess DATETIME NOT 

);




123456789-TOKEN-14
drop index idx_verb_text;
123456789-TOKEN-15

CREATE INDEX idx_verb_text
ON Verb (text);
123456789-TOKEN-15
drop index idx_compl_text;
123456789-TOKEN-16

CREATE INDEX idx_compl_text
ON Complemment(text);

123456789-TOKEN-17
drop index idx_verbAvg_text;
123456789-TOKEN-18

CREATE INDEX idx_verbAvg_text
ON VerbAVG (text);

123456789-TOKEN-19
drop index idx_complAvg_text;
123456789-TOKEN-20

CREATE UNIQUE INDEX idx_complAvg_text
ON ComplemmentAVG(text);

123456789-TOKEN-21
drop index idx_sentenAvg_text;
123456789-TOKEN-22

CREATE UNIQUE INDEX idx_sentenAvg_text
ON SentenceAVG(text);
