package es.cj.ejerciciosif.ejif;

import java.util.Scanner;

public class Ocho {
	
	// Pedir al ususario dia, mes y año y comprobar que la fecha es correcta
	// incluido bisiestos
	// multiplo de 4 y no de 100 o multiplo de 400
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// Recogida de datos
		System.out.println("Año: ");
		int anno = sc.nextInt();
		System.out.println("Mes: ");
		int mes = sc.nextInt();
		System.out.println("Día: ");
		int dia = sc.nextInt();
		
		// Bisiesto y condicionles
		boolean bisiesto = false;
		if (anno >= 0) {
			if (anno % 4 == 0 && anno % 100 != 0) {
				bisiesto = true;
			} else if (anno % 400 == 0) {
				bisiesto = true;
			}
			switch (mes) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				if (dia > 0 && dia <= 31) {
					System.out.println("La fecha es correcta.");
				} else {
					System.out.println("La fecha es incorrecta.");
				}
				break;
			case 2:
				if (dia > 0 && dia <= 28) {
					System.out.println("La fecha es correcta.");
				} else if (dia > 0 && dia <= 29 && bisiesto) {
					System.out.println("La fecha es correcta.");
				} else {
					System.out.println("Dia incorrecto");
				}
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				if (dia > 0 && dia <= 30) {
					System.out.println("Fecha correcta");
				} else {
					System.out.println("Dia incorrecto");
				}
				break;
			default:
				System.out.println("Mes incorrecto");
				break;
			}
		}
		
		sc.close();
	}
}