
###123456789-TOKEN-0
drop table if exists  SolutionInterpretation;
###123456789-TOKEN-1
create table Solution(
  
  solutioninterpretationId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
   solutionId BIGINT UNSIGNED NOT NULL, 
  candidateId BIGINT NOT NULL default 0,     
  candidatethreshold FLOAT NOT NULL DEFAULT 0, /* this is a kind of "reverse" */
  content  Varchar(4096),
  entityName Varchar(80) NOT NULL DEFAULT 'SolutionInterpretation',   
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
lastaccess Datetime,

CONSTRAINT WeightNorm_def_WeightNorm FOREIGN KEY (solutioninterpretationId,entityName)
    REFERENCES WeightNorm(entityNormId,entityName), 
 CONSTRAINT dein_de_dein FOREIGN KEY (solutionId)
    REFERENCES Solution(solutionId) ON DELETE CASCADE


);


