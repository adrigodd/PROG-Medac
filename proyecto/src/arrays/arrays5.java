package arrays;

import java.util.Scanner;

public class arrays5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double maximo=0;
		double minimo=100;
		double media=0;
		System.out.println("Dame la cantidad de notas que tienes");
		double[] arraisito=new double[sc.nextInt()];
		for(int i=0;i<arraisito.length;i++) {
			arraisito[i]=i;
		}
		for(int i=0; i<arraisito.length;i++) {
			
			System.out.println("Dame tus notas");
			arraisito[i]=sc.nextInt();
		
		
		}
		for(int i=0;i<arraisito.length;i++) {
			if(arraisito[i]>maximo) {
				maximo=arraisito[i];		
		}
			if(arraisito[i]<minimo) {
				minimo=arraisito[i];
			}
		}
		for(int i=0;i<arraisito.length;i++) {
			arraisito[i]=(arraisito[i]-minimo)/(maximo-minimo);
			System.out.println("El resultado del elemento es "+arraisito[i]);
		}
	
	}

}
