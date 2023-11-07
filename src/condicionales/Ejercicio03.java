package condicionales;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio03 {
	
	/* PRUEBA 1
	 * VALOR DE ENTRADA: 0KG TOTALES, 0NUM ANIMALES, 0KG ANIMALES
	 * RESULTADO ESPERADO: NAN
	 * RESULTADO OBTENIDO: NAN
	 * 
	 * PRUEBA 2
	 * VALOR DE ENTRADA: 50KG TOT, 0NUM ANIMALES, 20KG ANIMALES
	 * RESULTADO ESPERADO: NAN
	 * RESULTADO OBTENIDO: NAN*/
	

	public static void main(String[] args) {
		// Variables donde se almacenarán los datos introducidos por el usuario
		float cantidadComida;
		float kilosAnimales;
		int numeroAnimales;
		float kilosCorrespondiente;
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Hacemos un try/catch para asegurar que solo introduce números
		try {
			// Le preguntamos al usuario los kg comprados y lo guardamos
			System.out.println("Introduzca el total de kg de comida comprada");
			cantidadComida = sc.nextFloat();
			
			// Le preguntamos al usuario el número de animales y lo guardamos
			System.out.println("Introduzca el número de animales");
			numeroAnimales = sc.nextInt();
			
			// Le preguntamos al usuario el número de kg totales que comen los animales y lo guardamos.
			System.out.println("Introduzca el total de kg que comen los animales en total");
			kilosAnimales = sc.nextFloat();
			
			// Comprobamos que la cantidad de comida sea igual o mayor que los kg que comen los animales
			if (numeroAnimales != 0 && cantidadComida >= kilosAnimales) {
			
				System.out.println("Hay suficiente comida");
				
			} else {
				
				if (numeroAnimales == 0) {
					System.out.println("No se puede dividir entre 0");
				} else {
					// Calculamos el número de kg que debe comer cada animal e imprimimos por pantalla
					kilosCorrespondiente = (float) cantidadComida / numeroAnimales;
					System.out.println("Cada animal debe comer " + kilosCorrespondiente + " kg");
				}
				
			}
			
		} catch(InputMismatchException e) {
			System.out.println("No introduzca letras, introduce solo números");
		}
		
		// Cerramos el Scanner
		sc.close();
	}
	
}
