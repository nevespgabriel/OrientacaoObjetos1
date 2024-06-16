package lista5ex4;

public class Veiculo {

	private String placa;
	private int horaAlocacao;
	
	public Veiculo(String placa, int horaAlocacao) {
		
		this.placa = placa;
		this.horaAlocacao = horaAlocacao;
	}
	
	public void retirarVeiculo(int horaRetirada) {
		
		int horasTotal = horaRetirada - this.horaAlocacao;
		if(horasTotal < 3) {
			
			System.out.println("Impossível retirar o veículo, tempo mínimo de permanência na vaga é de 3 horas.");
		} else {
			
			System.out.println("Valor a ser pago: R$" + calcularPreco(horasTotal));
		}
	}
	
	private double calcularPreco(int horasTotal) {
		
		double preco;
		preco = ((horasTotal-3)*0.5) + 2;
		return preco;
	}
	
	public String getPlaca() {
		
		return this.placa;
	}
}
