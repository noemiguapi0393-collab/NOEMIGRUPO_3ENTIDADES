/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BibliotecaController;

import BibliotecaModel.Libro;
import BibliotecaModel.Usuario;
import BibliotecaModel.Prestamo;
import java.util.ArrayList;
import java.util.HashMap;


/**
 *
 * @author DAMA
 */
public class GestionBiblioteca {
  private HashMap<String, Libro> mapaLibros;  
  
  private ArrayList<Usuario> ListaUsuarios;
  private ArrayList<Prestamo> ListaPrestamo;
  
  public GestionBiblioteca(){
      this.mapaLibros = new HashMap<>();
      this.ListaUsuarios = new ArrayList<>();
      this.ListaPrestamo = new ArrayList<>();
  }
  public void registrarLibros(String isbn, Libro libro){
      mapaLibros.put(isbn, libro);
      System.out.println("Libro guardado con exito");
  }
  public void registarUsuario(Usuario usuario){
      ListaUsuarios.add(usuario);
      System.out.println("Usuario guardado con exito");
  }
  
}
