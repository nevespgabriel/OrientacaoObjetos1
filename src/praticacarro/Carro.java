package praticacarro;

public class Carro {
	
	String modelo;
	String marca;
	int ano;
	String placa;
	String cor;
	boolean ligado=false;
	double velocidade=0;
	
	public Carro(String modelo, String marca, int ano, String placa, String cor) {
		
		this.modelo = modelo;
		this.marca = marca;
		this.ano = ano;
		this.placa = placa;
		this.cor = cor;
	}
	
	public void ligar() {
		
		if(ligado == false) {
			ligado = true;
		}		
	}
	
	public void desligar() {
		
		if(ligado) {
			ligado = false;
		}
	}
	
	public void acelerar(int valor) {
		
		if(ligado) {
			velocidade+=valor;
		}
	}
	
	public void frear(int valor) {
		
		if((ligado)&&(valor<=velocidade)) {
			velocidade -= valor;
		}
	}
	
}
