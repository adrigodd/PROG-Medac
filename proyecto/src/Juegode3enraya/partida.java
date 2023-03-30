package Juegode3enraya;

import java.util.Scanner;
/**
 * En esta clase crea la partida asi como sus métodos para poder comprobar ganador, ademas tambien implementa la clase tablero y la clase Jugador
 * @author Adrián Sánchez Nieto
 * @version 30/03/2023
 *
 */
public class partida {
	private tablero tableroPartida=new tablero();
	private Jugador Jugador1;
	private Jugador Jugador2;
	private int color;
	/**
	 * En el metodo Jugar  reune todos los metodos  para poder jugar al 3 en raya
	 */
	public  void Jugar() {
		   Scanner sc = new Scanner(System.in);
		   Jugador1=new Jugador('X');
		   Jugador2=new Jugador('O');
		   char vacio='-';
		   boolean turno=true;
		   System.out.println("\u001B[0m"+"Elige un color de estos Jugador1:");
		   System.out.println("Azul:1");
		   System.out.println("Verde:2");
		   System.out.println("Rojo:3");
		   System.out.println("Rosa:4");
		   System.out.println("Amarillo:5");
			 color=sc.nextInt();
			 Jugador1.setColorJugador(diccionarioColores(color));
			 color = 0;
			System.out.println("Dime un color que quieras Jugador2");
			  System.out.println("Azul:1");
			   System.out.println("Verde:2");
			   System.out.println("Rojo:3");
			   System.out.println("Rosa:4");
			   System.out.println("Amarillo:5");
			 color=sc.nextInt();
			 Jugador2.setColorJugador(diccionarioColores(color));
		   boolean posValida;
		   boolean correcto;
		   int fila;
		   int columna;
		   System.out.println("Bienvenido al 3 en raya:\n");
		   while(!finPartida(tableroPartida,vacio)) {//mientras el fin de partida sea diferente se mete en el while
			  
			   do {
				   
				   mostrarTurno(turno);//Mostramos el turno
				   tableroPartida.mostrarMatriz(Jugador1.getColorJugador(), Jugador2.getColorJugador());//Mostramos matriz en pantalla
			   correcto=false;
			   System.out.println("\u001B[0m"+"Dame una fila (del 1 al 3)");//Pide filas
			 fila=sc.nextInt();
			System.out.println("Dame una columna (del 1 al 3)");//Pide columnas
			 columna=sc.nextInt();
			posValida=tableroPartida.validarPosicion(fila,columna);//miramos primero si la fila/columna cumple las condiciones de validar posicion y se la implementamos a una variable
			if(posValida) {//si el validar posicion esta en true entra, si no se va al else de la posicion no es valida
			if(!tableroPartida.HayValorPosicion(fila,columna)) {//Comprueba que haya un simbolo en la posicion marcada
				correcto=true;
				}else {
					System.out.println("Ya hay una marca en esa posicion");
				}
			}else {
				System.out.println("La posicion no es valida");
			}
			   
			   }while(!correcto);//haces el do while mientras el booleano correcto que esta inicializado en false, pasa a ser true, que la unica manera es si la posicion es valida y no hay ningun simbolo
			   if(turno) {
				   tableroPartida.InsertarEn(fila, columna,this.Jugador1.getIcono());//Inserta la ficha, dependiendo del booleano turno,inserta la ficha del jugador 1 o la del jugador2
			   }else {
				   tableroPartida.InsertarEn(fila, columna, this.Jugador2.getIcono());//Inserta la ficha, dependiendo del booleano turno,inserta la ficha del jugador 1 o la del jugador2
			   }
			   turno=!turno;
		   }
		
		   tableroPartida.mostrarMatriz(Jugador1.getColorJugador(),Jugador2.getColorJugador());//le muestra la matriz actualizada
		   mostrarGanador(tableroPartida,vacio);//comprueba que tras la posicion haya algun ganador
	   }
	  
	public  void mostrarGanador(tablero tableroPartida,char simboloDef) {
		   char simbolo=tableroPartida.coincidenciaLinea();
		   if(simbolo!=simboloDef) {//primero comprobamos que el simbolo de coincidencialinea sea diferente al simbolodef
			   if(simbolo==this.Jugador1.getIcono()) {
				   System.out.println("Ha ganado el jugador 1 por linea");
			   }else {
				   System.out.println("Ha ganado el jugador 2 por linea");
			   }
		   }
		   simbolo=tableroPartida.coincidenciaColumna();
				   
		   if(simbolo!=simboloDef) {
			   if(simbolo==this.Jugador1.getIcono()) {
				   System.out.println("Ha ganado el jugador 1 por columna");
			   }else {
				   System.out.println("Ha ganado el jugador 2 por columna");
			   }
		   }
		   
		   simbolo=tableroPartida.coincidenciaDiagonal();
		   if(simbolo!=simboloDef) {
			   if(simbolo==this.Jugador1.getIcono()) {
				   System.out.println("Ha ganado el jugador 1 por diagonal");
			   }else {
				   System.out.println("Ha ganado el jugador 2 por diagonal");
			   }
		   }
		   if(tableroPartida.matrizLlena()&& (tableroPartida.coincidenciaLinea()==simboloDef || tableroPartida.coincidenciaColumna()==simboloDef || tableroPartida.coincidenciaDiagonal()!=simboloDef )) {//este if indica que si la matriz esta llena y no hay coincidencia, hay un empate 
			   System.out.println("EMPATE");
		   }
	   }
	/**
	 * Metodo especifico para mostrar turno
	 * @param turno es un booleano para poder cambiar de turno
	 */
	public void mostrarTurno(boolean turno) {
		   if(turno) {
			   System.out.println("Le toca al J1");
		   }else { 
			   System.out.println("Le toca al J2");
			
		   }
	 
}
	/**
	 * Metodo booleano para indicar que la partida ha acabado
	 * @param tableroPartida Es el tablero de la partida
	 * @param simboloDef el simbolo por definido, que en este caso es '-'
	 * @return devuelve en este caso el resultado, si es true, significa que la partida ha acabado, si es false aun no ha acabado
	 */
	  public  boolean finPartida(tablero tableroPartida,char simboloDef) {
		  boolean resultado=false;
		   if(tableroPartida.matrizLlena()|| 
				   tableroPartida.coincidenciaLinea()!=simboloDef|| 
				   tableroPartida.coincidenciaColumna()!=simboloDef||
				   tableroPartida.coincidenciaDiagonal()!=simboloDef) {
			   resultado= true;
		   }
		return resultado;
	   } 
	  /**
	   * Este metodo especifico es para cambiar el color en funcion de la decision de cada jugador
	   * @param color es el numero que tu pones en el switch para indicar el color especifico
	   * @return te devuelve un string con un comando para cambiar el color
	   */
	public String diccionarioColores(int color) {
		String resultado="";
		switch(this.color) {
		
			case 1:
				
				resultado="\u001B[34m";
			break;
			
			case 2:
				resultado="\u001B[32m";
			break;
			
			case 3:
				resultado="\u001B[31m";
			break;
			
			case 4:
				resultado="\u001B[95m";
			break;
			
			case 5:
				resultado="\u001B[33m";
		}
		return resultado;
	}
}
