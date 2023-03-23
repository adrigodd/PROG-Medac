package arrays;

import java.util.Scanner;

public class arrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame la capacidad de la lista arrays");
		int[] arraisito=new int[10];
		for(int i=0;i<arraisito.length;i++) {
			arraisito[i]=i;
		}
		for(int i=arraisito.length-1;i>=0;i--) {
			System.out.println(arraisito[i]);
		}
	

	}

}
