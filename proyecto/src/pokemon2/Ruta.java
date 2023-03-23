package pokemon2;

import java.util.ArrayList;

public class Ruta {
	private ArrayList<pokemon> pokemon;

	public ArrayList<pokemon> getPokemon() {
		return pokemon;
	}

	public void setPokemon(ArrayList<pokemon> pokemon) {
		this.pokemon = pokemon;
	}
	public void añadirPokemon(pokemon p) {
		this.pokemon.add(p);
	}
	public void borrarPokemon(pokemon p) {
		this.pokemon.remove(p);
	}
	public void borrarPokemon(int index) {
		this.pokemon.remove(index);
	}
	public void borrarPokemon(String tipo) {
		this.pokemon.removeIf(poke->(poke.getTipo().equals(tipo)));
	}
	public pokemon consultarPokemon(int index) {
		return this.pokemon.get(index);
	}
	public String consultarTipo(int index) {
		return this.pokemon.get(index).getTipo();
	}
	public String consultarDescripcion(int index) {
		return this.pokemon.get(index).getDescripcion();
	}
	public String consultarNombre(int index) {
		return this.pokemon.get(index).getNombre();
	}
	public int consultarID(int index) {
		return this.pokemon.get(index).getId();
	}
	
	@Override
	public String toString() {
		return this.pokemon.toString();
	}
}
