package JuegodeDados;

public class Dado {//parametros privados
private int numerodeCaras;
private boolean trucado;


public Dado() {//constructor sin parametros
	this.numerodeCaras=0;
	this.trucado=false;

}
public Dado(int numerodeCaras,boolean trucado) {//constructor con parametros y con filtros
	if(numerodeCaras<1) {
		this.numerodeCaras=0;
	}else {
		this.numerodeCaras=numerodeCaras;
		
}
	this.trucado=trucado;

	}
		
	
	


public int getNumerodeCaras() {//Getters y setters
	return numerodeCaras;
}
public boolean setNumerodeCaras(int numerodeCaras) {
	boolean correcto=true;
	if(this.numerodeCaras<1) {
		correcto=false;
	}else {
		this.numerodeCaras=numerodeCaras;
	}
	return correcto;
}
public boolean isTrucado() {
	return trucado;
}
public void setTrucado(boolean trucado) {
	this.trucado = trucado;
}
	public String toString() {//Metodo toString
		String resultado="";
		if(trucado=true) {
			resultado="El numero de caras es "+this.numerodeCaras+"y está trucado";
		}else {
			resultado="El numero de caras es "+this.numerodeCaras+"y no está trucado";
		}
		return resultado;
		
	}
	public int  Tirar() {//Metodos especificos
		int resultado;
		if(trucado) {
			
			resultado = (int) ((Math.random()*2)+1);
			if(resultado==2) {
				return this.numerodeCaras;
			}else if(resultado==1){
				resultado = (int) ((Math.random()*this.numerodeCaras-1)+1);
			}
		}else {
			
			resultado = (int) ((Math.random()*this.numerodeCaras)+1);
		
		}
		return resultado;
		
	}
}
