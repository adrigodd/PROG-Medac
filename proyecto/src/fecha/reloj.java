	package fecha;

public class reloj {
private int hora;
private int minutos;
private int segundos;
private int horarandom;
public  reloj() {
	this.hora=0;
	this.minutos=0;
	this.segundos=0;
	this.horarandom=0;
	}
public reloj(int hora,int minutos,int segundos) {
	if(hora<1|| minutos<1||segundos<1||hora>24||minutos>60||segundos>60) {
		this.hora=0;
		this.minutos=0;
		this.segundos=0;
	}else if(hora>12) {
	this.hora=hora;
	this.minutos=minutos;
	this.segundos=segundos;

	
	
	}
	
}
public boolean comprobarHora() {
	boolean correcto=true;
	if(hora<1|| minutos<0||segundos<0||hora>24||minutos>60||segundos>60) {
		correcto=false;
	}else {
		correcto=true;
	}
	return correcto;
	
}

public int getHorarandom() {
	return horarandom;
}
public void setHorarandom(int horarandom) {
	this.horarandom = horarandom;
}
public int getHora() {
	return hora;
}
public void setHora(int hora) {
	this.hora = hora;
}
public int getMinutos() {
	return minutos;
}
public void setMinutos(int minutos) {
	this.minutos = minutos;
}
public int getSegundos() {
	return segundos;
}
public void setSegundos(int segundos) {
	this.segundos = segundos;
}
public boolean HoraPM(){
	boolean PM=true;
	if(hora>12) {
		PM=true;
	}else {
		PM=false;
	}
	return PM;
		
	}
public String toString() {
	String resultado="";
	if(hora>12) {
		this.horarandom=hora-12;
		 resultado = this.horarandom+":"+this.minutos+":"+this.segundos+"pm";
	}else {
		 resultado = this.hora+":"+this.minutos+":"+this.segundos+"am";
	}
	
	return resultado;
		
		
	}
public int cambiarHora(int hora,int minutos,int segundos) {
	this.hora=hora;
	this.minutos=minutos;
	return this.segundos=0;
}
public int cambiarHoraMinutos0(int hora,int minutos,int segundos) {
	this.hora=hora;
	this.segundos=segundos;
	return this.minutos=0;
	
}

}

