import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class IfElseStatements {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
    	System.out.println("Enter a number between 1 al 100:");
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        while(N<1 || N>100) {
        	System.out.println("\nEnter a number between 1 al 100:");
             N = scanner.nextInt();
        }

        if(N%2!=0) {
        	System.out.println("Weird");
        }else if((N>=2 && N<=5) || N>20) {
        	System.out.println("Not Weird");
        }else if(N>=6 && N<=20) {
        	System.out.println("Weird");
        }else {
        	System.out.println("Invalid");
        }
        
   

        scanner.close();
    }
}
