import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		System.out.print("Escribe el número del mes: ");
		Scanner in= new Scanner(System.in);
		int month= in.nextInt();
		String monthString;

		/*  antes de la versión 14, el switch case funcionaba así:
		switch (month) {
		case 1: monthString="Enero";
			break;
		case 2: monthString="Febrero";
				break;
		case 3: monthString="Marzo";
				break;
		case 4: monthString="Abril";
				break;
		case 5: monthString="Mayo";
				break;
		case 6: monthString="Junio";
				break;
		case 7: monthString="Julio";
				break;
		case 8: monthString="Agosto";
				break;
		case 9: monthString="Septiembre";
				break;
		case 10: monthString="Octubre";
				break;
		case 11: monthString="Noviembre";
				break;
		case 12: monthString="Diciembre";
				break;
		default:
			monthString="Mes incorrecto";
			break;
		}
		System.out.println(monthString);*/
		
		/*
		//desde la versión 14 tenemos:
		String monthString=switch(month) {
		case 1->"Enero";
		case 2->"Febrero";
		case 3->"Marzo";
		default->"invalido";
		};
		System.out.println(monthString);*/
		
		/*
		switch (month) {
		case 1,3,5,7,8,10,12:
			System.out.println("31");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30");
			break;
		case 2:
			System.out.println("28/29");
			break;
		default:
			System.out.println("invalido");
			break;
		}*/
		
		System.out.println(
				switch (month) {
				case 1,3,5,7,8,10,12 -> "sdsd";
				case 6,9,11 -> "30";
				case 2 -> "28/29";
				default -> "invalido";
				}
		);
		
		
		
		in.close();
	}

}
