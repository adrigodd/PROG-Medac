package Juegode3enraya;

public class tablero {
	// Declaración de la matriz y el símbolo por defecto
	private char[][] matriz = new char[3][3];
	private char simboloDef = '-';
	// Método para obtener la matriz
	public char[][] getMatriz() {
		return matriz;
	}
	// Método para establecer la matriz
	public void setMatriz(char[][] matriz) {
		this.matriz = matriz;
	}
	// Método para rellenar la matriz con el símbolo por defecto
	public void RellenarMatriz() {
		// Recorre la matriz y establece el símbolo por defecto en cada posición	
		for (int i = 0; i < this.matriz.length; i++) {
			for (int j = 0; j < this.matriz.length; j++) {
				this.matriz[i][j] = this.simboloDef;
			}
		}
	}
	// Método para mostrar la matriz en pantalla
	 public  String mostrarMatriz() {
		 String resultado="";
		// Recorre la matriz y muestra cada posición en pantalla
		   for(int i=0;i<matriz.length;i++) {
			   for(int j=0;j<matriz.length;j++) {
				   System.out.print(matriz[i][j]+" ");
			   }
			   System.out.println("");
		   }
		   return resultado;
	   }
	// Método para insertar un símbolo en una posición específica de la matriz
	public void InsertarEn(int fila, int columna, char simbolo) {
		this.matriz[fila-1][columna-1] = simbolo;
	}
	// Método para validar si una posición está dentro de los límites de la matriz
	public boolean validarPosicion(int fila, int columna) {
		if (fila > 0 && fila <= this.matriz.length && columna > 0 && columna <= this.matriz.length) {
			return true;
		}
		return false;
	}
	// Método para validar si una posición de la matriz ya tiene un valor asignado
	public boolean HayValorPosicion(int fila, int columna) {
		if (this.matriz[fila-1][columna-1] != this.simboloDef) {
			return true;//Si de la matriz, la fila y columna que ha puesto es DIFERENTE al simbolo default significa que si puede poner su simbolo
		}
		return false;
	}
	
	// Método para validar si la matriz está llena de símbolos
	public boolean matrizLlena() {
		for (int i = 0; i < this.matriz.length; i++) {
			for (int j = 0; j < this.matriz.length; j++) {
				if (this.matriz[i][j] == this.simboloDef) {
					return false;//Si de la matriz, la fila y columna que ha puesto es IGUAL al simbolo default significa que la matriz no esta llena
				}
			}

		}
		return true;
	}
	// Método para validar si hay una coincidencia de símbolos en una línea
	public char coincidenciaLinea() {
		char simbolo;
		boolean coincidencia = true;
		for (int i = 0; i < this.matriz.length; i++) {
			coincidencia = true;//Inicializamos la variable booleana en verdadera
			simbolo = this.matriz[i][0];//le damos a la variable AUXILIAR el valor de la  matriz[i][0] para que cada vez que vaya de nuevo al for, le des el valor de la I para que pueda comprobar el de 0,0 en el primero 1,0 en el segundo y 2,0 en el tercero
			if (simbolo != this.simboloDef) {
				for (int j = 1; j < this.matriz[0].length; j++) {
					if (simbolo != this.matriz[i][j]) 
						coincidencia = false;//Si entra en este IF significa que el simbolo aux es DIFERENTE al simbolo de su linea por tanto la coincidencia es false,por lo tanto NO hay coincidencia en esa linea
					}
				}
				if (coincidencia) {//Si cuando ha recorrido el for de la j no se mete en el IF que acabamos de mencionar signica que hya coincidencia por tanto ha ganado y te devuelve el simbolo el cual ha ganado
					return simbolo;
				}
			}

		
		return this.simboloDef;

	}
	// Método para validar si hay una coincidencia de símbolos en una columna
	public char coincidenciaColumna() {
		char simbolo;
		boolean coincidencia = true;
		for (int j = 0; j < this.matriz.length; j++) {
			coincidencia = true;//Inicializamos la variable booleana en verdadera
			simbolo = this.matriz[0][j];//le damos a la variable AUXILIAR el valor de la  matriz[i][0] para que cada vez que vaya de nuevo al for, le des el valor de la I para que pueda comprobar el de 0,0 en el primero 0,1 en el segundo y 0,2 en el tercero
			if (simbolo != this.simboloDef) {
				for (int i = 1; i < this.matriz[0].length; i++) {
					if (simbolo != this.matriz[i][j]) {
						coincidencia = false;//Si entra en este IF significa que el simbolo aux es DIFERENTE al simbolo de su linea por tanto la coincidencia es false,por lo tanto NO hay coincidencia en esa columna
					}
				}
				if (coincidencia) {//Si cuando ha recorrido el for de la j no se mete en el IF que acabamos de mencionar signica que hya coincidencia por tanto ha ganado y te devuelve el simbolo el cual ha ganado
					return simbolo;
				}
			}

		}
		return this.simboloDef;

	}
	// Método para validar si hay una coincidencia de símbolos en una diagonal
	public char coincidenciaDiagonal() {
		char simbolo;
		boolean coincidencia = true;//Inicializamos la variable booleana en verdadera
		simbolo = this.matriz[0][0];//le damos a la variable AUXILIAR el valor de la  matriz[0][0]
		if (simbolo != simboloDef) {
			for (int i = 1; i < this.matriz.length; i++) {
				if (simbolo != this.matriz[i][i]) {//Aqui ponemos en esta diagonal matriz[i][i] porque al ser una diagonal en la cual sumen 1 en las dos con un for nos vale
					coincidencia = false;//Si entra en este IF significa que el simbolo aux es DIFERENTE al simbolo de su linea por tanto la coincidencia es false,por lo tanto NO hay coincidencia en esa diagonal
				}
			}
			if (coincidencia) {//Si cuando ha recorrido el for de la j no se mete en el IF que acabamos de mencionar signica que hya coincidencia por tanto ha ganado y te devuelve el simbolo el cual ha ganado
				return simbolo;
			}

		}
		simbolo = matriz[0][2];//le damos a la variable AUXILIAR el valor de la  matriz[0][2]
		if (simbolo != this.simboloDef) {
			for (int i = 1, j = 1; i < this.matriz.length; i++, j--) {//en este for como el siguiente numero que hay que comparar es 1,1 y tenemos de momento 0,2 es restarle uno a la j y sumarle uno a la i
				if (simbolo != this.matriz[i][j]) {
					coincidencia = false;//Si entra en este IF significa que el simbolo aux es DIFERENTE al simbolo de su linea por tanto la coincidencia es false,por lo tanto NO hay coincidencia en esa diagonal
				}
			}
			if (coincidencia) {//Si cuando ha recorrido el for de la j no se mete en el IF que acabamos de mencionar signica que hya coincidencia por tanto ha ganado y te devuelve el simbolo el cual ha ganado
				return simbolo;
			}

		}
		return this.simboloDef;
	}

}
