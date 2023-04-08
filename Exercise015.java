package basicExercisesPart1;

public class Exercise015 {
	public static void main(String[] args) {
		// Write a Java program to swap two variables

		int variable1 = 10, variable2 = 20, auxiliar = 0;
		System.out.println("variable 1 = "+ variable1);
		System.out.println("variable 2 = "+ variable2);
		System.out.println("variable auxiliar = "+ auxiliar+"\n");
		
		auxiliar = variable1;
		variable1 = variable2;
		variable2 = auxiliar;
		System.out.println("variable 1 = "+ variable1);
		System.out.println("variable 2 = "+ variable2);
		System.out.println("variable auxiliar = "+ auxiliar);
		
	}
}
