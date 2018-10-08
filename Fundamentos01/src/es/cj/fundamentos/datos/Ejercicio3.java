package es.cj.fundamentos.datos;

import java.util.Scanner;

public class Ejercicio3 {
	
	// Pedir el radio de un c�rculo y calcular su �rea pi por r cuadrado y
	// su longitud dos pi r
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// Recogida de datos
		System.out.println("Dime el radio de un c�rculo: ");
		double radio = sc.nextDouble();
		
		// Operaciones
		double area = Math.PI * Math.pow(radio, 2);
		double longitud = 2 * Math.PI * radio;
		
		//Salidas
		System.out.println("El �rea del c�rculo es: " + area + "\n" + "La longitud del c�rculo es: " + longitud);
	
		sc.close();
	}

}
