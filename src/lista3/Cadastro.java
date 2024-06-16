package lista3;

public class Cadastro {
    private static int cont = 0;
	private int numRegistro;
	private String nome;
	private String dataNascimento;
	private String sexo;
	private String setor;
	private String telefone;
	private String rua;
	private String bairro;
	private String cidade;
	private String estado;
	
	public Cadastro(String nome, String dataNascimento, String sexo, 
			String setor, String telefone, String rua, String bairro, String cidade, 
			String estado) {
		
		cont += 1;
		this.numRegistro = cont;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.setor = setor;
		this.telefone = telefone;
		this.rua = rua;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
	}
	
	public void gerarRelatorio() {
		
		System.out.println("Relatório:");
		System.out.println("Número de Registro: " + this.numRegistro);
	}
	
	public String toString() {
		
		return  this.numRegistro + " - " + this.nome + " - " + this.dataNascimento + " - " 
				+ this.sexo + " - " + this.setor + " - " + this.telefone + " - " + this.rua 
				+ " - " + this.bairro + " - " + this.cidade + " - " + this.estado;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {	
		return this.nome;
	}
	
	public String getDataNascimento() {
		return this.dataNascimento;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public String getSexo() {
		return this.sexo;
	}
	
	public String getSetor() {
		return this.setor;
	}
	
	public void setSetor(String setor) {
		this.setor = setor;
	}
	
	public String getTelefone() {
		return this.telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
