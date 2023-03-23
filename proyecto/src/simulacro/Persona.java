package simulacro;

public class Persona {
private double IMC;
private String clasificacionOMS;
private String descripicionPopular;
private double peso;
private double talla;
private int edad;
private String sexo;
private String DNI;



public Persona() {
	this.IMC=0;
	this.clasificacionOMS="";
	this.descripicionPopular="";
	this.peso=0;
	this.talla=0;
	this.edad=0;
	this.sexo="";
	this.DNI="";
	
}
public Persona(String clasificacionOMS,String descripcionPopular,int peso,double talla,int edad,String sexo) {
	
	this.clasificacionOMS=clasificacionOMS;
	this.descripicionPopular=descripcionPopular;
	this.peso=peso;
	this.talla=0;
	this.IMC=this.calcularIMC();
	this.edad=edad;
	this.sexo=sexo;
	
}

public int getEdad() {
	return edad;
}
public boolean setEdad(int edad) {
	boolean correcto=true;
	if(edad<=0) {
		correcto=false;
	
	}else {
			this.edad = edad;
	}
	return correcto;
}
public String getSexo() {
	return sexo;
}
public void setSexo(String sexo) {
	this.sexo = sexo;
}
public String getDNI() {
	return DNI;
}

public double getPeso() {
	return peso;
}
public boolean setPeso(double peso) {
	boolean correcto=true;
	if(peso<=0) {
		correcto=false;
	
	}else {
			this.peso = peso;
			this.IMC=this.calcularIMC();
	}
	return correcto;

}
public double getTalla() {
	return talla;
}
public boolean setTalla(double talla) {
	boolean correcto=true;
	if(talla<=0) {
		correcto=false;
	
	}else {
			this.talla = talla;
			this.IMC=this.calcularIMC();
	}
	return correcto;
}
public double getIMC() {
	return IMC;
}
public String getClasificacionOMS() {
	return clasificacionOMS;
}
public void setClasificacionOMS(String clasificacionOMS) {
	this.clasificacionOMS = clasificacionOMS;
}
public String getDescripicionPopular() {
	return descripicionPopular;
}
public void setDescripicionPopular(String descripicionPopular) {
	this.descripicionPopular = descripicionPopular;
}
public double calcularIMC() {
	return this.peso/Math.pow(this.talla,2);
}


public String toString() {
	return "Mi DNI es "+this.DNI+" mi IMC es " +this.calcularIMC()+" Mi clasificacion OMS "+this.clasificacionOMS;
}
public String clasificacionOMS() {
	String resultado="";

	if(this.IMC<18.5) {
		this.clasificacionOMS="Bajo Peso";
		this.descripicionPopular="Delgado";
		resultado=this.clasificacionOMS+this.descripicionPopular;	
		
	}else if(this.IMC>18.5 && IMC<24.9) {
		this.clasificacionOMS="Adecuado";
		this.descripicionPopular="Delgado";
		resultado=this.clasificacionOMS+this.descripicionPopular;	
		
	}else if(this.IMC>25 && IMC<29.9) {
		this.clasificacionOMS="Sobrepeso";
		this.descripicionPopular="TODOS SOMOS PERFECTOS MIENTRAS NO AFECTE A NUESTRA SALUD(QUE ESTAS GORDO PICHA)";
		resultado=this.clasificacionOMS+this.descripicionPopular;	
	}else if(this.IMC>30 && IMC<34.9) {
		this.clasificacionOMS="Obesidad grado 1";
		this.descripicionPopular="Obesidad";
		resultado=this.clasificacionOMS+this.descripicionPopular;
	}else if(this.IMC>35 && IMC<39.9) {
		this.clasificacionOMS="Obesidad grado 2";
		this.descripicionPopular="Obesidad";
		resultado=this.clasificacionOMS+this.descripicionPopular;
	}else if(this.IMC>40) {
		this.clasificacionOMS="Obesidad grado 3";
		this.descripicionPopular="Obesidad";
		resultado=this.clasificacionOMS+this.descripicionPopular;
}
	return resultado;
}
}
