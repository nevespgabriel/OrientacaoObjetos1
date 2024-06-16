package lista6ex001;

public class PessoaTeste {

	public static void main(String[] args) {
		
		Pessoa pessoa1 =  new Pessoa("Caio César", "06/11/1905", 823919, 471235);
		Aluno aluno1 = new Aluno("Gabriel Nevs", "06/12/1988", 289131, 318781, 26059);
		
		pessoa1.imprimirDados();
		aluno1.imprimirDados();
	}
}
