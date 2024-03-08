import java.util.Scanner;

public class IfElseDemo {

	public static void main(String[] args) {
		System.out.print("Escribe el número de tu calificación: ");
		Scanner in= new Scanner(System.in);
		int testScore= in.nextInt();
		char grade;
		if (testScore>=90) {
			grade='A';
		}else if(testScore>=80) {
			grade='B';
		}else if(testScore>=70) {
			grade='C';
		}else if(testScore>=60) {
			grade='D';
		}else {
			grade='F';
		}//else
		System.out.println("Grade= "+grade);
		in.close(); //siempre que abramos un flujo de entrada, hay que cerrarlo al ginal de la clase
	}

}
