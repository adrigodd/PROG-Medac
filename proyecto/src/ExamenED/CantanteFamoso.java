package ExamenED;
/*Crea una clase denominada ListaCantantesFamosos que disponga de un atributo 
ArrayList listaCantantesFamosos que contenga objetos de tipo CantanteFamoso. La 
clase debe tener un método que permita añadir objetos de tipo CantanteFamoso a la 
lista. Un objeto de tipo CantanteFamoso tendrá como atributos nombre (String), 
Ventas (int) y GéneroMusical(String), y los métodos para obtener y establecer los 
atributos. Crea una clase test con el método main que inicialice un objeto 
ListaCantantesFamosos y añade manualmente dos objetos de tipo CantanteFamoso a 
la lista.  Debe permitir la siguiente funcionalidad: 
a. Buscar todos los cantantes pertenecientes a un mismo género 
b. Sacar el cantante con más ventas 
c. Imprimir todos los cantantes 
d. Añadir y borrar cantantes
*/ 
public class CantanteFamoso {
private String nombre;
private int Ventas;
private String GeneroMusical;
public CantanteFamoso() {
	this.nombre="";
	this.Ventas=0;
	this.GeneroMusical="";
}
public CantanteFamoso(String nombre,int Ventas,String GeneroMusical) {
	this.nombre=nombre;
	this.Ventas=Ventas;
	this.GeneroMusical=GeneroMusical;
}

public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getVentas() {
	return Ventas;
}
public void setVentas(int ventas) {
	Ventas = ventas;
}
public String getGeneroMusical() {
	return GeneroMusical;
}
public void setGeneroMusical(String generoMusical) {
	GeneroMusical = generoMusical;
}

public String toString() {
	String resultado="";
	resultado="Mi nombre es"+this.nombre+" mi genero musical es "+this.GeneroMusical + " y mis ventas son "+ this.Ventas;
	return resultado;
}


}
