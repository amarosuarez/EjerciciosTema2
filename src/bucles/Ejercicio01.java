package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio01 {
	
	/*
	 * PRUEBA 1
	 * VALOR DE ENTRADA: 1P
	 * RESULTADO ESPERADO: NO INTRODUZCA LETRAS
	 * RESULTADO OBTENIDO: NO INTRODUZCA LETRAS
	 * 
	 * PRUEBA 2
	 * VALOR DE ENTRADA: 12/34/50 + 70
	 * RESULTADO ESPERADO: 12:36:00
	 * RESULTADO OBTENIDO: 12:36:00
	 * 
	 * PRUEBA 3
	 * VALOR DE ENTRADA: 15/54/40 + 83
	 * RESULTADO ESPERADO: 15:56:03
	 * RESULTADO OBTENIDO: 15:56:03
	 * 
	 * PRUEBA 4
	 * VALOR DE ENTRADA: 23/58/30 + 283
	 * RESULTADO ESPERADO: 00:03:13
	 * RESULTADO OBTENIDO: 00:03:13
	 * 
	 * */

	public static void main(String[] args) {
		// Variable donde se almacenarán las horas
		int horas;
		
		// Variable donde se almacenarán los minutos
		int minutos;
		
		// Variable donde se almacenarán los segundos
		int segundos;
		
		// Variable donde se almacenarán los segundos a incrementar
		int cantidadIncrementar;

		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Comprobamos que no se introduzcan letras
		try {
			
			// Le pedimos las horas mientras introduzca un número menor que 0 o mayor que 23
			do {
				// Le pedimos las horas y las almacenamos
				System.out.println("Introduce las horas");
				horas = sc.nextInt();
			} while(horas < 0 || horas > 23);
			
			// Le pedimos los minutos mientras introduzca un número menor que 0 o mayor que 59
			do {
				// Le pedimos los minutos y las almacenamos
				System.out.println("Introduce los minutos");
				minutos = sc.nextInt();
			} while(minutos <  0 || minutos > 59); 

			// Le pedimos los segundos mientras introduzca un número menor que 0 o mayor que 59
			do {
				// Le pedimos los segundos y lo almacenamos
				System.out.println("Introduce los segundos");
				segundos = sc.nextInt();
			} while(segundos < 0 || segundos > 59);

			// Le pedimos los segundos a aumentar mientras introduzca un número menor que 0
			do {
				System.out.println("Introduce los segundos a incrementar");
				cantidadIncrementar = sc.nextInt();
			} while(cantidadIncrementar < 0);
			
			// Bucle para sumar la cantidad a incrementar
			for (int i = 0; i < cantidadIncrementar; i++) {
				// Sumamos un segundo
	            segundos++;
	            
	            if (segundos > 59) {
	            	// Si segundos es mayor que 59 sumamos un minuto y cambiamos los segundos a 0
	                segundos = 0;
	                minutos++;
	                
	                if (minutos > 59) {
	                	// Si minutos es mayor que 59 sumamos una hora y cambiamos los minutos a 0 
	                    minutos = 0;
	                    horas++;
	                    
	                    if (horas > 23) {
	                    	// Si horas es mayor que 23 la cambiamos a 0
	                        horas = 0;
	                    }
	                }
	            }
	        }
			
			// Mostramos el mensaje por pantalla
			System.out.println("La nueva hora es: "
					+ (horas<10 ? "0"+horas : horas) + ":"
					+ (minutos<10 ? "0"+minutos : minutos) + ":"
					+ (segundos<10 ? "0"+segundos : segundos));
			
		} catch(InputMismatchException e) {
			System.out.println("No introduzca letras");
		}
		
		// Cerramos el Scanner
		sc.close();
	}

}
