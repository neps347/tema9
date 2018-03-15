import java.util.Scanner;





public class Uso_Libro {
	
	Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		Libreria libro1=new Libreria("El Quijote de La Mancha.","Miguel de Cervantes.", 2, 0);
		//System.out.println(" " + Libro1.dime_titulo());
		//System.out.println(Libro1.dime_autor());
		//System.out.println(Libro1.dime_ejemplaresdisponibles());
		
		
		Libreria libro2=new Libreria("Arturo Pérez Reverte.", "El Capitán Alatriste.", 1, 0);
		//libro2.establece_titulo(" El Capitán Alatriste.");
		

        //se muestran por pantalla los datos del objeto libro1
        //se utilizan los métodos getters para acceder al valor de los atributos
        System.out.println("Libro 2:");
        System.out.println("Titulo: " + libro1.getTitulo());
        System.out.println("Autor: " + libro1.getAutor());
        System.out.println("Ejemplares: " + libro1.getEjemplares());
        System.out.println("Prestados: " + libro1.getPrestados());
        System.out.println();
		
        System.out.println("Libro 1:");
        System.out.println("Titulo: " + libro2.getTitulo());
        System.out.println("Autor: " + libro2.getAutor());
        System.out.println("Ejemplares: " + libro2.getEjemplares());
        System.out.println("Prestados: " + libro2.getPrestados());
        System.out.println();
		
		
		
		//System.out.println(libro2);
		
		//System.out.println(libro1.dime_titulo());
		
		//libro1.quedan_libros("si");
		
		
	}

}
