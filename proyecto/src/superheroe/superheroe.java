package superheroe;

public class superheroe {
private String Nombre;
private String Descripcion;
private boolean Capa;
public superheroe() {
	this.Nombre="";
	this.Descripcion="";
	this.Capa=false;

}
	

public superheroe(String Nombre) {
	 this.Nombre=Nombre;
	 this.Descripcion="";
	 this.Capa=false;
	
}
public String getNombre() {
	return Nombre;
}
public void setNombre(String nombre) {
	Nombre = nombre;
}
public String getDescripcion() {
	return Descripcion;
}
public void setDescripcion(String descripcion) {
	Descripcion = descripcion;
}
public boolean isCapa() {
	return Capa;
}
public void setCapa(boolean capa) {
	Capa = capa;
}
public String toString() {
	String resultado="";
	if(this.Capa==false) {
		resultado="Su nombre es "+this.Nombre+" su descripcion es   "+this.Descripcion+" y no lleva capa";
	}else {
		resultado="Su nombre es "+this.Nombre+" su descripcion es   "+this.Descripcion+" y  lleva capa";
	}
	
	return resultado;
	
}
}
