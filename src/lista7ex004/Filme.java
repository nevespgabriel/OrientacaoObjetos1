package lista7ex004;

public class Filme {
	
	private String titulo;
	private int duracao;
	private double preco;
	private int diaLocacao;
	private int diaPrevistoDevolucao;
	private int diaDevolucao;
	Cliente clienteAlocou;
	
	public Filme(String titulo, int duracao, double preco) {
		
		this.titulo = titulo;
		this.duracao = duracao;
		this.preco = preco;
	}
	
	public void locarFilme(Cliente clienteAlocou, int diaLocacao) {
		
		if(this.clienteAlocou == null) {
			
			this.clienteAlocou = clienteAlocou;
			this.diaLocacao = diaLocacao;
			this.diaPrevistoDevolucao = this.diaLocacao + 3;
		} else {
			
			System.out.println("Filme já foi alocado e está indisponível.");
		}
	}
	
	private double calcularMulta() {
		
		return (this.diaDevolucao - this.diaPrevistoDevolucao) * 2;
	}
	
	public void exibirRelatorio(){
		
		System.out.println("==============================================");
		System.out.println("Título do filme: " + this.titulo);
		System.out.println("Nome do cliente: " + this.clienteAlocou.getNome());
		System.out.println("Dia da locação: " + this.diaLocacao);
		System.out.println("Dia previsto da devolução: " + this.diaPrevistoDevolucao);
		System.out.println("Dia da devolução: " + this.diaDevolucao);
		System.out.println("Valor do filme: R$" + this.preco);
		System.out.println("Valor da multa: R$" + this.calcularMulta());
		System.out.println("Valor total da locação: R$" + (this.preco + this.calcularMulta()));
		System.out.println("==============================================");
	}
	
	public void devolverFilme(int diaDevolucao) {
		
		if(this.clienteAlocou != null) {
			
			this.diaDevolucao = diaDevolucao;
			this.exibirRelatorio();
			this.clienteAlocou = null;
		} else {
			
			System.out.println("O filme não foi alocado. Impossível devolver.");
		}
	}
}
