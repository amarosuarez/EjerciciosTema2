package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio08 {
	
	public static void main(String[] args) {
		// Variable donde se almacena el número introducido
		int numero;
		
		// Variable donde se almacena el número anterior
		int numAnterior;
		
		// Contador
		int contador=0;
		
		// Contador fallos
		int contadorFallos=0;
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		try {
			// Le pedimos un número y lo guardamos
			System.out.println("Dime un número inicial");
			numAnterior = sc.nextInt();
			// Sumamos uno al contador de números
			contador++;
			
			// Comprobamos que el número sea diferente de 0
			do {
				// Le pedimos el número y lo almacenamos
				System.out.println("Introduzca un número, use 0 para salir");
				numero = sc.nextInt();
				
				// Comprobamos que el número sea mayor que el número anterior y diferente de 0
				if (numero<numAnterior && numero!=0) {
					// Indicamos que es menor, sumamos uno al contador de fallos y reseteamos el número anterior
					System.out.println("Fallo es menor");
					contadorFallos++;
					numAnterior=0;
				} else {
					// Seteamos el numero anterior con el número introducido
					numAnterior=numero;
				}
				
				// Si el número es diferente de 0 sumamos uno al contador de números
				if (numero!=0) contador++;
				
			} while(numero!=0);
			
			// Imprimimos el número totla de números introducidos y el número de fallos
			System.out.println("Total de números introducidos: " + contador);
			System.out.println("Número fallados: " + contadorFallos);
			
		} catch(InputMismatchException e) {
			System.out.println("No introduzca letras");
		}
		
		// Cerramos el Scanner
		sc.close();
	}
	
}
