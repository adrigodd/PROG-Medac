package JuegodeDados;

public class Partida {//parametros privados
	private Jugador Jugador1;
	private Jugador Jugador2;
	private int NumerodeRondas;
	private Jugador Ganador;
	public Partida() {//constructor sin parametros
		this.Jugador1=new Jugador();
		this.Jugador2=new Jugador();
		this.NumerodeRondas=0;
	}
	public Partida(Jugador Jugador1,Jugador Jugador2,int NumerodeRondas) {//constructor con parametros
	this.Jugador1=Jugador1;
	this.Jugador2=Jugador2;
	this.NumerodeRondas=NumerodeRondas;
		
	}
	public Jugador getJugador1() {//Getters y setters
		return Jugador1;
	}
	public void setJugador1(Jugador jugador1) {
		Jugador1 = jugador1;
	}
	public Jugador getJugador2() {
		return Jugador2;
	}
	public void setJugador2(Jugador jugador2) {
		Jugador2 = jugador2;
	}
	public int getNumerodeRondas() {
		return NumerodeRondas;
	}
	public void setNumerodeRondas(int numerodeRondas) {
		NumerodeRondas = numerodeRondas;
	}
	public Jugador getGanador() {
		return Ganador;
	}
	public void setGanador(Jugador ganador) {
		Ganador = ganador;
	}
	public void Jugar() {//Metodos especificos
		int i;
		int suma=0;
		for(i=0;i<this.NumerodeRondas;i++) {
			this.Jugador1.Tirar();
			suma=suma+this.Jugador1.getPuntuacion();
			this.Jugador2.Tirar();
			suma=suma+this.Jugador2.getPuntuacion();
			
			
		}
		if(this.Jugador1.getPuntuacion()>this.Jugador2.getPuntuacion()) {
			this.Ganador=this.Jugador1;
		}else {
			this.Ganador=this.Jugador2;
		}
	
		}
		public String toString() {//Metodo toString
		String resultado="";
		resultado="El jugador 1 es "+this.Jugador1+" el jugador 2 es "+this.Jugador2+" el numero de rondas es "+this.NumerodeRondas+"y el ganador es "+this.Ganador;
		return resultado;
	}

}
