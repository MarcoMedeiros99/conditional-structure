package switch_case;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int prova1, prova2, nota;
		String resultado;

		System.out.println("resultado da primeira prova");
		prova1 = sc.nextInt();
		System.out.println("resultado da primeira prova");
		prova2 = sc.nextInt();

		nota = prova1 + prova2;

		switch (nota / 10) {
		case 10:
		case 9:
		case 8:
		case 7:
			resultado = "aprovado";
			break;
		case 6:
			resultado = "em recuperação";
			break;
		default:
			resultado = "reprovado";
			break;
		}

		System.out.printf("o aluno tirou %d e esta %s%n", nota, resultado);
		sc.close();

	}

}
