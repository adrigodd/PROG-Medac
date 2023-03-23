package JuegodeDados;

public class Jugador {//parametros privados
private String Nombre;
private Dado dado;
private int Puntuacion;
public Jugador() {//constructor sin parametros
	this.Nombre="";
	this.dado=new Dado();
	this.Puntuacion=0;
	
}
public Jugador(String Nombre, Dado dado) {//constructor con parametros
	this.Nombre=Nombre;
	this.dado=dado;
	
}
public String getNombre() {//Getters y setters
	return Nombre;
}
public void setNombre(String nombre) {
	Nombre = nombre;
}
public Dado getDado() {
	return dado;
}
public void setDado(Dado dado) {
	this.dado = dado;
}
public int getPuntuacion() {
	return Puntuacion;
}
public void setPuntuacion(int puntuacion) {
	Puntuacion = puntuacion;
}
public void Tirar() {//Metodos especificos
	this.dado.Tirar();
	this.Puntuacion=this.dado.Tirar();
	
	 
	}
public String toString() {//Metodo toString
	String resultado="";
	resultado="Su nombre es "+this.Nombre+" y su puntuacion es "+this.Puntuacion;
	return resultado;
}


}
