package aula016;

public class Retangulo extends Forma{
	
	private double base;
	private double altura;
	
	public Retangulo(String cor, double base, double altura) {
		
		super(cor);
		this.base = base;
		this.altura = altura;
	}
	
	public double calcularArea() {
		
		return this.getBase() * this.getAltura();
	}
	
	public double calcularPerimetro() {
		
		return (this.getAltura() * 2) + (this.getBase() * 2);
	}

	public double getBase() {
		
		return this.base;
	}

	public double getAltura() {
		return this.altura;
	}
	
	
}
