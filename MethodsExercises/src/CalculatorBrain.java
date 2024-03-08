import java.util.Scanner;
//https://github.com/generation-org/JAVA/tree/master/Functions
public class CalculatorBrain {

	public static void main(String[] args) {
		Scanner consola= new Scanner(System.in);
		System.out.println("Ingrese el primer número");
		double a=consola.nextDouble();
		System.out.println("Ingrese el segundo número");
		double b=consola.nextDouble();
		 
		addition(a,b);
		subtraction(a,b);
		multiplication(a,b);
		division(a,b);
		squareRoot(a,b);
		powerOf(a,b);
		consola.close();
	}

	private static void addition(double a, double b) {
		System.out.println("La suma de "+a+"+"+b+" = "+(a+b));
	}
	private static void subtraction(double a, double b) {
		System.out.println("La resta de "+a+"-"+b+" = "+(a-b));
	}
	private static void multiplication(double a, double b) {
		System.out.println("La multiplicación de "+a+"*"+b+" = "+(a*b));
	}
	private static void division(double a, double b) {
		System.out.println("La división de "+a+"/"+b+" = "+(a/b));
	}
	private static void squareRoot(double a, double b) {
		System.out.println("La raíz cuadrada de "+a+" = "+Math.sqrt(a));
		System.out.println("La raíz cuadrada de "+b+" = "+Math.sqrt(b));
	}
	private static void powerOf(double a, double b) {
		System.out.println("La potencia de "+a+" a la "+b+" = "+Math.pow(a, b));
	}
}
