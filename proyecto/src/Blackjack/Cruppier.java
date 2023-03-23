package Blackjack;

import java.util.ArrayList;
import java.util.Collections;

public class Cruppier {
	private String Nombre;
	private Baraja Arraisito;
	private int Puntuacion;
	private ArrayList<Integer> barajaCruppier;

	public Cruppier() {// constructor sin parametros
		this.Nombre = "";
		this.Arraisito = new Baraja();
		this.Puntuacion = 0;
		barajaCruppier = new ArrayList<Integer>();
	}

	public ArrayList<Integer> getBarajaCruppier() {
		return barajaCruppier;
	}

	public Cruppier(String Nombre) {// constructor con parametros
		this.Nombre = Nombre;
		barajaCruppier = new ArrayList<Integer>();
	}

	public String getNombre() {// Getters y setters
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public Baraja getArraisito() {
		return Arraisito;
	}

	public void setArraisito(Baraja arraisito) {
		Arraisito = arraisito;
	}

	public int getPuntuacion() {
		return Puntuacion;
	}

	public void setPuntuacion(int puntuacion) {
		Puntuacion = puntuacion;
	}

	public void Barajar() {
		Collections.shuffle(Arraisito.getArraisito());
	}

	public Integer DarCarta() {
		Integer a = 0;
		a = Arraisito.getArraisito().get(0);
		Arraisito.getArraisito().remove(0);

		return a;
	}

	public void CogerCarta(Integer carta) {// Metodos especificos
		this.barajaCruppier.add(0, carta);
		this.Puntuacion += carta;
	}

	public String toString() {
		return ("El cruppier se llama: " + this.Nombre + " y la puntuacion es: " + this.Puntuacion);
	}
}

