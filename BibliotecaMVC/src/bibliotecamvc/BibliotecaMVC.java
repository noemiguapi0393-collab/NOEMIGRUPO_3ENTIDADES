/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bibliotecamvc;
import java.util.Scanner;
import BibliotecaController.GestionBiblioteca;
import BibliotecaModel.Libro;
import BibliotecaModel.Usuario;
import BibliotecaModel.Prestamo;
import BibliotecaView.MenuPrincipal;

public class BibliotecaMVC {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        MenuPrincipal vista = new MenuPrincipal();
        GestionBiblioteca gestion = new GestionBiblioteca();
        int opcion;
        do {
            opcion = vista.mostrarMenu();
            switch (opcion) {
                
                case 1:
                    vista.limpiarBuffer();
                    System.out.println("\n=== REGISTRO DE LIBRO ===");

                    System.out.print("ISBN: ");
                    String isbn = leer.nextLine();

                    System.out.print("Titulo: ");
                    String titulo = leer.nextLine();

                    System.out.print("Autor: ");
                    String autor = leer.nextLine();
                    Libro nuevoLibro = new Libro(isbn, titulo, autor);
                    gestion.registrarLibro(isbn, nuevoLibro);
                    
                        break;
                    
                   
                case 2:
                    vista.limpiarBuffer();
                    System.out.println("\n=== REGISTRO DE USUARIO ===");
                    System.out.print("Cedula: ");
                    String cedula = leer.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = leer.nextLine();
                    Usuario nuevoUsuario = new Usuario(cedula, nombre);
                   gestion.registarUsuario(nuevoUsuario);
                    break;
                case 3:
                    vista.limpiarBuffer();
                    System.out.println("\n=== REGISTRO DE PRESTAMO ===");

                    System.out.print("Codigo: ");
                    String codigo = leer.nextLine();

                    System.out.print("Fecha: ");
                    String fecha = leer.nextLine();

                    Prestamo nuevoPrestamo = new Prestamo(codigo, fecha);

                    gestion.registrarPrestamo(nuevoPrestamo);
                    break;
                case 4:
                    System.out.println("\n===== REPORTE DE LIBROS =====");

                    if (gestion.getMapaLibros().isEmpty()) {
                    System.out.println("No existen libros registrados.");
                    } else {
                     for (Libro libro : gestion.getMapaLibros().values()) {
                     System.out.println(libro);
                    }
                         }

                    System.out.println("\n===== REPORTE DE USUARIOS =====");

                    if (gestion.getListaUsuarios().isEmpty()) {
                    System.out.println("No existen usuarios registrados.");
                    } else {
                    for (Usuario usuario : gestion.getListaUsuarios()) {
                    System.out.println(usuario);
                    }
                        }
                        
                    System.out.println("\n===== REPORTE DE PRESTAMOS =====");

                    if (gestion.getListaPrestamos().isEmpty()) {
                    System.out.println("No existen prestamos registrados.");
                    } else {
                    for (Prestamo prestamo : gestion.getListaPrestamos()) {
                    System.out.println(prestamo);
                    }
                            }
                        break;
                case 5:
                    System.out.println("\n>>> [SOPORTE]: Contacte al administrador del sistema.");
                    break;
                case 6:
                    System.out.println("\n>>> Cerrando sesion... Que tenga un excelente dia");
                    break;
                default:
                    System.out.println("Opcion invalida. Por favor, digite un numero del 1 al 6.");
                   
            }
        } while (opcion != 6);
    }
}