SELECT * FROM employees.departments ORDER BY dept_no;

insert into departments (dept_no, dept_name) VALUES ('d010', 'Software Development');

-- la primera tabla siempre es la de la izquierda
select departments.dept_name, dept_emp.dept_no, dept_emp.emp_no, dept_emp.from_date, dept_emp.to_date
from departments -- (tabla 1) trae toda la info de deptos
left join dept_emp -- y relacionamos con esta tabla
on departments.dept_no=dept_emp.dept_no -- donde van a coincidir
ORDER BY departments.dept_name DESC;

Select dept_manager.emp_no, dept_manager.dept_no
FROM dept_manager -- se relacionan los campos con esta tabla
RIGHT JOIN departments -- (tabla 2) trae todos los dato de esta tabla
ON dept_manager.dept_no=departments.dept_no;
