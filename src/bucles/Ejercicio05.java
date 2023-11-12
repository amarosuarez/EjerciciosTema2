package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio05 {

	/*
	 * PRUEBA 1
	 * VALOR DE ENTRADA: 3/6
	 * RESULTADO ESPERADO: 6
	 * RESULTADO OBTENIDO: 6
	 * 
	 * PRUEBA 2
	 * VALOR DE ENTRADA: 120/180
	 * RESULTADO ESPERADO: 360
	 * RESULTADO OBTENIDO: 360
	 * 
	 * PRUEBA 3
	 * VALOR DE ENTRADA: 121E
	 * RESULTADO ESPERADO: NO INTRODUZCA LETRAS
	 * RESULTADO OBTENIDO: NO INTRODUZCA LETRAS
	 * 
	 * PRUEBA 4
	 * VALOR DE ENTRADA: 187/451
	 * RESULTADO ESPERADO: 7667
	 * RESULTADO OBTENIDO: 7667
	 * 
	 * */
		
	public static void main(String[] args) {
		// Variables donde se almacenarán el mínimo común múltiplo, el número 1 y número 2
		int minComMult=0, numero1, numero2;
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Comprobamos que no introduzca letras
		try {
			do {
				// Le pedimos el número y lo guardamos
				System.out.println("Escriba un número: ");
				numero1 = sc.nextInt();
			} while (numero1 <= 0);

			do {
				// Le pedimos el número y lo guardamos
				System.out.println("Escriba otro número: ");
				numero2 = sc.nextInt();
			} while (numero2 <= 0);
			
			// Bucle para calcular el mínimo común múltiplo
			for (minComMult = numero1 > numero2 ? numero1 : numero2; minComMult >= 1; minComMult++) {
				if (minComMult % numero1 == 0 && minComMult % numero2 == 0) {
					break;
				}
			}
			
			// Imprimimos el mensaje por pantalla
			System.out.println("El mínimo común múltiplo es: " + minComMult);
		} catch(InputMismatchException e) {
			System.out.println("No introduzca letras");
		}
		
		// Cerramos el Scanner
		sc.close();
	}
	
}
