package examen3;

public class Pato extends Animal {

	public Pato(String familia,String especie,String reino,boolean vivo) {
		super(familia,especie,reino,vivo);
		this.familia=familia;
		this.especie=especie;
		this.reino=reino;
		this.vivo=vivo;
	}

		@Override
		public String sonido() {
			String resultado="";
			resultado="CUAC CUAC(como soy un pato hago cuac xd)";
			return resultado;
		}
		@Override
		public String comer() {
			String resultado="";
			resultado="Me como la carne porque soy carníííííííívoro.";
			return resultado;
		}
		@Override
		public boolean reproduccion() {
			boolean SECSO=true;
				if(this.vivo) {
					SECSO=true;
				}else {
					SECSO=false;
				}
			
			return SECSO;
		}

	}
