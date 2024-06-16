package lista3;

public class Calculadora {

	private String marca;
	private String modelo;
	private String tipo;
	private int memoriaInterna;
	
	public Calculadora(String marca, String modelo, String tipo, int memoriaInterna) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.tipo = tipo;
		this.memoriaInterna = memoriaInterna;
	}
	
	String getMarca() {
		
		return this.marca;
	}
	
	String getModelo() {
		
		return this.modelo;
	}
	
	String getTipo() {
		
		return this.tipo;
	}
	
	int getMemoriaInterna() {
		
		return this.memoriaInterna;
	}
	
	int somar(int valor1, int valor2) {
		
		return valor1 + valor2;
	}
	
	int subtrair(int valor1, int valor2) {
		
		return valor1 - valor2;
	}
	
	int multiplicar(int valor1, int valor2) {
		
		return valor1 * valor2;
	}
	
	int dividir(int valor1, int valor2) {
		
		return valor1 / valor2;
	}
	
	public String toString() {
		
		return this.marca + " - " + this.modelo + " - " + this.tipo + " - " + this.memoriaInterna;
	}
}
