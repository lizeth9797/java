import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> autos=new HashSet<String>();
		
		System.out.println(autos.add("Volvo"));//true
		System.out.println(autos.add("BMW"));//true
		System.out.println(autos.add("VW"));//true
		System.out.println(autos.add("Ford"));//true
		System.out.println(autos.add("Audi"));//true
		System.out.println(autos.add("BMW"));//false
		System.out.println(autos.size());//5
		System.out.println(autos.isEmpty());//false
		
		autos.forEach((marca)->mostrarMarca(marca));
		
		
	}

	private static void mostrarMarca(String marca) {
		
		System.out.println("+------------");
		System.out.println("|   "+marca.toUpperCase());
		System.out.println("+------------");

	}//mostrarMarca

}
