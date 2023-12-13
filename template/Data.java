package template;

import java.util.*;

public class Data {
    public static List<Animal> listAnimals = new ArrayList<>();
    public static List<Consultation> listConsultations = new ArrayList<>();
    public static List<Customer> listCustomers = new ArrayList<>();
    public static List<Doctor> listDoctors = new ArrayList<>();
    public static List<Race> listRaces = new ArrayList<>();
}

/*

drop database if exists `DOCTOR_VET`;

create database if not exists `DOCTOR_VET`;
use `DOCTOR_VET`;

create table if not exists `Animal`(
`id_animal` int primary key auto_increment,
`id_customer` int,
`name` varchar(50),
`gender` varchar(1),
`birth_date` date,
`id_race` int
);

create table if not exists `Consultation`(
`id_consultation` int primary key auto_increment,
`id_animal` int,
`id_customer` int,
`id_doctor` int,
`date` date,
`description` text
);

create table if not exists `Customer`(
`id_customer` int primary key auto_increment,
`name` varchar(100),
`email` varchar(50),
`cpf` varchar(14),
`phone` varchar(16),
`birth_date` date
);

create table if not exists `Doctor`(
`id_doctor` int primary key auto_increment,
`name` varchar(100),
`email` varchar(50),
`expertise` varchar(50),
`cpf` varchar(14),
`phone` varchar(17)
);

create table if not exists `Race`(
`id_race` int primary key,
`specie` varchar(50),
`name` varchar(50)
);

alter table `Animal`
add foreign key(`id_customer`) references `Customer`(`id_customer`),
add foreign key(`id_race`) references `Race`(`id_race`);

alter table `Consultation`
add foreign key(`id_animal`) references `Animal`(`id_animal`),
add foreign key(`id_doctor`) references `Doctor`(`id_doctor`),
add foreign key(`id_customer`) references `Customer`(`id_customer`);

create view `Animals` as
select anm.`id_animal`, anm.`id_customer`, cus.`name` 'customer', anm.`name`, anm.`gender`, anm.`birth_date`, anm.`id_race`, rac.`name` as 'race', rac.`specie` from `Animal` anm
inner join `Customer` cus on cus.`id_customer` = anm.`id_customer`
inner join `Race` rac on rac.`id_race` = anm.`id_race`;

create view `Consultations` as
select con.`id_consultation`, con.`id_animal`, anm.`name` as 'animal', con.`id_customer`, cus.`name` as 'customer', con.`id_doctor`, doc.`name` as 'doctor', con.`date`, con.`description` from `Consultation` con
inner join `Animal` anm on anm.`id_animal` = con.`id_animal`
inner join `Customer` cus on cus.`id_customer` = con.`id_customer`
inner join `Doctor` doc on doc.`id_doctor` = con.`id_doctor`;

create view `Customers` as
select cus.`id_customer`, cus.`name`, cus.`email`, cus.`cpf`, cus.`phone`, cus.`birth_date` from `Customer` cus;

create view `Doctors` as
select doc.`id_doctor`, doc.`name`, doc.`email`, doc.`cpf`, doc.`expertise`, doc.`phone` from `Doctor` doc;

create view `Races` as
select * from `Race` rac order by rac.`specie` asc, rac.`name` asc;


create procedure `insertAnimal`(`id_customer` int, `name` varchar(50), `gender` varchar(1), `birth_date` date, `id_race` int)
insert into `Animal` values (default, `id_customer`, `name`, `gender`, `birth_date`, `id_race`);

create procedure `insertConsultation`(`id_animal` int, `id_customer` int, `id_doctor` int, `date` date, `description` text)
insert into `Consultation` values (default, `id_animal`, `id_customer`, `id_doctor`, `date`, `description`);

create procedure `insertCustomer`(`name` varchar(70), `email` varchar(50), `cpf` varchar(14), `phone` varchar(17), `birth_date` date)
insert into `Customer` values (default, `name`, `email`, `cpf`, `phone`, `birth_date`);

create procedure `insertDoctor`(`name` varchar(100), `email` varchar(50), `expertise` varchar(50), `cpf` varchar(15), `phone` varchar(17))
insert into `Doctor` values (default, `name`, `email`, `expertise`, `cpf`, `phone`);


create procedure `deleteAnimal`(`id` int)
delete from `Animal` where `id_animal` = `id`;

create procedure `deleteConsultation`(`id` int)
delete from `Consultation` where `id_consultation` = `id`;

create procedure `deleteCustomer`(`id` int)
delete from `Customer` where `id_customer` = `id`;

create procedure `deleteDoctor`(`id` int)
delete from `Doctor` where `id_doctor` = `id`;


create procedure `updateAnimal`(`_id_animal` int, `_id_customer` int, `_name` varchar(50), `_gender` varchar(1), `_birth_date` date, `_id_race` int)
update `Animal` set `id_customer` = `_id_customer`, `name` = `_name`, `gender` = `_gender`, `birth_date` = `_birth_date`, `id_race` = `_id_race` where `id_animal` = `_id_animal`;

create procedure `updateConsultation`(`_id_consutation` int, `_id_animal` int, `_id_customer` int, `_id_doctor` int, `_date` date, `_description` text)
update `Consultation` set `id_animal` = `_id_animal`, `id_customer` = `_id_customer`, `id_doctor` = `_id_doctor`, `date` = `_date`, `description` = `_description` where `id_consultation` = `_id_consultation`;

create procedure `updateCustomer`(`_id_customer` int, `_name` varchar(70), `_email` varchar(50), `_cpf` varchar(15), `_phone` varchar(16), `_id_city` int, `_birth_date` date)
update `Customer` set `name` = `_name`, `email` = `_email`, `cpf` = `_cpf`, `phone` = `_phone`, `birth_date` = `_birth_date` where `id_customer` = `_id_customer`;

create procedure `updateDoctor`(`_id_doctor` int, `_name` varchar(100), `email` varchar(50), `_expertise` varchar(50), `_cpf` varchar(15), `_phone` varchar(17))
update `Doctor` set `name` = `_name`, `email` = `_email`, `expertise` = `_expertise`, `cpf` = `_cpf`, `phone` = `_phone` where `id_doctor` = `_id_doctor`;



*/