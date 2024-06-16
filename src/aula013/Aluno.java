package aula013;

public class Aluno extends Pessoa{

	private String curso;
	
	public Aluno(String nome, int idade, String logradouro, int numero, String bairro, String cidade, String unidadeFederativa) {
		
		super(nome, idade, logradouro, numero, bairro, cidade, unidadeFederativa);
	}
	
	public void realizarMatricula(String curso) {
		
		this.curso = curso;
		System.out.println("Matrícula de " + this.nome + " realizada no curso de " + this.curso + " com sucesso.");
	}
	
	public void imprimirDados() {
		
		System.out.println("============================");
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade);
		endereco.imprimirEndereco();
		System.out.println("Curso: " + this.curso);
		System.out.println("============================");
	}
}
