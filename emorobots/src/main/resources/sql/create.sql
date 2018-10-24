#123456789-TOKEN-0
drop table Verb;
#123456789-TOKEN-1
create table Verb(
  verbId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
   text  Varchar(20),
   weightId BIGINT UNSIGNED ,
   complemmentId BIGINT UNSIGNED, 
   sentenceId BIGINT UNSIGNED,
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0 , 
CONSTRAINT Complemment_Verb_Complemment FOREIGN KEY (complemmentId),
    REFERENCES Complemment(complementId) ,


CONSTRAINT Weight_Verb_Weight FOREIGN KEY (weightId)
    REFERENCES Weight(weightId) ON DELETE CASCADE,

CONSTRAINT S_Verb_S FOREIGN KEY (sentenceId)
    REFERENCES Sentence(sentenceId) ,


);



123456789-TOKEN-10
drop table SubjectSentences;  
123456789-TOKEN-11

create table SubjectSentences(
  
  subjectId BIGINT UNSIGNED NOT NULL,
  sentenceId  BIGINT UNSIGNED NOT NULL,
   text  Varchar2(300) ,
   weightNormId BIGINT UNSIGNED NOT NULL,
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0
   lastaccess DATETIME,
   CONSTRAINT ss_pk_ss PRIMARY KEY(subjectId,sentencesId),

   
  CONSTRAINT wnw_ss_wnw FOREIGN KEY(weighNormId)
  REFERENCES WeightNorm(weighNormId)


);
123456789-TOKEN-10
drop table SubjectSentences2SubjectSentences;  
123456789-TOKEN-11

create table SubjectSentences2SubjectSentences(
  
  subjectId BIGINT UNSIGNED NOT NULL,
  sentenceId  BIGINT UNSIGNED NOT NULL,
  subject2Id BIGINT UNSIGNED NOT NULL,
  sentence2d BIGINT UNSIGNED NOT NULL,
  text  Varchar2(350) ,
   weightNormId BIGINT UNSIGNED NOT NULL,
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0
   lastaccess DATETIME,
   CONSTRAINT s2s_pk_s2s PRIMARY KEY(subjectId,sentencesId),
 
  CONSTRAINT wnw_s2s_wnw FOREIGN KEY((subject2Id,sentences2Id))
  REFERENCES SubjectSentences(subjectId,sentencesId),

   
  CONSTRAINT wnw_s2s_wnw FOREIGN KEY(weighNormId)
  REFERENCES WeightNorm(weighNormId)


);

123456789-TOKEN-10
drop table ObserverSentences;  
123456789-TOKEN-11

create table ObserverSentences(
  
  observerId BIGINT UNSIGNED NOT NULL,
  sentenceId  BIGINT UNSIGNED NOT NULL,
   text  Varchar2(300) ,
   weightNormId BIGINT UNSIGNED NOT NULL,
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0
   lastaccess DATETIME,
   CONSTRAINT ss_pk_ss PRIMARY KEY(observerId,sentencesId),

   
  CONSTRAINT wnw_ss_wnw FOREIGN KEY(weighNormId)
  REFERENCES WeightNorm(weighNormId)


);
123456789-TOKEN-10
drop table ObserverSentences2ObserverSentences;  
123456789-TOKEN-11

create table ObserverSentences2ObserverSentences(
  
  observerId BIGINT UNSIGNED NOT NULL,
  sentenceId  BIGINT UNSIGNED NOT NULL,
  observer2Id BIGINT UNSIGNED NOT NULL,
  sentence2d BIGINT UNSIGNED NOT NULL,
  text  Varchar2(350) ,
   weightNormId BIGINT UNSIGNED NOT NULL,
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0
   lastaccess DATETIME,
   CONSTRAINT s2s_pk_s2s PRIMARY KEY(observerId,sentencesId),
 
  CONSTRAINT c_s2s_c FOREIGN KEY((observer2Id,sentences2Id))
  REFERENCES ObserverSentences(observerId,sentencesId),

   
  CONSTRAINT wnw_s2s_wnw FOREIGN KEY(weighNormId)
  REFERENCES WeightNorm(weighNormId)


);
123456789-TOKEN-10
drop table CommandSentences;  
123456789-TOKEN-11

create table CommandSentences(
  
  commadId BIGINT UNSIGNED NOT NULL,
  sentenceId  BIGINT UNSIGNED NOT NULL,
   text  Varchar2(300) ,
   weightNormId BIGINT UNSIGNED NOT NULL,
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0
   lastaccess DATETIME,
   CONSTRAINT ss_pk_ss PRIMARY KEY(commadId,sentencesId),

   
  CONSTRAINT wnw_ss_wnw FOREIGN KEY(weighNormId)
  REFERENCES WeightNorm(weighNormId)


);
123456789-TOKEN-10
drop table CommandSentences2CommandSentences;  
123456789-TOKEN-11

create table CommandSentences2CommandSentences(
  
  commadId BIGINT UNSIGNED NOT NULL,
  sentenceId  BIGINT UNSIGNED NOT NULL,
  commad2Id BIGINT UNSIGNED NOT NULL,
  sentence2d BIGINT UNSIGNED NOT NULL,
  text  Varchar2(350) ,
   weightNormId BIGINT UNSIGNED NOT NULL,
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0
   lastaccess DATETIME,
   CONSTRAINT s2s_pk_s2s PRIMARY KEY(commadId,sentencesId),
 
  CONSTRAINT c2_s2s_c2 FOREIGN KEY((commad2Id,sentences2Id))
  REFERENCES CommandSentences(commadId,sentencesId),

   
  CONSTRAINT c_5_c FOREIGN KEY(weighNormId)
  REFERENCES WeightNorm(weighNormId)


);

123456789-TOKEN-10
drop table ActionSentences;  
123456789-TOKEN-11

create table ActionSentences(
  
  commadId BIGINT UNSIGNED NOT NULL,
  sentenceId  BIGINT UNSIGNED NOT NULL,
   text  Varchar2(300) ,
   weightNormId BIGINT UNSIGNED NOT NULL,
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0
   lastaccess DATETIME,
   CONSTRAINT as_pk_as PRIMARY KEY(commadId,sentencesId),

   
  CONSTRAINT wnw_as_wnw FOREIGN KEY(weighNormId)
  REFERENCES WeightNorm(weighNormId)


);
123456789-TOKEN-10
drop table ActionSentences2ActionSentences;  
123456789-TOKEN-11

create table ActionSentences2ActionSentences(
  
  commadId BIGINT UNSIGNED NOT NULL,
  sentenceId  BIGINT UNSIGNED NOT NULL,
  commad2Id BIGINT UNSIGNED NOT NULL,
  sentence2d BIGINT UNSIGNED NOT NULL,
  text  Varchar2(350) ,
   weightNormId BIGINT UNSIGNED NOT NULL,
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0
   lastaccess DATETIME,
   CONSTRAINT c2_5_c2 PRIMARY KEY(commadId,sentencesId),
 
  CONSTRAINT c_6_c FOREIGN KEY((commad2Id,sentences2Id))
  REFERENCES ActionSentences(commadId,sentencesId),

   
  CONSTRAINT c2_7_c2 FOREIGN KEY(weighNormId)
  REFERENCES WeightNorm(weighNormId)


);

/* for testing purposes */
123456789-TOKEN-10
drop table TestSentences;  
123456789-TOKEN-11

create table TestSentences(
  
  commadId BIGINT UNSIGNED NOT NULL,
  sentenceId  BIGINT UNSIGNED NOT NULL,
   text  Varchar2(300) ,
   weightNormId BIGINT UNSIGNED NOT NULL,
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0
   lastaccess DATETIME,
   CONSTRAINT ss_pk_ss PRIMARY KEY(commadId,sentencesId),

   
  CONSTRAINT t_8_t FOREIGN KEY(weighNormId)
  REFERENCES WeightNorm(weighNormId)


);
123456789-TOKEN-10
drop table TestSentences2TestSentences;  
123456789-TOKEN-11

create table TestSentences2TestSentences(
  
  commadId BIGINT UNSIGNED NOT NULL,
  sentenceId  BIGINT UNSIGNED NOT NULL,
  commad2Id BIGINT UNSIGNED NOT NULL,
  sentence2d BIGINT UNSIGNED NOT NULL,
  text  Varchar2(350) ,
   weightNormId BIGINT UNSIGNED NOT NULL,
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0
   lastaccess DATETIME,
   CONSTRAINT s2s_pk_s2s PRIMARY KEY(commadId,sentencesId),
 
  CONSTRAINT t_9_t FOREIGN KEY((commad2Id,sentences2Id))
  REFERENCES TestSentences(commadId,sentencesId),

   
  CONSTRAINT t_10_t FOREIGN KEY(weighNormId)
  REFERENCES WeightNormTest(weighNormId)


);



