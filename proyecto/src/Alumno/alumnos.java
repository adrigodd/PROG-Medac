package Alumno;

public class alumnos {

	
		private String nombre;
		private String DNI;
		private int edad;
		private int CP;
		String sexo;
		
		public alumnos(String nombre ){
			this.setNombre("");
			this.CP =0;
			this.DNI="";
			this.edad=0;
			this.sexo="";
	
			}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
}
