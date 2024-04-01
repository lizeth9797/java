use ch37database;
-- las sentencias DML son aquellas utilizadas para insertar, borrar, modificar y consultar los datos de una base de datos

insert into participantes (nombre,ciudad,fecha)
values ('Lizeth Karina', 'MX', '2024-03-13');

update participantes set fecha='2021-10-03' where id=1 ;

delete from participantes where id='2';

select nombre, ciudad from participantes;



