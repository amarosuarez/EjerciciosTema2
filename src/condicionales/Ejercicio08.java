package condicionales;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio08 {

	
	/*
	 * PRUEBA 1
	 * VALOR DE ENTRADA = 224 5
	 * RESULTADO ESPERADO = 560 €
	 * RESULTADO OBTENIDO = 560 €
	 * 
	 * PRUEBA 2
	 * VALOR DE ENTRADA = 898,6 9
	 * RESULTADO ESPERADO = 1572,5499 €
	 * RESULTADO OBTENIDO = 1572,5499 €
	 * 
	 * PRUEBA 3
	 * VALOR DE ENTRADA = TRESCIENTOS CUATRO
	 * RESULTADO ESPERADO = NO INTRODUZCA LETRAS
	 * RESULTADO OBTENIDO = NO INTRODUZCA LETRAS
	 * */
	
	public static void main(String[] args) {
		// Constante con el precio del billete/kilometro
		final float PRECIO_KILOMETRO = 2.5f; 
		
		// Valor que aplica el descuento
		final float DESCUENTO = 0.7f; // 0.7 nos evita tener que restarle al precio el precio*0.3
		
		// Variable donde se almacena el precio del billete
		float precioBillete;
		
		// Variable donde se almacena la distancia a recorrer
		float distancia;
		
		// Variable donde se almacena el número de días de estancia
		int dias;
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Comprobamos que el usuario no introduzca letras
		try {
			// Le pedimos la distancia en km y lo almacenamos
			System.out.println("Introduzca la distancia en km");
			distancia = sc.nextFloat();
			
			// Le pedimos los días y lo almacenamos
			System.out.println("Introduzca el número de días de su estancia");
			dias = sc.nextInt();
			
			// Calculamos el precio de billete
			precioBillete = PRECIO_KILOMETRO * distancia;
			
			// Comprobamos si se cumplen las codiciones para el descuento
			if (distancia > 800 && dias > 7) precioBillete *= DESCUENTO;
			
			// Imprimimos el precio por pantalla
			System.out.println("El precio de su billete es: "+String.valueOf(precioBillete).replace(".", ",")+" €");
			
		} catch(InputMismatchException e) {
			System.out.println("No introduzca letras");
		}
		
		// Cerramos el Scanner
		sc.close();
	}
	
}
