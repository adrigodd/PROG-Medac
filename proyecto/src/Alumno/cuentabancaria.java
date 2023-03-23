package Alumno;

public class cuentabancaria {
private String titular;
private double saldo;
private int  cantidad;
private String cantidadnegativa;
private String noretirar;
private int transferir;

//Constructor vacio
public cuentabancaria() {
	this.titular="";
	this.saldo=0;
	this.cantidadnegativa="";
	this.noretirar="";
	this.transferir=0;
}
//Constructor con parametros
public cuentabancaria(String titular, double saldo, int cantidad, String cantidadnegativa, String noretirar,int transferir) {
	this.titular=titular; 
	this.saldo=saldo;
	this.cantidad=cantidad;
	this.cantidadnegativa="Al ser cantidad negativa no se añadira";
	this.noretirar="Como no hay dinero no se puede retirar nada";
	this.transferir=transferir;
}
//getters
public String gettitular() {
	return this.titular;
	
}
public String gettitular() {
	return this.titular;
	
}
//getters
public double getsaldo() {
	return this.saldo;
	
}
public double getcantidad() {
	return this.cantidad;
	
}
public String getnoretirar() {
	return this.noretirar;
}
//Setters
	public void settitular(String titular) {
		this.titular=titular;
	}
	public void setcantidad(int cantidad) {
		this.cantidad=cantidad;
	}
	//Setters
		public void setsaldo(double saldo) {
			this.saldo=saldo;
		}
		//metodos especificos
		public String incrementar ;String cantidadnegativa() {
			if (cantidad>0) {
			this.saldo=saldo+cantidad;
			}else {
			
			
			return cantidadnegativa;
			}
			return cantidadnegativa;
		
			}
		public String  retirar() {
			if (saldo>0) {
				this.saldo=saldo-cantidad;
			}else {
				return this.noretirar;
			}
			return cantidadnegativa;
		
			
		}
		public int trasnferir() {
			if (saldo>transferir) {
				this.saldo=saldo-transferir;
			}
			return cantidad;
		}
		
}