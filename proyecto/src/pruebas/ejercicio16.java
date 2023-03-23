package pruebas;

import java.util.Scanner;

public class ejercicio16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame un eje x y te digo en que cuadrante esta");
	     int ejeX = sc.nextInt();
	     System.out.println("Dame un eje Y y  te digo en que cuadrante esta");
		     int ejeY = sc.nextInt();
		     if(ejeX>0 && ejeY>0) {
		    	 System.out.println("Esta en el primer cuadrante");
		    	 
		     }else if (ejeX<0 && ejeY>0){
		    	 System.out.println("Esta en el segundo cuadrante");
		    	 
		     }else if(ejeX<0 && ejeY<0){
		    	 System.out.println("Esta en el tercer cuadrante");

		     }else if(ejeX>0 && ejeY<0){
		    	 System.out.println("Esta en el cuarto cuadrante");
		     }
	}
}
