package interfaces;

public interface iReproductorAudio extends IReproductorMusical{
	public boolean isReproduceAudioCDS();
	public void setReproduceAudioCDS(boolean reproduceAudioCDS) throws Exception;
	public boolean isReproduceMP3();
	public void setReproduceMP3(boolean reproduceMP3);
	public boolean isReproduceWMA();
	public void setReproduceWMA(boolean reproduceWMA);
	public boolean isReproduceVorbis();
	public void setReproduceVorbis(boolean reproduceVorbis);
	public boolean isAccesoCarpetas();
	public void setAccesoCarpetas(boolean accesoCarpetas);
	public boolean isRadio();
	public void setRadio(boolean radio);
	public boolean isGrabacionVoz();
	public void setGrabacionVoz(boolean grabacionVoz);

}
