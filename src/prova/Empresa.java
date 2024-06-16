package prova;
import java.util.List;
import java.util.ArrayList;


public class Empresa {

	private String razaoSocial;
	private String paisSede;
	private int anoFundacao;
	private List<Filme> filmes;
	private List<Cliente> clientes;
	
	public Empresa(String razaoSocial, String paisSede, int anoFundacao) {
		
		this.razaoSocial = razaoSocial;
		this.paisSede = paisSede;
		this.anoFundacao = anoFundacao;
		this.filmes = new ArrayList<Filme>();
		this.clientes = new ArrayList<Cliente>();
	}
	
	public void cadastrarFilme(String titulo, int anoLancamento, int faixaEtaria, String genero) {
		
		Filme filme = new Filme(titulo, anoLancamento, faixaEtaria, genero);
		filmes.add(filme);
	}
	
	public void addFilmeCliente(String usuario, String senha, String tituloFilme) {
		
		int c;
		for(c=0; c < filmes.size(); c++) {
			
			if(filmes.get(c).getTitulo().equals(tituloFilme)) {
				break;
			}
		}
		
		if(c<filmes.size()) {
			for(Cliente cliente : clientes) {
				
				if(cliente.getUsuario().equals(usuario) && cliente.getSenha().equals(senha)) {
					
					cliente.addFilmeCatalogo(filmes.get(c));
					return;
				}
			}
			System.out.println("Não foi encontrado nenhum cliente com os dados fornecidos.");
		} else {
			
			System.out.println("Não foi encontrado nenhum filme com o título fornecido.");
		}
	}
	
	public void listarFilmes() {
		
		for(Filme filme : filmes) {
			
			filme.listarFilme();
		}
	}
}
