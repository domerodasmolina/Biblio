/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.biblio1;

import ec.edu.ups.biblio1.clases.*;
import java.util.Date;

public class Biblio1 {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("     SISTEMA DE BIBLIOTECA - BIBLIO1    ");
        System.out.println("========================================\n");

        // --- Crear Editorial ---
        Editorial editorial = new Editorial("Planeta", "España", 1949);
        System.out.println("Editorial creada: " + editorial);
        System.out.println();

        // --- Crear Autores ---
        Autor autor1 = new Autor("Gabriel", "García Márquez", "Colombiana");
        Autor autor2 = new Autor("Isabel", "Allende", "Chilena");
        System.out.println("Autores creados:");
        System.out.println("  " + autor1);
        System.out.println("  " + autor2);
        System.out.println();

        // --- Crear Libros ---
        Libro libro1 = new Libro(
                "Cien Años de Soledad",
                new Date(),
                "Realismo Mágico",
                "Español",
                432,
                "978-0307474728",
                editorial
        );
        libro1.agregarAutor(autor1);

        Libro libro2 = new Libro(
                "La Casa de los Espíritus",
                new Date(),
                "Novela",
                "Español",
                368,
                "978-0553383805",
                editorial
        );
        libro2.agregarAutor(autor2);

        System.out.println("\nLibros registrados en la editorial:");
        libro1.obtenerInfo();
        libro2.obtenerInfo();

        // --- Crear Bibliotecario ---
        Bibliotecario bibliotecario = new Bibliotecario(
                "Carlos", "Pérez", "1712345678", 40, "08:00 - 16:00"
        );
        System.out.println("Bibliotecario: " + bibliotecario);
        System.out.println();

        // --- Crear Usuario ---
        Usuario usuario = new Usuario(
                "María", "López", "1798765432", 25,
                "maria.lopez@email.com", "clave123"
        );

        // El bibliotecario registra al usuario
        bibliotecario.registrarUsuario(usuario);
        bibliotecario.registrarLibro(libro1);
        System.out.println();

        // --- Crear Préstamo ---
        System.out.println("--- Proceso de Préstamo ---");
        Prestamo prestamo = new Prestamo(
                1001,
                new Date(),
                new Date(System.currentTimeMillis() + 7L * 24 * 60 * 60 * 1000), // +7 días
                usuario,
                libro1
        );

        // El usuario solicita el préstamo
        usuario.solicitarPrestamo(prestamo);
        System.out.println("Estado del libro tras préstamo:");
        System.out.println("  " + libro1);
        System.out.println();

        // --- Ver info del libro ---
        System.out.println("--- Información actualizada del libro ---");
        libro1.obtenerInfo();

        // --- Editar datos del libro ---
        System.out.println("--- Editar datos de libro2 ---");
        libro2.editDatos("La Casa de los Espíritus (Edición Especial)", "Novela Histórica", "Español");
        libro2.obtenerInfo();

        // --- Cambiar disponibilidad ---
        System.out.println("--- Cambiar disponibilidad de libro2 ---");
        libro2.cambiarDispo();
        System.out.println();

        // --- Cerrar Préstamo ---
        System.out.println("--- Cierre del Préstamo ---");
        prestamo.cerrarPrestamo();
        System.out.println("Estado del libro tras cierre:");
        System.out.println("  " + libro1);
        System.out.println();

        // --- Devolver libro manualmente ---
        System.out.println("--- Devolución de libro2 ---");
        usuario.devolverLibro(libro2);
        System.out.println("  " + libro2);

        System.out.println("\n========================================");
        System.out.println("           FIN DEL PROGRAMA             ");
        System.out.println("========================================");
    }
}
