
public class Productor extends Thread{

	public Productor(String name) {
		this.setName(name);
	}//constructor
	
	@Override
	public void run() {
		System.out.println("INICIO del Productor "+getName());
		
		int cont=0;
		while(cont < Almacen.max) {
		
		Integer num=Integer.valueOf((int)(Math.random()*500));
		Almacen.lista.add(num);
		System.out.println(cont+" Productor "+this.getName()+" num: "+num+" size: "+Almacen.lista.size());
		try {
			Thread.sleep(num);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cont++;
		
		}//while
		System.out.println(" ******* FIN del Productor "+getName());
	}
}
