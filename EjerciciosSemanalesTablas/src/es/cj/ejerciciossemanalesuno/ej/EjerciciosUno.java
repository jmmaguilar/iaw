package es.cj.ejerciciossemanalesuno.ej;

import java.util.Random;
import java.util.Scanner;

public class EjerciciosUno {

//	Leer n números enteros, guardarlos en la tabla y mostrar la media de los positivos,
//	media negativos y el número de ceros

	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// Recogida de datos
		System.out.print("Cuantos números va a proporcionar: ");
		int num = sc.nextInt();
		
		int tabla [] = new int [num];
		
		System.out.println(resultado(tabla));

		sc.close();
	}

	private static String resultado(int[] tabla) {
		// Variables
		String resultado = "";
		int mediaPositivos = 0, contadorPositivos = 0, mediaNegativos = 0, contadorNegativos = 0, contadorCeros = 0;
		
		
		// Recogida de Datos y comprobaciones
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = new Random().nextInt(20) - 10;
			if (tabla[i] > 0) {
				mediaPositivos += tabla[i];
				contadorPositivos++;
			} else if (tabla[i] < 0) {
				mediaNegativos += tabla[i];
				contadorNegativos++;
			} else {
				contadorCeros++;
			}
		}
		
		resultado = "Media positivos: " + (mediaPositivos = mediaPositivos / contadorPositivos) + "\n" + "Media negativos: " + (mediaNegativos = mediaNegativos / contadorNegativos) + "\n" + "Ceros totales: " + contadorCeros;
		
		return resultado;
	}

}
