/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bibliotecamvc;
import java.util.Scanner;
import BibliotecaController.GestionBiblioteca;
import BibliotecaModel.Libro;
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
                case 0:
                    System.out.println("\n>>> [MODO DESARROLLO]: Pruebas de conexión internas exitosas.");
                       
                    break;
                case 1:
                    System.out.println("\n>>> [REGISTRO]: Abriendo formulario de Libros...");
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
                    System.out.println("\n>>> [REGISTRO]: Abriendo formulario de Usuarios...");
                    break;
                case 3:
                    System.out.println("\n>>> [REGISTRO]: Abriendo formulario de Préstamos...");
                    break;
                case 4:
                    System.out.println("\n>>> [REPORTES]: Generando listados del sistema...");
                    break;
                case 5:
                    System.out.println("\n>>> [SOPORTE]: Contacte al administrador del sistema.");
                    break;
                case 6:
                    System.out.println("\n>>> Cerrando sesión... ¡Que tenga un excelente día!");
                    break;
                default:
                    System.out.println("\nXXXXXXXXXXXXXX [ERROR] XXXXXXXXXXXXXX");
                    System.out.println("Opción inválida. Por favor, digite un número del 1 al 6.");
                    System.out.println("XXXXXXXXXXXXXXXX****************XXXXX");
            }
        } while (opcion != 6);
    }
}