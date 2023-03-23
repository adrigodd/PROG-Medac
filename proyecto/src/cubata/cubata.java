package cubata;

public class cubata {
	private String alcohol;
	private String mezcla;
	private int numeroHielos;
	private boolean naranja;
	private boolean limon;
	private int capacidadMaxima;
	private int capacidadActual;



	public cubata(	) {
		this.alcohol="";
		this.mezcla="";
		this.naranja=false;
		this.numeroHielos=0;
		this.limon=false;
		this.capacidadMaxima=470;
		this.capacidadActual=0;
	}
		public cubata(String alcohol,String mezcla, int numeroHielos, boolean naranja, boolean limon, int capacidadMaxima, int capacidadActual) {
			this.alcohol=alcohol;
			this.mezcla=mezcla;
			this.naranja=naranja;
			this.numeroHielos=numeroHielos;
			this.limon=limon;
			this.capacidadMaxima=capacidadMaxima;
			this.capacidadActual=capacidadMaxima;
			if(capacidadMaxima>0) {
				this.capacidadActual=capacidadActual;
				this.capacidadMaxima=capacidadMaxima;
			}else{
				this.capacidadActual=470;
				this.capacidadActual=470;
			}
		}
	
	public String getalcohol() {
		return this.alcohol;
		
	}
	public String getmezcla() {
		return this.mezcla;
		
	}
	public boolean getnaranja() {
		return this.naranja;
		
	}
	public boolean getlimon() {
		return this.limon;
		
	}
	public int getnumeroHielos() {
		return this.numeroHielos;
		
	}
	
	public int getcapacidadMaxima() {
		return this.capacidadMaxima;
		
	}
	public int getcapacidadActual() {
		return this.capacidadActual;
		
	}
	public String mezcla (String mezcla) {
		return this.mezcla=mezcla;
	
		
	}
	public int numeroHielos() {
		return this.numeroHielos=numeroHielos;
	
		
	}
	public int capacidadMaxima () {
		return this.capacidadMaxima=capacidadMaxima;
		
		
	}
	public int capacidadActual() {
		return this.capacidadActual=capacidadActual;
	
		
	}
	public void llenar() {
		this.capacidadActual=capacidadMaxima;
		
	}
	public void beberuntrago() {
		this.capacidadActual=capacidadMaxima-80;
		
	}
	public void echarunhielo() {
		this.numeroHielos++;
		
	}
	public void aguarse() {
		this.capacidadActual=capacidadActual+50;
		this.numeroHielos++;
		
	}
	public void hidalgo() {
		this.capacidadActual=0;
		
	}
}	