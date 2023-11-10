package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio03 {

	/*
	 * PRUEBA 1
	 * VALOR DE ENTRADA: 5
	 * RESULTADO ESPERADO: 
	 *      * 
		   * * 
		  * * * 
		 * * * * 
		* * * * * 
		RESULTADO OBTENIDO: 
	 *      * 
		   * * 
		  * * * 
		 * * * * 
		* * * * * 
	 * 
	 * PRUEBA 2
	 * VALOR DE ENTRADA: 3
	 * RESULTADO ESPERADO:
		  * 
		 * * 
		* * * 
	 * RESULTADO ESPERADO:
		  * 
		 * * 
		* * * 
	 * */
	
	public static void main(String[] args) {
		// Variable donde se almacenará el número del usuario
		int num = 0;

		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Le preguntamos hasta que introduzca un número mayor que 0
		do {
			// Comprobamos que no introduzca letras
			try {
				// Le pedimos el numero y lo guardamos
				System.out.println("Introduzca un número positivo mayor que 0");
				num = sc.nextInt();
				
				// Bucle para generar el triángulo
				for(int fila=1; fila<=num; fila++) {

					// Bucle para generar los espacios
					for (int esp=1; esp<=num-fila; esp++) {
						System.out.print(" ");
					}
					
					// Bucle para colocar los asteriscos
					for (int columna=1; columna<=fila; columna++) {
						System.out.print("* ");
					}
					
					// Salto de línea
					System.out.println();
				}
			} catch(InputMismatchException e) {
				System.out.println("No introduzca letras");
				break;
			}
		} while(num < 1);
		
		// Cerramos el Scanner
		sc.close();
	}
	
}
