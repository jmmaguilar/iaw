package es.cj.fundamentos.datos;

import java.util.Scanner;

public class Ejercicio3 {
	
	// Pedir el radio de un círculo y calcular su área pi por r cuadrado y
	// su longitud dos pi r
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// Recogida de datos
		System.out.println("Dime el radio de un círculo: ");
		double radio = sc.nextDouble();
		
		// Operaciones
		double area = Math.PI * Math.pow(radio, 2);
		double longitud = 2 * Math.PI * radio;
		
		//Salidas
		System.out.println("El área del círculo es: " + area + "\n" + "La longitud del círculo es: " + longitud);
	
		sc.close();
	}

}
