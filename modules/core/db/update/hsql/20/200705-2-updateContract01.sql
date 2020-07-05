alter table CONTRACTCREATOR_CONTRACT alter column EXECUTION rename to EXECUTION__U44239 ^
alter table CONTRACTCREATOR_CONTRACT alter column EXECUTION__U44239 set null ;
alter table CONTRACTCREATOR_CONTRACT add column EXECUTION date ^
update CONTRACTCREATOR_CONTRACT set EXECUTION = current_date where EXECUTION is null ;
alter table CONTRACTCREATOR_CONTRACT alter column EXECUTION set not null ;
