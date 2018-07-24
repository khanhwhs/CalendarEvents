Begin TRANSACTION;


  create table EVENT
(
  EVENT_ID       int auto_increment
    primary key,
  EVENT_TITLE    varchar(50)  null,
  EVENT_DATE     date         null,
  EVENT_LOC      varchar(50)  null,
  USERS_LIST     varchar(500) null,
  LAST_UPDATE_TS timestamp    null
);

create table REMINDER
(
  REMINDER_ID      int auto_increment
    primary key,
  REMINDER_MESSAGE varchar(500) null,
  REMINDER_TS      timestamp    null,
  EVENT_ID         int          null,
  REMINDER_FLAG    varchar(1)   null,
  constraint REMINDER_REMINDER_ID_uindex
  unique (REMINDER_ID)
);

create table USER
(
  USER_ID          int auto_increment
    primary key,
  FIRST_NAME       varchar(12)  null,
  LAST_NAME        varchar(12)  null,
  EVENT_ID_LIST    varchar(500) null,
  LAST_UPDATE_DATE timestamp    null
);



Commit;

