
##123456789-TOKEN-12
drop table if exists  Threshold;
##123456789-TOKEN-13

create table Threshold(
  /*weightNormId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,*/
  entityNormId BIGINT UNSIGNED NOT NULL,
  entityName Varchar(30) NOT NULL,
  
  item0Id FLOAT NOT NULL DEFAULT 0, /*fear*/
  item1Id FLOAT NOT NULL DEFAULT 0, /*happy */
  item2Id FLOAT NOT NULL DEFAULT 0, /* anger */
  item3Id FLOAT NOT NULL DEFAULT 0,   /* sad */
  item4Id FLOAT NOT NULL DEFAULT 0,  /* peace */
  item5Id  FLOAT NOT NULL DEFAULT 0,  /* love */
  /* itemiId  FLOAT NOT NULL DEFAULT 0, */
  numaccess BIGINT UNSIGNED NOT NULL default 0,
  lastAccess DATETIME NOT NULL,
 
 candidateId BIGINT NOT NULL DEFAULT 0,
 candidatethreshold FLOAT NOT NULL DEFAULT 0,
  PRIMARY KEY(entityNormId,entityName)

 );

 
##123456789-TOKEN-12
drop table if exists  ThresProbChainItem0;
##123456789-TOKEN-13

create table ThresProbChainItem0(
  probchainItemId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  itemvalue  FLOAT NOT NULL DEFAULT 0,
  anomaly INT NOT NULL 0,
 next BIGINT UNSIGNED,
  
 );

 
##123456789-TOKEN-12
drop table if exists  ThresProbChainItem1;
##123456789-TOKEN-13

create table ThresProbChainItem1(
  probchainItemId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  itemvalue  FLOAT NOT NULL DEFAULT 0,
  anomaly INT NOT NULL 0,
 next BIGINT UNSIGNED,
  
 );

 
##123456789-TOKEN-12
drop table if exists  ThresProbChainItem2;
##123456789-TOKEN-13

create table ThresProbChainItem2(
  probchainItemId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  itemvalue  FLOAT NOT NULL DEFAULT 0,
  anomaly INT NOT NULL 0,
 next BIGINT UNSIGNED,
  
 );

 
##123456789-TOKEN-12
drop table if exists  ThresProbChainItem3;
##123456789-TOKEN-13

create table ThresProbChainItem3(
  probchainItemId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  itemvalue  FLOAT NOT NULL DEFAULT 0,
  anomaly INT NOT NULL 0,
 next BIGINT UNSIGNED,
  
 );

 
##123456789-TOKEN-12
drop table if exists  ThresProbChainItem4;
##123456789-TOKEN-13

create table ThresProbChainItem4(
  probchainItemId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  itemvalue  FLOAT NOT NULL DEFAULT 0,
  anomaly INT NOT NULL 0,
 next BIGINT UNSIGNED,
  
 );

 
##123456789-TOKEN-12
drop table if exists  ThresProbChainItem5;
##123456789-TOKEN-13

create table ThresProbChainItem5(
  probchainItemId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  itemvalue  FLOAT NOT NULL DEFAULT 0,
  anomaly INT NOT NULL 0,
 next BIGINT UNSIGNED,
  
 );

 
 