package Blackjack;

import java.util.Scanner;

public class Partida {
	private Cruppier Cruppier;
	private Jugador Jugador;

	public Partida() {
		this.Cruppier = new Cruppier();
		this.Jugador = new Jugador();

	}

	public Cruppier getCruppier() {
		return Cruppier;
	}

	public void setCruppier(Cruppier cruppier) {
		Cruppier = cruppier;
	}

	public Jugador getJugador() {
		return Jugador;
	}

	public void setJugador(Jugador jugador) {
		Jugador = jugador;
	}

	public void Jugar() {
		Scanner sc = new Scanner(System.in);

		Cruppier.getArraisito().LlenarBaraja();
		Cruppier.Barajar();

		int carta = Cruppier.DarCarta();
		Jugador.CogerCarta(carta);

		carta = Cruppier.DarCarta();
		Jugador.CogerCarta(carta);

		carta = Cruppier.DarCarta();
		Cruppier.CogerCarta(carta);

		carta = Cruppier.DarCarta();
		Cruppier.CogerCarta(carta);

		System.out.println(Jugador.getBarajaJugador());

		System.out.println(Jugador);
		System.out.println(Cruppier);

		// Jugador.eleccion(eleccion);
		while ((Jugador.getPuntuacion() <= 21 && Cruppier.getPuntuacion() <= 21) || (Cruppier.getPuntuacion() >= 17 && Jugador.getPuntuacion() <= 21)) {
			char eleccion;
			do {
				System.out.println("Introduce 'C' para carta y 'P' para parar");
				eleccion = sc.next().charAt(0);
				System.out.println(eleccion);
			} while ((eleccion != 'c') && (eleccion != 'C') && (eleccion != 'P') && (eleccion != 'p')  );
			if (eleccion == 'C' || eleccion == 'c') {
				carta = Cruppier.DarCarta();
				Jugador.CogerCarta(carta);
			} else {
				while (Cruppier.getPuntuacion() < 17) {
					carta = Cruppier.DarCarta();
					Cruppier.CogerCarta(carta);
				}
				System.out.println(Jugador.getBarajaJugador());
				System.out.println(Jugador);
				System.out.println(Cruppier.getBarajaCruppier());
				System.out.println(Cruppier);
				break;
			}

			System.out.println(Jugador.getBarajaJugador());
			System.out.println(Jugador);
			System.out.println(Cruppier.getBarajaCruppier());
			System.out.println(Cruppier);

		}
		System.out.println(comprobarGanador());
	}

	public String comprobarGanador() {
		String st = "";
		if (Jugador.getPuntuacion() > Cruppier.getPuntuacion() && Jugador.getPuntuacion() <= 21) {
			st = "Jugador gana con " + Jugador.getPuntuacion();
			return st;
		} else if (Jugador.getPuntuacion() == Cruppier.getPuntuacion()) {
			st = "Jugador y Cruppier empatan con " + Jugador.getPuntuacion() + " puntos!";
			return st;
		} else {
			if (Cruppier.getPuntuacion() <= 21) {
				st = "Cruppier gana con " + Cruppier.getPuntuacion();
				return st;
			} else {
				st = "Jugador gana con " + Jugador.getPuntuacion();
				return st;
			}
		}
	}
}
