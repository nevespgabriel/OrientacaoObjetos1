package lista7ex002;

public class Cliente {
	
	private String nome;
	private String cpf;
	private Conta conta;
	
	public Cliente(String nome, String cpf) {
		
		this.nome = nome;
		this.cpf = cpf;
		this.conta = new Conta();
	}
	
	public void adicionarEntrada(int numero, String nome, String descricaoIngredientes, double precoUnitario) {
		
		conta.adicionarEntrada(numero, nome, descricaoIngredientes, precoUnitario);
	}
	
	public void adicionarPratoPrincipal(int numero, String nome, String descricaoIngredientes, double precoUnitario) {
		
		conta.adicionarPratoPrincipal(numero, nome, descricaoIngredientes, precoUnitario);
	}
	
	public void adicionarSobremesa(int numero, String nome, String descricaoIngredientes, double precoUnitario) {
		
		conta.adicionarSobremesa(numero, nome, descricaoIngredientes, precoUnitario);
	}
	
	public void fecharConta() {
		
		conta.fecharConta();
	}
}
