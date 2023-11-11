package bucles;

import java.util.Scanner;

public class Ejercicio02 {
	
	public static void main(String[] args) {
		
		int numero;
		int contador=0;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número");
		numero = sc.nextInt();
		
		for (int numeroFijo=2; numeroFijo<=numero; numeroFijo++) {
			
			boolean esPrimo = true;
			
			for (int numeroCambia=2; numeroCambia<=numeroFijo; numeroCambia++) {
				if (numeroFijo%numeroCambia==0) {
					esPrimo = false;
					break;
				}
			}
			
			if (esPrimo) contador++;
			
		}
		
		System.out.println("Entre 1 y " + numero + " hay " + contador + " números primos");
	}
	
}
