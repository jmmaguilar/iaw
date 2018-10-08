package es.cj.ejerciciosif.ejif;

import java.util.Scanner;

public class UnoASeis {

	// 1 Pedir dos n�meros y decir si son iguales o no
	// 2 Pedir un n�mero e indicar si es positivo o negativo
	// 3 Pedir dos n�meros y decir si uno es m�ltiplo del otro
	// 4 Pedir dos n�meros e indicar cual es el mayor o si son iguales
	// 5 Pedir dos n�meros y mostrarlos ordenados de mayor a menor 
	// 6 Pedir tres n�meros y mostrarlos ordenados de mayor a menor
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
	// Recogida de datos
	System.out.println("Dame el primer n�mero: ");
	int num1 = sc.nextInt();
	System.out.println("Dame el segundo n�mero: ");
	int num2 = sc.nextInt();
	System.out.println("Dame el tercer n�mero: ");
	int num3 = sc.nextInt();
	
	// Primer ejercicio
	System.out.println("---------------------------------------------");
	System.out.println("Pedir dos n�meros y decir si son iguales o no:");
	if (num1 == num2) {
		System.out.println("El n�mero " + num1 + " es igual a " + num2);
	} else {
		System.out.println("El n�mero " + num1 + " no es igual a " + num2);
	}
	
	// Segundo ejercicio
	System.out.println("---------------------------------------------");
	System.out.println("Pedir un n�mero e indicar si es positivo o negativo:");
	if (num1 < 0) {
		System.out.println("El n�mero " + num1 + " es negativo.");
	} else if (num1 > 0) {
		System.out.println("El n�mero " + num1 + " es positivo");
	} else {
		System.out.println("El n�mero es 0 y por lo tanto no es v�lido");
	}
	
	// Tercer ejercicio
	System.out.println("---------------------------------------------");
	System.out.println("Pedir dos n�meros y decir si uno es m�ltiplo del otro:");
	if (num1 % num2 == 0) {
		System.out.println("El n�mero " + num1 + " es m�ltiplo de " + num2);
	} else if (num2 % num1 == 0) {
		System.out.println("El n�mero " + num2 + " es m�ltiplo de " + num1);
	} else {
		System.out.println("Ninguno de los d�s n�meros es multiplo del otro");
	}
	
	// Cuarto ejercicio
	System.out.println("---------------------------------------------");
	System.out.println("Pedir dos n�meros e indicar cual es el mayor o si son iguales");
	if (num1 > num2) {
		System.out.println(num1 + " es el mayor ");
	} else if (num2 > num1) {
		System.out.println(num2 + " es el mayor ");
	} else {
		System.out.println(num1 + " es igual a " + num2);
	}
	
	// Quinto ejercicio
	System.out.println("---------------------------------------------");
	System.out.println("Pedir dos n�meros y mostrarlos ordenados de mayor a menor:");
	if (num1 > num2) {
		System.out.println(num1 + " > " + num2);
	} else if (num2 > num1) {
		System.out.println(num2 + " < " + num1);
	} else {
		System.out.println(num1 + " = " + num2);
	}
	
	// Sexto ejercicio
	System.out.println("---------------------------------------------");
	System.out.println("Pedir tres n�meros y mostrarlos ordenados de mayor a menor");
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
