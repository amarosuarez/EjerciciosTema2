package condicionales;

import java.util.Scanner;

public class Ejercicio01 {
	
	/* PRUEBA 1
	 * VALOR DE ENTRADA: 1
	 * RESULTADO ESPERADO: CAPICUA
	 * RESULTADO OBTENIDO: CAPICÚA
	 * 
	 * PRUEBA 2
	 * VALOR DE ENTRADA: 23
	 * RESULTADO ESPERADO: NO CAPICUA
	 * RESULTADO OBTENIDO: NO CAPICUA
	 * 
	 * PRUEBA 3
	 * VALOR DE ENTRADA: 66
	 * RESULTADO ESPERADO: CAPICUA
	 * RESULTADO OBTENIDO: CAPICUA
	 * 
	 * PRUEBA 4
	 * VALOR DE ENTRADA: 119
	 * RESULTADO ESPERADO: NO CAPICUA
	 * RESULTADO OBTENIDO: NO CAPICUA
	 * 
	 * PRUEBA 5
	 * VALOR DE ENTRADA: 777
	 * RESULTADO ESPERADO: CAPICUA
	 * RESULTADO OBTENIDO; CAPICUA
	 * 
	 * PRUEBA 6
	 * VALOR DE ENTRADA: 4124
	 * RESULTADO ESPERADO: NO CAPICUA
	 * RESULTADO OBTENIDO: NO CAPICUA
	 * 
	 * PRUEBA 7
	 * VALOR DE ENTRADA: 7007
	 * RESULTADO ESPERADO: CAPICUA
	 * RESULTADO OBTENIDO: CAPICUA 
	 * 
	 * PRUEBA 8
	 * VALOR DE ENTRADA: 92877
	 * RESULTADO ESPERADO: FUERA DE RANGO
	 * RESULTADO OBTENIDO: FUERA DE RANGO */
	
	public static void main(String[] args) {
		// Variable donde se almacena el número introducido por el usuario
		int numero;
		// Variables donde se almacenarán las cifras
		int primeraCifra;
		int segundaCifra;
		int terceraCifra;
		int cuartaCifra;
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos al usuario un número y lo guardamos
		System.out.println("Introduzca un número entre 0 y 9999");
		numero = sc.nextInt();
	
		// Comprobamos que el número esté dentro del rango
		if	(numero >= 0 && numero <= 9999) {
			// Comprobamos que el número este entre 0 y 9
			if (numero >= 0 && numero <= 9) {
				// Siempre será capicúa
				System.out.println("Número capicúa");
			} else if (numero >= 10 && numero <= 99) {
				// Para comprobar si un número de dos cifras es capicúa debemos igual el modulo de 11 a 0
				if(numero%11==0) {
					System.out.println("Número capicúa");
				} else {
					System.out.println("No capicúa");
				}
			} else if (numero >= 100 && numero <= 999) {
				// Separamos las cifras
				primeraCifra = numero/100;
				terceraCifra = numero%10;
				
				/* Para compobrar si un número de 3 cifras es capicúa debemos otener la primera cifra e 
				 * igualarla con la última cifra
				 */
				if (primeraCifra==terceraCifra) {
					System.out.println("Número capicúa");
				} else {	
					System.out.println("No capicúa");
				}
			} else {
				// Separamos las cifras
				primeraCifra = numero/1000;
				segundaCifra = (numero/100)%10;
				terceraCifra = (numero%100)/10;
				cuartaCifra = numero%10;
				
				/* Para comprobar si un número de 4 cifras es capicúa debemos comparar 
				 * la primera cifra con la última y la segunda con la tercera*/
				if (primeraCifra==cuartaCifra && segundaCifra==terceraCifra) {
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
