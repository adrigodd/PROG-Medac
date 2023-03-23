package arrays;

public class main {

	public static void main(String[] args) {
		int[] a1= {1,2,3};
		arrays_clase a=new arrays_clase(a1);
		System.out.println(a.toString());
		
		System.out.println(a.productoEscalar(a1));
	}

}
