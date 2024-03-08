
public class Consumidor implements Runnable{ //le implementamos el Runnable para que funcione como un Thread
	private String name;
	public Consumidor(String name) {
		this.name=name;
	}//constructor
	
	
	public String getName() {
		return name;
	}

	@Override
	public void run() {
		System.out.println("INICIANDO Consumidor "+getName());
		int cont=0;
		while(cont<Almacen.max) {
			if(Almacen.lista.size()==0) {
				System.out.println("Consumidor "+getName()+" Zzzzz ");
				try {
					Thread.sleep(2000);//es mayor que el tiempo del productor
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}//if
			System.out.println(cont+" Consumiendo "+getName()+
					" "+Almacen.lista.remove(0)); //elimina el elemento del index 0
			cont ++;
		}//while
		System.out.println("FINALIZANDO Consumidor "+getName());

	}
}
