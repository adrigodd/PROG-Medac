package ejercicioRefactorizacion;

import java.util.Scanner;

public class e1 {
	  
	  public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int numero;
	    boolean primo = true;
	    boolean sigue=false;
	    do {
	    	
	    	  System.out.println("Ingrese un número: ");
	    	    numero = sc.nextInt();
	    	    if(numero<2) {
	    	    	System.out.println("Ingresa otro");
	    	    }
	    }while(numero<2);
	    
	   
	    
	    for(int i=2; i<numero && sigue; i++) {
	      if(numero % i == 0) {
	        primo = true;
	        sigue=false;
	      }
	    }
	    
	    if(primo) {
	      System.out.println("El número "+ numero + " es primo.");
	    } else {
	      System.out.println("El número "+ numero + "  no es primo.");
	    }
	    
	  }
	  
	}
