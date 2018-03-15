Public class Libros() 
{

    // Atributos
    private String titulo;
    private String autor;
    private int ejemplares;

    // Métodos
    public Libros(String titulo, String autor, int ejemplares)
    {
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
    }

    public String toString (){
        String mensaje = "El libro se llama " + titulo + " " + autor + " con " +
                         ejemplares + " ejemplares ";
        return mensaje;
    }
}