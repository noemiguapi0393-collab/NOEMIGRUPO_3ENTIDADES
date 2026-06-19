/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bibliotecamvc;

// Importamos la vista para que el Main pueda usar el menú
import BibliotecaView.MenuPrincipal;

public class BibliotecaMVC {

    public static void main(String[] args) {
        // Creamos el objeto del menú interactivo
        MenuPrincipal vista = new MenuPrincipal();
        
        int opcion;

        // Bucle repetitivo para que el menú no se cierre solo
        do {
            opcion = vista.mostrarMenu();
            
            // Switch-case para evaluar la opción marcada
            switch (opcion) {
                case 1:
                    System.out.println("\n[Acción]: Has seleccionado Registrar Libro.");
                    break;
                    
                case 2:
                    System.out.println("\n[Acción]: Has seleccionado Registrar Usuario.");
                    break;
                    
                case 3:
                    System.out.println("\n[Acción]: Has seleccionado Registrar Préstamo.");
                    break;
                    
                case 4:
                    System.out.println("\n[Acción]: Has seleccionado Mostrar Reportes.");
                    break;
                    
                case 5:
                    System.out.println("\nSaliendo del sistema de biblioteca... ¡Hasta luego!");
                    break;
                    
                default:
                    System.out.println("\n[ERROR]: Opción no válida. Intenta de nuevo.");
            }
            
        } while (opcion != 5);
    }
}
