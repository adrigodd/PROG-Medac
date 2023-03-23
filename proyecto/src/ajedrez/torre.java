package ajedrez;

public class torre extends figura {
public torre(char Columna,int Fila) {
	super(Columna,Fila);
	this.Columna=Columna;
	this.Fila=Fila;
	
}
public void moverFicha( char torreColumna, int torreFila){
	ComprobarMovimiento(torreColumna, torreFila);
	if(ComprobarMovimiento(torreColumna, torreFila)) {
		this.Columna=torreColumna;
		this.Fila=torreFila;
	}
}
public boolean comprobarMovimientoTorre(char torreColumna, int torreFila) {
	boolean movimiento=true;
if(this.Columna==torreColumna||this.Fila==torreFila) {
	movimiento=true;
}else {
	movimiento=false;
}
return movimiento;
}
public String toString() {
	String resultado="";
	resultado="Soy una torre y estoy en ("+this.Columna+","+this.Fila+")";
	return resultado;
}
@Override
public boolean ComprobarMovimiento(char Columna, int Fila) {
	if(this.comprobarMovimientoTorre(Columna, Fila)) {
		return true;
	}else {
		return false;
	}
	
}

}