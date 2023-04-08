package basicExercisesPart1;

import java.util.Scanner;

public class Exercise012 {
	public static void main(String[] args) {
		// Write a Java program that takes three numbers as input to calculate and print
		// the average of the numbers.
		
		System.out.println("Programa que recebe 3 número, e devolve a média dos mesmos.");

		Scanner dataScanner = new Scanner(System.in);

		int[] numbers = new int[3];
		int media = 0;
		int total = 0;

		for (int index = 0; index < numbers.length; index++) {

			if (index == 0) {
				System.out.println("Digite o primeiro número: ");
			} else if (index == 1) {
				System.out.println("Digite o segundo número: ");
			} else {
				System.out.println("Digite o terceiro número: ");
			}

			numbers[index] = dataScanner.nextInt();

			if (numbers[index] < 0) {
				index--;
			}
		}

		for (int elemento : numbers) {
			total += elemento;
			media = total / numbers.length;
		}

		System.out.println("\nA média dos número digitados foi: " + media);

		dataScanner.close();
	}
}
