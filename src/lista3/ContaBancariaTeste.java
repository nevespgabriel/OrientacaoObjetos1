package lista3;

public class ContaBancariaTeste {

	public static void main(String[] args) {
		
		ContaBancaria conta1 = new ContaBancaria(2800);
		
		conta1.depositar(-18.20);
		conta1.sacar(-4.20);
	}
}
