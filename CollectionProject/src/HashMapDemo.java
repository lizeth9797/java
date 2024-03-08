import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String,String> colores= new HashMap<String,String>();
		colores.put("RED","#FF0000");
		colores.put("GREEN","#FF0000");
		colores.put("BLUE","#FF0000");
		colores.put("WHITE","#FF0000");
		colores.put("BLACK","#000000");
		colores.put("FUCHSIA","#FF0000");
		colores.put("PINK","#FF0000");
		colores.put("YELLOW","#FF0000");
		colores.put("CYAN","#FF0000");

		System.out.println(colores.put("NAVY", "#000080"));//null
		System.out.println(colores.put("NAVY", "#000088"));//000080 //remplazará la linea anterior porque no puede haber elementos duplicados
		
		System.out.println("Tamaño del HashMap: " + colores.size());
        System.out.println("Valor asociado a la clave 'NAVY': " + colores.get("NAVY"));
        
        System.out.println("Valores en el HashMap:");
		for (String valor : colores.values()) { //valores
			System.out.println(valor);
		}//forEach
       
		System.out.println("Claves y valores en el HashMap:");
		for (String llave : colores.keySet()) { //Llaves
			System.out.println(llave+"= "+colores.get(llave));
		}//forEach

        System.out.println("Tabla de colores:");
		colores.forEach((k,v)->imprimeColores(k,v));
		
	}//main

	private static void imprimeColores(String k, String v) {
		String relleno="                  ";
		
		System.out.println("+------------+------------+------------");
		System.out.println("|"+(k+relleno).substring(0,18)+
				                       "|       "+v+"     |"); //el substring solo es para que ponga max 18 caracteres y la tabla se vea pareja independientemente del nombre del color, ya que no tienen la misma cantidad de letras
		System.out.println("+------------+------------+------------");
	}

}
