package es.cj.ejerciciossemanalesuno.ej;

import java.util.Scanner;

public class EjercicioDos {

	// Un obrero necesita calcular su salario semanal,
	// el cual se obtiene de la siguiente manera:
	// - Si trabaja 40 horas o menos se le paga 16 por hora
	// - si trabaja mas de 40 horas se le paga 16 por 
	//   cada una de las primeras 40 horas y 20 por cada hora extra
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// Recogida de datos
		System.out.print("Dime las horas que has trabajado esta semana: ");
		double horas = sc.nextDouble();
		double salario;
		
		// Condiciones
		if (horas <= 40 && horas >= 0) {
			salario = horas * 16;
			System.out.println("El salario de esta semana es de: " + salario + "€");
		} else if (horas > 40) {
			double horasext = horas - 40;
			horas = horas - horasext;
			salario = horas * 16;
			salario = salario + (horasext * 20);
			System.out.println("El salario de esta semana es de: " + salario + "€");
		} else {
			System.out.println("No esta permitido horas negativas.");
		}
	}

}
