package pokemon2;

public class MainPokemon {
//	Cree un programa que te deje consultar la información de un Pokemon. La
//	información de un Pokemon consistirá en la siguiente: Número en la pokédex, tipo
//	del pokémon y descripción del pokémon. El programa debe permitir consultar la
//	información de 5 pokemongos a vuestra elección(tanto la información completa
//	como una en específico). Utilice únicamente ArrayList unidimensional.
	public static void main(String[] args) {
		pokemon bulbasaur = new pokemon("Bulbasaur",1,"Es un Bulbasaur","Planta");
		pokemon ivysaur = new pokemon("Ivysaur",2,"Es un Ivysaur","Planta y Veneno");
		pokemon venusaur = new pokemon("Venusaur",3,"Es un Venusaur","Planta y Veneno");
		pokemon charmander = new pokemon("Charmander",7,"Es un Charmander","Fuego");
		
		ArraysPokemon arra= new ArraysPokemon();
		arra.añadirPokemon(bulbasaur);
		arra.añadirPokemon(ivysaur);
		arra.añadirPokemon(venusaur);
		arra.añadirPokemon(charmander);
		
		arra.borrarPokemon("Planta y Veneno");
		System.out.println(arra);
	}
	
}
