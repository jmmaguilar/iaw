package es.cj.ejerciciossemanalesuno.ej;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class EjercicioSeis {
	//	Crear una tabla de n elementos. Pedir al usuario un valor entre 0 y n-1. 
	//	Eliminar el valor de esa posición y desplazar todos los elementos para no dejar el 
	//	hueco vacío
	
	private static Scanner sc = new Scanner(System.in);
	
	private static int [] tabla;
	private static int tamano, valor = 0;
	
	public static void main(String[] args) {
		
		do {
			System.out.print("Dame el tamaño de la tabla: ");
			tamano = sc.nextInt();
		} while (tamano <= 0);
		
		tabla = new int [tamano];
		
		inicializarTabla();
		
		mostrarTabla();
		
		System.out.print("Dame el valor a borrar: ");
		valor = sc.nextInt();
		borrar();
		
		mostrarTabla();
		
		sc.close();
	}

	private static void borrar() {
		int posicion = Arrays.binarySearch(tabla, valor);
		System.out.println(posicion);
		if(posicion >= 0) {	
			for (int i = posicion; i < tabla.length; i++) {
				tabla[i] = tabla[i + 1];
			} 
		} else {
			System.out.println("Valor no encontrado");
		}
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
