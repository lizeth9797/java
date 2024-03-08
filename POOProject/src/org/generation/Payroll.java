package org.generation;

import org.generation.classes.Employee;
import org.generation.classes.Pagable;

import java.util.Date;

public class Payroll {
	
	//identamos un método
	public static void printReceipt(Pagable emp) {//tomaremos los datos del empleado y los mandaremos a imprimir como si fuera un recibo
		System.out.println("=============================================");
		System.out.println("| Recibo de pago de "+emp.getName());
		System.out.println("| RFC "+emp.getRFC());
		System.out.println("| Departamento "+emp.getDepartment());
		System.out.println("| Por la cantidad de MXN $ "+emp.calculateSalary(30));
		System.out.println("| Número de empleado "+emp.getId());
		System.out.println("| Fecha "+(new Date()));
		System.out.println("=============================================");

	}

}
