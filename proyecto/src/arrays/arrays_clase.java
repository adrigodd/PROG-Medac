package arrays;

public class arrays_clase {
private int[]arraisito;
public  arrays_clase() {
	int[]arraisito=new int[3];
}
public arrays_clase(int[] arraisito) {
 this.arraisito=arraisito;
}
public int[] getArraisito() {
	return arraisito;
}
public void setArraisito(int[] arraisito) {
	this.arraisito = arraisito;
}
public String toString() {
	String resultado="";
	resultado=""+this.arraisito[0]+","+this.arraisito[1]+","+this.arraisito[2];
	return resultado;
}
public int productoEscalar(int[]arrays) {
	int resultado=0;
	if(arrays.length>3) {
		
	}else {
		resultado=arrays[0]*this.arraisito[0]+arrays[1]*this.arraisito[1]+arrays[2]*this.arraisito[2];
	}
	
	return resultado;
}
}
			


