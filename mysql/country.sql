SELECT * FROM world.country;
select distinct(continent) from world.country;
select distinct(region) from world.country;
select count(*) from world.country where continent='Asia';
select count(*) from world.country; 
select count(*) from world.country where continent like '%America'; -- cualquier cosa que lleve la palabra America
select * from world.country where continent like 'A%a';-- cualquier cosa que empieza con A y termina con a
select * from world.country where name like 'I___a'; -- que empiece con I despues 3 letras y finalice con a 'India'
select * from world.country order by continent,`name`;
select * from world.country order by `name` DESC; -- en orden descendente
select * from world.country where continent IN ('Africa','Asia');
select * from world.country where IndepYear is NULL and LifeExpectancy is NULL; -- todos los paises que no tienen año de independencia
select * from world.country where IndepYear is NOT NULL ORDER BY IndepYear;
select * from world.country where Continent='Africa' OR Continent='Asia' OR Continent='Oceania' ORDER BY Continent DESC;
SELECT * FROM world.country WHERE `Code` LIKE 'M%' AND Continent='North America'; -- con like va uno por uno de los registros y compara si tiene M al inicio, tendrá mas carga en el procesamiento para el servidor
SELECT * FROM world.country WHERE `Code` >= 'M' AND `Code` < 'N' AND Continent='North America'; -- esta opcion tiene mejor rendimiento para el servidor que usar LIKE
select * from world.country where continent='Asia';
SELECT * FROM world.country WHERE Population BETWEEN 98000000 AND 100000000;
-- WHERE IndepYear BETWEEN 1810 AND 1815;
select COUNT(*) AS Total from world.country; -- AS es para agregar ALIAS en columnas






