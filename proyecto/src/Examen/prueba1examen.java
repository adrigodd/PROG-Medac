package Examen;

import java.util.Scanner;

public class prueba1examen {

	public static void main(String[] args) {
		/*
		 * Implemente un programa en Java que acepte dos números enteros por teclado, 
		 * representando el primero un número de euros, y el otro el tipo de billete a ejecutar.
		 *  El programa debe mostrar por pantalla el número de billetes de ese tipo que deberá utilizar 
		 *  y cuanto dinero le faltaría por pagar. NOTA: Se debe utilizar el operador módulo. 
		 */
		Scanner sc = new Scanner(System.in);/*Uso del scanner para que el usuario pueda imprimir por pantalla*/
		System.out.println("Introduce el tipo de billete que tienes: ");/*Uso del syso pidiendo al usuario el tipo de billete que tiene en este momento*/
	     int Billete = sc.nextInt();/*Declaración de variable de tipo entero y uso del scanner para que el usuario introduzca un numero*/
	     System.out.println("Introduce cantidad a pagar: ");/*Uso del syso pidiendo al usuario la cantidad a pagar*/
	     int Cantidad = sc.nextInt();
	     int cantidadDeBilletes=Cantidad/Billete;/*Declaracion de variable de tipo entero y uso de la division para poder darme la cantidad de billetes que necesita*/
	     int resto=Cantidad%Billete;/*Declaracion de variable de tipo entero y uso del modulo para poder darme el resto*/
	     System.out.println("Debes usar "+cantidadDeBilletes+" billetes y te faltarian por pagar "+resto+" euros");/*Uso del syso para poder imprimir una frase*/
	     
	}

}
