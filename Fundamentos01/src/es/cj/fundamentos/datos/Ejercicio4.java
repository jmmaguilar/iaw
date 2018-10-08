package es.cj.fundamentos.datos;

import java.util.Scanner;

public class Ejercicio4 {
	
	// Pida al usuario una cantidad de segundos e imprima la cantidad 
	// de horas, minutos y segundos que son

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// Recogida de datos
		System.out.println("Deme una cantidad de segundos: ");
		int segundosT = sc.nextInt();
		
		// Operaciones
		int horas = segundosT / 3600;
		int minutos = (segundosT % 3600) / 60;
		int segundos = (segundosT % 60);
		
		// Salidas
		System.out.println(segundos + " segundos son:");
		System.out.println("Horas: " + horas + ", minutos: " + minutos + ", segundos: " + segundos);
	
		sc.close();
	}
}
