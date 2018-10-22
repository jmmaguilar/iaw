package es.cj.ejerciciostablas.datos;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Explicacion {

	public static void main(String[] args) {
		int tabla [][] = new int [10][6];
		
		tabla[2][1] = 3;
		
		int tabla2 [] = {1,2,3};
		
		// Ejemplo tabla dos dimensiones
		
		int tabla3 [][] = {{1,2,3}, {4,5}, {6,7,8,9}};
		
		for (int i = 0; i < tabla3.length; i++) {
			for (int j = 0; j < tabla3[i].length; j++) {
				System.out.print(tabla3[i][j] + " ");
			}
			System.out.println();
		}
		
		// Recorrido tabla2
		
		for (int i = 0; i < tabla2.length; i++) { // .length nos da la longitud de la tabla
			System.out.print(tabla2[i] + " ");
		}
		
		// Modificacion tabla2
		
		for (int i = 0; i < tabla2.length; i++) {
			tabla2[i] = tabla2[i] * tabla2[i];
		}
		
		for (int i = 0; i < tabla2.length; i++) {
			System.out.print(tabla2[i] + " ");
		}
		
		// Array de cadena de carácteres
		
		String cadena [] = {"Hola", "que", "tal"};
		for (int i = 0; i < cadena.length; i++) {
			System.out.print(cadena[i] + " ");
		}
		
		// Inicializar tabla
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) { // con tabla[i] se marcan las columnas que tiene esa fila
				tabla[i][j] = new Random().nextInt(10); // añadimos un número a cada posicion
			}
		}
		
		System.out.println();
		
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				System.out.print(tabla[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
		int [] numeros = new int [10];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = new Random().nextInt(10);
		}
		
		Arrays.sort(numeros); // solo array unidimensionales
		
		System.out.println(Arrays.toString(numeros));
		
		System.out.println("El 6 se encuentra en la posicion: " + Arrays.binarySearch(numeros, 6));
		
		Arrays.fill(numeros, 99);
		
		System.out.println(Arrays.toString(numeros));
		
		int [] auxiliar = Arrays.copyOfRange(numeros, 0, 5);
		
		System.out.println(Arrays.toString(auxiliar));
		
		System.out.println(buscarPosiciones(numeros, 6));
		
	}

	private static String buscarPosiciones(int[] numeros, int valor) { // MAL
		String posiciones = "";
		
		for (int j = 0; j < numeros.length; j++) {
			if (numeros[j] == valor) {
				posiciones += j + " ";
			}
		}
		return posiciones;
	}

}
