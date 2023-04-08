package basicExercisesPart1;

import java.util.Scanner;

public class Exercise012 {
	public static void main(String[] args) {
		// Write a Java program that takes three numbers as input to calculate and print
		// the average of the numbers.

		Scanner dataScanner = new Scanner(System.in);

		System.out.println("Programa que recebe 3 números (inteiro) e imprime a média dos mesmos.");
		System.out.println("Digite o primeiro número: ");
		int number1 = dataScanner.nextInt();

		System.out.println("Digite o segundo número: ");
		int number2 = dataScanner.nextInt();

		System.out.println("Digite o terceiro número: ");
		int number3 = dataScanner.nextInt();

		int media = (number1 + number2 + number3) / 3;

		System.out.println("A média dos números digitados é: " + media);

		dataScanner.close();
	}
}
