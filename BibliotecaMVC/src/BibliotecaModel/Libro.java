/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BibliotecaModel;

/**
 *
 * @author DAMA
 */
public class Libro {
    private String isbn;
    private String titulo;
    private String autor;
     public Libro(String isbn, String titulo, String autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
    }
     public String getIsbn() {
    return isbn;
}

public String getTitulo() {
    return titulo;
}

public String getAutor() {
    return autor;
}
@Override
public String toString() {
    return "ISBN: " + isbn +
           ", Titulo: " + titulo +
           ", Autor: " + autor;
}
}
