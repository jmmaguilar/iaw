package es.cj.ejerciciossemanalesuno.ej;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class EjercicioCinco {

	// leer tabla de n numeros y desplazarla una posicion hacia abajo
	
	private static Scanner sc = new Scanner(System.in);
	
	private static int [] numeros;
	
	
	public static void main(String[] args) {
	int tamano;
	do {
		System.out.println("Numero de elemetnos: ");
		tamano = sc.nextInt();
	} while (tamano <= 0);

	numeros = new int [tamano];
	
	iniciar();
	
	mostrar();
	
	desplazar();
	
	mostrar();
	
	sc.close();
	}


	private static void desplazar() {
		int aux = numeros[numeros.length - 1];
		for (int i = numeros.length -1 ; i > 0; i--) {
			numeros[i] = numeros[i-1];
		}
		numeros[0] = aux;
	}


	private static void mostrar() {
		System.out.println(Arrays.toString(numeros));
		
	}


	private static void iniciar() {
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = new Random().nextInt(50) + 1;
		}
		
	}

}
