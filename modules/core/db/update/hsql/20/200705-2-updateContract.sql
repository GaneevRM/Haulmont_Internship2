alter table CONTRACTCREATOR_CONTRACT alter column EXECUTION rename to EXECUTION__U16647 ^
alter table CONTRACTCREATOR_CONTRACT alter column EXECUTION__U16647 set null ;
alter table CONTRACTCREATOR_CONTRACT alter column CONCLUSION rename to CONCLUSION__U23214 ^
alter table CONTRACTCREATOR_CONTRACT alter column CONCLUSION__U23214 set null ;
alter table CONTRACTCREATOR_CONTRACT add column CONCLUSION date ^
update CONTRACTCREATOR_CONTRACT set CONCLUSION = current_date where CONCLUSION is null ;
alter table CONTRACTCREATOR_CONTRACT alter column CONCLUSION set not null ;
alter table CONTRACTCREATOR_CONTRACT add column EXECUTION timestamp ^
update CONTRACTCREATOR_CONTRACT set EXECUTION = current_timestamp where EXECUTION is null ;
alter table CONTRACTCREATOR_CONTRACT alter column EXECUTION set not null ;
