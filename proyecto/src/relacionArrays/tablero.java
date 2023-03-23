

package relacionArrays;

	
	import java.util.Scanner;

	public class tablero {
		public static void main(String[]args) {
			Jugar();
		}
	
	   public static void Jugar() {
		   Scanner sc = new Scanner(System.in);
		   char J1='X';
		   char J2='O';
		   char vacio='-';
		   char[][]tablero=new char[3][3];
		   boolean turno=true;
		   RellenarMatriz(tablero, vacio);
		   boolean posValida;
		   boolean correcto;
		   int fila;
		   int columna;
		   while(!finPartida(tablero,vacio)) {
			  
			   do {
				   
				   mostrarTurno(turno);
				   mostrarMatriz(tablero);
			   correcto=false;
			   System.out.println("Dame una fila");
			 fila=sc.nextInt();
			System.out.println("Dame una columna");
			 columna=sc.nextInt();
			posValida=validarPosicion(tablero,fila,columna);
			if(posValida) {
			if(!HayValorPosicion(tablero,fila,columna, vacio)) {
				correcto=true;
				}else {
					System.out.println("Ya hay una marca en esa posicion");
				}
			}else {
				System.out.println("La posicion no es valida");
			}
			   
			   }while(!correcto);
			   if(turno) {
				   InsertarEn(tablero,fila,columna,J1);
			   }else {
				   InsertarEn(tablero,fila,columna,J2);
			   }
			   turno=!turno;
		   }
		
		   mostrarMatriz(tablero);
		   mostrarGanador(tablero,J1,J2,vacio);
	   }
	   public static void mostrarGanador(char[][] matriz,char J1,char J2,char simboloDef) {
		   char simbolo=coincidenciaLinea(matriz,simboloDef);
		   if(simbolo!=simboloDef) {
			   if(simboloDef==J1) {
				   System.out.println("Ha ganado el jugador 1");
			   }else {
				   System.out.println("Ha ganado el jugador 2");
			   }
		   }
		   simbolo=coincidenciaColumna(matriz,simboloDef);
		   if(simbolo!=simboloDef) {
			   if(simboloDef==J1) {
				   System.out.println("Ha ganado el jugador 1");
			   }else {
				   System.out.println("Ha ganado el jugador 2");
			   }
		   }
		   simbolo=coincidenciaDiagonal(matriz,simboloDef);
		   if(simbolo!=simboloDef) {
			   if(simboloDef==J1) {
				   System.out.println("Ha ganado el jugador 1");
			   }else {
				   System.out.println("Ha ganado el jugador 2");
			   }
		   }
	   }
	   public static void  InsertarEn(char[][]tablero,int fila,int columna,char simbolo) {
		  tablero[fila][columna]=simbolo;
	   }
	   public static boolean validarPosicion(char[][]tablero,int fila,int columna) {
		   if(fila>=0 && fila<tablero.length && columna>=0 && columna<tablero.length) {
			   return true;
		   }
		   return false;
	   }
	   public static boolean HayValorPosicion(char[][]matriz,int fila,int columna,char simboloDef) {
		   if(matriz[fila][columna]!=simboloDef) {
			   return true;
		   }
		   return false;
	   }
	   public static void mostrarTurno(boolean turno) {
		   if(turno) {
			   System.out.println("Le toca al J1");
		   }else { 
			   System.out.println("Le toca al J2");
			
		   }
	   }
	   public static void RellenarMatriz(char[][]matriz,char simbolo) {
		   
		   for(int i=0;i<matriz.length;i++) {
			   for(int j=0;j<matriz.length;j++) {
				   matriz[i][j]=simbolo;
			   }
		   }
	   }
	   public static boolean matrizLlena(char[][]matriz,char simboloDef) {
		   for(int i=0;i<matriz.length;i++) {
			   for(int j=0;j<matriz.length;j++) {
				   if(matriz[i][j]==simboloDef) {
					   return false;
				   }
			   }
			   
		   }
		   return true;
	   }
	   public static boolean finPartida(char[][]matriz,char simboloDef) {
		   if(matrizLlena(matriz,simboloDef)|| 
				   coincidenciaLinea(matriz, simboloDef)!=simboloDef|| 
				   coincidenciaColumna(matriz, simboloDef)!=simboloDef||
				   coincidenciaDiagonal(matriz, simboloDef)!=simboloDef) {
			   return true;
		   }
		return false;
	   }
	   public static void mostrarMatriz(char[][]matriz) {
		   for(int i=0;i<matriz.length;i++) {
			   for(int j=0;j<matriz.length;j++) {
				   System.out.print(matriz[i][j]+" ");
			   }
			   System.out.println("");
		   }
	   }
	   public static char coincidenciaLinea(char[][]matriz,char simboloDef) {
		   char simbolo;
		   boolean coincidencia=true;
		   for(int i=0;i<matriz.length;i++) {
			   coincidencia=true;
			   simbolo=matriz[i][0];
			   if(simbolo!=simboloDef) {
				 for(int j=1;j<matriz[0].length;j++) {
					 if(simbolo!=matriz[i][j]) {
						 coincidencia=false;
					 }
			   }
				 if(coincidencia) {
					 return simbolo;
				 }
			   }
			   
		   }
		return simboloDef;
		
	   }
	  public static char coincidenciaColumna(char[][]matriz,char simboloDef) {
		  char simbolo;
		   boolean coincidencia=true;
		   for(int j=0;j<matriz.length;j++) {
			   coincidencia=true;
			   simbolo=matriz[0][j];
				 for(int i=1;i<matriz[0].length && simbolo!=simboloDef;i++) {
					 if(simbolo!=matriz[i][j]) {
						 coincidencia=false;
					 }
			   }
				 if(coincidencia) {
					 return simbolo;
				 }
			   }
			   
		   
		return simboloDef;
	   }
	  public static char coincidenciaDiagonal(char[][]matriz,char simboloDef) {
		  char simbolo;
		   boolean coincidencia=true;
		   simbolo=matriz[0][0];
		   if(simbolo!=simboloDef) {
			  for(int i=1;i<matriz.length;i++) {
				  if(simbolo!=matriz[i][i]) {
					  coincidencia=false;
			  } 
		   }
		   if(coincidencia) {
			   return simbolo;
		   }

	}
		   simbolo=matriz[0][2];
		   if(simbolo!=simboloDef) {
				  for(int i=1,j=1;i<matriz.length;i++,j--) {
					  if(simbolo!=matriz[i][j]) {
						  coincidencia=false;
				  } 
			   }
				  if(coincidencia) {
					   return simbolo;
				   }

		}	
	 return simboloDef;
	}
	}

