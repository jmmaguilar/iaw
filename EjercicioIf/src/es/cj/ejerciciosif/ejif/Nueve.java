package es.cj.ejerciciosif.ejif;

import java.util.Scanner;

public class Nueve {
	
	// Pedir día, mes y año y mostrar la fecha del día siguiente. 
	// Suponer que todos los meses son de 30 días
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// Recogida de datos
		System.out.println("Dame el día: ");
		int dia = sc.nextInt();
		System.out.println("Dame el mes: ");
		int mes = sc.nextInt();
		System.out.println("Dame el año: ");
		int anno = sc.nextInt();
		
		if (dia < 30) {
			dia = dia + 1;
			System.out.println(dia + "/" + mes + "/" + anno);
		} else {
			dia = 1;
			if (mes < 12) {
				System.out.println();
			}
		}
		
		
		sc.close();
	}

}
