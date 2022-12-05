package exercicios_estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double value;
		System.out.print("Inform a value: ");
		value = sc.nextDouble();
		
		if (value < 0 || value > 100.0) {
			System.out.println("Out of range");
		}
		else if (value <= 25.0) {
			System.out.println("Value range [0,25]");
		}
		else if (value <= 50.0) {
			System.out.println("Value range [25,50]");
		}
		else if (value <= 75.0) {
			System.out.println("Value range [50, 75]");
		}
		else {
			System.out.println("Value range [75,100]");
		}
		
		
		
		sc.close();
	}

}
