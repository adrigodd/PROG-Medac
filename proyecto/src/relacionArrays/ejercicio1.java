package relacionArrays;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
	
		int[] arraisito=new int[5];
		int[] arraisito2=new int[5];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arraisito.length;i++) {
			arraisito[i]=i;

		}
		for(int i=0;i<arraisito.length;i++) {
			System.out.println("Dame un numero");
			arraisito[i]=sc.nextInt();
		}
		
		for(int i =0;i<arraisito.length;i++) {
		int suma=3;
			arraisito[i]=arraisito[i]/suma;
		}
		for(int i=0;i<arraisito.length;i++) {
			System.out.println(arraisito[i]);
		}
		}
		
	}



