package relacionArrays;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int n;
		 double media=0;
			int contador=1;
			double resultado=0;
	      int[] ratas=new int[20];
	      for(int i=0;i<ratas.length;i++) {
				ratas[i]=i;

			}
	      for(int i=0;i<ratas.length;i++) {
				System.out.println("Dame un peso");
				ratas[i]=sc.nextInt();
				media+=ratas[i];
			}
	      
	      for(int i = 1; i < ratas.length; i++){
	        for(int j = 0;j < ratas.length-i;j++){
	          if(ratas[j] > ratas[j+1]){
	            n = ratas[j];
	            ratas[j] = ratas[j+1];
	            ratas[j+1] = n;
	          }   
	        }
	      }
	      for (int i = 0; i <ratas.length - 1; i++) {
	    	         if(ratas[i] == ratas[i+1]) {
	    	        	 contador++;
	    	         }  else {
	    	        	 System.out.println("Hay "+contador+" que pesan "+ratas[i]);
	    	        	 contador = 1;
	    	         }
	    	         if(i==ratas.length-2) {
	    	        	 System.out.println("Hay "+contador+" que pesan "+ratas[i+1]);
	    	         }
	    	            
	    	       
	    	 
	    	     
	    	
	    
	      }
	      resultado=media/ratas.length;
	      System.out.println("La media es "+resultado);
	
	    
	}
}

	        
	    
	
			
