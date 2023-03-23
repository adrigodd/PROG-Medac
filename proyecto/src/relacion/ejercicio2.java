package relacion;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		/*
		 *Escriba un programa similar al anterior que muestre los números en orden inverso.
		 */

	
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame un numero y te imrpimo desde ese numero hasta el 0");
		int numeroaPedir = sc.nextInt();
		int i;
		for(i=numeroaPedir;i>=0;i--) {
			System.out.println(i);
		}
			
	}
	



	}


