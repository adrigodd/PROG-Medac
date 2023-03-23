package pruebas;

import java.util.Scanner;

public class ejercicio20 {

	public static void main(String[] args) {
		/*Realizar un programa que pida un numero al usuario repetidamente 
		 * hasta que el número entre 1 y 10
		 */
		Scanner sc = new Scanner(System.in);
		int numero; 
		do {
			System.out.println("Dame un numero");
			 numero =sc.nextInt();
		}while(numero<=1 || numero>=10);
		if(numero>=1 || numero<=10) {
			System.out.println("POR FIN LO CONSEGUISTES PISHA");
		}
		
	}

}
