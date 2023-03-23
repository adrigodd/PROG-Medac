package ExamenED;

import java.util.ArrayList;




public class listaCantantesFamoso extends CantanteFamoso {
	private ArrayList<CantanteFamoso>listaCantantesFamosos;
	private CantanteFamoso Cantante;
	
	
	public listaCantantesFamoso() {
		this.listaCantantesFamosos=new ArrayList<CantanteFamoso>();
		this.Cantante=new CantanteFamoso();
		
	}


	

	public CantanteFamoso getCantante() {
		return Cantante;
	}


	public void setCantante(CantanteFamoso cantante) {
		Cantante = cantante;
	}


	public ArrayList<CantanteFamoso> getArray() {
		return listaCantantesFamosos;
	}

	public void setArray(ArrayList<CantanteFamoso> array) {
		listaCantantesFamosos = array;
	}
	public void añadirCantante(CantanteFamoso Famoso) {
		this.listaCantantesFamosos.add(Famoso);
	}
	public void borrarCantante(CantanteFamoso Famoso) {
		this.listaCantantesFamosos.remove(Famoso);
	}
	
public void MismoGenero(String genero) {
	for(int i=0;i<this.listaCantantesFamosos.size();i++) {
		if(this.Cantante.getGeneroMusical().equals(genero));
		this.listaCantantesFamosos.get(i);
		
	}
}
	public void Imprimir() {
		for(int i=0;i<this.listaCantantesFamosos.size();i++) {
			System.out.println(this.listaCantantesFamosos.get(i));
		}
		
	}
	public void MasVentas() {
		for(int i=0;i<this.listaCantantesFamosos.size();i++) {
			if(this.Cantante.getVentas()>this.Cantante.getVentas()) {
				
			}
			
			
		}
	}

	

	
	
}
