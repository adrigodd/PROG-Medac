package pruebas;

import java.util.Scanner;

public class ejercicio15 {

	public static void main(String[] args) {
		
	/*
	 * Escribir una estrucutra de control que examine el valor de una variable real llamada temp
	 * y escriba uno de los siguientes mensajes dependiendo de su valor
	 * Hielo si su valor de temperatura es menor de 0
	 * Agua si su valor de temperatura se encuentra entre 0 y 100
	 * Vapor si su valor de temperatura se enceuntra + de 100
	 * 	
	 */
		System.out.println("Dame una temperatura y te dire si la temperatura en la que esta el agua");
		Scanner sc = new Scanner(System.in);
	     int temp1 = sc.nextInt();
	     if(temp1<0) {
	    	 System.out.println("El estado en el que estaria es en HIELO");
	    	 
	     }else if (0 <temp1 && temp1<100){
	    	 System.out.println("El estado en el que estaria es en AGUA");
	    	 
	     }else if(temp1>100);{
	    	 System.out.println("El estado en el que estaria es en VAPOR");
	     }
	}

}
