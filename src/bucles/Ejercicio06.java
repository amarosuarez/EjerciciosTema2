package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio06 {

	/*
	 * PRUEBA 1
	 * VALOR DE ENTRADA: 3
	 * RESULTADO ESPERADO:
	 * 1
	 * 22
	 * 333
	 * RESULTADO OBTENIDO:
	 * 1
	 * 22
	 * 333
	 * 
	 * PRUEBA 2
	 * VALOR DE ENTRADA: 1E
	 * RESULTADO ESPERADO: NO INTRODUZCA LETRAS
	 * RESULTADO OBTENIDO: NO INTRODUZCA LETRAS
	 * 
	 * PRUEBA 3
	 * VALOR DE ENTRADA: 5
	 * RESULTADO ESPERADO:
	 * 1
	 * 22
	 * 333
	 * 4444
	 * 55555
	 * RESULTADO OBTENIDO:
	 * 1
	 * 22
	 * 333
	 * 4444
	 * 55555
	 * 
	 * */
	
	public static void main(String[] args) {
		// Variable donde se almacena el número
		int numero;
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		try {
			// Le pedimos un número y lo almacenamos
			System.out.println("Dime un número");
			numero = sc.nextInt();
			
			// Bucle para imprimir los números con salto de linea
			for (int i=1; i<=numero; i++) {
				// Bucle para imprimir el número n veces
				for (int j=1; j<=i; j++) {
					System.out.print(i);
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
