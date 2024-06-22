package aula014;
import java.util.ArrayList;

public class Calculadora {
	
	public int somar(int v1, int v2) {
		return v1 + v2;
	}
	
	public double somar(double v1, double v2) {
		return v1 + v2;
	}
	
	public int somar(ArrayList<Integer> array) {
		int soma = 0;
		for(int n : array) {
			soma += n;
		}
		return soma;
	}
}
