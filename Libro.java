
public class Libro {
//private static String titulo;
//private static String autor;
//private static String ejemplares;
private String titulo;
private boolean ejemplaresprestados;
private  String autor;
private  int ejemplares;
//private int ejemplaresprestados;




//Métodos
public Libro(String titulo, String autor, int ejemplares)
{
    this.titulo = titulo;
    this.autor = autor;
    this.ejemplares = ejemplares;
    this.ejemplaresprestados = ejemplaresprestados;
}



//public String toString (){
  //  String mensaje = "El libro se llama " + titulo + " " + autor + " con " +
    //                 ejemplares + " ejemplares ";
    //return mensaje;
//}
//boolean ejemplaresprestados;
//
//public Libro() {
	//titulo="El Quijote de La Mancha.";
	//autor="Miguel de Cervantes.";
	//ejemplares="dos";
	//}
	
public String dime_titulo() {
	
	return "" + titulo;
}

public String dime_autores() {
	return " " + autor;
}



public String dime_ejemplaresdisponibles() {
	return " Los ejemplares disponibles son " + ejemplares;
	
}
//public void establece_ejemplares() {
	//ejemplares="dos";
//}

public void establece_titulo(String titulo_libro) {
	//titulo="El Quijote de La Mancha.";
	titulo=titulo_libro;
}
public void establece_autor() {
	autor="Miguel de Cervantes.";
}

public void quedan_libros(String ejemplaresprestados){
	
	if(ejemplaresprestados=="si") {
this.ejemplaresprestados=true;
}
	else {
	this.ejemplaresprestados=false;
}
}
public String dime_cuantos() {
	
	if(ejemplaresprestados==true) {
		
		return " El libro tiene unidades disponibles ";
}
else {
	return " El libro no tiene unidades disponibles";

}
	//public void prestamo
}


}

//public String dime_titulo() {
	//return " El titulo del libro es " + color;


//}

