package es.cj.ejerciciosif.datos;

import java.util.Scanner;

public class Explicacion {
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		// Pedir dos número y comprobar si son iguales
		System.out.println("Numero uno: ");
		int num1 = sc.nextInt();
		System.out.println("Numero dos: ");
		int num2 = sc.nextInt();
		
		
		// Forma 1
		
		if (num1 == num2) {
			System.out.println(num1 + " es igual a " + num2);
		} else {
			System.out.println(num1 + " no es igual a " + num2);
		}
		
		
		// Forma dos
		
		boolean condicion = num1 == num2;
		if (condicion)
			System.out.println(num1 + " es igual a " + num2);
		else
			System.out.println(num1 + " no es igual a " + num2);
		
		
		// Pedir un numero e indicar si es positivo, negativo o cero
		
		if (num1 > 0) {
			System.out.println(num1 + " es positivo.");
		} else if (num1 < 0) {
			System.out.println(num1 + " es negativo.");
		} else {
			System.out.println(num1 + " es cero.");
		}
		
		
		// Pedir dos número y decir si uno es multiplo de otro
		
		if (num1 % num2 == 0) {
			System.out.println(num1 + " es múltiplo de " + num2);
		} else if (num2 % num1 == 0) {
			System.out.println(num2 + " es múltiplo de " + num1);
		} else {
			System.out.println("Los números no son múltiplos");
		}
		
		
		// pedir dos números e indicar cual es el mayor o si son iguales
		
		if (num1 > num2) {
			System.out.println(num1 + " es mayor que " + num2);
		} else if (num2 > num1) {
			System.out.println(num2 + " es mayor que " + num1);
		} else {
			System.out.println(num1 + " es igual que " + num2);
		}
		
		
		// Pedir tres números y mostrarlos ordenados
		System.out.println("Numero 3: ");
		int num3 = sc.nextInt();
		if (num1 > num2 && num1 > num3) {
			System.out.print(num1 + " > ");
			if (num2 > num3) {
				System.out.println(num2 + " > " + num3);				
			} else {
				System.out.println(num3 + " > " + num2);
			}
		} else if (num2 > num3 && num2 > num1) {
			System.out.print(num2 + " > ");
			if (num3 > num1) {
				System.out.println(num3 + " > " + num1);
			} else {
				System.out.println(num1 + " > " + num3);
			}
		} else if (num3 > num1 && num3 > num2) {
			System.out.print(num3 + " > ");
			if (num2 > num1) {
				System.out.println(num2 + " > " + num1);
			} else {
				System.out.println(num1 + " > " + num2);
			}
		} else {
			System.out.println("Los tres números son iguales");
		}
		
		
		// Switch
		
		
		sc.close();
	}

}
