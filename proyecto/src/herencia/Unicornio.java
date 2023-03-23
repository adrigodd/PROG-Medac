package herencia;

public class Unicornio extends animalitos{
	private int tamañoCuerno;
	private int edad;
	public Unicornio(String reino, String familia, String especie, String rama,int tamañoCuerno, int edad) {
		super(reino,familia,especie,rama);
		this.tamañoCuerno = tamañoCuerno;
		this.edad = edad;
	}
	
	public String poderDeCuerno() {
		return "==> 7u7";
	}

	@Override
	public String sonido() {
		return "Linda y bella flor amor de primavera hoy vy a darte motivos para que asi tu me quieeeeras";
	}
	
}
	