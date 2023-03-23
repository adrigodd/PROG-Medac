package Alumno;

public class fraccion {
/*Cree una clase Fraccion con ,etodos para sumar restar multiplicar y dividir*/
	private int dividendo;
	private int divisor;
	public fraccion() {
		this.dividendo=1;
		this.divisor=1;
	}
	public fraccion(int dividendo,int divisor){
		this.dividendo=dividendo;
		this.divisor=divisor;
	}
	public int getdividendo() {
	return this.dividendo;
}
	public int getdivisor() {
		return this.divisor;
	}
	public void  setdividendo(int dividendo) {
		this.dividendo=dividendo;
	}
	public void setdivisor(int divisor) {
		this.divisor=divisor;
	}
	public String toString() {
		return this.dividendo+"/"+this.divisor;
	}
	public fraccion sumar(fraccion fraccion){
		int nuevoDenominador=this.divisor*fraccion.divisor;
		int nuevonum1=this.dividendo*fraccion.divisor;
		int nuevonum2=this.divisor*fraccion.dividendo;
		return new fraccion(nuevonum1+nuevonum2,nuevoDenominador);
		
	}
	public fraccion restar(fraccion fraccion) {
		int nuevoDenominador=this.divisor*fraccion.divisor;
		int nuevonum1=this.dividendo*fraccion.divisor;
		int nuevonum2=this.divisor*fraccion.dividendo;
		return new fraccion(nuevonum1-nuevonum2,nuevoDenominador);
	}
	public fraccion multiplicar(fraccion fraccion) {
		int nuevoDenominador=this.divisor*fraccion.divisor;
		int nuevonumerador=this.dividendo*fraccion.dividendo;
		int resultado=nuevonumerador/nuevoDenominador;
		return new fraccion(resultado,resultado);
	}
}
