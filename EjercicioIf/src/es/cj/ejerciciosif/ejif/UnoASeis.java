package es.cj.ejerciciosif.ejif;

import java.util.Scanner;

public class UnoASeis {

	// 1 Pedir dos números y decir si son iguales o no
	// 2 Pedir un número e indicar si es positivo o negativo
	// 3 Pedir dos números y decir si uno es múltiplo del otro
	// 4 Pedir dos números e indicar cual es el mayor o si son iguales
	// 5 Pedir dos números y mostrarlos ordenados de mayor a menor 
	// 6 Pedir tres números y mostrarlos ordenados de mayor a menor
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
	// Recogida de datos
	System.out.println("Dame el primer número: ");
	int num1 = sc.nextInt();
	System.out.println("Dame el segundo número: ");
	int num2 = sc.nextInt();
	System.out.println("Dame el tercer número: ");
	int num3 = sc.nextInt();
	
	// Primer ejercicio
	System.out.println("---------------------------------------------");
	System.out.println("Pedir dos números y decir si son iguales o no:");
	if (num1 == num2) {
		System.out.println("El número " + num1 + " es igual a " + num2);
	} else {
		System.out.println("El número " + num1 + " no es igual a " + num2);
	}
	
	// Segundo ejercicio
	System.out.println("---------------------------------------------");
	System.out.println("Pedir un número e indicar si es positivo o negativo:");
	if (num1 < 0) {
		System.out.println("El número " + num1 + " es negativo.");
	} else if (num1 > 0) {
		System.out.println("El número " + num1 + " es positivo");
	} else {
		System.out.println("El número es 0 y por lo tanto no es válido");
	}
	
	// Tercer ejercicio
	System.out.println("---------------------------------------------");
	System.out.println("Pedir dos números y decir si uno es múltiplo del otro:");
	if (num1 % num2 == 0) {
		System.out.println("El número " + num1 + " es múltiplo de " + num2);
	} else if (num2 % num1 == 0) {
		System.out.println("El número " + num2 + " es múltiplo de " + num1);
	} else {
		System.out.println("Ninguno de los dós números es multiplo del otro");
	}
	
	// Cuarto ejercicio
	System.out.println("---------------------------------------------");
	System.out.println("Pedir dos números e indicar cual es el mayor o si son iguales");
	if (num1 > num2) {
		System.out.println(num1 + " es el mayor ");
	} else if (num2 > num1) {
		System.out.println(num2 + " es el mayor ");
	} else {
		System.out.println(num1 + " es igual a " + num2);
	}
	
	// Quinto ejercicio
	System.out.println("---------------------------------------------");
	System.out.println("Pedir dos números y mostrarlos ordenados de mayor a menor:");
	if (num1 > num2) {
		System.out.println(num1 + " > " + num2);
	} else if (num2 > num1) {
		System.out.println(num2 + " < " + num1);
	} else {
		System.out.println(num1 + " = " + num2);
	}
	
	// Sexto ejercicio
	System.out.println("---------------------------------------------");
	System.out.println("Pedir tres números y mostrarlos ordenados de mayor a menor");
	if (num1 > num2 && num1 > num3) {
		System.out.print(num1 + " > ");
		if (num2 > num3) {
			System.out.println(num2 + " > " + num3);
		} else {
			System.out.println(num3 + " > " + num2);
		}
	} else if (num2 > num1 && num2 > num3) {
		System.out.print(num2 + " > ");
		if (num1 > num3) {
			System.out.println(num1 + " > " + num3);
		} else {
			System.out.println(num3 + " > " + num1);
		}
	} else if (num3 > num1 && num3 > num2) {
		System.out.print(num3 + " > ");
		if (num1 > num2) {
			System.out.println(num1 + " > " + num2);
		} else {
			System.out.println(num2 + " > " + num1);
		}
	}
	
	sc.close();
	}

}
