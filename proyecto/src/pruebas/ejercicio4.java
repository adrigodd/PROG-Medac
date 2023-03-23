package pruebas;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime tu primera nota");
		int nota1=sc.nextInt();
		System.out.println("Dime tu segunda nota");
		int nota2=sc.nextInt();
		System.out.println("Dime tu tercera nota");
		int nota3=sc.nextInt();
		System.out.println("Dime tu cuarta nota");
		int nota4=sc.nextInt();
		System.out.println("Dime tu quinta nota");
		int nota5=sc.nextInt();
		double nota_final=(double)(nota1+nota2+nota3+nota4+nota5)/5;
		String frase="Tu nota final es "+nota_final;
		System.out.println(frase);
	}

}
