package relacion;

import java.util.Scanner;

public class ejercicio9 {

	public static void main(String[] args) {
		/*Implementa un juego para adivinar un número entre 1-9 con un máximo de tres
		intentos. El número puede ser generado aleatoriamente o pedirlo por teclado.
		Después se irán pidiendo números indicando “mayor” o “menor” según sea mayor o
		menor con respecto a N. El proceso termina cuando el usuario acierta el número o
		consume los tres intentos.
		*/
		Scanner sc = new Scanner(System.in);
		int numero = (int)(Math.random()*10);
		int i;
		for(i=1;i<=3;i++) {
			System.out.println("Adivina un numero del 1 al 9");
			int numeroaAdivinar = sc.nextInt();
			if(numeroaAdivinar>numero) {
				System.out.println("El numero es menor,llevas  "+i+"intentos");
			}else if(numeroaAdivinar<numero) {
				System.out.println("El numero es mayor,llevas  "+i+" intentos");
			}
			if(numeroaAdivinar==numero) {
				System.out.println("El numero es ese");
				break;
				
			}
		
	
		}
	}
}
