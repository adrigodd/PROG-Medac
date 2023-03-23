package Alumno;

public class main {

	public static void main(String[] args) {
		fraccion hola=new fraccion(5,2);
		fraccion hola2=new fraccion(2,5);
		System.out.println(hola2);
		fraccion resultado= hola.sumar(hola2);
		System.out.println(resultado);
	}

}
