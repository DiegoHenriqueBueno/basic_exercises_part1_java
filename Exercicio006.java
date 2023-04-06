package exerciciosBasicosParte1;

public class Exercicio006 {
	public static void main(String[] args) {

		// Escreva um programa Java para imprimir a soma (adição), multiplicação,
		// subtração, divisão e resto de dois números.
		// Dados de teste:
		// Insira o primeiro número: 125
		// Insira o segundo número: 24
		// Saída esperada:
		// 125 + 24 = 149
		// 125 - 24 = 101
		// 125 x 24 = 3000
		// 125 / 24 = 5
		// 125 mod 24 = 5

		int firstNumber = 125;
		int secondNumber = 24;

		int sum = firstNumber + secondNumber;
		int minus = firstNumber - secondNumber;
		int multiply = firstNumber * secondNumber;
		int divide = firstNumber / secondNumber;
		int rnums = firstNumber % secondNumber;

		System.out.println(firstNumber + " + " + secondNumber + " = " + sum);
		System.out.println(firstNumber + " - " + secondNumber + " = " + minus);
		System.out.println(firstNumber + " x " + secondNumber + " = " + multiply);
		System.out.println(firstNumber + " / " + secondNumber + " = " + divide);
		System.out.println(firstNumber + " mod " + secondNumber + " = " + rnums);
	}
}
