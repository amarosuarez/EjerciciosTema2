package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio09 {
	
	
	/*
	 * PRUEBA 1
	 * VALOR DE ENTRADA: 1
	 * RESULTADO ESPERADO: 1 CIFRA
	 * RESULTADO OBTENIDO: 1 CIFRA
	 * 
	 * PRUEBA 2
	 * VALOR DE ENTRADA: 100
	 * RESULTADO ESPERADO: 3 CIFRAS
	 * RESULTADO OBTENIDO: 3 CIFRAS
	 * 
	 * PRUEBA 3
	 * VALOR DE ENTRADA: 100E
	 * RESULTADO ESPERADO: NO INTRODUZCA LETRAS
	 * RESULTADO OBTENIDO: NO INTRODUZCA LETRAS
	 * 
	 * */

	public static void main(String[] args) {
		// Variable donde se almacena el número introducido
		int num;
		// Variable donde se almacena el número de cifras
		int numCifras=0;
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Comprobamos que no introduzca letras
		try {
			
			do {
				// Le pedimos un número y lo almacenamos
				System.out.println("Introduzca un número mayor que 0");
				num = sc.nextInt();
			} while(num<0);
			
			// Comprobamos que el número introducido sea mayor que 0
			while(num>0) {
				// Dividimos el número entre 10 y sumamos 1 cifra
				num /= 10;
				numCifras++;
			}
			
			// Imprimimos el mensaje por pantalla
			System.out.println("Tu número tiene " + numCifras + (numCifras==1 ? " cifra" : " cifras"));
		} catch(InputMismatchException e) {
			System.out.println("No introduzca letras");
		}
		
		// Cerramos el Scanner
		sc.close();
	}
	
}
