/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.biblio1;

import ec.edu.ups.biblio1.clases.*;
import java.util.Date;
/**
 *
 * @author USER
 */
 
public class Biblio1 {

    public static void main(String[] args) {

        System.out.println("============================================");
        System.out.println("      SISTEMA DE BIBLIOTECA - BIBLIO1       ");
        System.out.println("============================================\n");

        // ── 1. CREAR EDITORIAL ──────────────────────────────────────────
        System.out.println("--- Creando Editorial ---");
        Editorial editorial = new Editorial("Planeta", "España");
        System.out.println(editorial);
        System.out.println();

        // ── 2. CREAR AUTORES ────────────────────────────────────────────
        System.out.println("--- Creando Autores ---");
        Autor autor1 = new Autor("Gabriel", "García Márquez", "Colombiana");
        Autor autor2 = new Autor("Isabel", "Allende", "Chilena");
        System.out.println(autor1);
        System.out.println(autor2);
        System.out.println();

        // ── 3. CREAR LIBROS ─────────────────────────────────────────────
        System.out.println("--- Creando Libros ---");
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
        System.out.println();

        // ── 4. CREAR BIBLIOTECARIO ──────────────────────────────────────
        System.out.println("--- Creando Bibliotecario ---");
        Bibliotecario bibliotecario = new Bibliotecario(
                "BIB-001",
                "Carlos", "Pérez",
                "1712345678", 40,
                "08:00 - 16:00"
        );
        System.out.println(bibliotecario);
        System.out.println();

        // ── 5. CREAR USUARIOS ───────────────────────────────────────────
        System.out.println("--- Creando Usuarios ---");
        Usuario usuario1 = new Usuario(
                "María", "López", "1798765432", 25,
                "maria.lopez@email.com", "clave123"
        );
        Usuario usuario2 = new Usuario(
                "Pedro", "Ramírez", "1756781234", 30,
                "pedro.ramirez@email.com", "pass456"
        );
        System.out.println(usuario1);
        System.out.println(usuario2);
        System.out.println();

        // ── 6. BIBLIOTECARIO REGISTRA USUARIOS Y LIBROS ─────────────────
        System.out.println("--- Registros por Bibliotecario ---");
        bibliotecario.registrarUsuario(usuario1);
        bibliotecario.registrarUsuario(usuario2);
        bibliotecario.registrarLibro(libro1);
        bibliotecario.registrarLibro(libro2);
        System.out.println();

        // ── 7. PRÉSTAMO 1: usuario1 solicita libro1 ─────────────────────
        System.out.println("--- Préstamo #1 ---");
        Prestamo prestamo1 = new Prestamo(
                1001,
                new Date(),
                new Date(System.currentTimeMillis() + 7L * 24 * 60 * 60 * 1000),
                usuario1,
                libro1
        );
        usuario1.solicitarPrestamo(prestamo1);
        System.out.println("Estado: " + libro1);
        System.out.println();

        // ── 8. PRÉSTAMO 2: usuario2 solicita libro2 ─────────────────────
        System.out.println("--- Préstamo #2 ---");
        Prestamo prestamo2 = new Prestamo(
                1002,
                new Date(),
                new Date(System.currentTimeMillis() + 14L * 24 * 60 * 60 * 1000),
                usuario2,
                libro2
        );
        usuario2.solicitarPrestamo(prestamo2);
        System.out.println("Estado: " + libro2);
        System.out.println();

        // ── 9. VER INFO DE LIBROS ────────────────────────────────────────
        System.out.println("--- Información de Libros ---");
        libro1.obtenerInfo();
        libro2.obtenerInfo();

        // ── 10. EDITAR DATOS DE LIBRO ────────────────────────────────────
        System.out.println("--- Editar datos libro2 ---");
        libro2.editarDatos("La Casa de los Espíritus (Ed. Especial)", "Novela Histórica", "Español");
        System.out.println();

        // ── 11. CAMBIAR DISPONIBILIDAD ───────────────────────────────────
        System.out.println("--- Cambiar disponibilidad ---");
        libro1.cambiarDispo();
        System.out.println();

        // ── 12. CERRAR PRÉSTAMOS ─────────────────────────────────────────
        System.out.println("--- Cerrar Préstamos ---");
        prestamo1.cerrarPrestamo();
        prestamo2.cerrarPrestamo();
        System.out.println();

        // ── 13. DEVOLUCIÓN MANUAL ────────────────────────────────────────
        System.out.println("--- Devolución manual ---");
        usuario1.devolverLibro(libro1);
        System.out.println("Estado final: " + libro1);

        System.out.println("\n============================================");
        System.out.println("             FIN DEL PROGRAMA               ");
        System.out.println("============================================");
    }
}
