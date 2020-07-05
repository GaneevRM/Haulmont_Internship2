-- begin CONTRACTCREATOR_CONTRACT
create table CONTRACTCREATOR_CONTRACT (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CONCLUSION date not null,
    EXECUTION date not null,
    AMOUNT varchar(255) not null,
    TOTAL_COST varchar(255) not null,
    CUSTOMER_ID varchar(36) not null,
    PROVIDER_ID varchar(36) not null,
    --
    primary key (ID)
)^
-- end CONTRACTCREATOR_CONTRACT
-- begin CONTRACTCREATOR_CUSTOMER
create table CONTRACTCREATOR_CUSTOMER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    FIO varchar(255) not null,
    PHONE varchar(255) not null,
    EMAIL varchar(255) not null,
    ADDRESS varchar(255) not null,
    --
    primary key (ID)
)^
-- end CONTRACTCREATOR_CUSTOMER
-- begin CONTRACTCREATOR_PROVIDER
create table CONTRACTCREATOR_PROVIDER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    PERSON boolean not null,
    FIO varchar(255),
    PHONE varchar(255),
    EMAIL varchar(255),
    SPECIALTY varchar(255),
    ADDRESS varchar(255),
    INN varchar(255),
    DIRECTOR varchar(255),
    --
    primary key (ID)
)^
-- end CONTRACTCREATOR_PROVIDER
