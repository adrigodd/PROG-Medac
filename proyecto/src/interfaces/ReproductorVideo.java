package interfaces;

public class ReproductorVideo extends interfaces implements IReproductoVideo {



	public ReproductorVideo(String marca, String modelo, String tipodeAlmacenamiento) {
		super(marca, modelo, tipodeAlmacenamiento);
		// TODO Auto-generated constructor stub
	}
	public ReproductorVideo(double tamanyoDeLaPantalla) {
		super(tamanyoDeLaPantalla);
	}

	@Override
	public boolean isreproduceWMV() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setreproduceWMV(boolean reproduceWMV) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isreproduceDIVX() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setreproduceDIVX(boolean reproduceDIVX) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isreproduceDVD() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setreproduceDVD(boolean reproduceDVD) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isreproduceJPG() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setreproduceJPG(boolean reproduceJPG) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean islevision() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setlevision(boolean television) {
		// TODO Auto-generated method stub
		
	}

}
