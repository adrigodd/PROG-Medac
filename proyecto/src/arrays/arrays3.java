package arrays;

import java.util.Scanner;

public class arrays3 {

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
		System.out.println("Las medias de las notas obtenidas es "+resultado);
	}

}
