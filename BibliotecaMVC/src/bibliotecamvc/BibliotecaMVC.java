/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bibliotecamvc;

import BibliotecaView.MenuPrincipal;

public class BibliotecaMVC {

    public static void main(String[] args) {
        MenuPrincipal vista = new MenuPrincipal();
        int opcion;

        // Bucle principal que mantiene el programa ejecutándose hasta elegir salir
        do {
            opcion = vista.mostrarMenu();
            
            switch (opcion) {
                case 0:
                    System.out.println("\n[Modo Desarrollo]: Ejecutando pruebas de conexión interna...");
                    break;
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
                    System.out.println("\n[Soporte]: Para asistencia, contacte al administrador del sistema.");
                    break;
                case 6:
                    System.out.println("\nSaliendo del sistema de biblioteca... ¡Hasta luego!");
                    break;
                default:
                    System.out.println("\nXXXXXXXXXXXXXX [ERROR] XXXXXXXXXXXXXX");
                    System.out.println("Opción inválida. Por favor, digite un número del 1 al 6.");
                    System.out.println("XXXXXXXXXXXXXXXX****************XXXXX");
            }
            
        } while (opcion != 6);
    }
}