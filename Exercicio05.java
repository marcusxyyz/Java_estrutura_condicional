package exercicios_estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("MENU");
		System.out.println("COD: 1 - Hot dog 	U$ 4.00\n"
				+ "COD: 2 - X-Salad 	U$ 4.50\n"
				+ "COD: 3 - X-Bacon 	U$ 5.00\n"
				+ "COD: 4 - Plain toast 	U$ 2.00\n"
				+ "COD: 5 - Soda 		U$ 1.50");
		
		System.out.println();
		System.out.print("Enter code: ");
		int cod = sc.nextInt();
		System.out.print("Product quantity: ");
		int quantity = sc.nextInt();
		
		double price = 0;
		
		System.out.println();
		
		switch (cod) {
		case 1:
			price = quantity * 4.0;
			break;
		case 2:
			price = quantity * 4.50;
			break;
		case 3:
			price = quantity * 5.00;
			break;
		case 4:
			price = quantity * 2.00;
			break;
		case 5:
			price = quantity * 1.50;
			break;
		default:
			System.out.println("The code does not exist");
		}
		
		System.out.printf("Total: U$ %.2f%n", price);
		sc.close();
	}

}
