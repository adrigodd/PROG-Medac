package ejercicioRefactorizacion;
/**
 * 
 * @author Adrián Sánchez Nieto
 * 
 */
public class e2 {
/**
 * 
 * @param args
 * * Este ejercicio es un for en el que inicializa de primeras una variable a 3 y
 * en el for la i la inicializa en dos y le suma a la i y   al numero1 le suma dos para poder
 * hacer la sumatoria y el resultado a 0 y  lo que hace el for es sumarle a ambos 2, para luego 
 * darle al valor resultado la suma de ambos
 */
	 public static void main(String[] args) {
		 
		 int numero1=3;
		 int resultado=0;
		 for(int i=2;i<=7;i+=2,numero1+=2) {
			resultado=numero1+i;
			System.out.println("La suma de "+numero1+" y "+i+" es "+resultado);
			
			
		 }
		  }
		  
		}

