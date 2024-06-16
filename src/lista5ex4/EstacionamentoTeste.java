package lista5ex4;

public class EstacionamentoTeste {

	public static void main(String[] args) {
		
		Estacionamento est = new Estacionamento();
		est.adicionarVaga(1);
		est.alocarVaga(2, "ARO-6669", 15);
		est.liberarVaga(1, 19);
	}
}
