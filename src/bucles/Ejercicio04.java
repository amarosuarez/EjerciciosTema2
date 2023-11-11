package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		int numero1, numero2;
		int mcd;
		Scanner sc = new Scanner(System.in);
		try {

			do {
				System.out.println("Escriba un número: ");
				numero1 = sc.nextInt();
			} while (numero1 <= 0);

			do {
				System.out.println("Escriba otro número: ");
				numero2 = sc.nextInt();
			} while (numero2 <= 0);


			for (mcd = numero1 < numero2 ? numero1 : numero2; mcd >= 1; mcd--) {
				if (numero1 % mcd == 0 && numero2 % mcd == 0) {
					break;
				}

			}
			System.out.println("El máximo común divisor es: " + mcd);
		} catch (InputMismatchException e) {
			System.out.println("Valores mal introducidos");
			sc.nextLine();
		}
		sc.close();
	}
}
