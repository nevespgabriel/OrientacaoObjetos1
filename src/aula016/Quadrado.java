package aula016;

public class Quadrado extends Forma{

	private double lado;
	
	public Quadrado(String cor, double lado) {
	
		super(cor);
		this.lado = lado;
	}
	
	public double calcularArea() {

		return this.getLado() * this.getLado();
	}
	
	public double calcularPerimetro() {
		
		return this.getLado() * 4;
	}

	public double getLado() {
		
		return this.lado;
	}
	
	
}
