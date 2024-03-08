import java.util.ArrayList;

public class Almacen {
	public final static ArrayList<Integer> lista=new ArrayList<Integer>();//Es para declarar una cosntante que solo se podrá accedes desde la clase y nunca más podremos reasignarle valor
	public final static int max=100;
	public static void main(String[] args) {
		Productor prod1= new Productor("Productor 1");
		Consumidor cons1= new Consumidor("Consumidor 1");
		Thread t1=new Thread(cons1);// este nuevo objeto Thread lo creamos porque consumidor no heredó de Thread, sino que implementó la interfaz Runnable por lo tanto no podemos decirle cons1.start() ya que no existe ese método en runnable. Mientras que en los Threads sí.
		
		prod1.start();
		t1.start();

	}
}
