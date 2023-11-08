package condicionales;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio06 {
	
	/* PRUEBA 1
	 * RESULTADO ESPERADO: CORRECTO
	 * RESULTADO OBTENIDO: CORRECTO
	 * 
	 * PRUEBA 2
	 * VALOR DE ENTRADA: DOCE
	 * RESULTADO ESPERADO: NO INTRODUZCA LETRAS
	 * RESULTADO OBTENIDO: NO INTRODUZCA LETRAS
	 * 
	 * PRUEBA 3
	 * RESULTADO ESPERADO: INCORRECTO
	 * RESULTADO OBTENIDO: INCORRECTO*/

	public static void main(String[] args) {
		// Variable donde se almacenará el primer número aleatorio
		int num1 = (int) (Math.random()*99)+1;
		
		// Variable donde se almacenará el segundo número aleatorio
		int num2 = (int) (Math.random()*99)+1;
				
		// Variable donde se almacenará el resultado de la suma
		int suma;
		
		// Creamos el Scanner 
		Scanner sc = new Scanner(System.in);
		
		// Comprobamos que el usuario no introduzca letras
		try {
			// Pedimos el resultado de la suma y lo guardamos
			System.out.println("¿Cuál es el resultado de "+num1+" + "+num2+" ?");
			suma = sc.nextInt();
			
			// Comprobamos el resultado e imprimimos por pantalla
			System.out.println(suma==num1+num2 ? "Resultado correcto" : "Resultado incorrecto");
		} catch(InputMismatchException e) {
			System.out.println("No introduzca letras");
		}
		
		// Cerramos el Scanner
		sc.close();
	}
	
}
