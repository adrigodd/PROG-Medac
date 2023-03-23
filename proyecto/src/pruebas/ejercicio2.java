package pruebas;

import java.util.Scanner;

public class ejercicio2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Pedazo de gilipollas dime una altura de un triangulo");
		double altura=(double) sc.nextInt();
		System.out.println("Anda dime una base que si no te puedo calcular el area y perimetro");
		double base=(double)sc.nextInt();
		double area=(double)base*altura/2;
		double perimetro=base*3;
		String frase = "El area  es " + area + " y el perimetro del triangulo es " + perimetro;
		System.out.println(frase);
	}
}
