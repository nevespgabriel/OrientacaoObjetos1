package prova;
import java.util.List;
import java.util.ArrayList;

public class Cliente {

	private String nome;
	private String usuario;
	private String senha;
	private int anoNascimento;
	private List<Filme> filmesCatalogados;
	
	public Cliente(String nome, String usuario, String senha, int anoNascimento) {

		this.nome = nome;
		this.usuario = usuario;
		this.senha = senha;
		this.anoNascimento = anoNascimento;
		this.filmesCatalogados = new ArrayList<Filme>();
	}
	
	public void addFilmeCatalogo(Filme filme) {
		
		if((2024 - anoNascimento) >= filme.getFaixaEtaria()) {
			
			filmesCatalogados.add(filme);
			System.out.println("Filme " + filme.getTitulo() + " adicionado ao catálogo!");
		} else {
			
			System.out.println("Não foi possível adicionar ao catálogo. Filme impróprio para menores de " + filme.getFaixaEtaria() + " anos.");
		}
	}

	public String getUsuario() {
		
		return this.usuario;
	}

	public String getSenha() {
		
		return this.senha;
	}
}
