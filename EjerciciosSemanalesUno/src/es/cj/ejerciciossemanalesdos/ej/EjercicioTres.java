package es.cj.ejerciciossemanalesdos.ej;

import java.util.Scanner;

public class EjercicioTres {

//	Escriba un programa que lea un número entero por el teclado y muestre
//	en la pantalla si es un número abundante. Un número abuntante 
//	si la suma de sus divisores es mayor que él
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int num;
		// Recogida de datos
		do {
			System.out.print("Dime un número: ");
			num = sc.nextInt();
		} while (num <= 0);
		
		int suma = divisores(num);
		
		if (suma > num) {
			System.out.println("El número " + num + " es abundante, su suma es " + suma);
		} else {
			System.out.println("El número " + num + " no es abundante, su suma es " + suma);
		}
	}

	private static int divisores(int num) {
		int sumaDivis = 1;
		for (int i = 2; i < num ; i++) {
			if (num % i == 0) {
				sumaDivis = sumaDivis + i;
			}
		}
		return sumaDivis;
	}

}
