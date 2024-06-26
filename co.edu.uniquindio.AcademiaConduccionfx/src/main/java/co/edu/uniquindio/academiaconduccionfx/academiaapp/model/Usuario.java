package co.edu.uniquindio.academiaconduccionfx.academiaapp.model;

import co.edu.uniquindio.academiaconduccionfx.academiaapp.model.builder.UsuarioBuilder;

public class Usuario {
    private String nombre;
    private String apellido;
    private String cedula;
    private int edad;
    private String correo;

    public Usuario(String nombre,
                   String apellido,
                   String cedula,
                   int edad,
                   String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.edad = edad;
        this.correo = correo;
    }

    public static UsuarioBuilder builder(){
        return new UsuarioBuilder();
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public int getEdad() {
        return edad;
    }

    public String getCorreo() {
        return correo;
    }


    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", cedula='" + cedula + '\'' +
                ", edad='" + edad + '\'' +
                ", correo='" + correo + '\'' +
                '}';
    }
}
