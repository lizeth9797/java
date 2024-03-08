import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
//https://www.hackerrank.com/challenges/one-month-preparation-kit-plus-minus/problem?isFullScreen=true
class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    	int n=arr.size();
    	//System.out.println(arr);
    	//System.out.println(n);
    	float positive=0;
    	float negative=0;
    	float zero=0;
    	for (Integer number : arr) {
    		if(number>0) {
    			positive++;
    		}else if(number<0) {
    			negative++;
    		}else if(number==0) {
    			zero++;
    		}
		}
    	String ratio1= String.format("%.6f", positive/n);
    	String ratio2= String.format("%.6f", negative/n);
    	String ratio3= String.format("%.6f", zero/n);

    	System.out.println(ratio1);
    	System.out.println(ratio2);
    	System.out.println(ratio3);


    }

}

public class Ratio {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n;
        do {
        	 n = Integer.parseInt(bufferedReader.readLine().trim()); //lee una linea y quita los espacios
        }while(n<0 || n>100);
        //lista de enteros
        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))//Replace:  elimina cualquier espacio en blanco al final de la linea. Split:separa las entradas con un espacio
            .map(Integer::parseInt) //convierte cada cadena a su equivalente en entero
            .collect(toList()); //los enteros convertidos se recopilan en una lista y son almacenados en la variable "arr"

        Result.plusMinus(arr);
        bufferedReader.close();
    }
}
