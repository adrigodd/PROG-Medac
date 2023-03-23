package relacion;

import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		/*Implemente un programa que pida números hasta que se introduzca uno negativo.
		Mostrar entonces la media de los valores introducidos.
*/
		Scanner sc = new Scanner(System.in);
	int numero=0;
	int numero2;
	int numeromedia=0;
	do {
System.out.println("Dame un numero y voy sumando la media");
	numero2=sc.nextInt();
	if(numero2>0) {
	numero=numero2+numero;
	numeromedia=numeromedia+1;
	}

}while(numero2>0);
	double media=(double)numero/numeromedia;
	System.out.println("Tu media es "+media);
}
}


