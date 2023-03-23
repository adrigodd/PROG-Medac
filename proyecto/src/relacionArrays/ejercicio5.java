package relacionArrays;

import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame la dimension que quieres que tenga en x");
		int numeroX=sc.nextInt();
		System.out.println("Dame la dimension que quieres que tenga en y");
		int numeroY=sc.nextInt();
		int[][]arraisito=new int[numeroX][numeroY];
		int numero=0;
	
		 for (int i = 0; i < numeroX; i++) {
			 for (int j = 0 ; j < numeroY; j++) {
				 do {
					 System.out.println("Ve dandome numeros DE 1 AL 10");
	    	 numero=sc.nextInt();
	    	 arraisito[i][j]=numero;
    	     
				 }while(numero<0||numero>11);
	    	
    	     }
	  
	}   
		 for (int i = 0; i <numeroX; i++) {
			 System.out.println("\n");
		     for (int j = 0 ; j <numeroY; j++) {
		    	
		    	System.out.print(arraisito[i][j]+"\t");
	
	    	     }
		}
		 
}
}


