package org.generation;
import org.generation.classes.Consultant;
import org.generation.classes.Employee;
import org.generation.classes.Pagable;
import org.generation.classes.Person;
import org.generation.ex.exceptions.EmailFormatException;

public class Main {
	public static void main(String[] args) {
		//Person chayo= new Person(); //constructor que inicializa el objeto person. Nota: ya no podemos usar el constructor vacio (por default) porque agregamos el constructor en la clase Person, por lo tanto esta linea ya no aplica.
		/* ya no se define así, esto solo aplica cuando el constructor es vacio (por default)
		chayo.name="Chayo Orozco";
		chayo.age=21;
		chayo.email="chayo@gmail.com"; 
		*/
		
		Employee chayo=new Employee("Chayo",21,"chayo@gmail.com","XAXX000000","Casa","QA",850);//al ya no ser un constructor por default/vacío, le debemos proporcionar el valor de sus propiedades aqui
		//Cuando agregamos "abstract" en person ya no podemos crear objetos tipo Person(instanciar), sólo objetos employee:
		/*Person monse=new Person("Monse Cervantes",20,"monse@gmail.com"); //pondrá RFC y dirección por default, la que definimos en el 2do constructor en Person
		Person monse=new Person("Monse Cervantes",20,"monse@gmail.com"); //pondrá RFC y dirección por default, la que definimos en el 2do constructor en Person
		Person jetsa=new Person("Jetsa Villegas");*/
		Employee monse=new Employee("Monse Cervantes",20,"monse@gmail.com","XEXX000000","AndreaC","Developer",66); //pondrá RFC y dirección por default, la que definimos en el 2do constructor en Person
		Employee jetsa=new Employee("Jetsa Villegas",25,"hola@gmail.com","XEXX000000","AndreaC","Developer",66);
					
		//Le dejamos person xxx new Employee porque los employees al final son personas
		//Estos objetos tienen 2 formas (es una persona y es un empleado), por eso definimos como persona e instanciamos a un empleado
		//Person monse=new Employee("Monse Cervantes",20,"monse@gmail.com","XEXX000000","AndreaC","Developer",66); //pondrá RFC y dirección por default, la que definimos en el 2do constructor en Person
		//Person jetsa=new Employee("Jetsa Villegas",25,"hola@gmail.com","XEXX000000","AndreaC","Developer",66);
					
		
		
		Consultant balam=new Consultant("BalamSA","XEXX000000",13.45);
		
		System.out.println(jetsa.getAge());
		jetsa.setAge(17);
		System.out.println(jetsa.getAge());
		System.out.println(jetsa.getEmail());
		//jetsa.setEmail("jetsa@yahoo.c");
		try {
			jetsa.setEmail("jetsa@yahoo.c");
		}catch(EmailFormatException e) {
			System.out.println(e.getMessage());
		}//catch
		System.out.println(jetsa.getEmail());

		System.out.println(chayo);
		System.out.println(monse);
		System.out.println(jetsa);

		chayo.setName("Chayo Orozco");
		System.out.println(monse.getName());
		System.out.println(chayo);
		
		System.out.println("*******Salary*******");
		System.out.println(chayo.calculateSalary(29));

		System.out.println("*******Receipt*******");
		//Payroll.printReceipt(chayo); //antes de implementar la INTERFAZ sí aplicaba, despues tuvimos que agregar "implements Pagable".
		Payroll.printReceipt(chayo); //es empleado y es pagable
		Payroll.printReceipt(monse); //es empleado y es pagable
		Payroll.printReceipt(jetsa); //es empleado y es pagable
		Payroll.printReceipt(balam); //es consultor y es pagable
	}//main
}//class main
