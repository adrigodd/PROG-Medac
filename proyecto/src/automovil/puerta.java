package automovil;

public class puerta {
	private boolean PuertaDerecha;
	private boolean puertaIzquierda;
	private ventana ventanaDerecha;
	private ventana ventanaIzquierda;
	public puerta() {
		this.PuertaDerecha="";
		this.puertaIzquierda="";
		this.ventanaIzquierda=new ventana();
		this.ventanaDerecha=new ventana();
	
	}
	public puerta(boolean PuertaDerecha,boolean puertaIzquierda,ventana ventanaDerecha) {
		this.PuertaDerecha=PuertaDerecha;
		this.puertaIzquierda=puertaIzquierda;
		this.ventanaDerecha=new ventana();
		this.ventanaIzquierda=new ventana();
		
				
	}
	
	public boolean isPuertaDerecha() {
		return PuertaDerecha;
	}
	public void setPuertaDerecha(boolean puertaDerecha) {
		PuertaDerecha = puertaDerecha;
	}
	public boolean isPuertaIzquierda() {
		return puertaIzquierda;
	}
	public void setPuertaIzquierda(boolean puertaIzquierda) {
		this.puertaIzquierda = puertaIzquierda;
	}
	public ventana getVentanaDerecha() {
		return ventanaDerecha;
	}
	public void setVentanaDerecha(ventana ventanaDerecha) {
		this.ventanaDerecha = ventanaDerecha;
	}
	public ventana getVentanaIzquierda() {
		return ventanaIzquierda;
	}
	public void setVentanaIzquierda(ventana ventanaIzquierda) {
		this.ventanaIzquierda = ventanaIzquierda;
	}
	public void AbrirCerrarventanaIzquierda(boolean abierta) {
		if(abierta==true) {
			puertaIzquierda=true;
		}else {
			puertaIzquierda=false;
		
		
	}
}
