import java.util.Random;

public class CicloThread extends Thread{
	private int max;
	private Random random;
	
	public CicloThread(int max,String name) {
		this.max=max;
		this.setName(name);
		random=new Random();

	}
	@Override
	public void run() {
		int cont=0;
		while(cont<this.max) {
			System.out.println(this.getName()+": "+cont++);
			try {
				Thread.sleep(random.nextInt(3000));//sirve para pausar cierto tiempo el proceso
			} catch (InterruptedException e) {
				e.printStackTrace();
			}//catch
		}//while
		System.out.println("FIN"+this.getName());
	}//run
}//CicloThread
