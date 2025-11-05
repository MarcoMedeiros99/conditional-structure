package exercicio_02;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double renda, impostoDeRenda;
		
		System.out.printf("qual é o seu salario? %n");
		renda = sc.nextDouble();
		
		if (renda <= 2000.00) {
			System.out.println("voce esta insento");
		}
		else if (renda >= 2000.01 && renda <= 3000.00) {
			impostoDeRenda = (renda - 2000.00) * 0.08;
			System.out.println("voce tem que pagar R$" + impostoDeRenda);
		}	
		else if (renda >= 3000.01 && renda <= 4500.00) {
			impostoDeRenda = (renda - 2000.00) * 0.18;
			System.out.println("voce tem que pagar R$" + impostoDeRenda);
		}	
		else if (renda > 4500.00) {
			impostoDeRenda = (renda - 2000.00) * 0.28;
			System.out.println("voce tem que pagar R$" + impostoDeRenda);
		}	
		
		sc.close();
	}
}