123456789-TOKEN-0
drop table Verb;
123456789-TOKEN-1
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

123456789-TOKEN-2
drop table Complemment;
123456789-TOKEN-3
create table Complemment(
  
  complemmentId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  verbId BIGINT UNSIGNED,
   text  Varchar(40),
   weightId BIGINT UNSIGNED NOT NULL,
   sentenceId BIGINT UNSIGNED, 
    numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
    lastaccess DATETIME NOT NULL,
CONSTRAINT V_C_V FOREIGN KEY (verbId)
    REFERENCES Verb(verbId) ON DELETE CASCADE,


CONSTRAINT Weight_Complemment_Weight FOREIGN KEY (weightId)
    REFERENCES Weight(weightId) ON DELETE CASCADE

);
123456789-TOKEN-4
drop table Sentence;
123456789-TOKEN-5

create table Sentence(
  
  sentenceId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  verbId BIGINT UNSIGNED,
  complemmentId BIGINT UNSIGNED,
   text  Varchar(40),
   weightId BIGINT UNSIGNED NOT NULL,
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0
   lastaccess DATETIME NOT NULL

CONSTRAINT V_S_V FOREIGN KEY (sentenceId,verbId)
    REFERENCES Verb(sentenceId,verbId) 

CONSTRAINT C_S_C FOREIGN KEY (sentenceId,complemmentId)
    REFERENCES Complemment(sentenceId,complementId) 


CONSTRAINT Weight_Complemment_Weight FOREIGN KEY (weightId)
    REFERENCES Weight(weightId) ON DELETE CASCADE



);
123456789-TOKEN-6
drop table VerbAVG;
123456789-TOKEN-7

create table VerbAVG(
  verbAVGId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
   text  Varchar(20) UNIQUE,
   weightId BIGINT UNSIGNED ,
   complemmentAVGId BIGINT UNSIGNED, 
   sentenceAVGId BIGINT UNSIGNED,
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0  

CONSTRAINT Complemment_Verb_Complemment FOREIGN KEY (complemmentAVGId)
    REFERENCES ComplemmentAVG(complementAVGId) 


CONSTRAINT Weight_Verb_Weight FOREIGN KEY (weightId)
    REFERENCES Weight(weightId) ON DELETE CASCADE

CONSTRAINT S_Verb_S FOREIGN KEY (sentenceId)
    REFERENCES Sentence(sentenceId) 


);
123456789-TOKEN-8
drop table ComplemmentAVG;
123456789-TOKEN-9

create table ComplemmentAVG(
  
  complemmentId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  verbId BIGINT UNSIGNED,
   text  Varchar(40) UNIQUE,
   weightId BIGINT UNSIGNED NOT NULL,
   sentenceId BIGINT UNSIGNED, 
    numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0
    lastaccess DATETIME NOT NULL
CONSTRAINT V_C_V FOREIGN KEY (verbId)
    REFERENCES Verb(verbId) ON DELETE CASCADE


CONSTRAINT Weight_Complemment_Weight FOREIGN KEY (weightId)
    REFERENCES Weight(weightId) ON DELETE CASCADE

);
123456789-TOKEN-10
drop table SentenceAVG;
123456789-TOKEN-11

create table SentenceAVG(
  
  sentenceAVGId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  verbAVGId BIGINT UNSIGNED,
  complemmentAVGId BIGINT UNSIGNED,
   text  Varchar(40) UNIQUE,
   weightId BIGINT UNSIGNED NOT NULL,
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0
   lastaccess DATETIME NOT NULL

CONSTRAINT Va_Sa_Va FOREIGN KEY (sentenceAVGId,verbAVGId)
    REFERENCES VerbAVG(sentenceAVGId,verbAVGId) 

CONSTRAINT Ca_Sa_Ca FOREIGN KEY (sentenceAVGId,complemmentAVGId)
    REFERENCES ComplemmentAVG(sentenceAVGId,complementAVGId) 


CONSTRAINT Weight_Complemment_Weight FOREIGN KEY (weightId)
    REFERENCES Weight(weightId) ON DELETE CASCADE



);
123456789-TOKEN-12
drop table Weight;
123456789-TOKEN-13

create table Weight(
  
  weightId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  fear FLOAT NOT NULL DEFAULT 0,
  happy FLOAT NOT NULL DEFAULT 0,
  anger FLOAT NOT NULL DEFAULT 0,
  sad FLOAT NOT NULL DEFAULT 0,
  peace FLOAT NOT NULL DEFAULT 0
  love  FLOAT NOT NULL DEFAULT 0,
  lastAccess DATETIME NOT NULL

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