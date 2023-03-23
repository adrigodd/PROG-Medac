package pruebas;

import java.util.Scanner;

public class ejercicio24 {

	public static void main(String[] args) {
		/*
		 * Escriba un programa que muestre los números de 0 a N, donde N es un valor leído de
			teclado.
		 */

	
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame un numero y te imrpimo desde el 0 hasta ese numero");
		int numeroaPedir = sc.nextInt();
		int i;
		for(i=0;i<=numeroaPedir;i++) {
			System.out.println(i);
		}
			
	}
	

}
