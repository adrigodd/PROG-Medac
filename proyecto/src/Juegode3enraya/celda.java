package Juegode3enraya;

/**
 * Esta clase sirve para poder modificar cada celda del tablero, es decir, un
 * tablero es un arrays formado de celdas
 * 
 * @author Adrián Sánchez Nieto
 * @version 30/03/2023
 *
 */
public class celda {
	private char valor;
	private boolean ocupado;

	/**
	 * Constructor vacío.
	 * 
	 * @param ocupado inicializamos en false porque al principio la celda no esta
	 *                ocupada
	 */
	public celda() {
		this.ocupado = false;
	}

	/**
	 * Constructor con parámetros.
	 * 
	 * @param valor Le da el valor introducido por parámetros de el mismo
	 */
	public celda(char valor) {
		this.valor = valor;
		this.ocupado = false;
	}

	/**
	 * Metodo get para obtener el valor de la celda
	 * 
	 * @return valor Te devuelve el valor de la celda
	 */
	public char getValor() {
		return valor;
	}

	/**
	 * Metodo set para modificar el valor de la celda
	 * 
	 * @param valor Modifica el valor de el mismo
	 */
	public void setValor(char valor) {
		this.valor = valor;
	}

	/**
	 * Metodo get para saber si la celda está ocupada.
	 * 
	 * @return te devuelve si la celda esta ocupada
	 */
	public boolean isOcupado() {
		return ocupado;
	}

	/**
	 * Metodo set para modificar si la celda esta ocupada o no
	 * 
	 * @param ocupado variable booleana que indica si la celda esta ocupada o no
	 */
	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}

	/**
	 * Metodo toString para poder enseñar el valor de la celda
	 */
	public String toString() {
		String resultado = "";
		resultado = Character.toString(valor);
		return resultado;

	}
}
