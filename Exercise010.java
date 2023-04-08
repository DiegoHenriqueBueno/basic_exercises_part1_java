package basicExercisesPart1;

public class Exercise010 {
	public static void main(String[] args) {
		// Escreva um programa Java para calcular uma fórmula especificada.
		// Fórmula especificada:
		// 4,0 * (1 - (1,0/3) + (1,0/5) - (1,0/7) + (1,0/9) - (1,0/11))
		// Saída esperada:
		// 2,9760461760461765
		
		double result = 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));

		System.out.println(result);
	}
}
