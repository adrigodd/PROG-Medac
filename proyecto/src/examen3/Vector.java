package examen3;

public class Vector implements IOperable{
private int[]arraisito;
	public Vector(int[]arraisito) {
	arraisito=new int[5];
	

	}
	
	public int[] getArraisito() {
		return arraisito;
	}

	public void setArraisito(int[] arraisito) {
		this.arraisito = arraisito;
	}
	

	public void Sumar(int suma) {
		for(int i =0;i<arraisito.length;i++) {
			this.arraisito[i]=this.arraisito[i]+suma;
		}
		
	}

	@Override
	public void Restar(int resta) {
		for(int i =0;i<arraisito.length;i++) {
			this.arraisito[i]=this.arraisito[i]-resta;
		}
		
	}

	@Override
	public void Multiplicar(int mult) {
		for(int i =0;i<arraisito.length;i++) {
			this.arraisito[i]=this.arraisito[i]*mult;
		}
		
	}

	@Override
	public void Dividir(int division) {
		for(int i =0;i<arraisito.length;i++) {
			this.arraisito[i]=this.arraisito[i]/division;
		}
		
		
	}

}
