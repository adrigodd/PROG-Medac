package Blackjack;

import java.util.ArrayList;
import java.util.Collections;

public class Baraja {
	private ArrayList<Integer> Arraisito;

	public ArrayList<Integer> getArraisito() {
		return Arraisito;
	}

	public void setArraisito(ArrayList<Integer> arraisito) {
		Arraisito = arraisito;
	}

	public Baraja() {
		this.Arraisito = new ArrayList<Integer>(52);

	}

	public void LlenarBaraja() {
		Integer contador = 1;
		for (int i = 0; i < 51; i++) {
			if (contador < 13) {
				if(contador.equals(1)) {
					this.Arraisito.add(i, contador+10);
				}else if(contador.equals(11)||contador.equals(12)) {
					this.Arraisito.add(i, 10);
				}else {
					this.Arraisito.add(i, contador);
				}
			} else {
				contador = 1;
				this.Arraisito.add(i, contador);
			}
			contador++;
		}

	}
}
