package aula002;

import java.util.Scanner;

public class ex001 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite seu nome completo:");
		String nome = scan.nextLine();
		
		System.out.println("Informe seu sexo:");
		String sex = scan.nextLine();
		
		System.out.println("Informe seu estado civil:");
		String estCiv = scan.nextLine();
		
		System.out.println("Informe quantos filhos você tem:");
		int qtdFilhos = scan.nextInt();
		
		scan.nextLine();
		
		System.out.println("Informe sua escolaridade:");
		String esc = scan.nextLine();
		
		System.out.println("Informe sua renda mensal:");
		double rMensal = scan.nextDouble();
		
		System.out.println(nome + " é um ser " + sex + " " + estCiv + ", com " + qtdFilhos + " filhos. Possui " + esc + " e ganha, por mês, R$" + String.format("%.2f",rMensal));
	}

}
