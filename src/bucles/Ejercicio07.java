package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		// Variables
		int numero;
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		try {
			// Le pedimos un número y lo guardamos
			System.out.println("Introduzca un número");
			numero = sc.nextInt();
			
			for(int i=1; i<=numero; i++) {
				for(int j=1; j<= i; j++) {
					System.out.print(j);
				}
				
				for(int j=i-1; j>=1; j--) {
					System.out.print(j);
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
