package ArraysList;

import java.util.ArrayList;
import java.util.Collections;

public class ArraysPersona {
private ArrayList<Persona>ArraysPersona;
public ArraysPersona() {
	this.ArraysPersona=new ArrayList<Persona>();
}
public ArrayList<Persona> getArraysPersona() {
	return ArraysPersona;
}
public void setArraysPersona(ArrayList<Persona> arraysPersona) {
	ArraysPersona = arraysPersona;
}
public void Añadir(Persona p) {
	ArraysPersona.add(p);
}
public void Invertir() {
	Collections.reverse(this.ArraysPersona);
}
public Persona consultar(int index) {
	return this.ArraysPersona.get(index);
}
public String consultarNombre(int index) {
	return this.ArraysPersona.get(index).getNombre();
}
public String consultarApellidos(int index) {
	return this.ArraysPersona.get(index).getApellidos();
}

public Persona consultar(Persona p) {
	int index=this.ArraysPersona.indexOf(p);
	return this.ArraysPersona.get(index);
}
public String consultaNombre(Persona p) {
	int index=this.ArraysPersona.indexOf(p);
	return this.ArraysPersona.get(index).getNombre();
}
public String consultaApellido(Persona p) {
	int index=this.ArraysPersona.indexOf(p);
	return this.ArraysPersona.get(index).getApellidos();
}
public ArrayList<Persona> consultar(){
	return this.ArraysPersona;
}
public ArrayList<String> consultarNombre() {
	ArrayList<String>nombres=new ArrayList<String>();
	for(int i=0; i<this.ArraysPersona.size();i++) {
		nombres.add(this.ArraysPersona.get(i).getNombre());
	}
	return nombres;
}
public ArrayList<String> consultarApellidos() {
	ArrayList<String>Apellidos=new ArrayList<String>();
	for(int i=0; i<this.ArraysPersona.size();i++) {
		Apellidos.add(this.ArraysPersona.get(i).getApellidos());
	}
	return Apellidos;
}
}
