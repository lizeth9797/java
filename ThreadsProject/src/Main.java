
public class Main {

	public static void main(String[] args) {
		CicloThread t1=new CicloThread(15,"Proceso1");
		CicloThread t2=new CicloThread(10,"Proceso2");
		CicloThread t3=new CicloThread(20,"Proceso3");
		CicloThread t4=new CicloThread(5,"Proceso4");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();


	}

}
