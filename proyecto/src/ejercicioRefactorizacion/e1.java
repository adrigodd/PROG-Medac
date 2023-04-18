package ejercicioRefactorizacion;

import java.util.Scanner;
/**
 * 
 * @author Adrián Sánchez Nieto
 * 
 *Este ejercicio consta de un booleano primo que empieza en true ya que si no es divisible entre ninguno 
 *es primo de un do while hasta que la persona escriba un numero superior a 2, 
 *mientras no lo escriba le pondra ingresa otra,cuando escriba un numero superior a 2, hace un for que 
 *empieza en 2 y para hasta la mitad del numero ya que para que sea divisible entre un numero debe haber 
 *dos numeros multiplicando por tanto si no hay en la mitad de un recorrido no va a haber en la otra mitad
 *pero tambien tiene la condicion que si el primo esta en true sigue si el booleano primo esta en false 
 *para ya porque hay un numero divisible, por ultimo tiene un if que si es primo indica que lo es y si por
 *el contrario el booleano esta en false indica que el numero no es primo.
 * 
 *
 * 
 *
 */
public class e1 {
	  
	  public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int numero;
	    boolean primo = true;
	    
	    do {
	    	
	    	  System.out.println("Ingrese un número: ");
	    	    numero = sc.nextInt();
	    	    if(numero<2) {
	    	    	System.out.println("Ingresa otro");
	    	    }
	    }while(numero<2);
	    
	   
	    
	    for(int i=2; i<numero/2 && primo; i++) {
	      if(numero % i == 0) {
	        primo = false;
	      }
	    }
	    
	    if(primo) {
	      System.out.println("El número "+ numero + " es primo.");
	    } else {
	      System.out.println("El número "+ numero + "  no es primo.");
	    }
	    
	  }
	  
	}
