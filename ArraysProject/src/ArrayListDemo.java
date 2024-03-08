import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> numeros=new ArrayList<Integer>();
		numeros.add(35); //0
		numeros.add(33); 
		numeros.add(42);
		numeros.add(10); 
		numeros.add(14); 
		numeros.add(19);
		numeros.add(27); 
		numeros.add(44); 
		numeros.add(26);
		numeros.add(31);
		numeros.add(31);
		
		System.out.println(numeros.size());//el size es un método. Aqui ya no usamos length
		
		System.out.println(numeros.get(5));
		
		System.out.println(numeros.isEmpty()); //false
		System.out.println(numeros.indexOf(31)); //9
		System.out.println(numeros.lastIndexOf(31));	//10
		System.out.println(numeros.indexOf(301)); //-1 porque no existe
	    System.out.println(numeros.contains(44));//true
	    System.out.println(numeros.set(8, 300)); //remplaza el elemento de la posicion 8 por el num 300
	    System.out.println(numeros.remove(9));//elimina el elemento 9 del arreglo

	    /*System.out.println("============");
	    for (int i=0; i<numeros.size(); i++) {
	    	System.out.println(numeros.get(i));
	    }//for*/
	    System.out.println("============");

	    for (Integer numero : numeros) {
			System.out.println(numero);
		}//forEach
	    
	    numeros.forEach((num)->imprimirParesImpares(num));
	    

	}//main

	private static void imprimirParesImpares(Integer num) {
		if(num%2==0) {
			System.out.println(num+" es par");
		}else {
			System.out.println(num+" es impar");
		}
	}//imprimirParesImpares

}
