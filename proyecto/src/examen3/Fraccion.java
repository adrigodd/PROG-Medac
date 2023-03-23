package examen3;

public class Fraccion implements IOperable{
private int dividendo;
private int divisor;
public Fraccion(int dividendo,int divisor) {
	this.dividendo=dividendo;
	this.dividendo=divisor;
	

	}

	public int getDividendo() {
	return dividendo;
}

public void setDividendo(int dividendo) {
	this.dividendo = dividendo;
}

public int getDivisor() {
	return divisor;
}

public void setDivisor(int divisor) {
	this.divisor = divisor;
}

	@Override
	public void Sumar(int suma) {
		suma=suma*this.divisor;
		this.dividendo=this.dividendo+suma;
		
	}

	@Override
	public void Restar(int resta) {
		resta=resta*this.divisor;
		this.dividendo=this.dividendo-resta;
		
	}

	@Override
	public void Multiplicar(int mult) {
		this.dividendo=this.dividendo*mult;
		
	}

	@Override
	public void Dividir(int division) {
		this.divisor=this.divisor*division;
		
	}

}
