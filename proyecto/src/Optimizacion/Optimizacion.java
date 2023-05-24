package Optimizacion;

import java.util.Arrays;
import java.util.Scanner;

public class Optimizacion{
	/**
	 * Este metodo multiplica el primer numero con el segundo
	 * @param a primer numero a multiplicar
	 * @param b Segundo numero a multiplicar
	 * @return devuelve el resultado de multiplicar el primer numero con el segundo
	 */
    public static int multiplicacion(int a, int b) {
        int resultado= a*b;
        
        return resultado;
    }
/**
 * Consta de conocer el mayor de todo el arrays
 * @param arr el arrays el cual vas a conocer el mayor de esos
 * @return te devuelve directamente el numero mas grande dentro de ese array
 */
    public static int conocerMayor(int[] arr) {
        int aux=Arrays.stream(arr).max().getAsInt();
        return aux;
    }
/**
 * Consta de elevar un numero a otro
 * @param base la base de la elevacion
 * @param exponente el numero al que quieres que se eleve la base
 * @return te devuelve el resultado elevado
 */
    public static int elevarNumero(int base, int exponente) {
       int resultado = 0;
       if(exponente==0) {
    	   resultado=1;
       
       }else {
    	   resultado=(int) Math.pow(base, exponente);       
    	   }
       return resultado;
    }
/**Consta de elevar la base a la base-1
 * 
 * @param n es el numero al que tienes que hacerle el factorial
 * @return te devuelve el factorial
 */
    public static int Factorial(int n) {
    	int resultado=0;
        if (n == 0) {
        	 resultado=1;
        } else {
            resultado=n*Factorial(n-1);
        }
        return resultado;
    }

    public static void main(String[] args) {
        // prueba f1
    	Scanner sc = new Scanner(System.in);
    	//Dependiendo del numero de b hacen b interacciones de a
    	System.out.println("Dame un numero para multiplicar");
        int a = sc.nextInt();
        System.out.println("Dame otro numero para multiplicar");
        int b = sc.nextInt();
        int ar = multiplicacion(a, b);
        System.out.println("La multiplicacion entre " + a + " y "+ b + " es " + ar);

        // prueba f2
        //Coge el numero mas grande del arrays
        
        
        int[] arr = {12,13,1,2,5,65,32,21};
        int Mayor = conocerMayor(arr);
        System.out.println("El mayor  del array es " + Mayor);

        // prueba f3
        //Elevas ba a ex
        System.out.println("Dame un numero para utilizarla de base");
        int base = sc.nextInt();
        System.out.println("Dame otro numero para utilizarla de exponente");
        int exponente = sc.nextInt();
        int resultado = elevarNumero(base, exponente);
        System.out.println(base+" elevado a " + exponente + " es igual a " + resultado);

        // prueba f4´
        //Es el factorial
        System.out.println("Dame un numero para utilizarla de base y se va a elevar al numero anterior");
        int baseEJ4 = sc.nextInt();
        int resultadoEj4 = Factorial(baseEJ4);
        System.out.println("El factorial de "+baseEJ4+" es " + resultadoEj4);
    }
}
