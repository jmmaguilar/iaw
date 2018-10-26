package es.cj.ejerciciossemanalesuno.ej;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class EjercicioCuatro {

//	Leer 2 tablas de n números y mezclarla en una tercera tabla de la siguiente 
//	forma: 1º de A, 1º de B, 2º de A, 2º de B, 3º de A, 3º de B,...

	private static Scanner sc = new Scanner(System.in);

	private static int tabla1 [];
	private static int tabla2 [];
	private static int tFinal [];
	
	public static void main(String[] args) {
		int tamano = 0;
		do {
			System.out.print("Número de elementos de las tablas: ");
			tamano = sc.nextInt();
		} while (tamano <= 0);
		
		tabla1 = new int [tamano];
		tabla2 = new int [tamano];
		tFinal = new int [tamano * 2];
		
		inicioT1();
		
		inicioT2();
		
		tablafinal();
		
		muestraFinal();
		
		sc.close();
	}

	private static void muestraFinal() {
		System.out.println(Arrays.toString(tabla1));
		System.out.println(Arrays.toString(tabla2));
		System.out.println(Arrays.toString(tFinal));
		
	}

	private static void tablafinal() {
		int contadorT1 = 0, contadorT2 = 0;
		for (int i = 0; i < tFinal.length; i++) {
			if (i == 0) {
				tFinal[i] = tabla1[contadorT1];
				contadorT1++;
			} else if (i % 2 == 0) {
				tFinal[i] = tabla1[contadorT1];
				contadorT1++;
			} else {
				tFinal[i] = tabla2[contadorT2];
				contadorT2++;
			}
		}
		
	}

	private static void inicioT2() {
		for (int i = 0; i < tabla2.length; i++) {
			tabla2[i] = new Random().nextInt(50);
		}
		
	}

	private static void inicioT1() {
		for (int i = 0; i < tabla1.length; i++) {
			tabla1[i] = new Random().nextInt(50);
		}
		
	}

}
