package ejercicioRefactorizacion;

import java.util.Scanner;

public class e3 {

	  public static void main(String[] args) {
		    
		    Scanner sc = new Scanner(System.in);
		    
		   
		    
		    System.out.println("Dime el numero que quieres que tenga la matriz");
		    int lengthMatriz = sc.nextInt();
		    double [] numeroaPedir = new double[lengthMatriz];
		    System.out.println("Dame un numero");
		    for(int i=0; i<numeroaPedir.length; i++) {
		    
		      numeroaPedir[i] = sc.nextDouble();
		      System.out.println("Dame otro");
		    }
		    
		    double suma = 0;
		    for(int i=0; i<numeroaPedir.length; i++) {
		      suma+=numeroaPedir[i];
		    }
		    
		    double promedio =  suma / numeroaPedir.length;
		    
		    System.out.println("La suma de los números es: " + suma);
		    System.out.println("El promedio de los números es: " + promedio);
		    
		  }
}
