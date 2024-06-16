package lista6ex002;

public class ImovelNovo extends Imovel{

	private double adicionalPreco;
	
	public ImovelNovo(String logradouro, String cidade, int numero, String uf, String bairro, double valorBase, double adicionalPreco) {
		
		super(logradouro, cidade, numero, uf, bairro, valorBase);
		this.adicionalPreco = adicionalPreco;
	}
	
	public void imprimirDados() {
		
		System.out.println("===============================");
		endereco.imprimirEndereco();
		System.out.println("Valor Base: " + this.valorBase);
		System.out.println("Adicional de Preço: " + this.adicionalPreco);
		System.out.println("===============================");
	}
}
