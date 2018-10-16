package es.cj.ejercicios;

import java.util.Scanner;

public class EjercicioCuatro {

	private static Scanner sc = new Scanner(System.in);
	
	// Escribir un programa que lea un número desde el teclado 
	// y realice la suma de los 100 número siguientes, mostrando el resultado
	// en pantalla
	
	public static void main(String[] args) {
		// Variables
		int suma = 0;
		
		// Recogida de variables
		System.out.print("Número: ");
		int num = sc.nextInt();
		
		// Bucles
		for (int i = (num + 1); i <= (num + 100); i++) {
			suma += i;
		}
		System.out.println("La suma total de los 100 siguientes número a " + num + " es de: " + suma);
	}

}
