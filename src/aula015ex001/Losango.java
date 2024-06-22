package aula015ex001;

public class Losango extends Quadrilatero{

	private double diagonalMaior;
	private double diagonalMenor;
	
	public Losango(double diagonalMenor, double diagonalMaior) {
		this.diagonalMaior = diagonalMaior;
		this.diagonalMenor = diagonalMenor;
	}
	
	@Override
	public void calcularArea() {
		System.out.println("Área do losango: " + this.diagonalMaior * this.diagonalMenor / 2);
	}
}
