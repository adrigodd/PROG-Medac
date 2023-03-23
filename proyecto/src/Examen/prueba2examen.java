package Examen;

import java.util.Scanner;

public class prueba2examen {

	public static void main(String[] args) {
		/*
		 * Implemente un programa en Java que resuelva la siguiente ecuación para sacar la x:
		 */
		final double variableC=356.18;
		Scanner sc = new Scanner(System.in);/*Uso del scanner para que el usuario pueda imprimir por pantalla*/
		System.out.println("Introduce la y : ");/*Uso del syso pidiendo al usuario la "y"*/
	     double variableY = sc.nextDouble();/*Declaración de variable de tipo double y uso del scanner para que el usuario introduzca un numero*/
	     System.out.println("Introduce la z: ");/*Uso del syso pidiendo al usuario la "z"*/
	     double variableZ = sc.nextDouble();
	     double variableX=(double)variableC*((Math.pow(variableZ, 2))*(Math.pow(variableY, 2)))/(variableZ+variableC);/*Realizando una operacion matemática haciendo uso del Math.pow para poder elevar a 2*/
	     System.out.println("El valor de X es: "+variableX);/*Uso del syso para dar el resultado de la variable "X"*/
	}

}
