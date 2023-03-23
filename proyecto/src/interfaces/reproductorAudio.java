package interfaces;

public class reproductorAudio extends interfaces implements iReproductorAudio {

	private boolean reproduceAudioCDs,reproduceMP3,reproduceWMA,reproduceVorbis,accesoPorCarpetas,radio,grabacionDeVoz;
	public boolean isReproduceAudioCDs() {
		return reproduceAudioCDs;
	}
	public void setReproduceAudioCDs(boolean reproduceAudioCDs) throws Exception {
		if(this.gettipodeAlmacenamiento().equals(CD)) {
			this.reproduceAudioCDs = reproduceAudioCDs;
		}else {
			throw new Exception("NO ES UN CD");
		}
	}
	public boolean isReproduceMP3() {
		return reproduceMP3;
	}
	public void setReproduceMP3(boolean reproduceMP3) {
		this.reproduceMP3 = reproduceMP3;
	}
	public boolean isReporduceWMA() {
		return reproduceWMA;
	}
	public void setReporduceWMA(boolean reporduceWMA) {
		this.reproduceWMA = reporduceWMA;
	}
	public boolean isReproduceVorbis() {
		return reproduceVorbis;
	}
	public void setReproduceVorbis(boolean reproduceVorbis) {
		this.reproduceVorbis = reproduceVorbis;
	}
	public boolean isAccesoPorCarpetas() {
		return accesoPorCarpetas;
	}
	public void setAccesoPorCarpetas(boolean accesoPorCarpetas) {
		this.accesoPorCarpetas = accesoPorCarpetas;
	}
	public boolean isRadio() {
		return radio;
	}
	public void setRadio(boolean radio) {
		this.radio = radio;
	}
	public boolean isGrabacionDeVoz() {
		return grabacionDeVoz;
	}
	public void setGrabacionDeVoz(boolean grabacionDeVoz) {
		this.grabacionDeVoz = grabacionDeVoz;
	}
	
	@Override
	public boolean isReproduceAudioCDS() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void setReproduceAudioCDS(boolean reproduceAudioCDS) throws Exception {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean isReproduceWMA() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void setReproduceWMA(boolean reproduceWMA) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean isAccesoCarpetas() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void setAccesoCarpetas(boolean accesoCarpetas) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean isGrabacionVoz() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void setGrabacionVoz(boolean grabacionVoz) {
		// TODO Auto-generated method stub
		
	}
	public reproductorAudio(String marca, String modelo, String tipodeAlmacenamiento,boolean reproduceAudioCDS, boolean reproduceMP3,boolean reproduceWMA,boolean reproduceVorbis, boolean reproduceAudioCDs) {
		super(marca, modelo, tipodeAlmacenamiento);
		this.reproduceAudioCDs=reproduceAudioCDs;
		this.reproduceMP3=reproduceMP3;
		this.reproduceVorbis=reproduceVorbis;
		this.reproduceWMA=reproduceWMA;
	}
}


