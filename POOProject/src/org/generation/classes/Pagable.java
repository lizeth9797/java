package org.generation.classes;
/**
 * Interface que permite que un elemento sea pagable
 */
public interface Pagable { //esta interfaz es una serie de requisitos que tomamos de Payroll
	public String getName();
	public String getRFC();
	public String getDepartment();
	public String calculateSalary(int days);
	public int getId();
}
