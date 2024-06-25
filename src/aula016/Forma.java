package aula016;

public abstract class Forma {
	
	protected String cor;
	
	public Forma(String cor) {
		
		this.cor = cor;
	}
	
	public abstract double calcularPerimetro();
	
	public abstract double calcularArea();
}
