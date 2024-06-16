package aula013;

public class Endereco {

	private String logradouro;
	private int numero;
	private String bairro;
	private String cidade;
	private String unidadeFederativa;
	
	public Endereco(String logradouro, int numero, String bairro, String cidade, String unidadeFederativa) {
		
		this.logradouro = logradouro;
		this.bairro = bairro;
		this.numero = numero;
		this.cidade = cidade;
		this.unidadeFederativa = unidadeFederativa;
	}
	
	public void imprimirEndereco() {
		
		System.out.println("Logradouro: " + this.logradouro);
		System.out.println("Número: " + this.numero);
		System.out.println("Bairro: " + this.bairro);
		System.out.println("Cidade: " + this.cidade);
		System.out.println("Unidade Federativa: " + this.unidadeFederativa);
	}
}
