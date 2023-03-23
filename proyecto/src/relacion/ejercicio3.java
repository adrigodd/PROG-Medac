package relacion;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		/*Escriba un programa que devuelva la sumatoria de un valor leído por teclado (la
				sumatoria de N es la suma de todos los términos desde 1... N).
	*/
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame un numero y te imrpimo desde el 0 hasta ese numero");
		int numeroaPedir = sc.nextInt();
		int i;
		int suma=0;
		for(i=0;i<=numeroaPedir;i++) {
			suma=suma+i;
	}
		System.out.println("La suma de los numeros introducidos incluyendo al mismo es "+suma);
			
	}
}
