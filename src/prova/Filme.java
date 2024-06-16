package prova;

public class Filme {

	private String titulo;
	private int anoLancamento;
	private int faixaEtaria;
	private String genero;
	
	public Filme(String titulo, int anoLancamento, int faixaEtaria, String genero) {

		this.titulo = titulo;
		this.anoLancamento = anoLancamento;
		this.faixaEtaria = faixaEtaria;
		this.genero = genero;
	}
	
	public String getTitulo() {
		
		return this.titulo;
	}
	
	public int getFaixaEtaria() {
		
		return this.faixaEtaria;
	}
	
	public void listarFilme() {
		
		System.out.println("=================================");
		System.out.println("Título: " + this.titulo);
		System.out.println("Ano de Lançamento: " + this.anoLancamento);
		System.out.println("Faixa Etária: " + this.faixaEtaria);
		System.out.println("Gênero: " + this.genero);
		System.out.println("=================================");
	}
}
