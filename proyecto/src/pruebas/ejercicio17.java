package pruebas;

import java.util.Scanner;

public class ejercicio17 {

	public static void main(String[] args) {
		/*
		 * Escribe un programa que lea una fecha representada poor 3 numeros enteros e imprima por pantalla la fecha
		 * correspondiente al dia siguiente
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame una fecha y yo te dare su dia siguiente");
	     System.out.println("Dame un numero de dia ");
		int dia = sc.nextInt();
		System.out.println("Dame un numero de mes ");
		int mes = sc.nextInt();
		System.out.println("Dame un numero de año ");
		int año = sc.nextInt();
		 
		if(año%4==0) {
			if(dia==29 && mes==2) {
				int mesAux=mes+1;
				System.out.println("1"+ "/"+ mesAux + "/"+ año );
					
			}else {
				if (dia<=30 &&((mes==1|| mes==3 || mes==5 || mes==7 || mes==8 || mes==10)|| mes==12 )) {
					int diaAux=dia+1;
					System.out.println(diaAux+ "/"+ mes + "/"+ año );
					
				}else if(dia==30 &&(mes==4|| mes==6 || mes==9 || mes==11)){
					int mesAux=mes+1;
					System.out.println("1"+ "/"+ mesAux + "/"+ año );
				
					
				}else if(dia==31 &&((mes==1|| mes==3 || mes==5 || mes==7 || mes==8 || mes==10)|| mes==12)){
					if(mes==12) {
						int añoAux=año+1;
						System.out.println("1"+ "/"+"1" + "/"+ añoAux );
					}else if(mes==1|| mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12){
					int mesAux=mes+1;
					System.out.println("1"+ "/"+ mesAux + "/"+ año );
					
			}
			}
			}
		}else{
			if(dia==29 && mes==2) {
				System.out.println("ERES GILIPOLLAS, DESDE CUANDO TIENE 29 DE FEBRERO UN AÑO QUE NO ES BISIESTO");
			}else if(dia==28 && mes==2) {
				int mesAux=mes+1;
				System.out.println("1"+ "/"+ mesAux + "/"+ año );
					
			}else {
				if (dia<=30 &&((mes==1|| mes==3 || mes==5 || mes==7 || mes==8 || mes==10)|| mes==12 )) {
					int diaAux=dia+1;
					System.out.println(diaAux+ "/"+ mes + "/"+ año );
					
				}else if(dia==30 &&(mes==4|| mes==6 || mes==9 || mes==11)){
					int mesAux=mes+1;
					System.out.println("1"+ "/"+ mesAux + "/"+ año );
					
					
				}else if(dia==31 &&((mes==1|| mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12))){
					if(mes==12) {
						int añoAux=año+1;
						System.out.println("1"+ "/"+"1" + "/"+ añoAux );
					}else if(mes==1|| mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12){
					int mesAux=mes+1;
					System.out.println("1"+ "/"+ mesAux + "/"+ año );
					
						
				}
					
			}
		}
			
	}
	}
	}


