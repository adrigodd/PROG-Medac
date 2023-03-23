package pruebas;

import java.util.Scanner;

public class ejercicio1 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Pedazo de gilipollas dime un numero payaso");
	int n1= sc.nextInt();
	System.out.println("Por tontopollas me dices otro");
	 int n2= sc.nextInt();
	 int suma= n1+n2;
	 int resta=n1-n2;
	 int multiplicacion=n1*n2;
	 double division=(double)n1/n2;
	 int modulo=n2%n1;
	 String frase="El resultado de la suma entre los dos digitos mencionados anteriormente  es ";
	 String frase2="El resultado de la resta entre los dos digitos mencionados anteriormente es ";
	 String frase3="El resultado de la multiplicacion entre los dos digitos mencionados anteriormente es ";
	 String frase4="El resultado de la division entre los dos digitos mencionados anteriormente es ";
	 String frase5="El resultado del modulo entre los dos digitos mencionados anteriormente es ";
	 
		System.out.println(frase + suma); 
		System.out.println(frase2 + resta); 
		System.out.println(frase3 + multiplicacion); 
		System.out.println(frase4 +division ); 
		System.out.println(frase5 +modulo); 

	}

}
