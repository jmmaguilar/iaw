package es.cj.ejerciciossemanalesuno.ej;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class EjercicioSiete {

//	Se pretende desarrollar una aplicación que nos ayude a gestionar 
//	las notas de un centro educativo. Cada clase está compuesta por 10 alumnos.
//	Se pide leer las notas del primer, segundo y tercer trimestre almacenándolas 
//	en una tabla. Debemos mostrar la nota media final de cada alumno y de cada 
//	clase en cada trimestre. Por último, desarrolle un método que se le pase un 
//	número de alumno y devuelve la media final de ese alumno

	private static Scanner sc = new Scanner(System.in);
	private static int [][] tabla = new int [10][3];
	
	private static int alumno = 0;
	
	public static void main(String[] args) {
		
		inicializarTabla();

		mostrarTabla();
		
		do {
			System.out.println("Número de alumno: ");
			alumno = sc.nextInt();
		} while (alumno <= 0 && alumno > 10);
		System.out.print("La media final del alumno: " + alumno + " es de: " + media());
	}

	private static double media() {
		double media = 0;
			for (int i = 0; i < tabla[alumno].length; i++) {
				media = tabla[alumno][i] + media;
			}
			media = media / 3;
		return media;
	}

	private static void mostrarTabla() {
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				System.out.print(tabla[i][j]);
			}
			System.out.println("");
		}
		
	}

	private static void inicializarTabla() {
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				tabla[i][j] = new Random().nextInt(10);
				
			}
		}
		
	}

}
