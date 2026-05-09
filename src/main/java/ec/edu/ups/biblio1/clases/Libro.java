/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.biblio1.clases;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/**
 *
 * @author USER
 */
 

public class Libro {
    private String titulo;
    private Date publicacion;
    private String genero;
    private String idioma;
    private int numeroPag;
    private String ISBN;
    private boolean disponible;

    // Asociación con Autor (1..* autores por libro)
    private List<Autor> autores;

    // Asociación con Editorial (composición, rombo negro)
    private Editorial editorial;

    public Libro(String titulo, Date publicacion, String genero, String idioma,
                 int numeroPag, String ISBN, Editorial editorial) {
        this.titulo = titulo;
        this.publicacion = publicacion;
        this.genero = genero;
        this.idioma = idioma;
        this.numeroPag = numeroPag;
        this.ISBN = ISBN;
        this.disponible = true;
        this.autores = new ArrayList<>();
        this.editorial = editorial;
        if (editorial != null) {
            editorial.agregarLibro(this);
        }
    }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public Date getPublicacion() { return publicacion; }
    public void setPublicacion(Date publicacion) { this.publicacion = publicacion; }

    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }

    public String getIdioma() { return idioma; }
    public void setIdioma(String idioma) { this.idioma = idioma; }

    public int getNumeroPag() { return numeroPag; }
    public void setNumeroPag(int numeroPag) { this.numeroPag = numeroPag; }

    public String getISBN() { return ISBN; }
    public void setISBN(String ISBN) { this.ISBN = ISBN; }

    public boolean isDisponible() { return disponible; }
    public void setDisponible(boolean disponible) { this.disponible = disponible; }

    public List<Autor> getAutores() { return autores; }
    public Editorial getEditorial() { return editorial; }

    public void agregarAutor(Autor autor) {
        autores.add(autor);
    }

    // Métodos del UML
    public void editDatos(String titulo, String genero, String idioma) {
        this.titulo = titulo;
        this.genero = genero;
        this.idioma = idioma;
        System.out.println("Datos actualizados para: " + this.titulo);
    }

    public void obtenerInfo() {
        System.out.println("=== Información del Libro ===");
        System.out.println("Título     : " + titulo);
        System.out.println("ISBN       : " + ISBN);
        System.out.println("Género     : " + genero);
        System.out.println("Idioma     : " + idioma);
        System.out.println("Páginas    : " + numeroPag);
        System.out.println("Disponible : " + (disponible ? "Sí" : "No"));
        System.out.println("Editorial  : " + (editorial != null ? editorial.getNombreEditorial() : "N/A"));
        System.out.print("Autores    : ");
        for (Autor a : autores) {
            System.out.print(a.getNombre() + " " + a.getApellido() + "; ");
        }
        System.out.println();
    }

    public void cambiarDispo() {
        this.disponible = !this.disponible;
        System.out.println("Disponibilidad de \"" + titulo + "\": " + (disponible ? "Disponible" : "No disponible"));
    }

    @Override
    public String toString() {
        return "Libro: " + titulo + " | ISBN: " + ISBN + " | Disponible: " + (disponible ? "Sí" : "No");
    }
}