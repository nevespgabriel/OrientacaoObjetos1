package praticastring;
import java.util.Scanner;

public class Ex001 {

	public static void main(String[] args) {
		
		String palavra, palavra2;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a palavra:");
		palavra = input.nextLine();
		String [] palavraDividida = palavra.split(" ");
		
		System.out.println("Caractere posição 3 = " + palavra.charAt(3));
		System.out.println("Número total de caracteres = " + palavra.length());
		System.out.println("toLower = " + palavra.toLowerCase());
		System.out.println("Divisão = " + palavraDividida[0]);
		System.out.println("Digite a segunda palavra:");
		palavra2 = input.nextLine();
		
		if(palavra.equals(palavra2)){
			
			System.out.println("As palavras são iguais");
		}
		else {
			
			System.out.println("As palavras são diferentes");
		}
		
	}
}
