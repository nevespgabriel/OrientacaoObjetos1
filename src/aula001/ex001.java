package aula001;

public class ex001 {
	
	public static void main(String[] args) {
		
		String produto1 = "Notebook", produto2 = "SSD";
		double precoProduto1 = 3500.00, precoProduto2 = 250.00;
		
		System.out.println("Produtos:");
		System.out.println(produto1 + " por apenas R$" + String.format("%.2f", precoProduto1));
		System.out.println(produto2 + " por apenas R$" + String.format("%.2f", precoProduto2));
	}
}


