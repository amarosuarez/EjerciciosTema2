package condicionales;

import java.util.Scanner;

public class Ejercicio01 {
	
	public static void main(String[] args) {
		// Variable donde se almacena el número introducido por el usuario
		int numero;
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un número");
		numero = sc.nextInt();
	
		if	(numero >= 0 && numero <= 9999) {
			
			if (numero >= 0 && numero <= 9) {
				System.out.println("Número capicúa");
			} else if (numero >= 10 && numero <= 100) {
				if(numero/10!=0) {
					System.out.println("Número capicúa");
				} else {
					System.out.println("No capicúa");
				}
			}
			
		} else {
			System.out.println("Número fuera del rango");
		}
		
		// Cerramos el Scanner
		sc.close();
	}
}
