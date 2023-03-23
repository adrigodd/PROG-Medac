package pruebas;

import java.util.Scanner;

public class ejercicio3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Pedazo de gilipollas dime una cierta cantidad de segundos y te la convierto a horas");
		int horas2=sc.nextInt();
		int dias=horas/24;
		int horas=(horas/24)%60;
		String frase="Los dias son "+ horas + " los horas son " +horas;
		System.out.println(frase);
	}
		
}