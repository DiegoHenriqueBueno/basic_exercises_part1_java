package basicExercisesPart1;

import java.util.Scanner;

public class Exercise007 {
	public static void main(String[] args) {

		// Escreva um programa Java que receba um número como entrada e imprima sua
		// tabela de multiplicação até 10.
		// Dados de teste:
		// Insira um número: 8
		// Saída esperada:
		// 8 x 1 = 8
		// 8 x 2 = 16
		// 8 x 3 = 24 ...
		// 8 x 10 = 80

		Scanner dataEnter = new Scanner(System.in);

		System.out.print("Informe o número da tabuada que deseja ver: ");
		int number = dataEnter.nextInt();
		int mult = 0;

		System.out.println("Tabuada do " + number);
		while (mult <= 10) {
			System.out.println(mult + "x" + number + " = " + number * mult);
			mult++;
		}

		dataEnter.close();
	}
}
