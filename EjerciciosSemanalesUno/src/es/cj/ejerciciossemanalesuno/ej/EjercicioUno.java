package es.cj.ejerciciossemanalesuno.ej;

import java.util.Scanner;

public class EjercicioUno {

	// Se solicita leer un n�mero entero positivo y 
	// determinar si es un n�mero de 1,2,3 o 4 cifras
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// Recogida de datos
		System.out.print("Dame un n�mero entero positivo y no cero: ");
		int num = sc.nextInt();
		
		// Condicion
		if (num > 0) {
			if (num < 10) {
				System.out.println("El n�mero tine 1 cifra");
			} else if (num < 100) {
				System.out.println("El n�mero tiene 2 cifras");
			} else if (num < 1000) {
				System.out.println("El n�mero tiene 3 cifras");
			} else if (num < 10000) {
				System.out.println("El numero tiene 4 cifras");
			} else {
				System.out.println("El n�mero tiene m�s de 4 cifras");
			}
		} else {
			System.out.println("El n�mero debe ser un entero positivo y no cero.");
		}

	}

}
