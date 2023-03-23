package pruebas;

import java.util.Scanner;

public class ejercicio11 {

	public static void main(String[] args) {
		/*
		 * Realiza un programa que reciba por teclado un numero de 3 cifras y un numeor de una cifra
		 * El programa devolvera true en caso de que el numero de un digito aparezca dentro del numero de 3 digitos
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame un numero de una cifra");
	     int numero1cifra = sc.nextInt();
	     System.out.println("Dame un numero de tres cifra");
	     int numero3cifra = sc.nextInt();
	     int primernumero=numero3cifra%10;
	    int segundonumero=(numero3cifra/10)%10;
	    int tercernumero=(numero3cifra/100)%10;
		boolean resultado= primernumero==numero1cifra||segundonumero==numero1cifra||tercernumero==numero1cifra;
		System.out.println(resultado);
	}

}
