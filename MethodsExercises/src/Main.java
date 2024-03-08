import java.util.Scanner;
//https://github.com/generation-org/JAVA/tree/master/Functions
public class Main
{
    public static void main( String[] args )
    {
        System.out.println( "Enter your name:  " );
    	Scanner console = new Scanner( System.in );
        String name = console.next();
        printNameLength( name );
        printNameCharacters( name );
        System.out.println( "\nEnter your lastname:  " );
        String lastName=console.next();
        printNameLength( lastName );
        printNameCharacters( lastName );
        printFullName(name,lastName);
        
        console.close();
    }

    private static void printNameLength( String data )
    {
        System.out.println("length of "+data+" is: "+data.length()); //usamos la propiedad length
    }

    private static void printNameCharacters( String data )
    {
        for(int i=0; i<data.length();i++) {
        	System.out.print(data.charAt(i)+"-");
        }
    }

    private static void printFullName(String name,String lastName) {
    	System.out.println("\nYour full name is: "+name+" "+lastName);
    	
    }

}