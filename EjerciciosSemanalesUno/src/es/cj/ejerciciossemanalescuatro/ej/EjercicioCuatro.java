package es.cj.ejerciciossemanalescuatro.ej;

import java.util.Arrays;
import java.util.Random;

public class EjercicioCuatro {

	// Rellena una tabla de 10 números (valores aleatorios del 1 al 6). Reliza una
	// función que devuelva el número que más se repite.

	private static int tabla[] = new int[10];
	private static int numRep;

	public static void main(String[] args) {
		inicioTabla();

		mostrarTabla();

		numeroRepetido();

		System.out.println("El número que más se repite es: " + numRep);
	}

	private static void numeroRepetido() {
		int aux[] = new int[6];
		for (int i = 0; i < tabla.length; i++) {
			if (tabla[i] == 1) {
				aux[0] = aux[0] + 1;
			} else if (tabla[i] == 2) {
				aux[1] = aux[1] + 1;
			} else if (tabla[i] == 3) {
				aux[2] = aux[2] + 1;
			} else if (tabla[i] == 4) {
				aux[3] = aux[3] + 1;
			} else if (tabla[i] == 5) {
				aux[4] = aux[4] + 1;
			} else if (tabla[i] == 6) {
				aux[5] = aux[5] + 1;
			}
		}
		int mayor = 0, posicion = 0;
		for (int i = 0; i < aux.length; i++) {
			if (aux[i] > mayor) {
				mayor = aux[i];
				posicion = i;
			}
		}
		System.out.println(Arrays.toString(aux));
		numRep = posicion + 1;
		

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
