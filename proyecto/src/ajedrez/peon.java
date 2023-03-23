package ajedrez;

public class peon extends figura {
	private boolean blanco;
	public peon() {
		this.blanco=true;
	}
	public peon(char Columna,int Fila,boolean blanco) {
		super(Columna,Fila);
		this.Columna=Columna;
		this.Fila=Fila;
		this.blanco=blanco;
		
	}
	
	public boolean isBlanco() {
		return blanco;
	}

	public void setBlanco(boolean blanco) {
		this.blanco = blanco;
	}

	public String toString() {
		String resultado="";
		resultado="Soy una alfil y estoy en ("+this.Columna+","+this.Fila+")";
		return resultado;
	}
	
	public boolean comprobarmovimientoPeon(char Columna,int Fila){
		boolean movimiento=false;
		if(this.blanco) {
			if(this.Fila==2) {
			if((Columna==this.Columna)&&(Fila==this.Fila+2)){
				movimiento=true;
			}
		}
		if((Columna==this.Columna)&&(Fila==this.Fila+1)) {
			movimiento=true;
		}
		if((Columna==this.Columna-1)&&(Fila==this.Fila+1)) {
			movimiento=true;
		}else if((Columna==this.Columna+1)&&(Fila==this.Fila+1)) {
			movimiento=true;
		}
		}else {
			if(this.Fila==7) {
				if((Columna==this.Columna)&&(Fila==this.Fila-2)){
					movimiento=true;
				}
			}
			if((Columna==this.Columna)&&(Fila==this.Fila-1)) {
				movimiento=true;
			}
			if((Columna==this.Columna+1)&&(Fila==this.Fila-1)) {
				movimiento=true;
			}else if((Columna==this.Columna-1)&&(Fila==this.Fila-1)) {
				movimiento=true;
			}
		}
		
		return movimiento;
	}
	@Override
	public boolean ComprobarMovimiento(char Columna, int Fila) {
		if(this.comprobarmovimientoPeon(Columna, Fila)) {
			return true;
		}else {
			return false;
		}
		
	}
	}

