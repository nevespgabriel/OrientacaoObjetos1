package aula015.ex002;

public class ImovelNovo extends Imovel{

	private double valorAdicional;
	
	public ImovelNovo(String endereco, double valorBase, double valorAdicional) {
		super(endereco, valorBase);
		this.valorAdicional = valorAdicional;
	}
	
	@Override
	public void imprimirDados() {
		super.imprimirDados();
		System.out.println("Valor Adicional: " + this.valorAdicional);
	}
}
