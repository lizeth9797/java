import java.util.Scanner;

public class EjercicioCine {

	public static void main(String[] args) {
		System.out.print("¿Cuál es tu edad?: ");
		Scanner entrada=new Scanner(System.in);
		int edad=entrada.nextInt();
		String mensaje="Total a pagar: ";
		int costoBoleto=7;
		String moneda=" euros";
		
		if(edad<5) { 
			System.out.println(mensaje+ (costoBoleto*.4)+moneda);
		}else if(edad>60) {
			System.out.println(mensaje+ (costoBoleto*.45)+moneda);
		}
		else {
			System.out.print("¿Cuántos boletos quiere comprar: ");
			//Scanner entrada2=new Scanner(System.in);
			int cantidad=entrada.nextInt();
			if(cantidad>=2) {
				System.out.println(mensaje+ ((costoBoleto*cantidad)*.7)+moneda);
			}else {
				System.out.println(mensaje+ costoBoleto+moneda);
			}
		}
		entrada.close();
	}

}
