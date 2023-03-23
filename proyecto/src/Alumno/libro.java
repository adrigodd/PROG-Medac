package Alumno;

public class libro {
 private int ISBN;
 private String titulo;
 private String Autor;
 private int año;
 private int numeroDePaginas;
 private boolean prestado;
 private String disponible;
 //Constructor vacio
 public libro() {
	this.ISBN=0;
	this.titulo="";
	this.Autor="";
	this.año=0;
	this.numeroDePaginas=0;
	this.prestado=false;
	
	
 }
 //Constructor con parametros
 public libro(int ISBN,String titulo, String Autor, int año, int numeroDePaginas, boolean prestado) {
	 this.ISBN=ISBN;
	 this.titulo=titulo;
	 this.Autor=Autor;
	 this.año=año;
	 this.numeroDePaginas=numeroDePaginas;
	 this.prestado=prestado;
	 
 }
 
 public int getISBN() {
	 return this.ISBN;
	
 }
 public String gettitulo() {
	 return this.titulo;
	 
 }
 public String getAutor() {
	 return this.Autor;
	 
 }
 public int getaño() {
	 return this.año;
 }
 public int getnumeroDePaginas() {
	 return this.numeroDePaginas;
 }
 public boolean getprestado() {
	 return this.prestado;
	
 }
 public void setISBN(int ISBN) {
	 this.ISBN=ISBN;
 }
 public void settitulo(String titulo) {
	 this.titulo=titulo;
 }
 public void setAutor(String Autor) {
	 this.Autor=Autor;;
 }
 public void setaño(int año){
	 this.año=año;
	 
 }
 
 public void setnumeroDePaginas(int numeroDePaginas) {
	 this.numeroDePaginas=numeroDePaginas;
 }
 public void setprestado(boolean prestado) {
	 this.prestado=prestado;
 }
 public void  prestar() {
	 this.prestado=true;
 }
 public String toString() {
	System.out.println("El libro"+titulo+"con ISBN"+ISBN+"y creado por "+Autor+"en "+año+"tiene "+numeroDePaginas);
	return null;
	 
 }
}
