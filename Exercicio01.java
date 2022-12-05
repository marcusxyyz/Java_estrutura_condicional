package exercicios_estrutura_condicional;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Number: ");
		int number = sc.nextInt();
		String negativeOrNotNegative;
		
		negativeOrNotNegative = (number >= 0) ? "NOT NEGATIVE" : "NEGATIVE";
		
		System.out.println(negativeOrNotNegative);
		
		sc.close();
	}

}
