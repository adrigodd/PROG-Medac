package relacion;

import java.util.Scanner;

public class ejercicio6 {

	public static void main(String[] args) {
		/*Implemente un programa que calcule los N primeros términos de la serie de
Fibonacci. El número de términos se leerá por teclado.
La sucesión de Fibonacci comienza con los números 0 y 1, y a partir de estos, cada
término es la suma de los dos anteriores:
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377...
*/
		Scanner sc = new Scanner(System.in);
        int numero,fibo1,fibo2,i;
  
        do{
            System.out.print("Introduce numero mayor que 1: ");
            numero = sc.nextInt();
        }while(numero<=1);
  
        System.out.println("Los " + numero + " primeros términos de la serie de Fibonacci son:");                 

        fibo1=1;
        fibo2=1;

        System.out.print(fibo1 + " ");
        for(i=2;i<=numero;i++){
            System.out.print(fibo2 + " ");
            fibo2 = fibo1 + fibo2;
            fibo1 = fibo2 - fibo1;
	}
	}
}
