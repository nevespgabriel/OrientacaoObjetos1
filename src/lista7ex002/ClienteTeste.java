package lista7ex002;

public class ClienteTeste {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Nebes", "389138");
		cliente.adicionarEntrada(1, "Sushi humano", "1 kg de cérebro, 2 toneladas de pele de pessoas inconvenientes", 150);
		cliente.adicionarPratoPrincipal(2, "Marcos Fidelis", "CHEGAAAAAAA", 20);
		cliente.adicionarSobremesa(3, "Eu", "Lenda", 3000);
		cliente.fecharConta();
	}
}
