

##123456789-TOKEN-10
drop table if exists  SubjectOrder;  
##123456789-TOKEN-11

create table SubjectOrder(
  subjectorderId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  subjectId BIGINT UNSIGNED NOT NULL,
  orderId  BIGINT UNSIGNED NOT NULL,
   text  Varchar(300) ,
entityName Varchar(80) NOT NULL DEFAULT 'subjectorder',
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
   lastaccess DATETIME,
  
 candidateId BIGINT NOT NULL default 0,
 candidateNormId BIGINT NOT NULL default 0,

    CONSTRAINT WeightNorm_sp_WeightNorm FOREIGN KEY (subjectorderId,entityName)
    REFERENCES WeightNorm(entityNormId,entityName),
    
    CONSTRAINT p_sp_p FOREIGN KEY (orderId)
    REFERENCES Order(orderId) ON DELETE CASCADE ,
    CONSTRAINT s_sp_s FOREIGN KEY (subjectId)
    REFERENCES Subject(subjectId) ON DELETE CASCADE 



);
##123456789-TOKEN-10
drop table if exists  ObserverOrder;  
##123456789-TOKEN-11

create table ObserverOrder(
  observerorderId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  observerId BIGINT UNSIGNED NOT NULL,
  orderId  BIGINT UNSIGNED NOT NULL,
   text  Varchar(300) ,
entityName Varchar(80) NOT NULL DEFAULT 'Observerorder',
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
   lastaccess DATETIME,
  

 candidateId BIGINT NOT NULL default 0,
 candidateNormId BIGINT NOT NULL default 0,
    CONSTRAINT WeightNorm_obsP_WeightNorm FOREIGN KEY (observerorderId,entityName)
    REFERENCES WeightNorm(entityNormId,entityName),
    
    CONSTRAINT p_op1_p FOREIGN KEY (orderId)
    REFERENCES Order(orderId) ON DELETE CASCADE ,
    CONSTRAINT s_op1_s FOREIGN KEY (ObserverId)
    REFERENCES Observer(ObserverId) ON DELETE CASCADE 



);

##123456789-TOKEN-10
drop table if exists  CommandOrder;  
##123456789-TOKEN-11

create table CommandOrder(
  commandorderId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  commandId BIGINT UNSIGNED NOT NULL,
  orderId  BIGINT UNSIGNED NOT NULL,
   text  Varchar(300) ,
entityName Varchar(80) NOT NULL DEFAULT 'Commandorder',
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
   lastaccess DATETIME,
  

 candidateId BIGINT NOT NULL default 0,
 candidateNormId BIGINT NOT NULL default 0,
    CONSTRAINT WeightNorm_comp_WeightNorm FOREIGN KEY (commandorderId,entityName)
    REFERENCES WeightNorm(entityNormId,entityName),
    
    CONSTRAINT p_comp_p FOREIGN KEY (orderId)
    REFERENCES Order(orderId) ON DELETE CASCADE ,
    CONSTRAINT c_cp_c FOREIGN KEY (CommandId)
    REFERENCES Command(CommandId) ON DELETE CASCADE 



);

##123456789-TOKEN-10
drop table if exists  ActionOrder;  
##123456789-TOKEN-11

create table ActionOrder(
  actionorderId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  actionId BIGINT UNSIGNED NOT NULL,
  orderId  BIGINT UNSIGNED NOT NULL,
   text  Varchar(300) ,
entityName Varchar(80) NOT NULL DEFAULT 'Actionorder',
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
   lastaccess DATETIME,
  

 candidateId BIGINT NOT NULL default 0,
 candidateNormId BIGINT NOT NULL default 0,
    CONSTRAINT WeightNorm_actp_WeightNorm FOREIGN KEY (actionorderId,entityName)
    REFERENCES WeightNorm(entityNormId,entityName),
    
    CONSTRAINT p_actp_p FOREIGN KEY (orderId)
    REFERENCES Order(orderId) ON DELETE CASCADE ,
    CONSTRAINT a_actp11_a FOREIGN KEY (actionId)  REFERENCES  `Action`(actionId) 

);




##123456789-TOKEN-10
drop table if exists  SubjectOrder2SubjectOrder;  
##123456789-TOKEN-11

create table SubjectOrder2SubjectOrder(
 subjectorder2subjectorderId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
 subjectorderId BIGINT UNSIGNED NOT NULL,
  subjectorder2Id  BIGINT UNSIGNED NOT NULL,
   text  Varchar(300) ,
entityName Varchar(80) NOT NULL DEFAULT 'SubjectOrder2SubjectOrder',
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
   lastaccess DATETIME,
   

 candidateId BIGINT NOT NULL default 0,
 candidateNormId BIGINT NOT NULL default 0,
    CONSTRAINT WeightNorm_sp2sp_WeightNorm FOREIGN KEY (subjectorder2subjectorderId,entityName)
    REFERENCES WeightNorm(entityNormId,entityName),
    
    CONSTRAINT sp_sp2sp_sp FOREIGN KEY (subjectorderId)
    REFERENCES SubjectOrder(subjectorderId) ON DELETE CASCADE ,
    CONSTRAINT sp1_sp2sp_sp1 FOREIGN KEY (subjectorder2Id)
    REFERENCES SubjectOrder(subjectorderId) ON DELETE CASCADE 
    

);

##123456789-TOKEN-10
drop table if exists  ObserverOrder2ObserverOrder;  
##123456789-TOKEN-11

create table ObserverOrder2ObserverOrder(
 observerorder2observerorderId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
 observerorderId BIGINT UNSIGNED NOT NULL,
  observerorder2Id  BIGINT UNSIGNED NOT NULL,
   text  Varchar(300) ,
entityName Varchar(80) NOT NULL DEFAULT 'ObserverOrder2ObserverOrder',
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
   lastaccess DATETIME,
   

 candidateId BIGINT NOT NULL default 0,
 candidateNormId BIGINT NOT NULL default 0,
    CONSTRAINT WeightNorm_op2op_WeightNorm FOREIGN KEY (observerorder2observerorderId,entityName)
    REFERENCES WeightNorm(entityNormId,entityName),
    
    CONSTRAINT op_op2op_op FOREIGN KEY (observerorderId)
    REFERENCES ObserverOrder(observerorderId) ON DELETE CASCADE ,
    CONSTRAINT op1_op2op_op1 FOREIGN KEY (observerorder2Id)
    REFERENCES ObserverOrder(observerorderId) ON DELETE CASCADE 
    

);



##123456789-TOKEN-10
drop table if exists  CommandOrder2CommandOrder;  
##123456789-TOKEN-11

create table CommandOrder2CommandOrder(
 commandorder2commandorderId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
 commandorderId BIGINT UNSIGNED NOT NULL,
  commandorder2Id  BIGINT UNSIGNED NOT NULL,
   text  Varchar(300) ,
entityName Varchar(80) NOT NULL DEFAULT 'CommandOrder2CommandOrder',
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
   lastaccess DATETIME,
   
 candidateId BIGINT NOT NULL default 0,
 candidateNormId BIGINT NOT NULL default 0,

    CONSTRAINT WeightNorm_cp2cp_WeightNorm FOREIGN KEY (commandorder2commandorderId,entityName)
    REFERENCES WeightNorm(entityNormId,entityName),
    
    CONSTRAINT cp_cp2cp_cp FOREIGN KEY (commandorderId)
    REFERENCES CommandOrder(commandorderId) ON DELETE CASCADE ,
    CONSTRAINT cp1_cp2sp_cp1 FOREIGN KEY (commandorder2Id)
    REFERENCES CommandOrder(commandorderId) ON DELETE CASCADE 
    

);




##123456789-TOKEN-10
drop table if exists  ActionOrder2ActionOrder;  
##123456789-TOKEN-11

create table ActionOrder2ActionOrder(
 actionorder2actionorderId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
 actionorderId BIGINT UNSIGNED NOT NULL,
  actionorder2Id  BIGINT UNSIGNED NOT NULL,
   text  Varchar(300) ,
entityName Varchar(80) NOT NULL DEFAULT 'ActionOrder2ActionOrder',
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
   lastaccess DATETIME,
   
 candidateId BIGINT NOT NULL default 0,
 candidateNormId BIGINT NOT NULL default 0,

    CONSTRAINT WeightNorm_ap2ap_WeightNorm FOREIGN KEY (actionorder2actionorderId,entityName)
    REFERENCES WeightNorm(entityNormId,entityName),
    
    CONSTRAINT ap_ap2ap_ap FOREIGN KEY (actionorderId)
    REFERENCES ActionOrder(actionorderId) ON DELETE CASCADE ,
    CONSTRAINT ap1_ap2ap_ap1 FOREIGN KEY (actionorder2Id)
    REFERENCES ActionOrder(actionorderId) ON DELETE CASCADE 
    

);
