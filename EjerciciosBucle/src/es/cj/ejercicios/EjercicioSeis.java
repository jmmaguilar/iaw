package es.cj.ejercicios;

import java.util.Scanner;

public class EjercicioSeis {
	
//	Diseñe una aplicación que muestre las tablas de multiplicar del 1 al 10. 
//	Además, solicite al usuario que tabla quiere mostrar
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int tablas = 0;
		// Recogida de datos
		do {
			System.out.print("Dime una tabla [0 = Todas]: ");
			tablas = sc.nextInt();
		} while (tablas < 0);
			
		if (tablas == 0) {
			for (int i = 1; i <= 10; i++) {
				System.out.println("Tabla del " + i);
				for (int j = 1; j <= 10; j++) {
					System.out.println(i + " * " + j + " = " + (i*j));
				}
			}
		} else {
			for (int i = 1; i <= 10; i++) {
				System.out.println(tablas + " * " + i + " = " + (i*tablas));
			}
		}
		
	}
}
