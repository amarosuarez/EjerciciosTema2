package bucles;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		// Variable donde se almacena el número
		int numero;
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos un número y lo almacenamos
		System.out.println("Dime un número");
		numero = sc.nextInt();
		
		// Bucle
		for (int i=1; i<=numero; i++) {
			
			for (int j=1; j<=i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		// Cerramos el Scanner
		sc.close();
		
	}
	
}
