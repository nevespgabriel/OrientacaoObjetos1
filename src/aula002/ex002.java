package aula002;

import java.util.Scanner;

public class ex002 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.println("Primeiro número:");
		n1 = scan.nextInt();
		System.out.println("Segundo número:");
		n2 = scan.nextInt();
		System.out.println("Terceiro número:");
		n3 = scan.nextInt();
		
		if ((n1>=n2)&&(n1>=n3)) {
			System.out.println("O maior número é " + n1);
		} else if ((n2>=n1)&&(n2>=n3)) {
			System.out.println("O maior número é " + n2);
		} else {
			System.out.println("O maior número é " + n3);
		} 
	}

}
