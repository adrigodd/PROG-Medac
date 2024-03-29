package Juegode3enraya;

import java.util.Scanner;

/**
 * En esta clase crea la partida asi como sus métodos para poder comprobar
 * ganador, ademas tambien implementa la clase tablero y la clase Jugador
 * 
 * @author Adrián Sánchez Nieto
 * @version 30/03/2023
 *
 */
public class partida {
	private tablero tableroPartida = new tablero();
	private Jugador Jugador1;
	private Jugador Jugador2;
	private JugadorIA JugadorIA;

	private int color;

	/**
	 * En el metodo Jugar reune todos los metodos para poder jugar al 3 en raya
	 */
	public void Jugar() {
		Scanner sc = new Scanner(System.in);
		boolean IA = false;
		int opcionIA = 0;
		do {
			System.out.println("2 Jugadores o 1 vs IA");
			System.out.println("1.2 Jugadores");
			System.out.println("2.1 VS IA");
			opcionIA = sc.nextInt();
		} while (opcionIA != 1 && opcionIA != 2);

		if (opcionIA == 1) {
			Jugador1 = new Jugador('X');
			Jugador2 = new Jugador('O');
		} else {
			Jugador1 = new Jugador('X');
			JugadorIA = new JugadorIA();
		}

		char vacio = '-';
		boolean turno = true;
		System.out.println("\u001B[0m" + "¿Quieres jugar? (Usa 1/2)");
		System.out.println("1.Jugar");
		System.out.println("2.Salir");
		int opcion = sc.nextInt();
		int reiniciar;

		switch (opcion) {

		case 1:
			do {
				tableroPartida = new tablero();
				turno = true;

				System.out.println("\u001B[0m" + "Elige un color de estos Jugador1:");
				System.out.println("Azul:1");
				System.out.println("Verde:2");
				System.out.println("Rojo:3");
				System.out.println("Rosa:4");
				System.out.println("Amarillo:5");
				color = sc.nextInt();
				Jugador1.setColorJugador(diccionarioColores(color));
				color = 0;
				System.out.println("Dime un color que quieras Jugador2");
				System.out.println("Azul:1");
				System.out.println("Verde:2");
				System.out.println("Rojo:3");
				System.out.println("Rosa:4");
				System.out.println("Amarillo:5");
				color = sc.nextInt();
				if (opcionIA == 1) {
					Jugador2.setColorJugador(diccionarioColores(color));
				} else {
					JugadorIA.setColorJugador(diccionarioColores(color));
				}

				boolean posValida;
				boolean correcto;
				int fila = 0;
				int columna = 0;
				System.out.println("Bienvenido al 3 en raya:\n");
				while (!finPartida(tableroPartida, vacio, fila, columna)) {// mientras el fin de partida sea diferente
																			// se mete en el
					// while

					do {

						mostrarTurno(turno);// Mostramos el turno
						if (opcionIA == 1) {
							tableroPartida.mostrarMatriz(Jugador1.getColorJugador(), Jugador2.getColorJugador(), turno);// Mostramos
							// matriz
							// en
							// pantalla
						} else {
							tableroPartida.mostrarMatriz(Jugador1.getColorJugador(), JugadorIA.getColorJugadorIA(),
									turno);// Mostramos
							// matriz
							// en
							// pantalla
						}

						correcto = false;
						if (opcionIA == 1) {
							System.out.println("\u001B[0m" + "Dame una fila (del 1 al 3)");// Pide filas
							fila = sc.nextInt();
							fila--;

							System.out.println("Dame una columna (del 1 al 3)");// Pide columnas
							columna = sc.nextInt();
							columna--;

						} else {
							if (turno) {
								IA = false;
								System.out.println("\u001B[0m" + "Dame una fila (del 1 al 3)");// Pide filas
								fila = sc.nextInt();
								fila--;

								System.out.println("Dame una columna (del 1 al 3)");// Pide columnas
								columna = sc.nextInt();
								columna--;
							} else {
								tableroPartida.InsertarfichaIAFacil(JugadorIA.getIcono(), JugadorIA.getColorJugadorIA());
								IA = true;
								turno = !turno;
							}
						}
						posValida = tableroPartida.validarPosicion(fila, columna);
						// cumple
						// las condiciones de validar
						// posicion y se
						// la implementamos a una variable
						if (!IA) {
							if (posValida) {// si el validar posicion esta en true entra, si no se va al else de la
											// posicion
								// no es valida
								if (!tableroPartida.HayValorPosicion(fila, columna)) {// Comprueba que haya un simbolo
																						// en la
									// posicion marcada
									correcto = true;
								} else {
									System.out.println("Ya hay una marca en esa posicion");
								}
							} else {
								System.out.println("La posicion no es valida");
							}
						}

					} while (!correcto);// haces el do while mientras el booleano correcto que esta inicializado en
										// false, pasa a ser true, que la unica manera es si la posicion es valida y no

					if (turno) {
						tableroPartida.InsertarEn(fila, columna, this.Jugador1.getIcono(),
								this.Jugador1.getColorJugador());// Inserta la ficha, dependiendo del
						// booleano turno,inserta la ficha
						// del jugador 1 o la del jugador2
					} else {
						if (opcionIA == 1) {
							tableroPartida.InsertarEn(fila, columna, this.Jugador2.getIcono(),
									Jugador2.getColorJugador());// hay ningun simbolo
						}

						// Inserta
						// la
						// ficha,
						// dependiendo
						// del
						// booleano turno,inserta la ficha
						// del jugador 1 o la del jugador2
					}
					turno = !turno;

				}
				if (opcionIA == 1) {
					tableroPartida.mostrarMatriz(Jugador1.getColorJugador(), Jugador2.getColorJugador(), turno);// le
					// muestra
					// la matriz
					// actualizada
				} else {
					tableroPartida.mostrarMatriz(Jugador1.getColorJugador(), JugadorIA.getColorJugadorIA(), turno);
				}

				mostrarGanador(tableroPartida, vacio, fila, columna);// comprueba que tras la posicion haya algun
																		// ganador
				System.out.println("¿Quieres reiniciar (Usa 1/2)");
				System.out.println("1.Si");
				System.out.println("2.No");
				reiniciar = sc.nextInt();
			} while (reiniciar == 1 );
			System.out.println("Nos vemos en otra epoca");

			break;
		case 2:

			System.out.println("Has decidido irte,adiós");

			break;

		}
	}

	public void mostrarGanador(tablero tableroPartida, char simboloDef, int fila, int columna) {
		char simbolo = tableroPartida.coincidenciaLinea(fila);
		boolean sigue = true;

		if (simbolo != simboloDef) {// primero comprobamos que el simbolo de coincidencialinea sea diferente al
			sigue = false; // simbolodef
			if (simbolo == this.Jugador1.getIcono()) {
				System.out.println("Ha ganado el jugador 1 por linea");
			} else {
				System.out.println("Ha ganado el jugador 2 por linea");
			}
		}
		simbolo = tableroPartida.coincidenciaColumna(columna);

		if (simbolo != simboloDef) {
			sigue = false;
			if (simbolo == this.Jugador1.getIcono()) {
				System.out.println("Ha ganado el jugador 1 por columna");
			} else {
				System.out.println("Ha ganado el jugador 2 por columna");
			}
		}

		simbolo = tableroPartida.coincidenciaDiagonal();
		if (simbolo != simboloDef) {
			sigue = false;
			if (simbolo == this.Jugador1.getIcono()) {
				System.out.println("Ha ganado el jugador 1 por diagonal");
			} else {
				System.out.println("Ha ganado el jugador 2 por diagonal");
			}
		}
		if (sigue) {
			if (tableroPartida.matrizLlena() && (tableroPartida.coincidenciaLinea(fila) != simboloDef
					|| tableroPartida.coincidenciaColumna(columna) != simboloDef
					|| tableroPartida.coincidenciaDiagonal() != simboloDef)) {// este if indica que si la matriz esta
																				// llena
																				// y no hay coincidencia, hay un empate
				System.out.println("EMPATE");
			}
		}

	}

	/**
	 * Metodo especifico para mostrar turno
	 * 
	 * @param turno es un booleano para poder cambiar de turno
	 */
	public void mostrarTurno(boolean turno) {
		if (turno) {
			System.out.println("Le toca al J1");
		} else {
			System.out.println("Le toca al J2");

		}

	}

	/**
	 * Metodo booleano para indicar que la partida ha acabado
	 * 
	 * @param tableroPartida Es el tablero de la partida
	 * @param simboloDef     el simbolo por definido, que en este caso es '-'
	 * @return devuelve en este caso el resultado, si es true, significa que la
	 *         partida ha acabado, si es false aun no ha acabado
	 */
	public boolean finPartida(tablero tableroPartida, char simboloDef, int fila, int columna) {
		boolean resultado = false;
		if (tableroPartida.matrizLlena() || tableroPartida.coincidenciaLinea(fila) != simboloDef
				|| tableroPartida.coincidenciaColumna(columna) != simboloDef
				|| tableroPartida.coincidenciaDiagonal() != simboloDef) {
			resultado = true;
		}
		return resultado;
	}

	/**
	 * Este metodo especifico es para cambiar el color en funcion de la decision de
	 * cada jugador
	 * 
	 * @param color es el numero que tu pones en el switch para indicar el color
	 *              especifico
	 * @return te devuelve un string con un comando para cambiar el color
	 */
	public String diccionarioColores(int color) {
		String resultado = "";
		switch (this.color) {

		case 1:

			resultado = "\u001B[34m";
			break;

		case 2:
			resultado = "\u001B[32m";
			break;

		case 3:
			resultado = "\u001B[31m";
			break;

		case 4:
			resultado = "\u001B[95m";
			break;

		case 5:
			resultado = "\u001B[33m";
		}

		return resultado;
	}
}
