/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.biblio1.clases;
/**
 *
 * @author USER
 */
 

public class Usuario extends Persona {
    private String correo;
    private String contrasena;

    public Usuario(String nombre, String apellido, String cedula, int edad,
                   String correo, String contrasena) {
        super(nombre, apellido, cedula, edad);
        this.correo = correo;
        this.contrasena = contrasena;
    }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }

    public String getContrasena() { return contrasena; }
    public void setContrasena(String contrasena) { this.contrasena = contrasena; }

    public void solicitarPrestamo(Prestamo prestamo) {
        System.out.println("Usuario [" + getNombre() + " " + getApellido() +
                           "] solicita préstamo. Código: " + prestamo.getCodigo());
    }

    public void devolverLibro(Libro libro) {
        libro.setDisponible(true);
        System.out.println("Usuario [" + getNombre() + " " + getApellido() +
                           "] devolvió: " + libro.getTitulo());
    }

    @Override
    public String toString() {
        return super.toString() + " | Correo: " + correo;
    }
}
