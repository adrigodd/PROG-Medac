package linea;

public class profundidad {
	private int z;

	
	public profundidad() {
		this.z=0;
	}
	public profundidad(int z) {
		this.z=z;
	}
	
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	public String toString() {
		return "("+ + this.z+")";
	}
	public void moverZ(int distancia) {
		this.z+=distancia; // this.y =  this.y+distancia;
	
	}
}
