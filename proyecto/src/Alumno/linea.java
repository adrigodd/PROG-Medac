package Alumno;

public class linea {
	private punto p1;
	private punto p2;
public linea() {
	this.p1=new punto();
	this.p2=new punto();
}
public linea(int x,int y){
	this.p1=new punto();
	this.p2=new punto(x,y);

}
public linea(int x1,int y1,int x2,int y2){
	this.p1=new punto(x1,y1);
	this.p2=new punto(x2,y2);

}
public linea(int x,int y){
	this.p1=new punto();
	this.p2=new punto(x,y);

}
public punto getP1() {
	return p1;
}
public void setP1(punto p1) {
	this.p1 = p1;
}
public punto getP2() {
	return p2;
}
public void setP2(punto p2) {
	this.p2 = p2;
}


}