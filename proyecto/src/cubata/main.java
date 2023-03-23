package cubata;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		cubata c=new cubata("ron","cocacola",2,true,false,470,470);
		System.out.println(c.getalcohol());
		System.out.println(c.getmezcla());
		System.out.println(c.getnumeroHielos());
		System.out.println(c.getnaranja());
		System.out.println(c.getlimon());
		System.out.println(c.getcapacidadMaxima());
		System.out.println(c.capacidadActual());
		
	}
}
