import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        System.out.print("Q:");
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            System.out.print("a:");
            int a = in.nextInt();
            System.out.print("b:");
            int b = in.nextInt();
            System.out.print("n:");
            int n = in.nextInt();
            int potencia;
            int resultado=0;
            for (int j=0;j<n;j++) {
            	resultado=0;
            	for(int k=0;k<=j;k++) {
	            	potencia=(int) (Math.pow(2, k)*b);
	            	//System.out.print(potencia+" ");
	            	resultado+=potencia;
	             }	
            	//System.out.print(a+"+("+resultado+")  ");
            	System.out.print(a+resultado+" ");
            }
            System.out.println();
        }
        in.close();
    }
}