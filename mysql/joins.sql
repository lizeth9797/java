SELECT * FROM employees.employees;
SELECT * FROM employees.employees WHERE emp_no=10001;
select * from employees.dept_emp where emp_no=10001;
select * from employees.departments where dept_no='d005';

select * from employees.employees INNER JOIN employees.dept_emp
ON employees.emp_no=dept_emp.emp_no
WHERE employees.emp_no=10001;

select employees.emp_no,employees.first_name,employees.last_name,employees.hire_date,dept_emp.dept_no,dept_emp.from_date,dept_emp.to_date
from employees.employees 
INNER JOIN employees.dept_emp
ON employees.emp_no=dept_emp.emp_no
WHERE employees.emp_no=10001;


select employees.emp_no,employees.first_name,employees.last_name,employees.hire_date,dept_emp.dept_no,dept_emp.from_date,dept_emp.to_date
from employees.employees
INNER JOIN employees.dept_emp
ON employees.emp_no=dept_emp.emp_no
WHERE employees.emp_no=10001;

-- employees set as default schema on workbench to make the queries easier:
select e.emp_no,e.first_name,e.last_name,e.hire_date,de.dept_no,de.from_date,de.to_date, d.dept_name
from employees AS e 
INNER JOIN dept_emp AS de
ON e.emp_no=de.emp_no
INNER JOIN departments AS d
ON de.dept_no=d.dept_no
WHERE e.emp_no=10001;


