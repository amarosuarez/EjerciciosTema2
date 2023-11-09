package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {

		int horas, minutos, segundos, cantidadIncrementar;

		Scanner sc = new Scanner(System.in);

		try {
			
			do {
				System.out.println("Introduce las horas");
				horas = sc.nextInt();
			} while(horas < 0 || horas > 23);
			
			do {
				System.out.println("Introduce los minutos");
				minutos = sc.nextInt();
			} while(minutos <  0 || minutos > 59); 

			do {
				System.out.println("Introduce los segundos");
				segundos = sc.nextInt();
			} while(segundos < 0 || segundos > 59);

			do {
				System.out.println("Introduce los segundos a incrementar");
				cantidadIncrementar = sc.nextInt();
			} while(cantidadIncrementar < 0);
			
			for (int i = 0; i < cantidadIncrementar; i++) {
	            segundos++;
	            if (segundos > 59) {
	                segundos = 0;
	                minutos++;
	                if (minutos == 60) {
	                    minutos = 0;
	                    horas++;
	                    if (horas == 24) {
	                        horas = 0;
	                    }
	                }
	            }
	        }
			
			System.out.println("La nueva hora es: "
					+ (horas<10 ? "0"+horas : horas) + ":"
					+ (minutos<10 ? "0"+minutos : minutos) + ":"
					+ (segundos<10 ? "0"+segundos : segundos));
			
		} catch(InputMismatchException e) {
			System.out.println("No introduzca letras");
		}
		
		sc.close();
	}

}
