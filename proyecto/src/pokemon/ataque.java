package pokemon;

public class ataque {
private int potencia;
private String tipoAtaque;
private String tipoDaño;
private int PP;
private int precision;
private boolean prioridad;
private double chanceVeneno;
private double chanceParalisis;
private double chanceQuemar;
private double chanceDormir;
private double chanceConfundir;
private double chanceCongelar;
private double multbuff=1.5;
private double multdebuff=0.5;
public ataque(int potencia, String tipoAtaque, String tipoDaño, int pP, int precision, boolean prioridad,
		double chanceVeneno, double chanceParalisis, double chanceQuemar, double chanceDormir, double chanceConfundir,
		double chanceCongelar, double multbuff, double multdebuff) {
	
	this.potencia = potencia;
	this.tipoAtaque = tipoAtaque;
	this.tipoDaño = tipoDaño;
	PP = pP;
	this.precision = precision;
	this.prioridad = prioridad;
	this.chanceVeneno = chanceVeneno;
	this.chanceParalisis = chanceParalisis;
	this.chanceQuemar = chanceQuemar;
	this.chanceDormir = chanceDormir;
	this.chanceConfundir = chanceConfundir;
	this.chanceCongelar = chanceCongelar;
	this.multbuff = multbuff;
	this.multdebuff = multdebuff;
}
public int getPotencia() {
	return potencia;
}
public void setPotencia(int potencia) {
	this.potencia = potencia;
}
public String getTipoAtaque() {
	return tipoAtaque;
}
public void setTipoAtaque(String tipoAtaque) {
	this.tipoAtaque = tipoAtaque;
}
public String getTipoDaño() {
	return tipoDaño;
}
public void setTipoDaño(String tipoDaño) {
	this.tipoDaño = tipoDaño;
}
public int getPP() {
	return PP;
}
public void setPP(int pP) {
	PP = pP;
}
public int getPrecision() {
	return precision;
}
public void setPrecision(int precision) {
	this.precision = precision;
}
public boolean isPrioridad() {
	return prioridad;
}
public void setPrioridad(boolean prioridad) {
	this.prioridad = prioridad;
}
public double getChanceVeneno() {
	return chanceVeneno;
}
public void setChanceVeneno(double chanceVeneno) {
	this.chanceVeneno = chanceVeneno;
}
public double getChanceParalisis() {
	return chanceParalisis;
}
public void setChanceParalisis(double chanceParalisis) {
	this.chanceParalisis = chanceParalisis;
}
public double getChanceQuemar() {
	return chanceQuemar;
}
public void setChanceQuemar(double chanceQuemar) {
	this.chanceQuemar = chanceQuemar;
}
public double getChanceDormir() {
	return chanceDormir;
}
public void setChanceDormir(double chanceDormir) {
	this.chanceDormir = chanceDormir;
}
public double getChanceConfundir() {
	return chanceConfundir;
}
public void setChanceConfundir(double chanceConfundir) {
	this.chanceConfundir = chanceConfundir;
}
public double getChanceCongelar() {
	return chanceCongelar;
}
public void setChanceCongelar(double chanceCongelar) {
	this.chanceCongelar = chanceCongelar;
}
public double getMultbuff() {
	return multbuff;
}
public void setMultbuff(double multbuff) {
	this.multbuff = multbuff;
}
public double getMultdebuff() {
	return multdebuff;
}
public void setMultdebuff(double multdebuff) {
	this.multdebuff = multdebuff;
}
}
