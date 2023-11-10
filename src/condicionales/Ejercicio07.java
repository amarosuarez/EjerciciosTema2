package condicionales;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio07 {
	
	/*
	 * PRUEBA 1
	 * VALOR DE ENTRADA: 12 25 48
	 * RESULTADO ESPERADO: 12H 25M 49S
	 * RESULTADO OBTENIDO: 12H 25M 49S
	 * 
	 * PRUEBA 2
	 * VALOR DE ENTRADA: 1 59 59
	 * RESULTADO ESPERADO: 2H 0M 0S
	 * RESULTADO OBTENIDO: 2H 0M 0S
	 * 
	 * PRUEBA 3 
	 * VALOR DE ENTRADA: DOCE Y TREINTA Y DOS
	 * RESULTADO ESPERADO: NO INTRODUZCA LETRAS
	 * RESULTADO OBTENIDO: NO INTRODUZCA LETRAS
	 * 
	 * PRUEBA 4
	 * VALOR DE ENTRADA: 25 15 47
	 * RESULTADO ESPERADO: FUERA DE RANGO
	 * RESULTADO OBTENIDO: FUERA DE RANGO
	 *
	 * PRUEBA 6
	 * VALOR DE ENTRADA: 24 58 59
	 * RESULTADO ESPERADO: 0H 59M 0S
	 * RESULTADO OBTENIDO: 0H 59M 0S
	 * */

	public static void main(String[] args) {
		// Variable donde se almacenará la hora introducida
		int hora;
		// Variable donde se almacanerá los minutos introducidos
		int minutos;
		// Variable donde se almacenará los segundos introducidos
		int segundos;
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Comprobamos que el usuario no introduzca letras
		try {
			
			// Le pedimos la hora y lo guardamos
			System.out.println("Introduce la hora");
			hora = sc.nextInt();
			
			// Le pedimos los minutos y lo guardamos
			System.out.println("Introduce los minutos");
			minutos = sc.nextInt();
			
			// Le pedimos los segundos y lo guardamos
			System.out.println("Introduce los segundos");
			segundos = sc.nextInt();
			
			// Comprobamos que este dentro del rango
			if (hora > 24 || minutos > 59 || segundos > 59) {
				System.out.println("Fuera de rango");
			} else {
				// Comprobamos si el usuario introdujo la hora como 24 para convertirlo a 0
				if (hora == 24) hora=0;
				
				// Sumamos 1 segundo
				segundos++;
				
				// Comprobamos si los segundos es mayor que 59
				if (segundos > 59) {
					// Sumamos un minuto
					minutos++;
					// Reseteamos el valor de segundos
					segundos=0;
				}
				// Comprobamso si los minutos es mayor que 59
				if (minutos > 59) {
					// Sumamos una hora
					hora++;
					// Reseteamos los minutos
					minutos=0;
				}
				
				// Comprobamos si la hora es mayor que 23
				if (hora > 23) {
					// Reiniciamos la hora
					hora = 0;
				}
				
				// Imprimimos el mensaje
				System.out.println("La hora tras 1 segundo será: "+hora+"h "+minutos+"min "+segundos+"seg");
			}
			
		} catch(InputMismatchException e) {
			System.out.println("No introduzca letras");
		}
		
		// Cerramos el Scanner
		sc.close();
	}
	
}
