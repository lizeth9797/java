
public class TiposDatos {

	public static void main(String[] args) {
		byte edad=15;
		short registros=10000;
		int camposXRegistro=2000000;
		long caracteres=300000000;
		double iva=0.16;
		float comision=256.53F; //cualquier numero con punto decimal es un double por defecto, por eso usamos F al final del valor
		char letra='h'; //usamos comillas simples al definir un caracter
		boolean esValido=false;
		System.out.println(edad);
		System.out.println(registros);
		System.out.println(camposXRegistro);
		System.out.println(caracteres);
		System.out.println(iva);
		System.out.println(comision);
		System.out.println(letra);
		System.out.println(esValido);
		edad=(byte)comision;
		System.out.println(edad);

	}

}
