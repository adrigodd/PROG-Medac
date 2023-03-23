package examen2;

public abstract class Profesor1 {
protected String Nombre;
protected int Edad;
protected String Asignatura;
public Profesor1() {
	this.Nombre="";
	this.Edad=0;
	this.Asignatura="";	

}

public Profesor1(String nombre, int edad, String asignatura) {
	this.Nombre = nombre;
	this.Edad = edad;
	this.Asignatura = asignatura;
}

public String getNombre() {
	return Nombre;
}

public void setNombre(String nombre) {
	Nombre = nombre;
}

public int getEdad() {
	return Edad;
}

public void setEdad(int edad) {
	if(edad<0) {
		
	}else {
		Edad = edad;
	}
	
}

public String getAsignatura() {
	return Asignatura;
}

public void setAsignatura(String asignatura) {
	Asignatura = asignatura;
}
public  abstract String fraseCaracterística();
public abstract String horaDeLlegada();
}
public abstract boolean descansito();
}
