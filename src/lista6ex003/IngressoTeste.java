package lista6ex003;

public class IngressoTeste {
	
	public static void main(String[] args) {
		
		IngressoNormal ingresso1 = new IngressoNormal(15, "Normal");
		CamaroteInferior ingresso2 = new CamaroteInferior(15, "Camarote Superior", 10, "Subsolo");
		CamaroteSuperior ingresso3 = new CamaroteSuperior(15, "Camarote Inferior", 15, "Céu");
	
		ingresso1.imprimirDadosIngresso();
		ingresso2.imprimirDadosIngresso();
		ingresso3.imprimirDadosIngresso();
	}
}
