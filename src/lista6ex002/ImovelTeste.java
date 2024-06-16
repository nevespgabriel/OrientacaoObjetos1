package lista6ex002;

public class ImovelTeste {

	public static void main(String[] args) {
		
		ImovelNovo imovel1 = new ImovelNovo("Rua João de Paula", "Ponta Fina", 1762, "PR", "Uvaranas", 200000, 15000);
		ImovelVelho imovel2 = new ImovelVelho("Rua Pedro Álvares Cabral", "Lagoinha", 2918, "BA", "Sertão", 100000, 10);
		imovel1.imprimirDados();
		imovel2.imprimirDados();
	}
		
}
