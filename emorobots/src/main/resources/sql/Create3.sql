123456789-TOKEN-6
drop table VerbObsObsAVG;
123456789-TOKEN-7

create table VerbObsObsAVG(
  verbObsObsAVGId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
   text  Varchar(20) UNIQUE,
   weightAVGId BIGINT UNSIGNED ,
   complemmentObsObsAVGId BIGINT UNSIGNED, 
   sentenceObsObsAVGId BIGINT UNSIGNED,
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0  

CONSTRAINT Complemment_Verb_Complemment FOREIGN KEY (complemmentObsObsAVGId)
    REFERENCES ComplemmentObsObsAVG(complementObsAVGId) 


CONSTRAINT weightAVG_Verb_weightAVG FOREIGN KEY (weightAVGId)
    REFERENCES WeightAVG(weightAVGId) ON DELETE CASCADE

CONSTRAINT S_Verb_S FOREIGN KEY (sentenceId)
    REFERENCES Sentence(sentenceId) 


);

123456789-TOKEN-8
drop table ComplemmentObsObsAVG;
123456789-TOKEN-9

create table ComplemmentObsObsAVG(
  
  complemmentId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  verbId BIGINT UNSIGNED,
   text  Varchar(40) UNIQUE,
   weightAVGId BIGINT UNSIGNED NOT NULL,
   sentenceId BIGINT UNSIGNED, 
    numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0
    lastaccess DATETIME NOT NULL
CONSTRAINT V_C_V FOREIGN KEY (verbId)
    REFERENCES Verb(verbId) ON DELETE CASCADE


CONSTRAINT weightAVG_Complemment_weightAVG FOREIGN KEY (weightAVGId)
    REFERENCES weightAVG(weightAVGId) ON DELETE CASCADE

);
123456789-TOKEN-10
drop table SentenceObsObsAVG;
123456789-TOKEN-11

create table SentenceObsObsAVG(
  
  sentenceObsObsAVGId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  verbObsAVGId BIGINT UNSIGNED,
  complemmentObsObsAVGId BIGINT UNSIGNED,
   text  Varchar(40) UNIQUE,
   weightAVGId BIGINT UNSIGNED NOT NULL,
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0
   lastaccess DATETIME NOT NULL

CONSTRAINT Va_Sa_Va FOREIGN KEY (sentenceObsObsAVGId,verbObsAVGId)
    REFERENCES VerbObsObsAVG(sentenceObsObsAVGId,verbObsAVGId) 

CONSTRAINT Ca_Sa_Ca FOREIGN KEY (sentenceObsObsAVGId,complemmentObsObsAVGId)
    REFERENCES ComplemmentObsObsAVG(sentenceObsObsAVGId,complementObsAVGId) 


CONSTRAINT weightAVG_Complemment_WeightAVG FOREIGN KEY (weightAVGId)
    REFERENCES WeightAVG(weightAVGId) ON DELETE CASCADE



);
123456789-TOKEN-12
drop table WeightAVG;
123456789-TOKEN-13

create table WeightAVG(
  
  weightAVGId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  fear FLOAT NOT NULL DEFAULT 0,
  happy FLOAT NOT NULL DEFAULT 0,
  anger FLOAT NOT NULL DEFAULT 0,
  sad FLOAT NOT NULL DEFAULT 0,
  peace FLOAT NOT NULL DEFAULT 0
  love  FLOAT NOT NULL DEFAULT 0,
  lastAccess DATETIME NOT NULL

);


123456789-TOKEN-17
drop index idx_verbObsObsAvg_text;
123456789-TOKEN-18

CREATE INDEX idx_verbObsObsAvg_text
ON VerbObsObsAVG (text);

123456789-TOKEN-19
drop index idx_complObsObsAvg_text;
123456789-TOKEN-20

CREATE UNIQUE INDEX idx_complAvg_text
ON ComplemmentObsObsAVG(text);

123456789-TOKEN-21
drop index idx_sentenAvg_text;
123456789-TOKEN-22

CREATE UNIQUE INDEX idx_sentenAvg_text
ON SentenceObsObsAVG(text);