package interfaces;

public interface IReproductoVideo {
public final boolean reproduceWMV=true;
public final boolean reproduceDIVX=true;
public final boolean reproduceMPG=true;
public final boolean reproduceDVD=true;
public final boolean reproduceJPG=true;
public final double tamanyoDeLaPantalla=0;
public final boolean television=true;
public boolean isreproduceWMV();
public void setreproduceWMV(boolean reproduceWMV);
public boolean isreproduceDIVX();
public void setreproduceDIVX(boolean reproduceDIVX);
public boolean isreproduceDVD();
public void setreproduceDVD(boolean reproduceDVD);
public boolean isreproduceJPG();
public void setreproduceJPG(boolean reproduceJPG);
public boolean islevision();
public void setlevision(boolean television);


}
