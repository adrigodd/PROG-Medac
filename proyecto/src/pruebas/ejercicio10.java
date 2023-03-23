package pruebas;

import java.util.Scanner;

public class ejercicio10 {

	public static void main(String[] args) {
		/*
		 * Realizar un programa que pida un numero y una posicion y devuelva el digito 
		 * que esta en esa posicion
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un numero");
		int numero= sc.nextInt();
		System.out.println("Dime una posicion en concreto y te proporcionare su digito");
		int numero2= sc.nextInt();
		int resultado=(int)(numero/Math.pow(10,(numero2-1)))%10;
		
		if (resultado==0) {
			System.out.println(resultado);
		} else {
			System.out.println("Eres gilipollas");
		}
		
				
		
	}

}
