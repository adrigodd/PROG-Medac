package superheroe;

public class Dimension {
private double alto;
private double ancho;
private double profundidad;
private double dimensiones;
public Dimension() {
	this.alto=0;
	this.ancho=0;
	this.profundidad=0;	
	this.dimensiones=0;
}
public Dimension(double alto, double ancho, double profundidad) {
	if(alto<1||ancho<1||profundidad<1) {
		this.alto=0;
		this.ancho=0;
		this.profundidad=0;	
		this.dimensiones=0;
	}else {
	this.alto=alto;
	this.ancho=ancho;
	this.profundidad=profundidad;
	
	}
	
}

public double getDimensiones() {
	return dimensiones;
}
public void setDimensiones(double dimensiones) {
	this.dimensiones = dimensiones;
}
public double getAlto() {
	return alto;
}
public void setAlto(double alto) {
	this.alto = alto;
}
public double getAncho() {
	return ancho;
}
public void setAncho(double ancho) {
	this.ancho = ancho;
}
public double getProfundidad() {
	return profundidad;
}
public void setProfundidad(double profundidad) {
	this.profundidad = profundidad;
}
public double getVolumen() {
	double maximo=0;
	maximo=this.alto*this.ancho*this.profundidad;
	return maximo;
}
public double dimensiones() {
	double dimensiones=0;
	dimensiones=this.alto*this.ancho*this.profundidad;
	return dimensiones;
}
public String toString() {
	String resultado="";
	resultado="El alto es "+this.alto+" el ancho es "+this.ancho+" la profundida es "+this.profundidad+" y el volumen maximo es "+this.getVolumen();
return resultado;
}

}
