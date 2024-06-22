package aula015.ex002;

public class ImovelUsado extends Imovel{

	private double valorDesconto;
	
	public ImovelUsado(String endereco, double valorBase, double valorDesconto) {
		super(endereco, valorBase);
		this.valorDesconto = valorDesconto;
	}
	
	@Override
	public void imprimirDados() {
		super.imprimirDados();
		System.out.println("Valor Desconto: " + this.valorDesconto);
	}
}
