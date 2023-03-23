package automovil;

public class ventana {
	private boolean ventanaIzquierda;
	private boolean  ventanaDerecha;
	public ventana() {
		
		this.ventanaDerecha=false;
		this.ventanaIzquierda=false;
	}
	public ventana(boolean ventanaDerecha,boolean ventanaIzquierda) {
		this.ventanaDerecha=ventanaDerecha;
		this.ventanaIzquierda=ventanaIzquierda;
		
	}
	
	public boolean isVentanaIzquierda() {
		return ventanaIzquierda;
	}
	public void setVentanaIzquierda(boolean ventanaIzquierda) {
		this.ventanaIzquierda = ventanaIzquierda;
	}
	public boolean isVentanaDerecha() {
		return ventanaDerecha;
	}
	public void setVentanaDerecha(boolean ventanaDerecha) {
		this.ventanaDerecha = ventanaDerecha;
	}
	public void AbrirCerrarventanaDerecha(boolean abierta) {
		if(abierta==true) {
			ventanaDerecha=true;
		}else {
			ventanaDerecha=false;
		}
		
	}
	public void AbrirCerrarventanaIzquierda(boolean abierta) {
		if(abierta==true) {
			ventanaIzquierda=true;
		}else {
			ventanaIzquierda=false;
		}
	}

	}

