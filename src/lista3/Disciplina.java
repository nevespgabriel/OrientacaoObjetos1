package lista3;

public class Disciplina {
	private static int cont;
	private int codigo;
	private String nome;
	private String modalidade;
	private int cargaHoraria;
	private String conteudoProgramatico;
	
	public Disciplina(String nome, String modalidade, int cargaHoraria,
			String conteudoProgramatico) {
		
		cont += 1;
		this.codigo = cont;
		this.nome = nome;
		this.modalidade = modalidade;
		this.cargaHoraria = cargaHoraria;
		this.conteudoProgramatico = conteudoProgramatico;
	}
	
	public String toString() {
		
		return codigo + " - " + this.nome + " - " + this.modalidade + " - " + 
		this.cargaHoraria + " - " + this.conteudoProgramatico;
	}
	
	public int getCodigo() {
		
		return this.codigo;
	}
	
	public void setNome(String nome) {
		
		this.nome = nome;
	}
	
	public String getNome() {
		
		return this.nome;
	}
	
	public void setModalidade(String modalidade) {
		
		this.modalidade = modalidade;
	}
	
	public String getModalidade() {
		
		return this.modalidade;
	}
	
	public void setCargaHoraria(int cargaHoraria) {
		
		this.cargaHoraria = cargaHoraria;
	}
	
	public int getCargaHoraria() {
		
		return this.cargaHoraria;
	}
	
	public void setConteudoProgramatico(String conteudoProgramatico) {
		
		this.conteudoProgramatico = conteudoProgramatico;
	}
	
	public String getConteudoProgramatico() {
		
		return this.conteudoProgramatico;
	}
	
	public void relatarDisciplina() {
		
		System.out.println("Relatório:");
		System.out.println("Código: " + this.codigo);
	}
}
