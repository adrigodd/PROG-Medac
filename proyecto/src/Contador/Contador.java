package Contador;

public class Contador {
	private int numero;
	//Constructor vacio
	public Contador() {
		this.numero=0;
		
	}
	//Constructor con parametros
	public Contador(int numero) {
		this.numero=numero;
	}
	//Getters
	public int getnumero() {
		return this.numero;
		
	}
	//Setters
	public void setnumero(int numero) {
		this.numero=numero;
	}
	//metodos especificos
	public void incrementar() {
		this.numero++;
		
	}
	public void decrementar() {
		this.numero--;
	}
}
