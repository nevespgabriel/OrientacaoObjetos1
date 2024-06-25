package lista7ex004;

public class Socio extends Cliente {

	private String cpf;
	private Cliente dependente;

	public Socio(String nome, String dataNascimento, String telefone, String logradouro, int numeroResidencia,
			String bairro, String cep, String cidade, String uf, String cpf) {
		
		super(nome, dataNascimento, telefone, logradouro, numeroResidencia, bairro, cep, cidade, uf);
		this.cpf = cpf;
	}
	
	public Socio(String nome, String dataNascimento, String telefone, String logradouro, int numeroResidencia,
			String bairro, String cep, String cidade, String uf, String cpf, String nomeDependente, String dataNascimentoDependente,
			String telefoneDependente, String logradouroDependente, int numeroResidenciaDependente,String bairroDependente, 
			String cepDependente, String cidadeDependente, String ufDependente) {
				
				super(nome, dataNascimento, telefone, logradouro, numeroResidencia, bairro, cep, cidade, uf);
				this.cpf = cpf;
				this.dependente = new Dependente(nomeDependente, dataNascimentoDependente, telefoneDependente, logradouroDependente, numeroResidenciaDependente, bairroDependente, cepDependente, cidadeDependente, ufDependente);
	} 
}
