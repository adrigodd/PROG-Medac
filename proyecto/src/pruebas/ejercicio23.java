package pruebas;

import java.util.Scanner;

public class ejercicio23 {

	public static void main(String[] args) {
		/*
		 * Realizar un programa que lea un numero y diga si es o no capicua
		 
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dame un numero y te digo si es capicua");
		int  numero=sc.nextInt();
		int aux,numeroInvertido,resto;
		
		while(numero<=0);
		  aux=numero;
		  numeroInvertido=0;
		  resto=0;
		  while(aux!=0)
		  {
		   resto=aux%10;
		   numeroInvertido=numeroInvertido*10+resto;
		   aux=aux/10;
		  }
		  if(numeroInvertido==numero)
			  System.out.println("\nEl numero es capicua\n");
			 else
			  System.out.println("\nEl numero no es capicua\n");
	}
}