package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {

	public static void main(String[] args) {
		ArrayList <Double> Arraisito=new ArrayList <Double>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame un numero de arrayList");
			Double dato=sc.nextDouble();
		while(dato>0){
			System.out.println("Dame otro");
		Arraisito.add(dato);
		dato=sc.nextDouble();
		
		
		}
		
		
		Arraisito.sort(null);
		System.out.println(Arraisito);
		ArrayList<Double>Arraisito2=new ArrayList <Double>();
		Arraisito2.addAll(Arraisito);
	
		for(int i=0;i<Arraisito.size()-1;i++) {
			int contador=1;
			Double comparar=Arraisito2.get(i);	
			if(comparar.equals(Arraisito2.get(i+1))) {
				
				
				contador++;
			}else {
				contador=1;
				System.out.println("Hay "+contador+ " que pesan "+Arraisito2.get(i));
			}
			if(i==Arraisito.size()-2) {
				System.out.println("Hay "+contador+ " que pesan "+Arraisito2.get(i+1));

			}
		}
	
	}
	
}
