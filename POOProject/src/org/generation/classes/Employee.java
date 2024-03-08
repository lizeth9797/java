package org.generation.classes;

/**
 * Clase Employee que hereda a la clase Person y representa a un empleado en la empresa.
 */

public class Employee extends Person implements Pagable{ //implements 'pagable'(interface related)
	//como employee hereda de person ya tiene constructor (3 exactamente) porque Person ya tiene 3 constructores definidos
	
	//agregaremos 2 propiedades extra
	private String department;//principio de la encapsulación (private)
	private double salary;

/**
 * Constructor de la clase Employee	
 * @param name nombre del empleado
 * @param age edad  del empleado
 * @param email correo electrónico  del empleado
 * @param rfc
 * @param address
 * @param department departamento al que pertenece el empleado
 * @param salary salario diario del empleado
 */
	
	//generamos el constructor de employee
	public Employee(String name, int age, String email, String rfc, String address, String department, double salary) {
		super(name, age, email, rfc, address); //super porque viene de la clase superior que es Person(de la que hereda)
		this.department = department;
		this.salary = salary;
	}//constructor

	/**
	 * Calcula el salario basado en los días del mes
	 * @param days
	 */
	public String calculateSalary(int days) {
		double total=0;
		total=(this.salary*days)*1.16;
		return String.format("%.2f", total);		
	}//calculateSalary
	
	
	//agregamos getters y setters
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String getRFC() {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public String toString() {
		return "Employee [department=" + department + ", salary=" + salary + ", getName()=" + getName() + ", getAge()="
				+ getAge() + ", getEmail()=" + getEmail() + ", getRfc()=" + getRfc() + ", getAddress()=" + getAddress()
				+ ", getId()=" + getId() + "]";
	}


	

	
}
