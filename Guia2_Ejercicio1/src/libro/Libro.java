/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
Autor, Número de páginas, y un constructor con todos los atributos pasados por
parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los
datos al usuario y luego informar mediante otro método el número de ISBN, el título,
el autor del libro y el numero de páginas.

*/

package libro;

public class Libro {
    
    private String isbn;
    private String titulo;
    private String autor;
    private int nroPaginas;

    public Libro() {
    }

    public Libro(String isbn, String titulo, String autor, int nroPaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.nroPaginas = nroPaginas;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNroPaginas() {
        return nroPaginas;
    }

    public void setNroPaginas(int nroPaginas) {
        this.nroPaginas = nroPaginas;
    }


    public String imprimir() {
        String libro = "---Libro---";
        libro += " ISBN: " + isbn + ",";
        libro += " Titulo: " + titulo + ",";
        libro += " Autor: " + autor + ",";
        libro += " Nº Paginas: " + nroPaginas + ".";
        return libro;
    }
    
    public void cargarLibro(String isbn, String titulo, String autor, int nroPag){
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.nroPaginas = nroPag;
    }
    
    
}