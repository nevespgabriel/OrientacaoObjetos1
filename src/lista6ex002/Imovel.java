package lista6ex002;

public class Imovel {

	protected Endereco endereco;
	protected double valorBase;
	
	public Imovel(String logradouro, String cidade, int numero, String uf, String bairro, double valorBase) {
		
		this.endereco = new Endereco(logradouro, cidade, numero, uf, bairro);
		this.valorBase = valorBase;
	}
	
	public void imprimirDados() {
		
		System.out.println("===============================");
		endereco.imprimirEndereco();
		System.out.println("Valor Base: " + this.valorBase);
		System.out.println("===============================");
	}
}
