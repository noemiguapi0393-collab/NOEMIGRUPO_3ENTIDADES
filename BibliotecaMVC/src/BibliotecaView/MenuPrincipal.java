/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BibliotecaView;

import java.util.Scanner;

public class MenuPrincipal {
    // Scanner para leer la opción del usuario
    private Scanner leer = new Scanner(System.in);

    // Método para mostrar el menú y retornar lo que el usuario digite
    public int mostrarMenu() {
        System.out.println("\n=================================");
        System.out.println("    SISTEMA DE BIBLIOTECA MVC    ");
        System.out.println("=================================");
        System.out.println("1. Registrar Libro");
        System.out.println("2. Registrar Usuario");
        System.out.println("3. Registrar Préstamo");
        System.out.println("4. Mostrar Reportes");
        System.out.println("5. Salir");
        System.out.println("=================================");
        System.out.print("Seleccione una opción: ");
        
        return leer.nextInt();
    }
}
