package lista6ex003;

public class IngressoNormal extends Ingresso{

	
	public IngressoNormal(double valor, String tipo) {
		
		super(valor, tipo);
	}
	
	public void imprimirDadosIngresso() {
		
		super.imprimirDadosIngresso();
		System.out.println("==========================");
	}
}
