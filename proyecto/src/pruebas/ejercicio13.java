package pruebas;

import java.util.Scanner;

public class ejercicio13 {

	public static void main(String[] args) {
		/*
		 * Implemente un programa en Java que resuelva la siguiente fórmula para resolver con 
qué fuerza se atraen dos cuerpos: 
		 */
		final double Gravedad=6.673*Math.pow(10,-11 );
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame la primera masa para hacer la formula de la fuerza gravitatoria");
	     int masaPrimerObjeto= sc.nextInt();
	     System.out.println("Dame la segunda masa para hacer la formula de la fuerza gravitatoria");
	     int masaSegundoObjeto= sc.nextInt();
	     System.out.println("Dame el radio  para hacer la formula de la fuerza gravitatoria");
	     int radio= sc.nextInt();
	     double resultado=(double)Gravedad*(masaPrimerObjeto*masaSegundoObjeto/Math.pow(radio,2));
	     System.out.println("El resultado es "+resultado);
	}

}
