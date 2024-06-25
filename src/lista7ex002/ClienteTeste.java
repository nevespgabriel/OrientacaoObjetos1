package lista7ex002;

public class ClienteTeste {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Nebes", "389138");
		cliente.adicionarEntrada(1, "Maçã", "Suculenta, doce", 10);
		cliente.adicionarPratoPrincipal(2, "Barco de sushi", "Vários sushis, mais de 100", 670);
		cliente.adicionarSobremesa(3, "Chocolate", "Meio amargo", 20);
		cliente.fecharConta();
	}
}
