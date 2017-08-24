create database IF NOT EXISTS serverdata;
use serverdata;
create table IF NOT EXISTS priv_usr
(UID integer PRIMARY KEY AUTO_INCREMENT,UNAME varchar(25) NOT NULL,EMAIL varchar(20) not null unique,PHNO long not null,ADMIN_TYPE varchar(25) NOT NULL,GRADE char(1) NOT NULL,Password varchar(20) NOT NULL);
desc priv_usr;
insert into priv_usr values(1000,"WCW","sysadmin","8987417067","Backdoor","A","1111111111");
select * from priv_usr;
create table IF NOT EXISTS dummy_log
(Entries int primary key,OptrType varchar(10) not null,ProcExecLev varchar(10) not null,InitVal int not null,AltVal int not null,AltOn date not null,IPAddr varchar(25) not null);
desc dummy_log;
insert into dummy_log values(1,"ADMIN","KERNEL",0,1,'2004-03-20',"117.162.65.2");
insert into dummy_log values(2,"ADMIN","KERNEL",0,-1,'2003-03-17',"116.162.65.2");
insert into dummy_log values(3,"USER","USER",-1,1,'2002-03-27',"117.166.65.2");
insert into dummy_log values(4,"USER","USER",1,0,'2011-03-1',"117.162.65.0");
insert into dummy_log values(5,"ADMIN","KERNEL",4,0,'2014-03-02',"117.162.55.2");
insert into dummy_log values(6,"ADMIN","USER",0,127,'2016-02-07',"137.162.65.2");
insert into dummy_log values(7,"USER","KERNEL",1,-1,'2002-02-17',"237.162.65.2");
insert into dummy_log values(8,"USER","USER",0,1,'2001-01-16',"117.123.65.2");
insert into dummy_log values(9,"USER","USER",9,1,'2017-03-15',"117.123.25.2");
insert into dummy_log values(10,"USER","USER",1,7,'2016-12-29',"123.162.65.2");
insert into dummy_log values(11,"USER","USER",8,444,'2004-03-2',"112.162.65.2");
insert into dummy_log values(12,"USER","USER",1,23,'2014-12-29',"114.162.64.2");
insert into dummy_log values(13,"USER","USER",0,1,'2014-03-08',"154.442.65.2");
select * from dummy_log;
create table newcome
(Name varchar(25) not null,Email varchar(50) not null unique,Phone int unique,Type varchar(5) not null,Gender char(1) not null);
desc newcome;
create table recorded_packet(S_no int primary key auto_increment,timestamp double,hostip varchar(50) not null,destip varchar(50),request varchar(10) not null,length int not null,information varchar(50));
desc recorded_packet;
create table triggerdb(cmd varchar(10) not null,time timestamp,cmd_issuer varchar(50) not null,email varchar(50) not null);
delimiter //
create TRIGGER catch_insert before insert on newcome for each row
BEGIN
insert into triggerdb values("INSERT",NOW(),CURRENT_USER(),new.email);
END
//
delimiter ;
select * from triggerdb;

