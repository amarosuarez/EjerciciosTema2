package condicionales;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio05 {
	
	/* PRUEBA 1
	 * VALOR DE ENTRADA: 12
	 * RESULTADO ESPERADO: EL VALOR ABSOLUTO ES 12
	 * RESULTADO OBTENIDO: EL VALOR ABSOLUTO ES 12
	 * 
	 * PRUEBA 2
	 * VALOR DE ENRTADA: 5
	 * RESULTADO ESPERADO: EL VALOR ABSOLUTO ES 5
	 * RESULTADO OBTENIDO: EL VALOR ABSOLUTO ES 5
	 * 
	 * PRUEBA 3
	 * VALOR DE ENTRADA: -8
	 * RESULTADO ESPERADO: EL VALOR ABSOLUTO ES 8
	 * RESULTADO OBTENIDO: EL VALOR ABSOLUTO ES 8
	 * 
	 * PRUEBA 4
	 * VALOR DE ENTRADA: TRES
	 * RESULTADO ESPERADO: NO INTRODUZCA LETRAS
	 * RESULTADO OBTENIDO: NO INTRODUZCA LETRAS*/
	
	public static void main(String[] args) {
		// Variable donde se almacena el número del usuario
		int numero;
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Comprobamos que el usuario no introduzca ninguna letra
		try {
			// Le pedimos al usuario un número y lo guardamos
			System.out.println("Introduzca un número");
			numero = sc.nextInt();
			
			// Imprimimos el mensaje por pantalla
			System.out.println("El valor absoluto es " + (numero>=0 ? numero : numero-(numero*2)));
		} catch(InputMismatchException e) {
			System.out.println("No introduzca letras");
		}
		
		// Cerramos el Scanner
		sc.close();
	}
	
}
