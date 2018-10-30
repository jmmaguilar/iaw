package es.cj.ejerciciossemanalesuno.ej;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class EjercicioSeisProfesor {

	private static Scanner sc = new Scanner(System.in);
	
	private static int [] tabla;
	
	public static void main(String[] args) {
		int tamano;
		do {
			System.out.print("Dame el tamaño de la tabla: ");
			tamano = sc.nextInt();
		} while (tamano <= 0);
		
		tabla = new int [tamano];
		
		inicializarTabla();
		
		mostrarTabla();

		int posicion;
		do {
			System.out.println("Valor: ");
			posicion = sc.nextInt();
		} while (posicion < 0 || posicion > tamano);
		
		eliminarPosicion(posicion);
		
		mostrarTabla();
		
		sc.close();
	}

	private static void eliminarPosicion(int posicion) {
		for (int i = posicion; i < tabla.length - 1; i++) {
			tabla[i] = tabla[i + 1];
		}
		tabla[tabla.length - 1] = 0;
	}

	private static void mostrarTabla() {
		System.out.println(Arrays.toString(tabla));
		
	}

	private static void inicializarTabla() {
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = new Random().nextInt(20);
		}
		
	}
}
