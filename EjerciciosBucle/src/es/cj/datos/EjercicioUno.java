package es.cj.datos;

import java.util.Scanner;

public class EjercicioUno {
	
	// Pedir 5 números. Mostrar la media de los positivos, media de negativos y cantidad de
	// ceros

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// Variables
		double sumaPositivos = 0, sumaNegativos = 0;
		int contadorPositivos = 0, contadorNegativos = 0, contadorCeros = 0;
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Número: ");
			double numero = sc.nextDouble();
			
			if (numero > 0) {
				sumaPositivos += numero;
				contadorPositivos++;
			} else if (numero < 0) {
				sumaNegativos += numero;
				contadorNegativos++;
			} else {
				contadorCeros++;
			}
		}
		
		System.out.println("Media de Positivos: " + (sumaPositivos/contadorPositivos));
		System.out.println("Media de Negativos: " + (sumaNegativos/contadorNegativos));
		System.out.println("Contador de Ceros: " + contadorCeros);
		
		sc.close();
	}

}
