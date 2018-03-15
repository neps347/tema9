

public class copiado {


public static void main(String[] args) {
        
        String titulo, autor = null;
        int ejemplares;

        //se crea el objeto libro1 utilizando el constructor con parámetros
        Libro libro1 = new Libro(" El Quijote de La Mancha.", "Miguel de Cervantes.", 2);
        //se crea el objeto libro2 utilizando el constructor por defecto
        Libro libro2 = new Libro("El Capitán Alatriste." , "Arturo Pérez Reverte" , 1);

    

        //se muestran por pantalla los datos del objeto libro1
        //se utilizan los métodos getters para acceder al valor de los atributos
        System.out.println("Libro 1:");
        System.out.println("Titulo: " + libro1.dime_titulo());
        System.out.println("Autor: " + libro1.dime_autores());
        System.out.println("Ejemplares: " + libro1.dime_ejemplaresdisponibles());
        
        //System.out.println();



        //mostrar los datos del objeto libro2
        System.out.println("Libro 2:");
        System.out.println("Titulo: " + libro2.dime_titulo());
        System.out.println("Autor: " + libro2.dime_autores());
        System.out.println("Ejemplares: " + libro2.dime_ejemplaresdisponibles());
        
        System.out.println();
    }
}