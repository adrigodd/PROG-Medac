package ExamenED;

import ArraysList.Persona;

public class main {

	public static void main(String[] args) {
		listaCantantesFamoso arra=new listaCantantesFamoso();
		CantanteFamoso a=new CantanteFamoso("a",10,"a");
		
		CantanteFamoso b=new CantanteFamoso("a",11,"a");
		arra.añadirCantante(a);
		arra.añadirCantante(b);
	
		System.out.println(arra);
	}

}
