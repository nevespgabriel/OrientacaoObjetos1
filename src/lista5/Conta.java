package lista5;

public class Conta {

	private int numero;
	private double saldo;
	private Cliente cliente;
	
	public Conta(int numero, Cliente cliente) {

		this.numero = numero;
		this.saldo = 0;
		this.cliente = cliente;
	}
	
	public Conta(int numero, String nome, String cpf) {

		this.numero = numero;
		this.saldo = 0;
		this.cliente = new Cliente(nome, cpf);
	}

	public void sacarConta(double valor) {
		
		if(valor <= this.saldo) {
			
			this.saldo -= valor;
			System.out.println("Depósito realizado com sucesso!");
			return;
		}
		System.out.println("Não foi possível sacar. Valor maior que o saldo.");
	}
	
	public void depositarConta(double valor) {
		
		this.saldo += valor;
		System.out.println("Depósito realizado com sucesso.");
	}
	
	public int getNumero() {
		return this.numero;
	}

	public double getSaldo() {
		return this.saldo;
	}
	
}
