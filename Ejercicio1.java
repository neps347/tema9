import java.util.ArrayList;

public class Ejercicio1 {

	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<String>();
		//delcaro e inicializado
		
		lista.add("Susana");
		lista.add("Julio");
		lista.add("Suso");
		lista.add("Pedro");
		lista.add("Samuel");
		lista.add("Chasna");
		lista.add("Grazdaa");
		
		System.out.println("contenido de la lista: ");
		for (String alumno : lista) {
			System.out.println(alumno);
		}
	}

}
