package aula002;

import java.util.Scanner;

public class ex003 {
	
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in); 
		
		System.out.println("Digite o valor da compra em reais:");
		double valor = scan.nextDouble();
		
		valor = (valor>=50) ? valor-valor*0.1 : valor - valor*0.05;
		
		System.out.println("O valor final do produto é " + String.format("%.2f", valor));
	}

}
