package es.cj.fundamentos.datos;

import java.util.Scanner;

public class Ejercicio2 {
	
	// Defina dos variables de tipo entero para describir las longitudes de los
	// lados de un rectángulo. El programa debe calcular y mostrar las
	// longitudes de los lados, el perímetro y el área del rectángulo
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// Recogida de datos
		System.out.println("Introduza el alto: ");
		int alto = sc.nextInt();
		System.out.println("Introduzca el ancho: ");
		int ancho = sc.nextInt();
		
		// Operaciones
		int perimetro = (alto * 2) + (ancho * 2);
		int area = alto * ancho;
		
		// Salidas
		System.out.println("El perímetro del rectángulo es: " + perimetro);
		System.out.println("El área del rectángulo es: " + area);
		
		sc.close();
	}
}
