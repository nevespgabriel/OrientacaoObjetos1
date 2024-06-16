package aula013;

public class Professor extends Pessoa{

	private double salarioBase;
	private double salarioTitulacao;
	
	public Professor(String nome, int idade, double salarioBase, double salarioTitulacao, String logradouro, int numero, String bairro, String cidade, String unidadeFederativa){
		
		super(nome, idade, logradouro, numero, bairro, cidade, unidadeFederativa);
		this.salarioBase = salarioBase;
		this.salarioTitulacao = salarioTitulacao;
	}
	
	double calcularSalario() {
		
		return this.salarioBase + this.salarioTitulacao;
	}
	
	void imprimirDados() {
		
		System.out.println("============================");
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade);
		endereco.imprimirEndereco();
		System.out.println("Salário Base: R$" + String.format("%.2f", this.salarioBase));
		System.out.println("Salário Titulação: R$" + String.format("%.2f",this.salarioTitulacao));
		System.out.println("============================");
	}
}
