package exercicios_estrutura_condicional;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int startTime, endTime, gameDuration=0;
		
		System.out.print("Star time: ");
		startTime = sc.nextInt();
		System.out.print("End time: ");
		endTime = sc.nextInt();
		
		if (startTime > endTime) {
			gameDuration = 24 - startTime + endTime;
		}
		else if (endTime > startTime) {
			gameDuration = endTime - startTime;
		}
		else {
			gameDuration = 24 - startTime + endTime;
		}
		
		System.out.println("THE GAME LAST "+ gameDuration + " HOUR(S)");
		
		
		sc.close();
	}

}
