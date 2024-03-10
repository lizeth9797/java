import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;
//https://www.hackerrank.com/challenges/prime-checker/problem?isFullScreen=true
	class Prime{
		public void checkPrime(int ... numbers) { //metodo dentro de la clase Prime para determinar primos
			for (int i : numbers) { 
				boolean prime=true;
				if(i>1) {
					//modulo para saber si es divisible por otro num diferente a el mismo o 1
					for(int j=(i-1);j>1;j--) { 
						if(i%j==0) { 
							prime=false;
							break;
						}
					}
				}else {
					prime=false;
				}
				if(prime) {
					System.out.print(i+" ");
				}
			}
			System.out.println();
		}
	}
	
	
public class Primos {
	public static void main(String[] args) {
		try{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n1=Integer.parseInt(br.readLine());
		int n2=Integer.parseInt(br.readLine());
		int n3=Integer.parseInt(br.readLine());
		int n4=Integer.parseInt(br.readLine());
		int n5=Integer.parseInt(br.readLine());
		Prime ob=new Prime();
		ob.checkPrime(n1);
		ob.checkPrime(n1,n2);
		ob.checkPrime(n1,n2,n3);
		ob.checkPrime(n1,n2,n3,n4,n5);	
		//revisa si hay sobrecarga de metodos:
		Method[] methods=Prime.class.getDeclaredMethods();
		Set<String> set=new HashSet<>();
		boolean overload=false;
		for(int i=0;i<methods.length;i++)
		{
			if(set.contains(methods[i].getName()))
			{
				overload=true;
				break;
			}
			set.add(methods[i].getName());
			
		}
		if(overload)
		{
			throw new Exception("Overloading not allowed");
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
}

