package es.cj.ejerciciossemanalestres.ej;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class EjerciciosCuatro {

//	Rellena una tabla de 20 n�meros positivos de manera aleatoria.
//	Pida n�meros al usuario (0 para finalizar el bucle) y muestra cu�ntas veces
//	se repite el n�mero en la tabla y cu�l es la primera posici�n en la que aparece
//	(-1 si no se encuentra en la tabla)

	private static Scanner sc = new Scanner(System.in);
	
	private static int tabla [] = new int [20];
	
	public static void main(String[] args) {
		inicioTabla();
		
		busqueda();
		
		sc.close();

	}

	private static void busqueda() {
		int num = 0, contador = 0, primer = -1;
		System.out.println(Arrays.toString(tabla));
		do {
			System.out.print("Dame un n�mero: ");
			num = sc.nextInt();
			for (int i = 0; i < tabla.length; i++) {
				if (tabla[i] == num && primer == -1) {
					primer = i;
					contador++;
				} else if (tabla[i] == num) {
					contador++;
				}
			}
			if (primer != -1) {
				System.out.println("El numero se repite " + contador + " y su primera posici�n es " + primer);
			} else {
				System.out.println("El numero no aparece");
			}
			
			contador = 0;
			primer = -1;
		} while (num != 0);
		
	}

	private static void inicioTabla() {
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = new Random().nextInt(10); 
		}
		
	}

}
