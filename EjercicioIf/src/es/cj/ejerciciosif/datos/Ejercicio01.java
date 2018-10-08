package es.cj.ejerciciosif.datos;

import java.util.Scanner;

public class Ejercicio01 {

	// Pedir una nota de 0 a 10 y mostrarla como insuficiente, suficiente, bien, notable
	// y sobresaliente

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Regida de datos
		System.out.println("Dame tu nota: ");
		double nota = sc.nextDouble();

		// Condiciones
		if (nota < 5 && nota >= 0) {
			System.out.println("Insuficiente");
		} else if (nota >= 5 && nota < 6) {
			System.out.println("Suficiente");
		} else if (nota >= 6 && nota < 7) {
			System.out.println("Bien");
		} else if (nota >= 7 && nota < 9) {
			System.out.println("Notable");
		} else if (nota <= 10 && nota >= 0) {
			System.out.println("Sobresaliente");
		} else {
			System.out.println("Nota no v�lida");
		}
		
		switch ((int)nota) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.println("Insuficiente");
			break;
		case 5:
			System.out.println("Suficiente");
			break;
		case 6:
			System.out.println("Bien");
			break;
		case 7:
		case 8:
			System.out.println("Notable");
			break;
		case 9:
		case 10:
			System.out.println("Sobresaliente");
			break;
		default:
			System.out.println("Valor incorrecto");
			break;
		}

		sc.close();
	}

}
