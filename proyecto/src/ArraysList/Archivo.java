package ArraysList;

public class Archivo {
private String Nombre;
private String Contenido;
private int tamaño;
public Archivo() {
	this.Nombre="";
	this.Contenido="";
	this.tamaño=0;
}
public Archivo(String Nombre,String Contenido) {
	this.Nombre=Nombre;
	this.Contenido=Contenido;
	this.tamaño=this.Contenido.length();
}
public String getNombre() {
	return Nombre;
}
public void setNombre(String nombre) {
	Nombre = nombre;
}
public String getContenido() {
	return Contenido;
}
public void setContenido(String contenido) {
	Contenido = contenido;
}
public int getTamaño() {
	return tamaño;
}
public void setTamaño(int tamaño) {
	this.tamaño = tamaño;
}

}
