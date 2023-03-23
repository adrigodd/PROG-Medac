package pruebas;

import java.util.Scanner;

public class ejercicio14 {

	public static void main(String[] args) {
		/*
		 * Implementa un programa en Java que reciba dos parámetros de tipo entero: distancia 
y tiempo. El programa mostrará por pantalla la aceleración obtenida a partir de estas 
variables. La formula de la aceleración es: a= d/t. Un ejemplo de ejecución sería el 
siguiente: 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el tiempo para calcular la aceleración:");
	     int tiempo= sc.nextInt();
	     System.out.println("Introduce la distancia para calcular la aceleración:");
	     int distancia= sc.nextInt();
	     double aceleracion=(double)distancia/tiempo;
	     System.out.println("La aceleracion es de "+aceleracion+"m/s");
	}

}
