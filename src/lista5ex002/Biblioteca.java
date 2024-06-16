package lista5ex002;
import java.util.List;
import java.util.ArrayList;


public class Biblioteca {

	private String nome;
	private List<Livro> livros;
	
	public Biblioteca(String nome) {
		
		this.nome = nome;
		this.livros = new ArrayList<Livro>();
	}
	
	public void cadastrarLivro(String titulo, String autor, int anoPublicacao, String editora, int numPaginas) {
		
		Livro livro = new Livro(titulo, autor, anoPublicacao, editora, numPaginas);
		this.livros.add(livro);
	}
	
	public boolean verificarDisponibilidade(String titulo) {
		
		for(Livro livro : livros) {
			
			if(livro.getTitulo() == titulo) {
				
				return livro.isDisponibilidade();
			}
		}
		return false;
	}
	
	public void emprestarLivro(String titulo, int diaEmprestimo) {
		
		if(verificarDisponibilidade(titulo)) {
			
			for(Livro livro : livros) {
				
				if(titulo == livro.getTitulo()) {
					
					livro.setDisponibilidade(false);
					livro.setDiaEmprestimo(diaEmprestimo);
					System.out.println("Livro emprestado com sucesso!");
					return;
				}
			}
		}	
		System.out.println("Não foi possível emprestar o livro solicitado.");
	}
	
	public void devolverLivro(String titulo, int diaDevolucao) {
		
		if(!verificarDisponibilidade(titulo)) {
			
			for(Livro livro : livros) {
				
				if(titulo == livro.getTitulo()) {
					
					livro.setDisponibilidade(true);
					double multa = calcularMulta(diaDevolucao, livro.getDiaEmprestimo());
					System.out.println("Livro devolvido com sucesso!");
					return;
				}
			}
		}
		System.out.println("Não foi possível devolver o livro solicitado.");
	}
	
	private double calcularMulta(int diaDevolucao, int diaEmprestimo) {
		
		if((diaDevolucao - diaEmprestimo) > 7) {
			
			int diasAtraso = diaDevolucao - diaEmprestimo - 7;
			System.out.println("Pelos " + diasAtraso + " dias de atraso, será cobrada uma multa de R$" + String.format("%.2f", diasAtraso*1.5));
			return diasAtraso * 1.5;
		}
		System.out.println("Não será cobrada multa");
		return 0;
	}
}
