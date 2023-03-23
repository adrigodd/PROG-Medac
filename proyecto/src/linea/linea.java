package linea;

public class linea {
	private Punto p1;
	private Punto p2;
	
	public linea() {
		this.p1=new Punto();
		this.p2=new Punto();
	}
	public linea(int x, int y) {
		this.p1=new Punto();
		this.p2=new Punto(x,y);
	}
	public linea(int x1, int y1, int x2, int y2) {
		this.p1=new Punto(x1,y1);
		this.p2=new Punto(x2,y2);
	}
	public linea(Punto p1, Punto p2) {
		this.p1=p1;
		this.p2=p2;
	}
	public Punto getP1() {
		return p1;
	}
	public void setP1(Punto p1) {
		this.p1 = p1;
	}
	public Punto getP2() {
		return p2;
	}
	public void setP2(Punto p2) {
		this.p2 = p2;
	}
	
	public String toString() {
		return this.p1 + " hasta " + this.p2;// (3,5) hasta (4,6)
	}
	
	public void desplazarV(int distancia) {
		this.p1.moverV(distancia);
		this.p2.moverV(distancia);
	}
	public void desplazarH(int distancia) {
		this.p1.moverH(distancia);
		this.p2.moverH(distancia);
	}
	public void moverZ(int distancia) {
		this.p1.moverZ(distancia);
		this.p2.moverZ(distancia);
	}
}

