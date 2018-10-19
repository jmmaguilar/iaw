package es.cj.ejercicios;

import java.util.Random;
import java.util.Scanner;

public class EjercicioNueve {

	// Lee por teclado una serie de n numeros. La aplicación debe indicarnos si
	// los números estan ordenados de forma creciente, decreciente, o si no están 
	// ordenados
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int cantidad = 0;
		
		do {
			System.out.print("Candidad de números: ");
			cantidad = sc.nextInt();
		} while (cantidad <= 0);

		// 1:creciente -1:decreciente 0:desordenado
		int orden = comprobarOrden(cantidad);
		
		switch (orden) {
		case 1:
			System.out.println("Crecientes");
			break;
		case -1:
			System.out.println("Decrecientes");
			break;	
		default:
			System.out.println("Desordenados");
			break;
		}
		
		sc.close();
	}

	private static int comprobarOrden(int cantidad) {
		int orden = 0;
		boolean creciente = false, decreciente = false;
		int numero = 0, auxiliar = 0;
		
		for (int i = 0; i < cantidad; i++) {
			numero = new Random().nextInt(100);
			System.out.print(numero + " ");
		
			if (i == 0) {
				auxiliar = numero;
			} else {
				if (numero > auxiliar) {
					creciente = true;
				} else if (numero < auxiliar) {
					decreciente = true;
				}
				auxiliar = numero;
			}
		}
		if (creciente && !decreciente) {
			orden = 1;
		} else if (decreciente && !creciente) {
			orden = -1;
		}
		return orden;
	}

}
