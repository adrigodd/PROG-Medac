package interfaces;

public interface IReproductorMusical {
public final String CD="CD";
public final String DVD="DVD";
public final String MemoriaFlash="MemoriaFlash";
public final String Minidisk="Minidisk";
public final int MB=0;
public final String Ninguna="Ninguna";
public final String texto="texto";
public final String Monocromo="Monocromo";
public final String Color="Color";
public String getMarca();
public void setMarca(String marca);
public String getModelo();
public void setModelo(String modelo);
public int getCapacidadAlmacenamiento(); 
public void setCapacidadAlmacenamiento(int capacidadAlmacenamiento);
public boolean getreproduceSonido();
public void getreproduceSonido(boolean reporduceSonido);
public boolean getreproduceVideo();
public void getreproduceVideo(boolean reporduceVideo);
public String gettipodeAlmacenamiento();
public void settipodeAlmacenamiento(String tipodeAlmacenamiento); 
public String getpantalla(); 	
public void  setpantalla(String pantalla); 
public String gettipoDeBateria();
public void settipoDeBateria(String tipoDeBateria);
public int getAutonomia();
public void setAutonomia(int Autonomia);
public double getpeso();
public void setpeso(double peso);
public double getancho();
public void setancho(double ancho);
public double getalto();
public void setalto(double alto);
public double getgrosor();
public void setgrosor(double grosor);
}
