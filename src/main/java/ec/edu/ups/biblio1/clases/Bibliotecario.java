/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.biblio1.clases;
/**
 *
 * @author USER
 */
 

public class Bibliotecario extends Persona {
    private String horario;

    public Bibliotecario(String nombre, String apellido, String cedula, int edad, String horario) {
        super(nombre, apellido, cedula, edad);
        this.horario = horario;
    }

    public String getHorario() { return horario; }
    public void setHorario(String horario) { this.horario = horario; }

    // Métodos del UML
    public void registrarUsuario(Usuario usuario) {
        System.out.println("Bibliotecario [" + getNombre() + "] registró al usuario: " +
                           usuario.getNombre() + " " + usuario.getApellido());
    }

    public void registrarLibro(Libro libro) {
        System.out.println("Bibliotecario [" + getNombre() + "] registró el libro: " +
                           libro.getTitulo() + " | ISBN: " + libro.getISBN());
    }

    @Override
    public String toString() {
        return super.toString() + " | Horario: " + horario;
    }
}