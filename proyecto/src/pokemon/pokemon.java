package pokemon;

public class pokemon {
private String nombre;
private String tipo1;
private String ata1;
private String ata2;
private String ata3;
private String ata4;
private String tipo2;
private int lvl=50;


public pokemon() {
this.nombre="missigno";
this.tipo1="normal";
this.tipo2=null;

}
public pokemon (String nombre,String tipo1,String ata1,String ata2,String ata3,String ata4) {
	this.nombre=nombre;
	this.tipo1=tipo1;
	this.tipo2=tipo2;
	this.ata1=ata1;
	this.ata2=ata2;
	this.ata3=ata3;
	this.ata4=ata4;
	
}
public pokemon (String nombre,String tipo1,String tipo2,String ata1,String ata2,String ata3,String ata4) {
	this.nombre=nombre;
	this.tipo1=tipo1;
	this.tipo2=null;
	this.ata1=ata1;
	this.ata2=ata2;
	this.ata3=ata3;
	this.ata4=ata4;;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getTipo1() {
	return tipo1;
}
public void setTipo1(String tipo1) {
	this.tipo1 = tipo1;
}
public String getTipo2() {
	return tipo2;
}
public void setTipo2(String tipo2) {
	this.tipo2 = tipo2;
}
public int getLvl() {
	return lvl;
}
public void setLvl(int lvl) {
	this.lvl = lvl;
}
public String toString() {
	String resultado;
	if (this.tipo2!=null) {
		resultado=this.nombre+"es de tipo "+this.tipo1+"y de tipo"+this.tipo2;
		
	}else {
		resultado=this.nombre+"es de tipo "+this.tipo1;
	}
	return resultado;
}

	
}
