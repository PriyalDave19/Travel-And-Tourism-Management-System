create database travelmanagementsystem;
show databases;
use travelmanagementsystem;

create table account(username varchar(20), name varchar(20), password varchar(20), security varchar(100), answer varchar(50));
select * from account;

create table customer(username varchar (20), id varchar(30),number varchar(30),name varchar(30),gender varchar(30),country varchar (30),address varchar(50),phone varchar(15),email varchar(40)); 
select * from customer ;

create table bookpackage(username varchar(20), package varchar(30), persons varchar(20), id varchar(30), number varchar(30),phone varchar(20),price varchar(20));
select * from bookpackage;

create table hotel(name varchar(30), costperperson varchar(30), acroom varchar(20), foodincluded varchar(30));
insert into hotel values('Raddison Blue Hotel' , '3400' , '1000' , '1700');
insert into hotel values('River View Hotel' , '2400' , '1600' , '1000');
insert into hotel values('Taj Hotel' , '4800' , '1240' , '2900');
insert into hotel values('JW Marriot Hotel' , '1000' , '500' , '2000');
insert into hotel values('Madarin Oriental Hotel' , '1500' , '1000' , '3000');
insert into hotel values('Four Season Hotel' , '2000' , '500' , '1500');
insert into hotel values('Classio Hotel' , '2500' , '1240' , '3500');
insert into hotel values('Breeze Blow Hotel' , '5000' , '1000' , '2900');
insert into hotel values('Happy Morning Hotel' , '2500' , '1550' , '4000');
insert into hotel values('The Bay Club Hotel' , '4800' , '1530' , '5000');
update hotel set name  = 'Raddission Blue Hotel' where  name  = 'Raddison Blue Hotel';
select * from hotel;

create table bookhotel(username varchar (30), name varchar(60),persons varchar(30),days varchar(30),ac varchar(30),food varchar (30),id varchar(20),number varchar(20),phone varchar(20),price varchar(20)); 
select * from bookhotel;

create table review(name varchar (20),selectedPackages varchar(40),rating int(30),comments varchar(50)); 
select * from review;



