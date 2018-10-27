
##123456789-TOKEN-12
drop table if exists  Threshold;
##123456789-TOKEN-13

create table Threshold(
  thresholdId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
  entityId BIGINT UNSIGNED NOT NULL,   
  entityName Varchar(30) NOT NULL,
  fear FLOAT NOT NULL DEFAULT 0,
  happy FLOAT NOT NULL DEFAULT 0,
  anger FLOAT NOT NULL DEFAULT 0,
  sad FLOAT NOT NULL DEFAULT 0,
  peace FLOAT NOT NULL DEFAULT 0,
  love  FLOAT NOT NULL DEFAULT 0,
 numaccess BIGINT UNSIGNED NOT NULL default 0,
  lastAccess DATETIME NOT NULL,
 PRIMARY KEY(thresholdId,entityId,entityName)

 );
