package lista7ex004;

public abstract class Cliente {

	protected String nome;
	protected String dataNascimento;
	protected String telefone;
	protected Endereco endereco;
	
	public Cliente(String nome, String dataNascimento, String telefone, String logradouro, 
			int numeroResidencia, String bairro, String cep, String cidade, String uf) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.telefone = telefone;
		this.endereco = new Endereco(logradouro, numeroResidencia, bairro, cep, cidade, uf);
	}

	public String getNome() {
		
		return this.nome;
	}
}
