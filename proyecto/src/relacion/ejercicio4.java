package relacion;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		/*Escriba un programa que devuelva la sumatoria de un valor leído por teclado (la
				sumatoria de N es la suma de todos los términos desde 1... N).
	*/
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame un numero y te impri");
		int numeroaPedir = sc.nextInt();
		int i;
		int numeroFactorial=1;
		for(i=1;i<=numeroaPedir;i++) {
			numeroFactorial=numeroFactorial*i;
	}
		System.out.println("El factorial del número " + numeroaPedir +  " es " +numeroFactorial);
			
	}

}
