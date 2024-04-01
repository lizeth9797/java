create database ch37database;
-- drop schema ch37database;
-- sentencias DDL son aquellas utilizadas para la creación de una base de datos y todos sus componentes: tablas, índices, relaciones, disparadores (triggers), procedimientos almacenados, etc.
use ch37database;

CREATE table participantes(
	id int not null,
    nombre varchar(200) not null,
    ciudad varchar(50),
    fecha datetime null,
    primary key(id)
);

alter table participantes
modify column id int not null auto_increment;

alter table participantes
add edad int not null;

alter table participantes
drop column edad;

rename table participantes to estudiantes;
rename table estudiantes to participantes;


insert into participantes (nombre,ciudad,fecha)
values ('Lizeth Karina', 'MX', '2024-03-13');

update participantes set fecha='2021-10-03' where id=1 ;

delete from participantes where id='2';

select nombre, ciudad from participantes;




