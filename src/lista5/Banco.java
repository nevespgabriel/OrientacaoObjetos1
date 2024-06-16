package lista5;
import java.util.List;
import java.util.ArrayList;

public class Banco {

	private String nome;
	private List<Conta> contas;
	
	public Banco(String nome) {
		
		this.nome = nome;
		this.contas = new ArrayList<Conta>();
	}
	
	public void criarConta(int numero, String nome, String cpf) {
		
		Conta contaBancaria = new Conta(numero, nome, cpf);
		this.contas.add(contaBancaria);
		System.out.println("Conta " + numero + " criada com sucesso!");
	}
	
	public void excluirConta(int numero) {
		
		for(Conta contaBancaria : this.contas) {
			
			if(numero == contaBancaria.getNumero()) {
				
				this.contas.remove(contaBancaria);
				System.out.println("Conta " + numero + " removida com sucesso!");
				return;
			}
			System.out.println("Não foi encontrada nenhuma conta bancária correspondente.");;
		}
	}
	
	public void sacar(int numConta, double valor) {
		
		for(Conta contaBancaria : this.contas) {
			
			if(numConta == contaBancaria.getNumero()){
				
				contaBancaria.sacarConta(valor);
				return;
			}
		}
		System.out.println("Não foi encontrada conta bancária correspondente.");
	}
	
	public void depositar(int numConta, double valor) {
		
		for(Conta contaBancaria : this.contas) {
			
			if(numConta == contaBancaria.getNumero()) {
				
				contaBancaria.depositarConta(valor);
				return;
			}
		}
		System.out.println("Não foi encontrada conta bancária correspondente.");
	}
	
	public void verificarSaldo(int numConta) {
		
		for(Conta contaBancaria : this.contas) {
			
			if(numConta == contaBancaria.getNumero()) {
				
				System.out.println(String.format("%.2f", contaBancaria.getSaldo()));
			}
		}
	}
}
