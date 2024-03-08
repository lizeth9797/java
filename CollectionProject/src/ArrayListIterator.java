import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {

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
		
		Iterator<Integer> iterator=numeros.iterator();
		int total=0;
		while(iterator.hasNext()) {
			total += iterator.next();
			//System.out.println(iterator.next());

		}//while
		System.out.println(total);
		


	}//main


}
