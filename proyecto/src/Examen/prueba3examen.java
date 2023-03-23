package Examen;

import java.util.Scanner;

public class prueba3examen {

	public static void main(String[] args) {
		/*
		 * Implementa un programa en Java que reciba dos parámetros de tipo entero y devuelva su división en formato byte.
		 */
		Scanner sc = new Scanner(System.in);/*Uso del scanner para que el usuario pueda imprimir por pantalla*/
		System.out.println("Introduce el primer numero  entero: ");/*Uso del syso pidiendo al usuario el primer numero*/
	     int primerNumero = sc.nextInt();/*Declaración de variable de tipo entero y uso del scanner para que el usuario introduzca un numero*/
	     System.out.println("Introduce el segundo numero entero: ");/*Uso del syso pidiendo al usuario el segundo numero*/
	     int segundoNumero= sc.nextInt();
	     byte resultadoByte=(byte) (primerNumero/segundoNumero);/*Declaracion de varible de tipo Byte para darle la solución*/
	     System.out.println("El valor de la división en fórmato Byte es: "+resultadoByte);/*Uso del syso para mostrar la solucion*/
	}

}
