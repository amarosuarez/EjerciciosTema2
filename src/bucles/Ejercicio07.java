package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio07 {
	
	/*
	 * PRUEBA 1
	 * VALOR DE ENTRADA: 4
	 * RESULTADO ESPERADO: 
	 *  1
		121
		12321
		1234321

	 * RESULTADO OBTENIDO: 
	 *  1
		121
		12321
		1234321
	 * 
	 * PRUEBA 2
	 * VALOR DE ENTRADA: 1E
	 * RESULTADO ESPERADO: NO INTRODUZCA LETRAS
	 * RESULTADO OBTENIDO: NO INTRODUZCA LETRAS
	 * 
	 * PRUEBA 3
	 * VALOR DE ENTRADA: 2
	 * RESULTADO ESPERADO: 
	 * 1
	 * 12
	 * 121
	 * 
	 * RESULTADO OBTENIDO: 
	 * 1
	 * 12
	 * 121
	 * 
	 * */

	public static void main(String[] args) {
		// Variables
		int numero;
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Comprobamos que no introduzca letras
		try {
			// Le pedimos un número y lo guardamos
			System.out.println("Introduzca un número");
			numero = sc.nextInt();
			
			// Bucle para imprimir los números
			for(int i=1; i<=numero; i++) {
				// Bucle para imprimir los números en orden correcto
				for(int j=1; j<= i; j++) {
					System.out.print(j);
				}
				
				// Bucle para imprimir los números en orden inverso
				for(int j=i-1; j>=1; j--) {
					System.out.print(j);
				}
				System.out.println();
			}
		} catch(InputMismatchException e) {
			System.out.println("No introduzca letras");
		}
		
		// Cerramos el Scanner
		sc.close();
	}
	
}
