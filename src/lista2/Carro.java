package lista2;

public class Carro {

	String modelo;
	String marca;
	int ano;
	String cor;
	int renavam;
	int chassi;
	String placa;
	
	public Carro(String modelo, String marca, int ano, String cor, int renavam, int chassi, String placa) {
		
		this.modelo = modelo;
		this.marca = marca;
		this.ano = ano;
		this.cor = cor;
		this.renavam = renavam;
		this.chassi = chassi;
		this.placa = placa;
	}
	
	public void acelerar() {
		
		System.out.println(modelo + " está acelerando");
	}
	
	public void frear() {
		
		System.out.println(modelo + " está freando");
	}
	
	public void ligar() {
		
		System.out.println(modelo + " está ligando");
	}
	
	public void desligar() {
		
		System.out.println(modelo + " está desligando");
	}
}
