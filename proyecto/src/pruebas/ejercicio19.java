package pruebas;

import java.util.Scanner;

public class ejercicio19 {

	public static void main(String[] args) {
		/*
		 * Escriba un programa que pida al usuario una hora determinada que denominaremos h1,(Pidiendo primero 
		 * las horas expresadas desde 0 a 24 horas y a continuacion los minutos)
		 * Posteriormente se pedira al usuario otra hora h2
		 * El usuario debera indicar si h1 es posterior o anterior a h2
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame dos horas y te dire cual es posterior");
		System.out.println("Dame un hora entre el 0 y 24");
		int hora1 = sc.nextInt();
		if(hora1>24) {
			System.out.println("Me da a mi que no sabes leer no?");
			System.out.println("Vuelve a darme otro ");
			hora1=sc.nextInt();
	

		}
		System.out.println("Dame unos minutos entre 0 y 59");
		int minuto1 = sc.nextInt();
		if(minuto1>59) {
			System.out.println("Me da a mi que no sabes leer no?");
			System.out.println("Vuelve a darme otro ");
			minuto1=sc.nextInt();
		}
		System.out.println("Dame un hora entre el 0 y 24");
		int hora2 = sc.nextInt();
		if(hora2>24) {
			System.out.println("Me da a mi que no sabes leer no?");
			System.out.println("Vuelve a darme otro ");
			hora2=sc.nextInt();
		}
		System.out.println("Dame un minuto entre el 0 y 59");
		int minuto2 = sc.nextInt();
		if(minuto2>59) {
			System.out.println("Me da a mi que no sabes leer no?");
			System.out.println("Vuelve a darme otro ");
			minuto2=sc.nextInt();
		}
		
		if(hora1>hora2) {
			System.out.println("La primera hora que me has dado es posterior");
			System.out.println("Por tanto la segunda hora que me has dado anterior");
		}else if(hora2>hora1) {
			System.out.println("La segunda hora que me has dado es posterior");
			System.out.println("Por tanto la primera hora que me has dado es anterior");
		}else if(hora1==hora2) {
			System.out.println("Como las horas son las mismas vamos a ver si el minuto es posterior o anterior");
			if(minuto1>minuto2){
				System.out.println("La primera hora que me has dado es posterior");
				System.out.println("Por tanto la segunda hora que me has dado anterior");
				
			}else if(minuto2>minuto1){
				System.out.println("La segunda hora que me has dado es posterior");
				System.out.println("Por tanto la primera hora que me has dado anterior");
			}else if(minuto1==minuto2) {
				System.out.println("Es la misma hora ");
			}
		}
			
	
		int minutosPrimero=(hora1*60)+minuto1;
		int minutosSegundo=(hora2*60)+minuto2;
		if(minutosPrimero>minutosSegundo) {
			int resultado1=minutosPrimero-minutosSegundo;
			System.out.println("Quedan: "+resultado1+"minuto/s para que la segunda hora sea igual que la primera");
		}else if(minutosSegundo>minutosPrimero){
			int resultado2=minutosSegundo-minutosPrimero;
			System.out.println("Quedan: "+resultado2+"minuto/s para que la primera hora sea igual que la segunda");
		}else if(minutosSegundo==minutosPrimero) {
			System.out.println("No queda ningun minuto ya que es la misma hora");
		}
	}
	

}

