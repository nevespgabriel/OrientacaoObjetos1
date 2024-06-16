package lista6ex004;

public class Data {

	protected int dia;
	protected int mes;
	protected int ano;
	
	public Data(int dia, int mes, int ano) {

		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public Data(int mes, int ano) {
		
		this.mes = mes;
		this.ano = ano;
		this.dia = 1;
	}
	
	public Data(int dia) {
		
		this(dia, 1, 2019);
	}
	
	public String toString() {
		
		return (String.format("%02d", this.dia) + "/" + String.format("%02d", this.mes) + "/" + this.ano);
	}
}
