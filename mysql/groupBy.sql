SELECT * FROM employees.salaries;

select emp_no, MIN(salary) as `Mínimo`, MAX(salary), AVG(salary) as `Promedio`, COUNT(salary) as total -- cuantas veces a aumentado de salario ese empleado? (agregar COUNT)
FROM employees.salaries
WHERE emp_no <=10010
GROUP BY emp_no
ORDER BY total DESC; -- no lo podemos ordenar por funcion (ej min, max, avg o count) pero sí por alias, por eso agregamos un alias a COUNT

