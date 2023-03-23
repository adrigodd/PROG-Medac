package ajedrez;

public class rey extends figura {
	public rey(char Columna,int Fila) {
		super(Columna,Fila);
		this.Columna=Columna;
		this.Fila=Fila;
		
	}
	public boolean comprobarmovimientoRey(char Columna,int Fila) {
		boolean resultado=false;
		if(comprobarmovimientoTorre(Columna,Fila)||
				comprobarmovimientoDerechaArriba(Columna,Fila)||
				comprobarmovimientoIzquierdaArriba(Columna,Fila)||
				comprobarmovimientoIzquierdaAbajo(Columna,Fila)||
				comprobarmovimientoDerechaAbajo(Columna,Fila)){
			resultado=true;
			
		}
		return resultado;
	}
	public boolean comprobarmovimientoTorre(char torreColumna, int torreFila) {
		boolean movimiento=false;
	if((torreColumna==this.Columna && torreFila==this.Fila+1)||
		(torreColumna==this.Columna && torreFila==this.Fila-1)||
		(torreColumna==this.Columna-1 && torreFila==this.Fila)||
		(torreColumna==this.Columna+1 && torreFila==this.Fila)){
		movimiento=true;
	}
	return movimiento;
	}
	public boolean comprobarmovimientoDerechaArriba(char alfilColumna, int alfilFila) {
		boolean movimiento=false;
		
			if((alfilColumna==(this.Columna+1))&&(alfilFila==(this.Fila-1))){
				movimiento=true;
			}
			
			
		return movimiento;
		}

		

	public boolean comprobarmovimientoIzquierdaArriba(char alfilColumna, int alfilFila) {
		
		boolean movimiento=false;
				if((alfilColumna==(this.Columna-1))&&(alfilFila==(this.Fila-1))){
				movimiento=true;
			}
			
			
		return movimiento;
		}

	public boolean comprobarmovimientoDerechaAbajo(char alfilColumna, int alfilFila) {
		boolean movimiento=false;
	
			if((alfilColumna==(this.Columna+1))&&(alfilFila==(this.Fila+1))){
				movimiento=true;
			
			
			}
		return movimiento;

	}
	public boolean comprobarmovimientoIzquierdaAbajo(char alfilColumna, int alfilFila) {
		boolean movimiento=false;
		
			if((alfilColumna==(this.Columna-1))&&(alfilFila==(this.Fila+1))){
				movimiento=true;
			}
			
			
		return movimiento;
	}
	@Override
	public boolean ComprobarMovimiento(char Columna, int Fila) {
		if(this.comprobarmovimientoRey(Columna, Fila)) {
			return true;
		}else {
			return false;
		}
	
	}
}
