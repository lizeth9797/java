
public class Rombo implements FigurasGeometricas{
	private String nombre;
	private double diagonalMenor;
	private double diagonalMayor;
	private double lado;
	public Rombo(String nombre, double diagonalMenor, double diagonalMayor, double lado) {
		super();
		this.nombre = nombre;
		this.diagonalMenor = diagonalMenor;
		this.diagonalMayor = diagonalMayor;
		this.lado = lado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getDiagonalMenor() {
		return diagonalMenor;
	}
	public void setDiagonalMenor(double diagonalMenor) {
		this.diagonalMenor = diagonalMenor;
	}
	public double getDiagonalMayor() {
		return diagonalMayor;
	}
	public void setDiagonalMayor(double diagonalMayor) {
		this.diagonalMayor = diagonalMayor;
	}
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	@Override
	public String toString() {
		return "Rombo [nombre=" + nombre + ", diagonalMenor=" + diagonalMenor + ", diagonalMayor=" + diagonalMayor
				+ ", lado=" + lado + "]";
	}
	
	public double calcularArea() {
		return (diagonalMenor*diagonalMayor)/2;
	}

	public double calcularPerimetro() {
		return lado*4;
	}
}
