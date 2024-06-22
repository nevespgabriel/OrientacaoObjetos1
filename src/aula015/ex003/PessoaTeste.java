package aula015.ex003;

public class PessoaTeste {

	public static void main(String[] args) {
		
		Pessoa pessoaFisica = new PessoaFisica("Eu", 24000, 2000);
		Pessoa pessoaJuridica = new PessoaJuridica("Viajaí", 600, 1);
		
		pessoaFisica.calcularImposto();
		pessoaJuridica.calcularImposto();
	}
}
