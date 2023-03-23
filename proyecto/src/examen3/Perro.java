package examen3;


	public class Perro extends Animal {

		public Perro(String familia,String especie,String reino,boolean vivo) {
			super(familia,especie,reino,vivo);
			this.familia=familia;
			this.especie=especie;
			this.reino=reino;
			this.vivo=vivo;
		}

			@Override
			public String sonido() {
				String resultado="";
				resultado="GUAU GUAU DAME DE COMER PORFAVOR QUE SOY UN PERRO CHICO";
				return resultado;
			}
			@Override
			public String comer() {
				String resultado="";
				resultado="Lo que me de la mama";
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

