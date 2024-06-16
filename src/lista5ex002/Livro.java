package lista5ex002;

public class Livro {

	private String titulo;
	private String autor;
	private int anoPublicacao;
	private String editora;
	private int numPaginas;
	private boolean disponibilidade;
	private int diaEmprestimo;
	
	public Livro(String titulo, String autor, int anoPublicacao, String editora, int numPaginas) {

		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
		this.editora = editora;
		this.numPaginas = numPaginas;
		this.disponibilidade = true;
	}

	public String getTitulo() {
		
		return titulo;
	}

	public boolean isDisponibilidade() {
		
		return disponibilidade;
	}

	public void setDisponibilidade(boolean disponibilidade) {
		
		this.disponibilidade = disponibilidade;
	}
	
	public void setDiaEmprestimo(int diaEmprestimo) {
		
		this.diaEmprestimo = diaEmprestimo;
	}
	
	public int getDiaEmprestimo() {
		
		return this.diaEmprestimo;
	}
}