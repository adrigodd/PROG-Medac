package ajedrez;

public class alfil extends figura {
public alfil(char Columna,int Fila) {
	super(Columna,Fila);
	this.Columna=Columna;
	this.Fila=Fila;
	
}
@Override
public boolean ComprobarMovimiento(char Columna, int Fila) {
	boolean movimiento=false;
	comprobarmovimientoDerechaArriba(Columna, Fila);
	comprobarmovimientoIzquierdaArriba(Columna, Fila);
	comprobarmovimientoDerechaAbajo(Columna, Fila);
	comprobarmovimientoIzquierdaAbajo(Columna, Fila);
	if(comprobarmovimientoDerechaArriba(Columna, Fila)||comprobarmovimientoIzquierdaArriba(Columna, Fila)||comprobarmovimientoDerechaAbajo(Columna, Fila)||comprobarmovimientoIzquierdaAbajo(Columna, Fila)) {
	movimiento=true;
	}else {
		movimiento=false;
	}
	return movimiento;
	}
	
	

public void moverFicha( char alfilColumna, int alfilFila){
	comprobarmovimientoDerechaArriba(alfilColumna, alfilFila);
	comprobarmovimientoIzquierdaArriba(alfilColumna, alfilFila);
	comprobarmovimientoDerechaAbajo(alfilColumna, alfilFila);
	comprobarmovimientoIzquierdaAbajo(alfilColumna, alfilFila);

	if(comprobarmovimientoDerechaArriba(alfilColumna, alfilFila)||comprobarmovimientoIzquierdaArriba(alfilColumna, alfilFila)||comprobarmovimientoDerechaAbajo(alfilColumna, alfilFila)||comprobarmovimientoIzquierdaAbajo(alfilColumna, alfilFila)) {
		this.Columna=alfilColumna;
		this.Fila=alfilFila;
	}
}

public boolean comprobarmovimientoDerechaArriba(char alfilColumna, int alfilFila) {
	boolean movimiento=false;
	for (int i=1;i<=8;i++) {
		if((alfilColumna==(this.Columna+i))&&(alfilFila==(this.Fila-i))){
			movimiento=true;
		}
		
		}
	return movimiento;
	}

	

public boolean comprobarmovimientoIzquierdaArriba(char alfilColumna, int alfilFila) {
	
	boolean movimiento=false;
	for (int i=1;i<=8;i++) {
		if((alfilColumna==(this.Columna-i))&&(alfilFila==(this.Fila-i))){
			movimiento=true;
		}
		
		}
	return movimiento;
	}

public boolean comprobarmovimientoDerechaAbajo(char alfilColumna, int alfilFila) {
	boolean movimiento=false;
	for (int i=1;i<=8;i++) {
		if((alfilColumna==(this.Columna+i))&&(alfilFila==(this.Fila+i))){
			movimiento=true;
		}
		
		}
	return movimiento;

}
public boolean comprobarmovimientoIzquierdaAbajo(char alfilColumna, int alfilFila) {
	boolean movimiento=false;
	for (int i=1;i<=8;i++) {
		if((alfilColumna==(this.Columna-i))&&(alfilFila==(this.Fila+i))){
			movimiento=true;
		}
		
		}
	return movimiento;
}
public String toString() {
	String resultado="";
	resultado="Soy una alfil y estoy en ("+this.Columna+","+this.Fila+")";
	return resultado;
}


}