package praticastring;
import java.util.Scanner;

public class Ex002 {

	public static void main(String[] args) {
		
		int v1;
		double v2;
		String v1string;
		String v2string;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o valor inteiro:");
		v1 = input.nextInt();
		System.out.println("Digite o valor double:");
		v2 = input.nextDouble();
		
		v1string = String.valueOf(v1);
		v2string = String.valueOf(v2);
		System.out.println(v1string + " " + v2string);
		
	}
}
