/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BibliotecaView;

import java.util.Scanner;

public class MenuPrincipal {
    private  final Scanner leer = new Scanner(System.in);

    // Este método imprime las opciones en consola y captura la selección del usuario
    public int mostrarMenu() {
        System.out.println("\n=================================");
        System.out.println("    BIENVENIDO AL SISTEMA 2026   ");
        System.out.println("    SISTEMA DE BIBLIOTECA MVC    ");
        System.out.println("=====================================");
        System.out.println("1. Registrar Libro");
        System.out.println("2. Registrar Usuario");
        System.out.println("3. Registrar Prestamo");
        System.out.println("4. Mostrar Reportes");
        System.out.println("5. actualizar libro");
        System.out.println("6. eliminar libro ");
        System.out.println("7.actualizar usuario");
        System.out.println("8.eliminar usuario");
        System.out.println("9.actulizar prestamo");
        System.out.println("10.eliminar prestamo ");
        System.out.println("======================================");
        System.out.print("Seleccione una opcion: ");
        
        return leer.nextInt();
    }

    public void limpiarBuffer() {
        // Método preparado para evitar errores de lectura de strings
        leer.nextLine();
    }
}