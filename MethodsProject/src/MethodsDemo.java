
public class MethodsDemo {

	public static void main(String[] args) {
		System.out.println(sum(40,35)); //se manda a llamar al metodo de clase
		MethodsDemo demo= new MethodsDemo(); //construye un objeto
		System.out.println(demo.multiplica(9, 5));//se manda a llamar al método de instancia

		//sobrecarga de metodos:
		System.out.println(sum(1,2,10));
		System.out.println(sum(40.452,12332.3));
	}
	
	public static int sum(int a, int b) { //método estatico, puede ser mandado a llamar en otro metodo estático
		return a+b;
	}
	//SOBRECARGA DE MÉTODOS:
	public static int sum(int a, int b,int c) {
		return a+b+c;
	}

	public static double sum(double a, double b) {
		return a+b;
	}

	
	public int multiplica(int num1, int num2) { //este metodo no es estático, es de instancia y si lo queremos mandar a llamar en otro lado debemos construir un objeto
		return num1*num2;
	}
}
