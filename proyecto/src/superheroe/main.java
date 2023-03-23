package superheroe;

public class main {

	public static void main(String[] args) {
		superheroe ez=new superheroe("Adri");
		ez.setDescripcion("HOLA BUENAS TARDES ERES TREMENDO GAY");
		System.out.println(ez.toString());
		Dimension tu=new Dimension(-12,21.2,12.4);
		tu.getVolumen();
		System.out.println(tu);
	}

}
