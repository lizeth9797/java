import java.util.Scanner;

public class EjercicioComisiones {

	public static void main(String[] args) {
		System.out.print("Escribe el precio de venta: ");
		Scanner entrada= new Scanner(System.in);
		int value=entrada.nextInt();
		if(value>10000) {
			System.out.println(value*0.3);
		}else if(value>=5000 && value<=10000) {
			System.out.println(value*0.2);
		}else if(value>=1000 && value<=4999) {
			System.out.println(value*0.1);
		}else if(value<1000) {
			System.out.println("N/A");
		}
		else {
			System.out.println("Invalido");
		}	
		entrada.close();
	}
}
