package arrays;

import java.util.Scanner;

public class arrays4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double media=0;
		System.out.println("Dame la cantidad de notas que tienes");
		double[] arraisito=new double[sc.nextInt()];
		for(int i=0;i<arraisito.length;i++) {
			arraisito[i]=i;
		}
		for(int i=0; i<arraisito.length;i++) {
			
			System.out.println("Dame tus notas");
			arraisito[i]=sc.nextDouble();
			media+=arraisito[i];
		
		}
		double resultado=media/arraisito.length;
		for(int i=0;i<arraisito.length;i++) {
		if(arraisito[i]>resultado) {
			System.out.println("Las medias de las notas obtenidas es "+resultado+" y el "+arraisito[i]+" es mayor que la media");
			}
		}
		
	
		
	}
	}


