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

public class GestionBiblioteca {

    private HashMap<String, Libro> mapaLibros;
    private ArrayList<Usuario> listaUsuarios;
    private ArrayList<Prestamo> listaPrestamos;

    public GestionBiblioteca() {
        mapaLibros = new HashMap<>();
        listaUsuarios = new ArrayList<>();
        listaPrestamos = new ArrayList<>();
    }

    // LIBROS
    public void registrarLibro(String isbn, Libro libro) {
        mapaLibros.put(isbn, libro);
        System.out.println("Libro guardado con exito");
    }

    public void actualizarLibro(String isbn, Libro libro) {
        if (mapaLibros.containsKey(isbn)) {
            mapaLibros.put(isbn, libro);
            System.out.println("Libro actualizado con exito");
        } else {
            System.out.println("Libro no encontrado");
        }
    }

    public void eliminarLibro(String isbn) {
        if (mapaLibros.remove(isbn) != null) {
            System.out.println("Libro eliminado con exito");
        } else {
            System.out.println("Libro no encontrado");
        }
    }

    // USUARIOS
    public void registarUsuario(Usuario usuario) {
        listaUsuarios.add(usuario);
        System.out.println("Usuario guardado con exito");
    }

    public void actualizarUsuario(int posicion, Usuario usuario) {
        if (posicion >= 0 && posicion < listaUsuarios.size()) {
            listaUsuarios.set(posicion, usuario);
            System.out.println("Usuario actualizado con exito");
        } else {
            System.out.println("Usuario no encontrado");
        }
    }

    public void eliminarUsuario(int posicion) {
        if (posicion >= 0 && posicion < listaUsuarios.size()) {
            listaUsuarios.remove(posicion);
            System.out.println("Usuario eliminado con exito");
        } else {
            System.out.println("Usuario no encontrado");
        }
    }

    // PRÉSTAMOS
    public void registrarPrestamo(Prestamo prestamo) {
        listaPrestamos.add(prestamo);
        System.out.println("Préstamo registrado con exito");
    }

    public void actualizarPrestamo(int posicion, Prestamo prestamo) {
        if (posicion >= 0 && posicion < listaPrestamos.size()) {
            listaPrestamos.set(posicion, prestamo);
            System.out.println("Préstamo actualizado con exito");
        } else {
            System.out.println("Préstamo no encontrado");
        }
    }

    public void eliminarPrestamo(int posicion) {
        if (posicion >= 0 && posicion < listaPrestamos.size()) {
            listaPrestamos.remove(posicion);
            System.out.println("Préstamo eliminado con exito");
        } else {
            System.out.println("Préstamo no encontrado");
        }
    }

    // GETTERS
    public HashMap<String, Libro> getMapaLibros() {
        return mapaLibros;
    }

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public ArrayList<Prestamo> getListaPrestamos() {
        return listaPrestamos;
    }
}

