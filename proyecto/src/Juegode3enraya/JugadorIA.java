package Juegode3enraya;

/**
 * En la clase Jugador crearemos el jugador que posteriormente se va a generar
 * en la clase Partida
 * 
 * @author Adrián Sánchez Nieto
 * @version 30/03/2023
 *
 */
public class JugadorIA {
	private char icono='O';
	private String colorJugadorIA;
	private tablero tablero;

	public void setColorJugadorIA(String colorJugadorIA) {
		this.colorJugadorIA = colorJugadorIA;
	}

	public tablero getTablero() {
		return tablero;
	}

	public void setTablero(tablero tablero) {
		this.tablero = tablero;
	}

	/**
	 * Constructor con parámetros
	 * 
	 * @param icono es el simbolo que va a tener el jugador, en este caso o 'X' o
	 *              'O'
	 */
	public JugadorIA() {
		
	}

	/**
	 * Metodo get para obtener el color del simbolo del jugador
	 * 
	 * @return colorJugador te devuelve el color seleccionado para el jugador
	 */
	public String getColorJugadorIA() {
		return colorJugadorIA;
	}

	/**
	 * Metodo set para modificar el color seleccionado
	 * 
	 * @param colorJugador valor que te devueleve el color
	 */
	public void setColorJugador(String colorJugadorIA) {
		this.colorJugadorIA = colorJugadorIA;
	}

	/**
	 * Metodo get para obtener el simbolo del jugador
	 * 
	 * @return icono te devuelve el icono seleccionado para el jugador
	 */
	public char getIcono() {
		return icono;
	}

	/**
	 * Metodo set para modificar el icono seleccionado
	 * 
	 * @param icono el valor icono es un char para poder diferenciar en el tablero
	 *              tu icono
	 */
	public void setIcono(char icono) {
		this.icono = icono;
	}

	

}
