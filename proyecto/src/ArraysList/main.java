package ArraysList;

public class main {

	public static void main(String[] args) {
		ArraysPersona arra=new ArraysPersona();
		Persona Adri= new Persona("Adrian","Sanchez Nieto");
		Persona CALPED= new Persona("CALPED","Sanchez Nieto");
		arra.Añadir(CALPED);
		arra.Añadir(Adri);
		arra.Invertir();
		System.out.println(arra);
		System.out.println(arra.consultaNombre(CALPED));
	}

}
