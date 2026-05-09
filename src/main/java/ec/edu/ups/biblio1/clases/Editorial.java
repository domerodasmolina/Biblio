/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.biblio1.clases;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author USER
 */
 
 
public class Editorial {
    private String nombreEditorial;
    private String pais;
    private int anioFundacion;
 
    // Composición: la Editorial contiene Libros (rombo negro en el UML)
    private List<Libro> libros;
 
    public Editorial(String nombreEditorial, String pais, int anioFundacion) {
        this.nombreEditorial = nombreEditorial;
        this.pais = pais;
        this.anioFundacion = anioFundacion;
        this.libros = new ArrayList<>();
    }
 
    public String getNombreEditorial() { return nombreEditorial; }
    public void setNombreEditorial(String nombreEditorial) { this.nombreEditorial = nombreEditorial; }
 
    public String getPais() { return pais; }
    public void setPais(String pais) { this.pais = pais; }
 
    public int getAnioFundacion() { return anioFundacion; }
    public void setAnioFundacion(int anioFundacion) { this.anioFundacion = anioFundacion; }
 
    public List<Libro> getLibros() { return libros; }
 
    public void agregarLibro(Libro libro) {
        libros.add(libro);
        System.out.println("Libro \"" + libro.getTitulo() + "\" agregado a editorial " + nombreEditorial);
    }
 
    @Override
    public String toString() {
        return "Editorial: " + nombreEditorial +
               " | País: " + pais +
               " | Fundada: " + anioFundacion;
    }
}
