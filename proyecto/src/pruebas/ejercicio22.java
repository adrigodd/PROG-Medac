package pruebas;

import java.util.Scanner;

public class ejercicio22 {

	public static void main(String[] args) {
		/*
		 * Realizar un programa que devuelva si el numero introduido es primo o no
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame un numero y te digo si es primo o no ");
		int numero = sc.nextInt();
		if(numero==0 || numero==1 || numero==4) {
			System.out.println("El numero no es primo ");
			
		}
		if(numero==5||numero==3||numero==2) {
			System.out.println("El numero es primo ");
		}

	for(int i=2;i<numero/2;i++) {
		
		if(numero%i==0) {
		System.out.println("El numero no es primo ");
		break;
	}else {
		System.out.println("El numero  es primo ");
	}	
}
	}
}
