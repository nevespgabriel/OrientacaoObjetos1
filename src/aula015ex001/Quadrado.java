package aula015ex001;

public class Quadrado extends Quadrilatero{

	private double lado;
	
	public Quadrado(double lado) {
		this.lado = lado;
	}
	
	@Override
	public void calcularArea() {
		System.out.println("Área quadrado: " + this.lado*this.lado);
	}
}
