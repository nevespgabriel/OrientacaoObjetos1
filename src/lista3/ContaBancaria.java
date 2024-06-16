package lista3;

public class ContaBancaria {

	private static int cont;
	private int numeroAgencia;
	private int numeroConta;
	private double saldo;
	
	public ContaBancaria(int numeroAgencia) {
		cont+=1;
		this.numeroAgencia = numeroAgencia;
		this.numeroConta = cont;
		this.saldo = 0;
	}
	
	public void sacar(double valor) {
		
		if ((valor <= saldo)&&(valor > 0)) {
			this.saldo -= valor;
			System.out.println("Saque de R$" + String.format("%.2f", valor) + " realizado com sucesso.");
		}
		else {
			System.out.println("ERRO. Impossível sacar valor maior que seu saldo ou valor igual ou menor que 0.");
		}
	}
	
	public void depositar(double valor) {
		
		if(valor > 0) {
			this.saldo += valor;
			System.out.println("R$" + String.format("%.2f", valor) + " depositados com sucesso.");
		}
		else {
			System.out.println("Impossível depositar valor menor ou igual a zero.");
		}
	}
	
	public void verificarSaldo() {
		
		System.out.println("Saldo disponível = R$" + String.format("%.2f", this.saldo));
	}
	
	public double getSaldo() {
		
		return this.saldo;
	}
	
	public String toString() {
		
		return this.numeroAgencia + " - " + this.numeroConta + " - " + this.saldo;
	}
}
