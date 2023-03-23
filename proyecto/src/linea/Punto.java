package linea;

public class Punto {
	private int x;
	private int y;
	private profundidad z;
	
	public profundidad getZ() {
		return z;
	}
	public void setZ(profundidad z) {
		this.z = z;
	}
	public Punto() {
		this.x=0;
		this.y=0;
		this.z=new profundidad();
	}
	public Punto(int x, int y,profundidad z) {
		this.x=x;
		this.y=y;
		this.z=z;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public String toString() {
		return "(" + this.x + ","+this.y+")";
	}
	public void moverV(int distancia) {
		this.y+=distancia; // this.y =  this.y+distancia;
	}
	public void moverH(int distancia) {
		this.x+=distancia;
	}
	public void moverZ(int distancia) {
		this.z.moverZ(distancia); // this.y =  this.y+distancia;
	
	}
}

