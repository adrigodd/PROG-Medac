package Juegode3enraya;

/**
 * Esta clase va a servir para generar el tablero de la partida, asi como sus
 * métodos específicos
 * 
 * @author Adrián Sánchez Nieto
 * @version 30/03/2023
 */
public class tablero {

	private celda[][] tablero = new celda[3][3];
	private final char simboloDef = '-';

	/**
	 * Constructor con parámetros
	 */
	public tablero() {
		char valor = simboloDef;
		for (int i = 0; i < this.tablero.length; i++) {
			for (int j = 0; j < this.tablero[i].length; j++) {
				celda c = new celda(valor);
				tablero[i][j] = c;
			}
		}
	}

	/**
	 * Metodo get para obtener el arrays del tablero
	 * 
	 * @return tablero te devuelve el tablero entero.
	 */
	public celda[][] getTablero() {
		return tablero;
	}

	/**
	 * Metodo set para modificar el arrays del tablero
	 * 
	 * @param tablero El tablero es el arrays del programa
	 */
	public void setTablero(celda[][] tablero) {
		this.tablero = tablero;
	}

	/**
	 * Método para mostrar la matriz en pantalla
	 * 
	 * @param colorJ1 Sirve para mostrar el color del Jugador1
	 * @param colorJ2 Sirve para mostrar el color del Jugador1
	 * @return te devuelve la matriz actualizada.
	 */

	public String mostrarMatriz(String colorJ1, String colorJ2, boolean turno) {
		String resultado = "";

		// Recorre la matriz y muestra cada posición en pantalla

		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero.length; j++) {
				if (tablero[i][j].getValor() == 'X') {
					System.out.print(colorJ1 + tablero[i][j] + " " + "\u001B[0m");
				} else if (tablero[i][j].getValor() == 'O') {
					System.out.print(colorJ2 + tablero[i][j] + " " + "\u001B[0m");
				} else {
					System.out.print(tablero[i][j] + " ");
				}

			}
			System.out.println("");
		}

		return resultado;
	}

	/**
	 * Método para insertar un símbolo en una posición específica de la matriz
	 * 
	 * @param fila    Para introducir la fila que quieres seleccionar
	 * @param columna Para introducir la columna que quieres seleccionar
	 * @param simbolo Para introducir el simbolo que quieres introducir
	 */

	public void InsertarEn(int fila, int columna, char simbolo, String color) {
		this.tablero[fila][columna].setValor(simbolo);
		this.tablero[fila][columna].setOcupado(true);

	}

	/**
	 * Método booleano para validar si una posición está dentro de los límites de la
	 * matriz
	 * 
	 * @param fila    Para introducir la fila que quieres seleccionar
	 * @param columna Para introducir la columna que quieres seleccionar
	 * @return te devuelve si la posicion introducida esta entre esa fila
	 *         seleccionada y esa columna seleccionada
	 */

	public boolean validarPosicion(int fila, int columna) {
		boolean resultado = false;
		if (fila >= 0 && fila < this.tablero.length && columna >= 0 && columna < this.tablero.length) {
			resultado = true;
		}
		return resultado;
	}

	/**
	 * Método booleano para validar si una posición de la matriz ya tiene un valor
	 * asignado
	 * 
	 * @param fila    Para introducir la fila que quieres seleccionar
	 * @param columna Para introducir la columna que quieres seleccionar
	 * @return te devuelve si la posicion introducida tiene un simbolo ya
	 *         introducido
	 */

	public boolean HayValorPosicion(int fila, int columna) {
		boolean resultado = false;
		if (this.tablero[fila][columna].getValor() != this.simboloDef) {
			resultado = true;// Si de la matriz, la fila y columna que ha puesto es DIFERENTE al simbolo
			// default significa que si puede poner su simbolo
		}
		return resultado;
	}

	/**
	 * Método para validar si la matriz está llena de símbolos
	 * 
	 * @return si esta en true, la matriz esta llena, por lo tanto como ya esta
	 *         indicado en la partida, el juego termina
	 */

	public boolean matrizLlena() {
		int contador = 0;
		boolean bool = false;
		for (int i = 0; i < this.tablero.length; i++) {
			for (int j = 0; j < this.tablero.length; j++) {
				if (this.tablero[i][j].isOcupado()) {// Si el la celda[i][j] esta ocupada el contador le suma 1 para que
														// se cuente que esa casilla si esta ocupada
					contador++;
				}
			}
		}
		if (contador == 9) {// si el contador llega a 9 significa que todas las celdas estan ocupadas
			bool = true;
		}
		return bool;
	}

	/**
	 * Método para validar si hay una coincidencia de símbolos en una línea
	 * 
	 * @return si la coincidencia esta en true, el jugador gana ya que ha habido una
	 *         coincidencia en esa linea
	 */

	public char coincidenciaLinea(int fila) {
		char simbolo, simboloLocal = this.simboloDef;
		boolean coincidencia = true;

		coincidencia = true;// Inicializamos la variable booleana en verdadera
		simbolo = this.tablero[fila][0].getValor();// le damos a la variable AUXILIAR el valor de la matriz[i][0] para
													// que cada vez
		// que vaya de nuevo al for, le des el valor de la I para que pueda comprobar el
		// de 0,0 en el primero 1,0 en el segundo y 2,0 en el tercero
		if (this.tablero[fila][0].isOcupado()) {
			for (int j = 1; j < this.tablero.length; j++) {
				if (coincidencia) {
					coincidencia = (simbolo == this.tablero[fila][j].getValor());
					// Entra de primeras en este if ya que la coincidencia de primeras esta en true,
					// cuando entra el booleano de la derecha se lo aplica a coincidencia,
					// hay dos opciones si ese booleano devuelve un true la siguiente interaccion
					// si entra a revisar, si no, ni lo revisa.
				}

			}

			if (coincidencia) {// Una vez acabada el for si sigue en true la coincidencia significa que ha
								// ganado, por tanto el simbolo que estamos utilizando se le da al simboloLocal
								// que es el cual vamos a devolver.
				simboloLocal = simbolo;

			}
		}

		return simboloLocal;

	}

	/**
	 * Método para validar si hay una coincidencia de símbolos en una columna
	 * 
	 * @return si la coincidencia esta en true, el jugador gana ya que ha habido una
	 *         coincidencia en esa columna
	 */

	public char coincidenciaColumna(int columna) {
		char simbolo, simboloLocal = simboloDef;
		boolean coincidencia = true;

		coincidencia = true;// Inicializamos la variable booleana en verdadera
		simbolo = this.tablero[0][columna].getValor();// le damos a la variable AUXILIAR el valor de la matriz[i][0]
														// para
		// que cada vez
		// que vaya de nuevo al for, le des el valor de la I para que pueda comprobar el
		// de 0,0 en el primero 0,1 en el segundo y 0,2 en el tercero
		if (this.tablero[0][columna].isOcupado()) {
			for (int i = 1; i < this.tablero.length; i++) {

				if (coincidencia) {
					coincidencia = (simbolo == this.tablero[i][columna].getValor());// Entra de primeras en este if ya
																					// que la coincidencia de primeras
																					// esta en true,cuando entra el
																					// booleano de la derecha se lo
																					// aplica a coincidencia, hay dos
																					// opciones si ese booleano devuelve
																					// un true la siguiente interaccion
																					// si entra a revisar, si no, ni lo
																					// revisa

				}

			}
			if (coincidencia) {// Una vez acabada el for si sigue en true la coincidencia significa que ha
								// ganado, por tanto el simbolo que estamos utilizando se le da al simboloLocal
								// que es el cual vamos a devolver
				simboloLocal = simbolo;

			}
		}

		return simboloLocal;

	}

	/**
	 * Método para validar si hay una coincidencia de símbolos en una diagonal
	 * 
	 * @return si la coincidencia esta en true, el jugador gana ya que ha habido una
	 *         coincidencia en esa diagonal
	 */

	public char coincidenciaDiagonal() {
		char simbolo, simboloLocal = simboloDef;
		boolean coincidencia = true;// Inicializamos la variable booleana en verdadera
		simbolo = this.tablero[0][0].getValor();// le damos a la variable AUXILIAR el valor de la matriz[0][0]
		boolean sigue = true;
		if (this.tablero[0][0].isOcupado()) {
			for (int i = 1; i < this.tablero.length && sigue; i++) {

				if (simbolo != this.tablero[i][i].getValor()) {// Aqui ponemos en esta diagonal matriz[i][i] porque al
																// ser una
					// diagonal en la cual sumen 1 en las dos con un for nos vale
					coincidencia = false;// Si entra en este IF significa que el simbolo aux es DIFERENTE al simbolo de
											// su linea por tanto la coincidencia es false,por lo tanto NO hay
											// coincidencia en esa linea

				}
			}
			if (coincidencia) {// Si cuando ha recorrido el for de la j no se mete en el IF que acabamos de
								// mencionar signica que hya coincidencia por tanto ha ganado y te devuelve el
								// simbolo el cual ha ganado
				simboloLocal = simbolo;
				sigue = false;
			}

		}
		simbolo = this.tablero[0][2].getValor();// le damos a la variable AUXILIAR el valor de la matriz[0][2]
		coincidencia = true;
		if (this.tablero[0][2].isOcupado()) {
			for (int i = 1, j = 1; i < this.tablero.length && sigue; i++, j--) {// en este for como el siguiente numero
																				// que hay que comparar es 1,1 y tenemos
																				// de momento 0,2 es restarle uno a la j
																				// y sumarle uno a la i

				if (simbolo != this.tablero[i][j].getValor()) {// Aqui ponemos en esta diagonal matriz[i][i] porque al
																// ser una
					// diagonal en la cual sumen 1 en las dos con un for nos vale
					coincidencia = false;// Si entra en este IF significa que el simbolo aux es DIFERENTE al simbolo de
											// su linea por tanto la coincidencia es false,por lo tanto NO hay
											// coincidencia en esa linea
				}
			}
			if (coincidencia) {// Si cuando ha recorrido el for de la j no se mete en el IF que acabamos de
								// mencionar signica que hya coincidencia por tanto ha ganado y te devuelve el
								// simbolo el cual ha ganado
				simboloLocal = simbolo;
				sigue = false;
			}

		}
		return simboloLocal;
	}

	public void InsertarfichaIAFacil(char simbolo, String colorJugadorIA) {
		int fila;
		int columna;

		do {
			fila = (int) (Math.random() * ((2 - 0) + 1));
			columna = (int) (Math.random() * ((2 - 0) + 1));
		} while (this.tablero[fila][columna].isOcupado() != false);
		this.tablero[fila][columna].setValor(simbolo);
		this.tablero[fila][columna].setOcupado(true);

	}

}
