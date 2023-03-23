package examen3;

public abstract class Animal {
protected String familia;
protected String especie;
protected String reino;
protected boolean vivo;
public Animal() {
	this.familia="";
	this.especie="";
	this.reino="";
	this.vivo=true;
}
public Animal(String familia,String especie,String reino,boolean vivo) {
	this.familia=familia;
	this.especie=especie;
	this.reino=reino;
	this.vivo=vivo;
}
public boolean isVivo() {
	return vivo;
}
public void setVivo(boolean vivo) {
	this.vivo = vivo;
}
public String getFamilia() {
	return familia;
}
public void setFamilia(String familia) {
	this.familia = familia;
}
public String getEspecie() {
	return especie;
}
public void setEspecie(String especie) {
	this.especie = especie;
}
public String getReino() {
	return reino;
}
public void setReino(String reino) {
	this.reino = reino;
}
public abstract String sonido();
public abstract String comer();
public abstract boolean reproduccion();

}
