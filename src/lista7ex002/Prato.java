package lista7ex002;

public abstract class Prato {

	protected int numero;
	protected String nome;
	protected String descricaoIngredientes;
	protected double precoUnitario;
	
	public Prato(int numero, String nome, String descricaoIngredientes, double precoUnitario) {

		this.numero = numero;
		this.nome = nome;
		this.descricaoIngredientes = descricaoIngredientes;
		this.precoUnitario = precoUnitario;
	}

	public double getPrecoUnitario() {
		
		return this.precoUnitario;
	}

	public String getNome() {
		
		return this.nome;
	}
	
	
}
