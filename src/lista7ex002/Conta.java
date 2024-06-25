package lista7ex002;

public class Conta {
	
	private Prato pratoEntrada;
	private Prato pratoPrincipal;
	private Prato sobremesa;
	private double valorTotal;
	
	public Conta() {

		this.valorTotal = 0;
	}
	
	public void adicionarEntrada(int numero, String nome, String descricaoIngredientes, double precoUnitario) {
		
		if(pratoEntrada == null) {
			
			pratoEntrada = new PratoEntrada(numero, nome, descricaoIngredientes, precoUnitario);
		} else {
			
			System.out.println("Prato já foi adicionado anteriormente.");
		}
		
	}
	
	public void adicionarPratoPrincipal(int numero, String nome, String descricaoIngredientes, double precoUnitario) {
		
		if(pratoPrincipal == null) {
			
			pratoPrincipal = new PratoPrincipal(numero, nome, descricaoIngredientes, precoUnitario);
		} else {
			
			System.out.println("Prato já foi adicionado anteriormente.");
		}
	}
	
	public void adicionarSobremesa(int numero, String nome, String descricaoIngredientes, double precoUnitario) {
		
		if(sobremesa == null) {
			
			sobremesa = new Sobremesa(numero, nome, descricaoIngredientes, precoUnitario);
		} else {
			
			System.out.println("Prato já foi adicionado anteriormente.");
		}
	}
	
	private double calcularTotal() {
		
		if(pratoEntrada != null) {
			
			this.valorTotal += pratoEntrada.getPrecoUnitario();
		}
		if(pratoPrincipal != null) {
			
			this.valorTotal += pratoPrincipal.getPrecoUnitario();
		}
		if(sobremesa != null) {
			
			this.valorTotal += sobremesa.getPrecoUnitario();
		}
		this.valorTotal += this.valorTotal*0.1;
		return this.valorTotal;
	}
	
	public void fecharConta() {
		
		System.out.println("Pratos consumidos:\n");
		if(pratoEntrada != null) {
			
			System.out.println("Prato entrada - " + pratoEntrada.getNome() + " : R$" + pratoEntrada.getPrecoUnitario() );
		}
		if(pratoPrincipal != null) {
			
			System.out.println("Prato principal - " + pratoPrincipal.getNome() + " : R$" + pratoPrincipal.getPrecoUnitario() );
		}
		if(sobremesa != null) {
			
			System.out.println("Sobremesa - " + sobremesa.getNome() + " : R$" + sobremesa.getPrecoUnitario());
		}
		System.out.println("Total a ser pago: R$" + this.calcularTotal());
	}
}
