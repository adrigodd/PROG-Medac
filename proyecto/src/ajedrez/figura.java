package ajedrez;

public abstract class figura {
	 protected char Columna;
	protected int Fila;
	public figura() {
		this.Columna='A';
		this.Fila=0;
	}
	public figura(char Columna,int Fila) {
		this.Columna=Columna;
		this.Fila=Fila;
	}
	 
	 
	 public char getTorreColumna() {
		return Columna;
		
	}
	public void setTorreColumna(char torreColumna) {
		if(torreColumna<'A' && torreColumna>'H') {
			
		}else {
			this.Columna = torreColumna;
		}
		
	}
	public abstract boolean ComprobarMovimiento(char Columna,int Fila);
	public int getTorreFila() {
		return Fila;
	}
	public void setTorreFila(int torreFila) {
	if(torreFila<1 && torreFila>8) {
			
		}else {
			this.Fila = torreFila;
		}
}
}
