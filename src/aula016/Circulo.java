package aula016;

public class Circulo extends Forma {
	
	private double raio;
	
	public Circulo(String cor, double raio) {
		
		super(cor);
		this.raio = raio;
	}
	
	public double calcularArea() {
		
		return this.getRaio() * this.getRaio() * 3.14;
	}
	
	public double calcularPerimetro(){
		return 2 * 3.14 * this.getRaio();
	}

	public double getRaio() {
		
		return this.raio;
	}
}
