package pruebas;

import java.util.Scanner;

public class ejercicio6 {

	public static void main(String[] args) {
		/*
		 Escribe un programa que lea desde el teclado una fechad e nacimiento y la fecha de hoy e imprima el numero de dias que lleva viviendo
		 
		 Una fecha viene representada por tres numeros enteros correspondientes a años mes y dia
		 Considere que todos los dias tienen 365 dias y que todosl los meses tienen 30 dias
		  
		 */
		
		Scanner sc = new Scanner(System.in);
		String frase="Dime que dia nacistes";
		 System.out.println(frase);
	     int fechaNacimiento = sc.nextInt();
		String frase2="Dime el numero de mes";
		System.out.println(frase2);
		int mesNacimiento=sc.nextInt();
		String frase3="Dime que año nacistes";
		System.out.println(frase3);
		int añoNacimiento=sc.nextInt();
		String frase4="Dime que dia es hoy";
		System.out.println(frase4);
	     int fechaHoy1 = sc.nextInt();
		String frase5="Dime el numero de mes es hoy ";
		System.out.println(frase5);
		int mesHoy=sc.nextInt();
		String frase6="Dime en que año estamos";
		System.out.println(frase6);
		int añoHoy=sc.nextInt();
		int diasActuales=(fechaHoy1+(mesHoy*30)+(añoHoy*365));
		int diasNacimiento=(fechaNacimiento+(mesNacimiento*30)+(añoNacimiento*365));
		int diasVividos=diasActuales-diasNacimiento;
				String frase7="Tu numero de dias vividos es  "+diasVividos;
	     System.out.println(frase7);
	}

}
