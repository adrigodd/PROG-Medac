package Juegode3enraya;

import java.util.Scanner;

public class partida {
	private tablero tableroPartida=new tablero();
	public  void Jugar() {
		   Scanner sc = new Scanner(System.in);
		   char J1='X';
		   char J2='O';
		   char vacio='-';
		   boolean turno=true;
		   tableroPartida.RellenarMatriz();//Rellenamos la matriz
		   boolean posValida;
		   boolean correcto;
		   int fila;
		   int columna;
		   System.out.println("Bienvenido al 3 en raya:\n");
		   while(!finPartida(tableroPartida,vacio)) {//mientras el fin de partida sea diferente se mete en el while
			  
			   do {
				   
				   mostrarTurno(turno);//Mostramos el turno
				   tableroPartida.mostrarMatriz();//Mostramos matriz en pantalla
			   correcto=false;
			   System.out.println("Dame una fila (del 1 al 3)");//Pide filas
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
				   tableroPartida.InsertarEn(fila, columna,J1);
			   }else {
				   tableroPartida.InsertarEn(fila, columna, J2);
			   }
			   turno=!turno;
		   }
		
		   tableroPartida.mostrarMatriz();//le muestra la matriz actualizada
		   mostrarGanador(tableroPartida,J1,J2,vacio);//comprueba que tras la posicion haya algun ganador
	   }
	  
	public  void mostrarGanador(tablero tableroPartida,char J1,char J2,char simboloDef) {
		   char simbolo=tableroPartida.coincidenciaLinea();
		   if(simbolo!=simboloDef) {//primero comprobamos que el simbolo de coincidencialinea sea diferente al simbolodef
			   if(simboloDef==J1) {
				   System.out.println("Ha ganado el jugador 2");
			   }else {
				   System.out.println("Ha ganado el jugador 1");
			   }
		   }
		   simbolo=tableroPartida.coincidenciaColumna();
				   
		   if(simbolo!=simboloDef) {
			   if(simboloDef==J1) {
				   System.out.println("Ha ganado el jugador 2");
			   }else {
				   System.out.println("Ha ganado el jugador 1");
			   }
		   }
		   simbolo=tableroPartida.coincidenciaDiagonal();
		   if(simbolo!=simboloDef) {
			   if(simboloDef==J1) {
				   System.out.println("Ha ganado el jugador 2");
			   }else {
				   System.out.println("Ha ganado el jugador 1");
			   }
		   }
		   if(tableroPartida.matrizLlena()&& (tableroPartida.coincidenciaLinea()==simboloDef || tableroPartida.coincidenciaColumna()==simboloDef || tableroPartida.coincidenciaDiagonal()!=simboloDef )) {//este if indica que si la matriz esta llena y no hay coincidencia, hay un empate 
			   System.out.println("EMPATE");
		   }
	   }
	public void mostrarTurno(boolean turno) {
		   if(turno) {
			   System.out.println("Le toca al J1");
		   }else { 
			   System.out.println("Le toca al J2");
			
		   }
	 
}
	  public  boolean finPartida(tablero tableroPartida,char simboloDef) {
		   if(tableroPartida.matrizLlena()|| 
				   tableroPartida.coincidenciaLinea()!=simboloDef|| 
				   tableroPartida.coincidenciaColumna()!=simboloDef||
				   tableroPartida.coincidenciaDiagonal()!=simboloDef) {
			   return true;
		   }
		return false;
	   }
	
}
