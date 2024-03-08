
public class Ciclos {

	public static void main(String[] args) {
final int MAX=100;  //final quiere decir que esta variable es final, que nunca más podremos reasignarle valor
		
		/*
		for(int cont=0;cont<MAX;cont+=5) {
			System.out.println(cont);	
			if(cont==80) {
				break; //aqui termina el ciclo
			}
		}
		System.out.println("=======2doFor========");	
		for(int cont=MAX; cont>0;cont-=5) { 
			if(cont==50) {
				continue; //si cont ==50 no hagas nada, vuelve al ciclo for
			}
			System.out.println(cont);
		}
		System.out.println("===============");	
		*/
		

		int cont=0; 
		while(cont<MAX) { 
			if(cont==80) {
				break;
			}
			System.out.println(cont);
			cont +=5;
		}
		System.out.println("=======kjhkjhkh========");	
		
		cont=MAX; 
		while(cont>0) { 
			if(cont==50) {
				cont-=5; //si no agregamos esto se creará un bucle infinito
				continue;
			}
			System.out.println(cont);
			cont -=5;
		}
		System.out.println("===============");	
		
		
		/*
		int contador=MAX;
		do {
			System.out.println(contador);
			contador -=5;
		}while(contador>0);
		System.out.println("===============");	
		
		
		int contador2=0;
		do {
			System.out.println(contador2);
			contador2 +=5;
		}while(contador2<MAX);
		
		*/

	}

}
