package ajedrez;

public class caballo extends figura {
	public caballo(char Columna,int Fila) {
		super(Columna,Fila);
		this.Columna=Columna;
		this.Fila=Fila;
		
	}
	public boolean comprobarmovimiento(char Columna,int Fila) {
		boolean movimiento=false;
		if(((Columna==this.Columna-2)&&(Fila==this.Fila+1))||
				((Columna==this.Columna-2)&&(Fila==this.Fila-1))||
				((Columna==this.Columna-1)&&(Fila==this.Fila-2))||
				((Columna==this.Columna+1)&&(Fila==this.Fila-2))||
				((Columna==this.Columna+2)&&(Fila==this.Fila-1))||
				((Columna==this.Columna+2)&&(Fila==this.Fila+1))||
				((Columna==this.Columna+1)&&(Fila==this.Fila+2))||
				((Columna==this.Columna-1)&&(Fila==this.Fila+2))){
			movimiento=true;
			
		}
		return movimiento;
	}
	@Override
	public boolean ComprobarMovimiento(char Columna, int Fila) {
		if(this.comprobarmovimiento(Columna, Fila)) {
			return true;
		}else {
			return false;
		}
		
	}
}
