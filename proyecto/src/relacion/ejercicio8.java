package relacion;

import java.util.Scanner;

public class ejercicio8 {

	public static void main(String[] args) {
		/* Implementa un juego para adivinar un número entre 1-9 con un máximo de tres
		intentos. El número puede ser generado aleatoriamente o pedirlo por teclado.
		Después se irán pidiendo números indicando “mayor” o “menor” según sea mayor o
		menor con respecto a N. El proceso termina cuando el usuario acierta el número o
		consume los tres intentos.*/
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime una frase y te la pongo normal,al reves y te cuenta las silabas que tiene");
		String frase = sc.nextLine();
		System.out.println(frase);
		StringBuilder frasealreves = new StringBuilder(frase);
		frase = frasealreves.reverse().toString();
		System.out.println(frase);
		System.out.println(frase.length());
	}
		
}

