package ArraysList;

public class Persona {
private String Nombre;
private String Apellidos;
public Persona() {
	this.Nombre="";
	this.Apellidos="";
	
}
public Persona(String Nombre, String Apellidos) {
	this.Nombre=Nombre;
	this.Apellidos=Apellidos;
	
}
public String getNombre() {
	return Nombre;
}
public void setNombre(String nombre) {
	Nombre = nombre;
}
public String getApellidos() {
	return Apellidos;
}
public void setApellidos(String apellidos) {
	Apellidos = apellidos;
}
@Override
public String toString() {

return this.Nombre+" "+this.Apellidos;

}
}
