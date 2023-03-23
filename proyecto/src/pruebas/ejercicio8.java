package pruebas;

import java.util.Scanner;

public class ejercicio8 {

	public static void main(String[] args) {
		/*Escriba un programa que intercambie el valor de dos variables de topo entero leida por un teclado
		 * Imprima la pantalla los valores de las variables antes y despues del intecambio
		 
		 */
		Scanner sc = new Scanner(System.in);
		String frase1="Dime un numero y lo voy a intercambiar";
		 System.out.println(frase1);
		 int numero1 = sc.nextInt();
		 String frase2="Dime otro numero para intercambiar";
		 System.out.println(frase2);
		 int numero2=sc.nextInt();
		 int resultado=(numero1*numero2)/numero1;
		 int resultado2=(numero2*numero1)/numero2;
		 String VarAntes1 ="El antes del numero 1 es "+numero1;
		 String VarAntes2="El antes del numero2 es "+numero2;
		String VarDespues1="El despues del numero1 es "+resultado;
		 String VarDespues2="El despues del numero 2 es "+resultado2;
		 
		System.out.println(VarAntes1);
		System.out.println(VarAntes2);
		System.out.println(VarDespues1);
		System.out.println(VarDespues2);
		
	}

}
