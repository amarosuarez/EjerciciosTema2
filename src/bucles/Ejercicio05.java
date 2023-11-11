package bucles;

import java.util.Scanner;

public class Ejercicio05 {

		
	public static void main(String[] args) {
		
		int minComMult=0, numero1, numero2;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Escriba un número: ");
			numero1 = sc.nextInt();
		} while (numero1 <= 0);

		do {
			System.out.println("Escriba otro número: ");
			numero2 = sc.nextInt();
		} while (numero2 <= 0);
		

		for (minComMult = numero1 > numero2 ? numero1 : numero2; minComMult >= 1; minComMult++) {
			if (minComMult % numero1 == 0 && minComMult % numero2 == 0) {
				break;
			}
		}
		
		System.out.println("El máximo común divisor es: " + minComMult);
		
		
		
		
	}
	
}
