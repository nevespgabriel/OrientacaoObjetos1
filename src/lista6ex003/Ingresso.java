package lista6ex003;

public class Ingresso {

	protected double valor;
	protected String tipo;
	
	public Ingresso(double valor, String tipo) {
		
		this.valor = valor;
		this.tipo = tipo;
	}
	
	public void imprimirDadosIngresso() {
		
		System.out.println("==========================");
		System.out.println("INGRESSO");
		System.out.println("Valor: R$" + String.format("%.2f", this.valor));
		System.out.println("Tipo: " + this.tipo);
	}
}
