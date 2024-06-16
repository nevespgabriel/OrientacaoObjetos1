package lista6ex002;

public class Endereco {

	String logradouro;
	String cidade;
	int numero;
	String uf;
	String bairro;
	
	public Endereco(String logradouro, String cidade, int numero, String uf, String bairro) {

		this.logradouro = logradouro;
		this.cidade = cidade;
		this.numero = numero;
		this.uf = uf;
		this.bairro = bairro;
	}
	
	void imprimirEndereco() {
		
		System.out.println("Logradouro: " + this.logradouro);
		System.out.println("Cidade: " + this.cidade);
		System.out.println("Numero: " + this.numero);
		System.out.println("UF: " + this.uf);
		System.out.println("Bairro: " + this.bairro);
	}
}
