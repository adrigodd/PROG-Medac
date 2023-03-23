package Blackjack;

import java.util.ArrayList;

public class Jugador {
	private String Nombre = "";
	private int Puntuacion = 0;
	private ArrayList<Integer> barajaJugador;

	public Jugador() {
		this.Nombre = "";
		this.Puntuacion = 0;
		barajaJugador = new ArrayList<Integer>();
	}

	public Jugador(String Nombre) {// constructor con parametros
		this.Nombre = Nombre;
		this.Puntuacion = 0;
		barajaJugador = new ArrayList<Integer>();
	}

	public String getNombre() {// Getters y setters
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public int getPuntuacion() {
		return Puntuacion;
	}

	public void setPuntuacion(int puntuacion) {
		Puntuacion = puntuacion;
	}

	public ArrayList<Integer> getBarajaJugador() {
		return barajaJugador;
	}

	public void CogerCarta(Integer carta) {// Metodos especificos
		this.barajaJugador.add(0, carta);
		this.Puntuacion += carta;
	}

	/*public char eleccion(char eleccion) {
		char sigue = eleccion;
		if (sigue=='C') {
			return sigue;
		} else {
			return sigue;
		}
	}*/
	
	public String toString() {
		return ("El jugador se llama: " + this.Nombre + " y la puntuacion es: "+ this.Puntuacion);
	}
}
