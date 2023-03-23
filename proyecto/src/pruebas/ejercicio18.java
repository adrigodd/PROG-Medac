package pruebas;

import java.util.Scanner;

public class ejercicio18 {

	public static void main(String[] args) {
		/*
		 * un programa lee por teclado recibe un numero entre 0 y 24
		 * Si el numero es entre el 0 y 6 va a imprimir "Hora del lolete"
		 * De 6 a 14 "A dormir como un campeon"
		 * 15 "Monster y pa clase"
		 * Entre 15 y 21:30 "Ojala programacion"
		 * 21:30 a 24 "Autorecreamiento y autocuidarse
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame un numero entre el 0 y 24");
		double numero = sc.nextDouble();
		if(0<=numero && numero<=5.99) {
			System.out.println("Hora del lolete");
	}else if(6<=numero && numero<13.99) {
		System.out.println("A dormir como un campeon");
	}else if(numero==15) {
		System.out.println("Monster y pa clase");
	}else if(15<=numero && numero<21.5) {
		System.out.println("Monster y pa clase");
	}else if(21.5<=numero && numero<=24) {
		System.out.println("Monster y pa clase");
	}
	}
	}
