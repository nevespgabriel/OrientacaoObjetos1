package lista6ex002;

public class ImovelVelho extends Imovel{
	
	private double precoDesconto;

	public ImovelVelho(String logradouro, String cidade, int numero, String uf, String bairro, double valorBase, double precoDesconto) {
		
		super(logradouro, cidade, numero, uf, bairro, valorBase);
		this.precoDesconto = precoDesconto;
	}
	
	public void imprimirDados() {
		
		System.out.println("===============================");
		endereco.imprimirEndereco();
		System.out.println("Valor Base: " + this.valorBase);
		System.out.println("Desconto do preço: " + this.precoDesconto);
		System.out.println("===============================");
	}
}
