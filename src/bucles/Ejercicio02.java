package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio02 {
	
	/*
	 * PRUEBA 1
	 * VALOR DE ENTRADA: 20
	 * RESULTADO ESPERADO: 8 PRIMOS
	 * RESULTADO OBTENIDO: 8 PRIMOS
	 * 
	 * PRUEBA 2
	 * VALOR DE ENTRADA: 10
	 * RESULTADO ESPERADO: 4 PRIMOS
	 * RESULTADO OBTENIDO: 4 PRIMOS
	 * 
	 * PRUEBA 3
	 * VALOR DE ENTRADA: 30E
	 * RESULTADO ESPERADO: NO INTRODUZCA LETRAS
	 * RESULTADO OBTENIDO: NO INTRODUZCA LETRAS
	 * 
	 * PRUEBA 4
	 * VALOR DE ENTRADA: 40
	 * RESULTADO ESPERADO: 12 PRIMOS
	 * RESULTADO OBTENIDO: 12 PRIMOS
	 * 
	 * */
	
	public static void main(String[] args) {
		
		// Variable donde se almacenará el número
		int numero;
		
		// Variable donde se almacenará el contador
		int contador=0;
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Comprobamos que no introduzca letras
		try {
			// Le preguntamos mientras el número sea menor que 1
			do {
				// Le pedimos un número y lo guardamos
				System.out.println("Introduce un número");
				numero = sc.nextInt();
			} while(numero<1);
			
			// Bucle para comprobar números primos
			for (int numeroFijo=2; numeroFijo<=numero; numeroFijo++) {
				
				// Inicializamos la variable a true
				boolean esPrimo = true;
				
				// Bucle para comprobar si el número es divisible entre 2 y el número introducido
				for (int numeroCambia=2; numeroCambia<numeroFijo; numeroCambia++) {
					// Condición para comprobar si un número no es primo
					if (numeroFijo%numeroCambia==0) {
						esPrimo = false;
						break;
					}
				}
				
				// Sumamos uno al contador de primos
				if (esPrimo) contador++;
				
			}
			
			// Imprimimos el mensaje por pantalla
			System.out.println("Entre 1 y " + numero + " hay " + contador + " números primos");
		} catch(InputMismatchException e) {
			System.out.println("No introduzca letras");
		}
		
		// Cerramos el Scanner
		sc.close();
	}
	
}
