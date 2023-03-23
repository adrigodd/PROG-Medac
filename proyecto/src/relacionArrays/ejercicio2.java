package relacionArrays;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {

		int[] arraisito=new int[6];
		int aciertos=0;
		
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arraisito.length;i++) {
			arraisito[i]=i;

		}
		int[]arraisitoGanador=new int[6];
		for(int i=0;i<arraisitoGanador.length;i++) {
			arraisitoGanador[i]=i;

		}
		for(int i=0;i<arraisito.length;i++) {
			System.out.println("Dame un tu boleto");
			arraisito[i]=sc.nextInt();
		}
		for(int i=0;i<arraisitoGanador.length;i++) {
			System.out.println("Dame un numero del boleto ganador");
			arraisitoGanador[i]=sc.nextInt();
		}
		for(int i=0;i<arraisitoGanador.length;i++) {
			if(arraisito[0]==arraisitoGanador[i]) {
				aciertos++;
			}else if(arraisito[1]==arraisitoGanador[i]) {
				aciertos++;
			}else if(arraisito[2]==arraisitoGanador[i]) {
				aciertos++;
			}else if(arraisito[3]==arraisitoGanador[i]) {
				aciertos++;
			}else if(arraisito[4]==arraisitoGanador[i]) {
				aciertos++;
			}else if(arraisito[5]==arraisitoGanador[i]) {
				aciertos++;
			}
			
			
			
		}
		for(int i=0;i<arraisito.length;i++) {
			System.out.print(arraisito[i]+" ");
		}
		System.out.println("");
		for(int i=0;i<arraisito.length;i++) {
			System.out.print(arraisitoGanador[i]+" ");
		}
		
		System.out.println("Tiene "+aciertos+" aciertos");

	}

}
