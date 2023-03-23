package relacionArrays;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame cuantos caracteres ");
		int a=sc.nextInt();
		char[] arrasito=new char[a];
		char[]arrasitoReves=new char[a];
		boolean arrays=false;
		for(int i=0;i<a;i++) {
			System.out.println("Dame un caracter");
			arrasito[i]=sc.next().charAt(0);

		}
		
		for(int i=a-1;i>=0;i--) {
			arrasitoReves[i]=arrasito[(a-1)-i];
			
			}
		for(int i=0;i<a;i++) {
			
			if(arrasito[i]==arrasitoReves[i]) {
				arrays=true;
			
		}else if(arrasito[i]!=arrasitoReves[i]){
		
			arrays=false;
			
			break;
		}

	}
		
		System.out.println(arrays);
		if(arrays==true) {
			System.out.println("La palabra es palíndromo");
		}else {
			System.out.println("La palabra no es palíndromo");
		}
	
}
}
