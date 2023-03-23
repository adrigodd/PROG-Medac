package pruebas;

import java.util.Scanner;

public class ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		/*
		 Escriba un programa que imprima en la pantalla con el formato del ejemplo el salario semanal 
		 de una persona cuyas horas extra y horas semanales trabajadas son leidas por el teclado.Considere
		 que en la empresa en la que trabaja dicha persona se paga a 10 euros la hora y que las horas extras
		 se pagan a 20 euros. 40 horas trabajadas y 15 horas extra corresponden a un salario semanal de 700€
		 */
			
				Scanner sc = new Scanner(System.in);
				String frase1="Dime cuantas horas semanalmente trabajas";
				 System.out.println(frase1);
				 int horas = sc.nextInt();
				 String frase2="Dime cuantas horas extra semanalmente trabajas";
				 System.out.println(frase2);
				 int horasExtra = sc.nextInt();
				  final int salarioHora=horas*10;
				  final int salarioExtra=horasExtra*20;
				  int resultado=salarioHora+salarioExtra;
				  String frase="Tu salario al cabo de una semana sumando horas normales y horas extra es "+ resultado;
				  System.out.println(frase);
		}

	}
