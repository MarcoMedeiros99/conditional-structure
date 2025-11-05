package exercicio_01;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int codigo, quantidade; 
		double preco, valorPagar;

		System.out.println("1 - hot dog R$ 4.00");
		System.out.println("2 - X Salada R$ 4.50");
		System.out.println("3 - X Bacon R$ 5.00");
		System.out.println("4 - Torrada R$ 2.00");
		System.out.println("5 - Refri R$ 1.50");
		System.out.println();

		System.out.println("digite o codigo do seu pedido: ");
		codigo = sc.nextInt();
		System.out.println("digite o quantidade que deseja: ");
		quantidade = sc.nextInt();

		if (codigo == 1) {
			preco = 4.00;
			valorPagar = preco * quantidade;
			System.out.printf("voce comprou " +  quantidade + " hot dog e tem que pagar R$ " + valorPagar);
		} else if (codigo == 2) {
			preco = 4.50;
			valorPagar = preco * quantidade;
			System.out.printf("voce comprou " +  quantidade + " X Salada  e tem que pagar R$ " + valorPagar);
		} else if(codigo == 3) {
			preco = 5.00;
			valorPagar = preco * quantidade;
			System.out.printf("voce comprou " +  quantidade + " X Bacon e tem que pagar R$ " + valorPagar);
		} else if(codigo == 4) {
			preco = 2.00;
			valorPagar = preco * quantidade;
			System.out.printf("voce comprou " +  quantidade + " Torrada e tem que pagar R$ " + valorPagar);
		} else if (codigo == 5) {
			preco = 1.50;
			valorPagar = preco * quantidade;
			System.out.printf("voce comprou " +  quantidade + " Refri e tem que pagar R$ " + valorPagar);
		} else {
			System.out.println("opção invalida!");
	
		}

		sc.close();
	}
}