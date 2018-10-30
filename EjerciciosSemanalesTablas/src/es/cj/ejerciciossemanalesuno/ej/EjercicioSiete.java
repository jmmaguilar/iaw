package es.cj.ejerciciossemanalesuno.ej;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class EjercicioSiete {

//	Se pretende desarrollar una aplicaci�n que nos ayude a gestionar 
//	las notas de un centro educativo. Cada clase est� compuesta por 10 alumnos.
//	Se pide leer las notas del primer, segundo y tercer trimestre almacen�ndolas 
//	en una tabla. Debemos mostrar la nota media final de cada alumno y de cada 
//	clase en cada trimestre. Por �ltimo, desarrolle un m�todo que se le pase un 
//	n�mero de alumno y devuelve la media final de ese alumno

	private static Scanner sc = new Scanner(System.in);
	private static int [][] tabla = new int [10][3];
	
	public static void main(String[] args) {
		
		inicializarTabla();

		mostrarTabla();
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
