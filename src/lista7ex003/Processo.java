package lista7ex003;

public class Processo {

	private int numero;
	private String dataCriacao;
	private String descricao;
	
	public Processo(int numero, String dataCriacao, String descricao) {
		
		this.numero = numero;
		this.dataCriacao = dataCriacao;
		this.descricao = descricao;
	}

	public void imprimirDados() {
		
		System.out.println("Número do Processo: " + this.numero);
		System.out.println("Data de criação do processso: " + this.dataCriacao);
		System.out.println("Descrição do processo: " + this.descricao);
	}
	
}
