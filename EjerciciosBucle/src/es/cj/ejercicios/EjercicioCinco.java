package es.cj.ejercicios;

import java.util.Scanner;

public class EjercicioCinco {

	// Pedir un número y calcular su factorial
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int factorial = 1, numero = 0;
		// Recogida de datos
		do {
			System.out.println("Dame un número: ");
			numero = sc.nextInt();
		} while (numero <= 0);
		
		for (int i = numero; i >= 2; i--) {
			factorial = factorial * i;
		}

		System.out.println("El factorial de " + numero + " es " + factorial);
		
		sc.close();
	}

}
