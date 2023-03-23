package ajedrez;

public class reina extends figura {
	public reina(char Columna,int Fila) {
		super(Columna,Fila);
		this.Columna=Columna;
		this.Fila=Fila;
		
		
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
	public boolean comprobarmovimientoTorre(char torreColumna, int torreFila) {
		boolean movimiento=true;
	if(this.Columna==torreColumna||this.Fila==torreFila) {
		movimiento=true;
	}else {
		movimiento=false;
	}
	return movimiento;
	}
	
	public boolean comprobarmovimientoReina(char Columna,int Fila) {
		boolean movimiento=true;
		if(comprobarmovimientoTorre(Columna, Fila)||
		comprobarmovimientoDerechaArriba(Columna, Fila)||
		comprobarmovimientoDerechaAbajo(Columna, Fila)||
		comprobarmovimientoIzquierdaArriba(Columna, Fila)||
		comprobarmovimientoIzquierdaAbajo(Columna, Fila)) {
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
		if(this.comprobarmovimientoReina(Columna, Fila)) {
			return true;
		}else {
			return false;
		}
		
	}
}
