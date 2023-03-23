package examen3;

public class Medusa extends Animal {
	public Medusa(String familia,String especie,String reino,boolean vivo) {
		super(familia,especie,reino,vivo);
		this.familia=familia;
		this.especie=especie;
		this.reino=reino;
		this.vivo=vivo;
	}

		@Override
		public String sonido() {
			String resultado="";
			resultado="GLU GLU GLU";
			return resultado;
		}
		@Override
		public String comer() {
			String resultado="";
			resultado="Normalmente me suelo comer brazos de humanos si esta calentita el agua,si no lo que pille";
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

