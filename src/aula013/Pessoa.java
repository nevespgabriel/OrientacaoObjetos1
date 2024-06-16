package aula013;

public class Pessoa {

	protected String nome;
	protected int idade;
	protected Endereco endereco;
	
	public Pessoa(String nome, int idade, String logradouro, int numero, String bairro, String cidade, String unidadeFederativa) {
		
		this.nome = nome;
		this.idade = idade;
		this.endereco = new Endereco(logradouro, numero, bairro, cidade, unidadeFederativa);
	}
	
	void imprimirDados() {
		
		System.out.println("============================");
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade);
		endereco.imprimirEndereco();
		System.out.println("============================");
	}
}
