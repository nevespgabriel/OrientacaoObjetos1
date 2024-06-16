package lista6ex003;

public class IngressoVip extends Ingresso{

	private double valorAdicional;
	private String localizacao;
	
	public IngressoVip(double valor, String tipo, double valorAdicional, String localizacao) {
		
		super(valor, tipo);
		this.valorAdicional = valorAdicional;
		this.localizacao = localizacao;
	}
	
	public void imprimirDadosIngresso() {
		
		super.imprimirDadosIngresso();
		System.out.println("Valor adicional: " + this.valorAdicional);
		System.out.println("Valor total: " + calcularValorIngressoVip());
		System.out.println("Localização: " + this.localizacao);
		System.out.println("==========================");
	}
	
	private double calcularValorIngressoVip() {
		
		return (this.valor + this.valorAdicional);
	}
}
