package lista6ex001;

public class Aluno extends Pessoa {
	
	private int numeroMatricula;
	
	public Aluno(String nome, String nascimento, long rg, long cpf, int numeroMatricula) {
		
		super(nome, nascimento, rg, cpf);
		this.numeroMatricula = numeroMatricula;
	}
	
	public void imprimirDados() {
		System.out.println("================================");
		System.out.println("Numero de Matrícula: " + this.numeroMatricula);
		System.out.println("Nome: " + this.nome);
		System.out.println("Nascimento: " + this.nascimento);
		System.out.println("RG: " + this.rg);
		System.out.println("CPF: " + this.cpf);
		System.out.println("================================");
	}
}
