package if_else;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite um numero: ");
		int nota = sc.nextInt();
		
		if (nota % 2 == 0) {
			System.out.println("par");
		} 
		else {
			System.out.println("impar");
		}
		sc.close();
	}
}