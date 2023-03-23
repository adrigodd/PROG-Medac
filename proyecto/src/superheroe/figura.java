package superheroe;

public class figura {
private String Codigo;
private double Precio;
private superheroe Descripcion;
private Dimension dimensiones;
public figura() {
	this.Codigo="";
	this.Precio=0;
	this.Descripcion=new superheroe();
	this.dimensiones=new Dimension();

	
}
public figura(String Codigo,double Precio,String Descripcion,double dimensiones) {
	this.Codigo=Codigo;
	this.Precio=Precio;
	this.Descripcion=new superheroe(Descripcion);

}
public String getCodigo() {
	return Codigo;
}
public void setCodigo(String codigo) {
	Codigo = codigo;
}
public double getPrecio() {
	return Precio;
}
public void setPrecio(double precio) {
	Precio = precio;
}
public superheroe getDescripcion() {
	return Descripcion;
}
public void setDescripcion(superheroe descripcion) {
	Descripcion = descripcion;
}
public Dimension getDimensiones() {
	return dimensiones;
}
public void setDimensiones(Dimension dimensiones) {
	this.dimensiones = dimensiones;
}

}
