package es.cj.ejerciciossemanalesuno.ej;

import java.util.Arrays;
import java.util.Random;

public class EjercicioSemanalProfesor{

	// Rellena una tabla de 10 n�meros (valores aleatorios del 1 al 6). Reliza una
	// funci�n que devuelva el n�mero que m�s se repite.

	private static int tabla[] = new int[10];
	private static int numRep;

	public static void main(String[] args) {
		inicioTabla();

		mostrarTabla();

		numeroRepetido();

		System.out.println("El n�mero que m�s se repite es: " + numRep);
	}

	private static void numeroRepetido() {
		int mayor = 0, posicion = 0;
		Arrays.sort(tabla);
		for (int i = 0; i < tabla.length; i++) {
			
		}
		

	}

	private static void mostrarTabla() {
		System.out.println(Arrays.toString(tabla));

	}

	private static void inicioTabla() {
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = new Random().nextInt(5) + 1;
		}

	}

}
