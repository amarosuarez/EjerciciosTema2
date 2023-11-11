package bucles;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		// Variable donde se almacena el número introducido
		int num;
		// Variable donde se almacena el número de cifras
		int numCifras=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un número mayor que 0");
		num = sc.nextInt();
		
		while(num>0) {
			num /= 10;
			numCifras++;
		}
		
		System.out.println("Tu número tiene " + numCifras + " cifras");
		
		sc.close();
	}
	
}
