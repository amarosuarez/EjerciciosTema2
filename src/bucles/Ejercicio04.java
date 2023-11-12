package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio04 {
	
	
	/*
	 * PRUEBA 1
	 * VALOR DE ENTRADA: 6/18
	 * RESULTADO ESPERADO: 6
	 * RESULTADO OBTENIDO: 6
	 * 
	 * PRUEBA 2
	 * VALOR DE ENTRADA: 8E
	 * RESULTADO ESPERADO: NO INTRODUZCA LETRAS
	 * RESULTADO OBTENIDO: NO INTRODUZCA LETRAS
	 * 
	 * PRUEBA 3
	 * VALOR DE ENTRADA: 120/80
	 * RESULTADO ESPERADO: 60
	 * RESULTADO OBTENIDO: 60
	 * 
	 * PRUEBA 4
	 * VALOR DE ENTRADA: 777/921
	 * RESULTADO ESPERADO: 3
	 * RESULTADO OBTENIDO: 3
	 * 
	 * */

	public static void main(String[] args) {
		// Variables donde se almacenarán número1 y número2
		int numero1, numero2;
		
		// Variable donde se almacenará el máximo común divisor
		int maximoComDiv;
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Comprobamos que no introduzca letras
		try {

			do {
				// Le pedimos el número y lo almacenamos
				System.out.println("Escriba un número: ");
				numero1 = sc.nextInt();
			} while (numero1 <= 0);

			do {
				// Le pedimos el número y lo almacenamos
				System.out.println("Escriba otro número: ");
				numero2 = sc.nextInt();
			} while (numero2 <= 0);

			// Bucle para calcular el máximo común divisor
			for (maximoComDiv = numero1 < numero2 ? numero1 : numero2; maximoComDiv >= 1; maximoComDiv--) {
				if (numero1 % maximoComDiv == 0 && numero2 % maximoComDiv == 0) {
					break;
				}
			}
			
			// Imprimimos el mensaje por pantalal
			System.out.println("El máximo común divisor es: " + maximoComDiv);
		} catch (InputMismatchException e) {
			System.out.println("Valores mal introducidos");
			sc.nextLine();
		}
		
		// Cerramos el Scanner
		sc.close();
	}
}
