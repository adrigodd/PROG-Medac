package excepciones;

import java.util.Scanner;

public class excepcionita{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu edad");
		boolean seguir=true;
		int a=0;
		do {
			try {
				a = sc.nextInt();
				int hola=(int)Math.sqrt(-3);
				seguir=false;
			}catch(Exception e){
				System.out.println(e);
				sc.next();
			}
		}while(seguir);
		System.out.println("Tu edad es: "+ a);

	}

}
