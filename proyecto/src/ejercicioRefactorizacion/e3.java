package ejercicioRefactorizacion;

import java.util.Scanner;
/**
 * 
 * @author Adrián Sánchez Nieto
 * 
 *
 */
public class e3 {
/**
 * 
 * @param args
 * El ejercicio empieza pidiendote el length de la matriz,sabiendo el length de la matriz hace un for en el cual empieza el 0 y acaba en
 * el length que has puesto anteriormente y le va pidiendo numeros, en este for pide el numero y hace la sumatoria a la misma vez
 * y al final hace el promedio diviendo la sumatoria/el length de la matriz.
 */
	  public static void main(String[] args) {
		    
		    Scanner sc = new Scanner(System.in);
		    
		   
		    
		    System.out.println("Dime el numero que quieres que tenga la matriz");
		    int lengthMatriz = sc.nextInt();
		    double [] numeroaPedir = new double[lengthMatriz];
		    System.out.println("Dame un numero");
		    
		    double suma = 0;
		    
		    for(int i=0; i<numeroaPedir.length; i++) {
		    
		      numeroaPedir[i] = sc.nextDouble();
		      suma+=numeroaPedir[i];
		      System.out.println("Dame otro");
		    }
		    
		    double promedio =  suma /lengthMatriz;
		    
		    System.out.println("La suma de los números es: " + suma);
		    System.out.println("El promedio de los números es: " + promedio);
		    
		  }
}
