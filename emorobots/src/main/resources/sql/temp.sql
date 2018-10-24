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

   
  CONSTRAINT wnw_ss_wnw FOREIGN KEY(weighNormId)
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
 
  CONSTRAINT wnw_s2s_wnw FOREIGN KEY((commad2Id,sentences2Id))
  REFERENCES TestSentences(commadId,sentencesId),

   
  CONSTRAINT wnw_s2s_wnw FOREIGN KEY(weighNormId)
  REFERENCES WeightNormTest(weighNormId)


);


