package exerciciosBasicosParte1;

public class Exercicio011 {
	public static void main(String[] args) {
		// Escreva um programa Java para imprimir a área e o perímetro de um círculo.
		// Dados de teste:
		// Raio = 7,5 O perímetro de saída esperado é = 47,12388980384689
		// A área é = 176,71458676442586

		double raio = 7.5;

		double perimetro = 2 * Math.PI * raio;
		double area = Math.PI * raio * raio;

		System.out.println(perimetro);
		System.out.println(area);
	}
}
