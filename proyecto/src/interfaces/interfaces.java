package interfaces;

public class interfaces implements IReproductorMusical{
	private String marca;
	private String modelo;
	private int capacidadAlmacenamiento;
	private boolean reproduceSonido;
	private boolean reproduceVideo;
	private String tipodeAlmacenamiento;
	private String tipoDeBateria;
	private String pantalla;
	private int Autonomia;
	private double peso;
	private double ancho;
	private double alto;
	private double grosor;
	public interfaces(String marca,String modelo,String tipodeAlmacenamiento){
		this.marca = marca;
		this.modelo = modelo;
		this.tipodeAlmacenamiento=tipodeAlmacenamiento;
	}
	public interfaces(double tamanyoDeLaPantalla) {
		// TODO Auto-generated constructor stub
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	@Override
	public int getCapacidadAlmacenamiento() {
		// TODO Auto-generated method stub
		return capacidadAlmacenamiento;
	}

	@Override
	public void setCapacidadAlmacenamiento(int capacidadAlmacenamiento) {
		this.capacidadAlmacenamiento=capacidadAlmacenamiento;
		
	}

	@Override
	public boolean getreproduceSonido() {
		
		return reproduceSonido;
	}

	@Override
	public void getreproduceSonido(boolean reproduceSonido) {
		this.reproduceSonido=reproduceSonido;
		
	}

	@Override
	public boolean getreproduceVideo() {
		
		return reproduceVideo;
	}

	@Override
	public void getreproduceVideo(boolean reproduceVideo) {
		this.reproduceVideo=reproduceVideo;
		
	}

	@Override
	public String gettipodeAlmacenamiento() {
		// TODO Auto-generated method stub
		return tipodeAlmacenamiento;
	}

	@Override
	public void settipodeAlmacenamiento(String tipodeAlmacenamiento) {
	this.tipodeAlmacenamiento=tipodeAlmacenamiento;
		
	}

	@Override
	public String getpantalla() {
		
		return pantalla;
	}

	@Override
	public void setpantalla(String pantalla) {
		this.pantalla=pantalla;
		
	}

	@Override
	public String gettipoDeBateria() {
		
		return tipoDeBateria;
	}

	@Override
	public void settipoDeBateria(String tipoDeBateria) {
		this.tipoDeBateria=tipoDeBateria;
		
	}

	@Override
	public int getAutonomia() {
		
		return Autonomia;
	}

	@Override
	public void setAutonomia(int Autonomia) {
	this.Autonomia=Autonomia;
		
	}

	@Override
	public double getpeso() {
		
		return peso;
	}

	@Override
	public void setpeso(double peso) {
		this.peso=peso;
		
	}

	@Override
	public double getancho() {
		// TODO Auto-generated method stub
		return ancho;
	}

	@Override
	public void setancho(double ancho) {
		this.ancho=ancho;
		
	}

	@Override
	public double getalto() {
		
		return alto;
	}

	@Override
	public void setalto(double alto) {
		this.alto=alto;
		
	}

	@Override
	public double getgrosor() {
			return grosor;
	}

	@Override
	public void setgrosor(double grosor) {
	this.grosor=grosor;
	}
}