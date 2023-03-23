package arrays;

import java.util.Scanner;

public class arrays6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double suma=0;
		double varianza=0;
		double operacionVarianza=0;
		double desviacionTipica=0;
		System.out.println("Dame la cantidad de notas que tienes");
		double[] arraisito=new double[sc.nextInt()];
		for(int i=0;i<arraisito.length;i++) {
			arraisito[i]=i;
		}
		for(int i=0; i<arraisito.length;i++) {
			
			System.out.println("Dame tus notas");
			arraisito[i]=sc.nextDouble();
			suma+=arraisito[i];
		
		}
		double resultado=suma/arraisito.length;
		for(int i=0;i<arraisito.length;i++) {
			
		operacionVarianza=Math.pow((arraisito[i]-resultado),2);
		
		varianza+=operacionVarianza;
		
					}
		varianza=varianza/arraisito.length;
		desviacionTipica=Math.sqrt(varianza);
		System.out.println("La media es "+resultado);
		System.out.println("La varianza es "+varianza);
		System.out.println("La desviacion tipica es"+desviacionTipica);
	
	}

}
