package pruebas;

import java.util.Scanner;

public class ejercicio12 {

	public static void main(String[] args) {
		/*
		 * Implemente un programa en Java que acepte un número entero por teclado, 
representando un número en centímetros, y muestre por pantalla su descomposición 
en metros y kilómetros. NOTA: Se debe utilizar el operador módulo. Un ejemplo de 
ejecución es el siguiente
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame un numero en centimetros y te lo convierto a km y metros");
		int numero = sc.nextInt();
		int kilometros=numero/100000;
		int metros=(numero%100000)/100;
		int centimetros=(numero%100000)%100;
		String frase="La descomposicion resultante de "+numero+" es: ";
		System.out.println(frase);
		System.out.println("Centimetros: "+centimetros);
		System.out.println("Metros: "+metros);
		System.out.println("Kilometros: "+kilometros );
		
		
	}

}
