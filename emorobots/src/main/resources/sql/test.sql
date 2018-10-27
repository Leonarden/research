
##123456789-TOKEN-10
drop table if exists  TestProblem2TestProblem;  
##123456789-TOKEN-11

create table TestProblem2TestProblem(
 testproblem2testproblemId BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
 testproblemId BIGINT UNSIGNED NOT NULL,
  testproblem2Id  BIGINT UNSIGNED NOT NULL,
   text  Varchar(300) ,
entityName Varchar(50) NOT NULL DEFAULT 'TestProblem2TestProblem',
   numaccess  BIGINT UNSIGNED NOT NULL DEFAULT 0,
   lastaccess DATETIME,
   

    CONSTRAINT WeightNorm_ap2ap_WeightNorm FOREIGN KEY (testproblem2testproblemId,entityName)
    REFERENCES WeightNorm(entityNormId,entityName),
    
    CONSTRAINT ap_cp2ap_cp FOREIGN KEY (testproblemId)
    REFERENCES TestProblem(testproblemId) ON DELETE CASCADE,
    CONSTRAINT ap1_cp2sp_cp1 FOREIGN KEY (testproblem2Id)
    REFERENCES TestProblem(testproblemId) ON DELETE CASCADE
    

);
