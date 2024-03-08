
public class Operadores {

	public static void main(String[] args) {
		int likes=0;
		
		System.out.println(++likes); //1
		likes+= 10; //1+10
		System.out.println(likes); //11
		likes-=2;
		System.out.println(likes); //9
		likes/=3;
		System.out.println(likes); //3
		likes*=4;
		System.out.println(likes); //12 
		System.out.println(likes%2); //0 
		System.out.println((likes>10)?"bien":"mal"); //bien
		System.out.println((likes>10) || (likes==15)); //true
		System.out.println((likes>10) && (likes==15)); //false
		System.out.println(1+2*2*3*4/5); //10 porque todos los num los toma como enteros
		System.out.println(1F+2F*2F*3F*4F/5F); //10.6 
	}

}
