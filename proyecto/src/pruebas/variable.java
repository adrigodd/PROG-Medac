package pruebas;

import java.util.Scanner;

public class variable {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String frase="Dime un numero de euros y te lo convierto a pesetas";
	System.out.println(frase);
	double euros=sc.nextDouble();
		final double pesetas=euros*166.386;
		String frase2="Tu cambio de euros a pesetas es "+ pesetas;
		System.out.println(frase2);
		
	}

}
