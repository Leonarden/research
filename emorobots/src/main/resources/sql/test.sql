

 ###123456789-TOKEN-0
drop table if exists  Synonym;
###123456789-TOKEN-1
create table Synonym(
  synonymId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
   text  Varchar(35),
   entityName Varchar(30) NOT NULL DEFAULT 'Synonym',
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
    frequency BIGINT USIGNED NOT NULL DEFAULT 0,
    nextsynId BIGINT UNSIGNED,
 candidateId BIGINT NOT NULL default 0,
 candidateNormId BIGINT NOT NULL default 0,
CONSTRAINT WeightNorm_Synonym_WeightNorm FOREIGN KEY (synonymId,entityName)
    REFERENCES WeightNorm(entityNormId,entityName) ON DELETE CASCADE

    

);
