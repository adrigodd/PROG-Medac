package relacion;

import java.util.Scanner;

public class ejercicio10 {

	public static void main(String[] args) {
		/*
		 * . Implementar el juego del ahorcado. El juego debe solicitar una frase al comienzo y
	mostrarÃ¡ la frase oculta tras cada jugada. Conforme se vayan acertando letras se irÃ¡n
	descubriendo los caracteres en la frase oculta. Cada vez que el jugador falle, se
	descontarÃ¡ un intento. El juego termina cuando se hayan descubierto todos los
	caracteres o se hayan acabado los intentos.
		 */
	
			Scanner sc=new Scanner(System.in);
			
			System.out.println("1.Jugar introduciendo la palabra tu");
			System.out.println("2.Salir");
			System.out.println("Introduce una opción de las que te aparece");
			int menu=sc.nextInt();
			switch(menu) {
			case 1:
			System.out.println("\n JUEGA AL AHORCADO,(porfa juega que me he tirado 5 horas)\n");
		System.out.println("Pon una frase");
		String palabraaAdivinar = sc.next();
		palabraaAdivinar.length();
		palabraaAdivinar.toLowerCase();
		
		String fraseast="";
		 int intentos=0;
		
		 int i;
		for(i=1;i<=palabraaAdivinar.length();i++) {
			fraseast="*"+fraseast;
		}
		StringBuffer fraseOculta= new StringBuffer(fraseast);
		
	
	
		do {	
			
			
			System.out.println("\n \n");
			System.out.println("\n \n");
			
			
		System.out.println("Dame una letra");
		System.out.println(fraseOculta);
		char letra=sc.next().charAt(0);
		letra=Character.toLowerCase(letra);
		
		StringBuffer nuevoBuffer = new StringBuffer(fraseOculta);
		
		for(i=0;i<=palabraaAdivinar.length()-1;i++) {
			if(palabraaAdivinar.charAt(i)==letra){
				fraseOculta.setCharAt(i, letra);
				System.out.println(fraseOculta);
			}
		}
		if(nuevoBuffer.toString().equals(fraseOculta.toString())) {
			
			intentos++;
			System.out.println("Llevas "+intentos+ " intentos");
			
			
		} else {
			nuevoBuffer = fraseOculta;
			
		}
		}while(intentos<6 &&  !palabraaAdivinar.equals(fraseOculta.toString()));
		if(intentos==6) {
			System.out.println("Has perdido, ya que has llegado al maximo de intentos, mas suerte la proxima vez");
		}
		if(palabraaAdivinar.equals(fraseOculta.toString())) {
			System.out.println("Has acertado la palabra");
		}
		break;
			case 2:
				System.out.println("Pues nada, no juegues al ahorcado tan bonito que hay");
				break;
	}

	}

}

