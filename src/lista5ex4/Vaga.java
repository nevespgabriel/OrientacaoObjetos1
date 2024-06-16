package lista5ex4;

public class Vaga {

	private int numeroVaga;
	private Veiculo veiculo;
	
	public Vaga(int numeroVaga) {
		
		this.numeroVaga = numeroVaga;
	}
	
	public void alocar(String placa, int horaAlocacao) {
		
		if(veiculo != null) {
			
			veiculo = new Veiculo(placa, horaAlocacao);
		} else {
			
			System.out.println("Vaga ocupada.");
		}

	}
	
	public void liberar(int horaRetirada) {
		
		if(this.veiculo == null) {
			
			System.out.println("Impossível liberar a vaga, pois nenhum veículo a ocupa.");
		} else {
			
			veiculo.retirarVeiculo(horaRetirada);
			System.out.println("Veículo de placa " + veiculo.getPlaca() + " retirado da vaga com sucesso.");
		}
	}
	
	public int getNumeroVaga() {
		
		return this.numeroVaga;
	}
}
