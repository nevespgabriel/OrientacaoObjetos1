package aula015ex001;

public class Retangulo extends Quadrilatero{

	private double altura;
	private double base;
	
	public Retangulo(double altura, double base) {
		this.altura = altura;
		this.base = base;
	}
	
	@Override
	public void calcularArea() {
		System.out.println("Área retângulo: " +  this.base*this.altura);
	}
}
