package org.generation.classes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.generation.ex.exceptions.EmailFormatException;

//Al agregar "abstract" ya no se permite crear objetos del tipo Person, sólo heredar de esta clase
public abstract class Person { //antes era public class Person
	//propiedades o atributos:
	
	//se pusieron private para seguir el principio del encapsulamiento, al ser privados nadie los puede modificar
	 private String name; 
	 private int age;
	 private String email;
	 private String rfc;
	 private String address;
	 private int id; //posteriormente se usaran como primarykey en la DB
	 //propiedad ESTATICA, sólo se puede acceder mediante la clase
	 private static int total=0;
	
	 // NOTA:constructor default existe cuando nuestra clase no tiene escrito un constructor
/**
 * Constructor para instanciar una persona	
 * @param name nombre de la persona
 * @param age edad de la persona
 * @param email correo de la persona
 * @param rfc registro federal de constribuyentes de la persona
 * @param address dirección de la persona
 */
	public Person(String name, int age, String email, String rfc, String address){
		this.name=name.toUpperCase();
		this.age=(age<18)?18:age;
		this.email=email.toLowerCase();
		this.rfc=rfc.toUpperCase();
		this.address=address;
		Person.total++;
		id=Person.total;
	}
	
	//crearemos un nuevo constructor. Tener multiples constructores es sobrecarga de métodos 
	public Person (String name, int age, String email) {
		this(name,age,email,"JHXX000000","Sin dirección");
	}//constructor
	
	public Person(String name) { //este constructor manda a llamar al de arriba, q tiene 3 parametros
		this(name,21,"algun@correo.com");
	}
	
	public String getName(){
		return this.name; // o puede ser return name;, no es obligatorio el this
	}
	public void setName(String name){
		this.name=name.toLowerCase();
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=(age<18)?18:age;
	}
	public String getEmail() {
		return email;
	}
	/**
	 * Establece un correo electrónico para la persona, realiza la validación del formato
	 * @param emailIngresado  nuevo correo electrónico para la persona
	 * @throws EmailFormatException si el correo electrónico no tiene el formato correcto, se lanza esta excepción
	 */
	
	
	//ENCAPSULACIÓN: estamos protegiendo que los correos estén bien escritos segun las reglas de negocio establecidas
	public void setEmail(String emailIngresado) throws EmailFormatException { // significa: podría lanzar un EmailFormatException
		this.email="sincorreo@correo.com";
		Pattern regex=Pattern.compile("^[a-z_0-9.%+-]+@[a-z0-9.-]+\\.[a-z]{2,6}"); //patron que debe seguir, la sintaxis es "Pattern.compile"
		Matcher matcher=regex.matcher(emailIngresado);
		if(matcher.matches()) {//si el corre es válido
			this.email=emailIngresado;
		}else {
			throw new EmailFormatException("El correo ["+emailIngresado+"] no tiene un formato válido");
		}
	}
	
	
	
	
	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public int getId() {
		return id;
	}

	//generamos un toString de manera automática, desde la pestaña Source/generate toString
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", email=" + email + ", rfc=" + rfc + ", address=" + address
				+ "]";
	}

}//class Person