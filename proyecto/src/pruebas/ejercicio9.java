package pruebas;

import java.util.Scanner;

public class ejercicio9 {

	public static void main(String[] args) {
		/*
		 * Escriba un programa que tome por teclado los coeficientes(a,b,c)
		 *  de una ecuacion de segundo gradoy la resuelva.
		 */
		Scanner sc = new Scanner(System.in);
		String frase1="Dime un un valor que sustituya a A";
		 System.out.println(frase1);
		 int a = sc.nextInt();
		 String frase2="Dime un valor que sustituya a B";
		 System.out.println(frase2);
		 int b=sc.nextInt();
		 String frase3="Dime un valor que sustituya a C";
		 System.out.println(frase3);
		 int c=sc.nextInt();
		 
		 double resultadoMas=(((-b)+Math.sqrt(Math.pow(b,2)-4*a*c))/2*a);
		 double resultadoMenos=(((-b)-Math.sqrt(Math.pow(b,2)-4*a*c))/2*a);
		
		 String frase4="Tu resultado a la ecuacion de segundo grado es "+resultadoMas;
		 System.out.println(frase4);
		 String frase5="Tu resultado a la ecuacion de segundo grado es "+resultadoMenos;
		 System.out.println(frase5);
		 
		
	}

}
