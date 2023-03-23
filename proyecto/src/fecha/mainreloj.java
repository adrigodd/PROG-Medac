package fecha;

public class mainreloj {

	public static void main(String[] args) {
		reloj hora=new reloj(13,12,43);
		System.out.println(hora);
		hora.cambiarHoraMinutos0(23, 40, 23);	
		System.out.println(hora);
		hora.HoraPM();
		hora.comprobarHora();
		System.out.println(hora.comprobarHora());
		System.out.println(hora.HoraPM());
	
	}

}
