
public class Main {

	public static void main(String[] args) {
		Triangulo bermudas= new Triangulo("Bermudas",20,10,15);
		imprimirCalculo(bermudas);//es un triangulo y tambien FigurasGeometricas
		
		Cuadrado bob=new Cuadrado("Bob",5);
		imprimirCalculo(bob); //es un cuadrado y tambien FigurasGeometricas(esto es polimorfismo)
		

		Rectangulo rectangulo= new Rectangulo("Rectangulo",2,5);
		imprimirCalculo(rectangulo);

		Rombo rombo= new Rombo("Rombo",2.1,3,5.2);
		imprimirCalculo(rombo);

		Romboide romboide= new Romboide("Romboide",1.5,2.5);
		imprimirCalculo(romboide);

		Trapecio trapecio= new Trapecio("Trapecio",4,5,5,8,8,4,7);
		imprimirCalculo(trapecio);
		
		
		
	}
	
	/*
	public static void imprimirCalculo(Triangulo t) { //sin uso de interfaz (esto no sería lo optimo xq tendríamos que crear múltiples métodos apra cada figura. Por lo tanto crearemos la interfaz "FigurasGeometricas")
		System.out.println(t.toString());
		System.out.println("El área de ["+t.getNombre()+
				"] es: "+t.calcularArea());
		System.out.println("El perímetro de ["+t.getNombre()+
				"] es: "+t.calcularPerimetro());		System.out.println("------------------");
	}//imprimirCalculo*/
	
	public static void imprimirCalculo(FigurasGeometricas t) { //usando interfaz
		System.out.println(t.toString());
		System.out.println("------------------");
		System.out.println("El área de ["+t.getNombre()+
				"] es: "+t.calcularArea());
		System.out.println("El perímetro de ["+t.getNombre()+
				"] es: "+t.calcularPerimetro());		System.out.println("------------------");
		System.out.println("\n\n");
	}//imprimirCalculo
	
	

}
