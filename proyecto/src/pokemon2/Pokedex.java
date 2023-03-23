package pokemon2;

import java.util.ArrayList;
import java.util.HashMap;

public class Pokedex {
	private HashMap<String,pokemon> miHashMap;
	public Pokedex() {
			pokemon bulbasaur = new pokemon("Bulbasaur",1,"Es un Bulbasaur","Planta");
	pokemon ivysaur = new pokemon("Ivysaur",2,"Es un Ivysaur","Planta y Veneno");
	pokemon venusaur = new pokemon("Venusaur",3,"Es un Venusaur","Planta y Veneno");
	pokemon charmander = new pokemon("Charmander",7,"Es un Charmander","Fuego");
	ArraysPokemon arra=new ArraysPokemon();
	arra.añadirPokemon(charmander);
	arra.añadirPokemon(venusaur);
	arra.añadirPokemon(ivysaur);
	arra.añadirPokemon(bulbasaur);
	miHashMap=new HashMap<String,pokemon>();
	ArrayList<pokemon> pokes=arra.getPokes();
	for(pokemon poke:pokes) {
		miHashMap.put(poke.getNombre(),poke);
	}



	}
}

	
