package condicionales;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio04 {
	
	/*
	 * PRUEBA 1
	 * VALOR DE ENTRADA: 1
	 * RESULTADO ESPERADO: UNO
	 * RESULTADO OBTENIDO: UNO
	 * 
	 * PRUEBA 2
	 * VALOR DE ENTRADA: 101
	 * RESULTADO ESPERADO: FUERA DE RANGO
	 * RESULTADO OBTENIDO: FUERA DE RANGO
	 * 
	 * PRUEBA 3
	 * VALOR DE ENTRADA: 99
	 * RESULTADO ESPERADO: NOVENTA Y NUEVE
	 * RESULTADO OBTENIDO: NOVENTA Y NUEVE
	 * 
	 * PRUEBA 4
	 * VALOR DE ENTRADA: DOS
	 * RESULTADO ESPERADO: NO INTRODUZCA LETRAS
	 * RESULTADO OBTENIDO: NO INTRODUZCA LETRAS
	 * 
	 * PRUEBA 5
	 * VALOR DE ENTRADA: 33
	 * RESULTADO ESPERADO: TREINTA Y TRES
	 * RESULTADO OBTENIDO: TREINTA Y TRES*/

	public static void main(String[] args) {
		// Variable donde se almacenará el número
		int num;
		
		// Variable donde se almacenará el número en texto
		String numTxt="";
		
		// Creamos el objeto Scanner
		Scanner sc = new Scanner(System.in);
		
		// Comprobamos que el usuario no introduzca letras
		try {
			// Le pedimos al usuario un número y lo guardamos
			System.out.println("Introduzca un número entre 1 y 99");
			num = sc.nextInt();
			
			// Variable donde se almacena la primera cifra
			int primeraCifra = num/10;
			
			// Variable donde se almacena la segunda cifra
			int segundaCifra = num%10;
			
			// Comprobamos que el número esté dentro del rango
			if (num > 0 && num < 100) {
				// Comprobamos que el número sea igual o mayor que 10 y menor que 16
				if (primeraCifra==1 && segundaCifra<6) {
					numTxt = switch(num) {
						case 10 -> "diez";
						case 11 -> "once";
						case 12 -> "doce";
						case 13 -> "trece";
						case 14 -> "catorce";
						case 15 -> "quince";
						default -> "";
					};
				} else {
					// Según la primera cifra asignamos un valor
					if (primeraCifra==1) {
						numTxt = "dieci";
					} else if (primeraCifra==2) {
						if (segundaCifra==0) {
							numTxt = "veinte";
						} else {
							numTxt = "veinti";
						}
					} else {
						numTxt = switch (primeraCifra) {
							case 3 -> "treinta";
							case 4 -> "cuarenta";
							case 5 -> "cincuenta";
							case 6 -> "sesenta";
							case 7 -> "setenta";
							case 8 -> "ochenta";
							case 9 -> "noventa";
							default -> "";
						};
					}
					
					// Comprobamos que el número no sea una decena (10,20,30...) para asignarle "y"
					if (primeraCifra>2 && segundaCifra!=0) {
						numTxt += " y ";
					}
					
					// Asignamos el valor final sumando el valor anterior de la cadena con los números de 0 y 9
					numTxt += switch (segundaCifra) {
						default -> "";
						case 1 -> "uno";
						case 2 -> "dos";
						case 3 -> "tres";
						case 4 -> "cuatro";
						case 5 -> "cinco";
						case 6 -> "seis";
						case 7 -> "siete";
						case 8 -> "ocho";
						case 9 -> "nueve";
					};
				}
				
				// Imprimimos el mensaje por pantalla
				System.out.println(numTxt);
				
			} else {
				System.out.println("Fuera de rango");
			}
			
		} catch(InputMismatchException e) {
			System.out.println("No introduzca letra");
		}
		
		// Cerramos el Scanner
		sc.close();
	}
	
}
