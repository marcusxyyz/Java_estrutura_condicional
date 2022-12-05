package exercicios_estrutura_condicional;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int number = sc.nextInt();
		
		String evenOrOdd = (number % 2 == 0) ? "EVEN" : "ODD";
		
		System.out.println(evenOrOdd);
		
		
		sc.close();
	}

}
