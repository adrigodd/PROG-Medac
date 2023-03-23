package examen2;

public class Luis extends Profesor1 {
	public Luis(String nombre, int edad, String asignatura) {
		super(nombre,edad,asignatura);
		this.Nombre = nombre;
		this.Edad = edad;
		this.Asignatura = asignatura;
	}

	@Override
	public String fraseCaracterística() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String horaDeLlegada() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean descansito() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
