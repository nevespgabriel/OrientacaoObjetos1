package aula015.ex002;

public class ImovelTeste {

	public static void main(String[] args) {
		
		Imovel imovelUsado = new ImovelUsado("João Cecy Filho", 200000, 20000);
		Imovel imovelNovo = new ImovelNovo("Ermelino de Leão", 300000, 3000);
		
		imovelUsado.imprimirDados();
		imovelNovo.imprimirDados();
	}
}
