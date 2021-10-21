# Library Management System
By Assistance Solutions
## Description
The main aim of this project is to provide an easy to handle, automated library management system, which includes features for maintaining librarian records, students' history of issues, fines etc. This library management system helps to make a organnized library which facilitates quick and effortless searching of books, calculation of fines, checking history of book issues/returns etc.
## Getting Started
### Dependencies
* JDK 11 [get] (https://www.oracle.com/in/java/technologies/javase/jdk11-archive-downloads.html#license-lightbox)
* NetBeans 12.5 [get] (https://netbeans.apache.org/download/nb125/nb125.html)
* MySQL 8.x [get] (https://dev.mysql.com/downloads/windows/installer/8.0.html)
 OR MySQL 5.x [get] (https://drive.google.com/file/d/1tui3H5bSm4eVLTyAepvZC-ARRmY6D0sC/view?usp=sharing)
* WampServer 3.2.3 [get] (https://sourceforge.net/projects/wampserver/)
* mysql-connector-java-8.0.21.jar [get] (https://drive.google.com/file/d/1k0ztvz6f1lmjwz0gbaJdaNrI0tooNbQv/view) OR
mysql-connector-java-5.1.49.jar [get] (https://drive.google.com/file/d/1yBPECFLwxk9QP6AfzmYHueHyH7f072DS/view?usp=sharing)
* Library Management System V1.0 [get] (https://drive.google.com/drive/folders/1kP3Zkf6254bh-R0P9_0AufE0iO2A-svH?usp=sharing)
### Installation
* Download JDK and add bin to the path in environment variables
* Install NetBeans and open project Library Management System V1.0
* Resolve two issues by adding mysql-connector-java-8.0.21.jar and by creating a new library MySQLDriver
* Open conn.java and replace password with the root user password in the following statement, 
```c =DriverManager.getConnection("jdbc:mysql:///lbms","root","password");``` 
* Install and open Wamp Server and login as a root user with your MySQL server
### Execution
* In the wamp server, type and check the following codes to create a required database for the project:
```
show databases;
create database lbms;
use lbms;
create table account(username varchar(20), name varchar(25), password varchar(25), sec_q varchar(25), sec_ans varchar(25));
alter table account add primary key (username);
create table account_srf(student_id varchar(20), password varchar(25), sec_q varchar(25), sec_ans varchar(25));
create table book(book_id varchar(10), name varchar(40),author varchar(20), publisher varchar(30), edition varchar(10), price varchar(10), pages varchar(10));
alter table book add primary key (book_id);
create table fine(student_id varchar(10), sname varchar(40), bname varchar(40), dateOfIssue varchar(15), dateOfReturn varchar(15), fine varchar(10));
create table issuebook(book_id varchar(10), student_id varchar(10), bname varchar(40), sname varchar(40), course varchar(20), branch varchar(10), dateofIssue date);
create table requestbook(book_id varchar(10), student_id varchar(10), name varchar(40), author varchar(20), publisher varchar(30), edition varchar(10), price varchar(10), pages varchar(10));
create table returnbook(book_id varchar(10), student_id varchar(10), bname varchar(40), sname varchar(40), course varchar(20), branch varchar(10), dateOfIssue varchar(30), dateOfReturn varchar(30));
create table student(student_id varchar(10), name varchar(25), father varchar(25), course varchar(10), branch varchar(10), year varchar(10), semester varchar(10));
alter table student add primary key (student_id);
alter table account_srf add foreign key (student_id) references student(student_id) on delete cascade;
```
## Author
* Samya Bose [github] (https://github.com/samya-ravenXI) E-mail: j.21.samyabose@gmail.com
* Junaid Ahmed [github] (https://github.com/kap6174) E-mail: ditipriyaseal@gmail.com
* Ditipriya Seal [github] (https://github.com/Ditipriya5678) E-mail: junaidahmed50143@gmail.com
* Namisha Gupta [github] (https://github.com/Namisha19) E-mail: namishagupta.c186@gmail.com
## Acknowledgement
* [kunaltyagi9] (https://github.com/kunaltyagi9/Library-Management-System) 