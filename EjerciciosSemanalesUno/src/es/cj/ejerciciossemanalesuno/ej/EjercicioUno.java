package es.cj.ejerciciossemanalesuno.ej;

import java.util.Scanner;

public class EjercicioUno {

	// Se solicita leer un número entero positivo y 
	// determinar si es un número de 1,2,3 o 4 cifras
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// Recogida de datos
		System.out.print("Dame un número entero positivo y no cero: ");
		int num = sc.nextInt();
		
		// Condicion
		if (num > 0) {
			if (num < 10) {
				System.out.println("El número tine 1 cifra");
			} else if (num < 100) {
				System.out.println("El número tiene 2 cifras");
			} else if (num < 1000) {
				System.out.println("El número tiene 3 cifras");
			} else if (num < 10000) {
				System.out.println("El numero tiene 4 cifras");
			} else {
				System.out.println("El número tiene más de 4 cifras");
			}
		} else {
			System.out.println("El número debe ser un entero positivo y no cero.");
		}

	}

}
