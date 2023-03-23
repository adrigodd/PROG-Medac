package JuegodeDados;

public class main {

	public static void main(String[] args) {
	Dado h=new Dado(15,false);
	h.Tirar();
	
	System.out.println(h);
	System.out.println(h.Tirar());
	System.out.println(h.isTrucado());
	}

}
