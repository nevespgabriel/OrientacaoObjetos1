package lista5;

public class BancoTeste {

	public static void main(String[] args) {
		
		Banco banco = new Banco("Santander"); 
		banco.criarConta(0, "Aníbal Mendes", "17394538541");
		banco.criarConta(1, "Octacília Dalega", "13470024018");
		banco.verificarSaldo(0);
		banco.depositar(0, 5073.9);
		banco.verificarSaldo(0);
		banco.sacar(0, 2637.12);
		banco.verificarSaldo(1);
	}
}
