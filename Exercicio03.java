package exercicios_estrutura_condicional;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int firstNumber = sc.nextInt();
		System.out.print("Enter second number: ");
		int secondNumber = sc.nextInt();
		
		int changeOrder;
		String multiples;
		
		if (firstNumber < secondNumber) {
			changeOrder = firstNumber;
			firstNumber = secondNumber;
			secondNumber = changeOrder;
		}
		
		multiples = (firstNumber % secondNumber == 0) ? "ARE MULTIPLES" : "ARE NOT MULTIPLES";
		
		System.out.println(multiples);

		sc.close();
	}

}
