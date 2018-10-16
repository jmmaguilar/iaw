package es.cj.ejercicios;

import java.util.Scanner;

public class EjercicioTres {

	// Programa que muestre y calcule el producto de los n primeros números impares
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// variables
		int producto = 1;
		
		// Recogida de datos
		System.out.print("Número: ");
		int num = sc.nextInt();
		
		for (int i = 1; i <= (num * 2); i = i + 2) {
				producto = producto * i;
				System.out.println(i);
		}
		System.out.println("El producto de los primeros " + num + " impares es de: " + producto);
		sc.close();
	}

}
