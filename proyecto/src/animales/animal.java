package animales;

public class animal {
	private String Nombre;
	private int patas;
	private String Tipo;
	private String Alimentacion;
	private boolean respirar;
	
	public animal() {
		this.Nombre="";
		this.patas=0;
		this.Tipo="";
		this.Alimentacion="";
		this.respirar=true;
		
	}
	public animal(String Nombre,int patas,String Tipo,String Alimentacion,boolean respirar) {
		this.Nombre=Nombre;
		this.patas=patas;
		this.Tipo=Tipo;
		this.Alimentacion=Alimentacion;
		this.respirar=respirar;
	}
	
	public boolean isRespirar() {
		return respirar;
	}
	public void setRespirar(boolean respirar) {
		this.respirar = respirar;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public int getPatas() {
		return patas;
	}
	public void setPatas(int patas) {
		this.patas = patas;
	}
	public String getTipo() {
		return Tipo;
	}
	public void setTipo(String tipo) {
		Tipo = tipo;
	}
	public String getAlimentacion() {
		return Alimentacion;
	}
	public void setAlimentacion(String alimentacion) {
		Alimentacion = alimentacion;
	}
	
	public String toString() {
		String resultado="";
		if(this.respirar) {
			resultado="El animal se llama "+this.Nombre+" tiene "+this.patas+" patas "+" es de tipo "+this.Tipo+" y es "+this.Alimentacion+" y esta respirando";
		
		}else {
			resultado="El animal se llama "+this.Nombre+" tiene "+this.patas+" patas "+" es de tipo "+this.Tipo+" y es "+this.Alimentacion+" y no esta respirando";
			
		}
		
		return resultado;
		
	}
}

