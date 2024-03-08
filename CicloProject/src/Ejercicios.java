
public class Ejercicios {

	public static void main(String[] args) {
		
		int numero=4;
		for(int i=0;i<numero;i++) {
			//System.out.print(i+1);
			for(int j=0;j<numero;j++) {
				System.out.println((i+1)+""+(j+1));
			}
			System.out.println();
		}
		System.out.println("===============");
		
		numero=6;
		char ast='*';
		int cont=0;
		for(int i=numero;i>0;i--) {
			cont=0;
			do {
				System.out.print(ast);
				cont++;
			}while(cont<i);
			System.out.println();
		}
		System.out.println("===============");
		
		numero=5;
		for(int i=0;i<numero;i++) {
			cont=0;
			do {
				System.out.print(ast);
				cont++;
			}while(i>=cont);
			System.out.println();
		}
		
	}

}
