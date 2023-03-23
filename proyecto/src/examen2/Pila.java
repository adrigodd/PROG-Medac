package examen2;

public class Pila implements ILista{
	private int[]arraisito;
	private int Capacidad;
	public Pila(int[]arraisito, int Capacidad) {
		arraisito=new int[Capacidad];
		this.Capacidad=Capacidad;
	
	}
	
	@Override
	public int[] getArrays() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setArrays(int[] arraisito) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getCapacidad() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setCapacidad(int Capacidad) {
		// TODO Auto-generated method stub
		
	}
	
public boolean isFull() {
	boolean full=false;
	if(this.arraisito[Capacidad]>=0) {
		full=true;
	}
	return full;
	
}
public boolean isEmpty() {
	boolean Empty=false;
	
		if(this.arraisito[0]==0) {
			Empty=true;
		
	}
	
	return Empty;
	
}
public void Push(int numero) {
	for(int i=0;i<this.Capacidad;i++) {
		if(this.arraisito[i]==0) {
			this.arraisito[i]=numero;
			break;
		}
	}
	
	
}
public void Pop(boolean LIFO) {
	if(LIFO==true) {
		for(int i=this.Capacidad;i<=0;i++) {
		 if(this.arraisito[i]!=0) {
			 this.arraisito[i]=this.arraisito[this.Capacidad-1];
		 }else {
			 break;
		 }
		}
	}else {
			for(int i=0;i<this.Capacidad;i++) {
				 if(this.arraisito[i]!=0) {
					 this.arraisito[i]=this.arraisito[this.Capacidad-1];
				 }else {
					 break;
		}
	}
	
	
	}

}





}
