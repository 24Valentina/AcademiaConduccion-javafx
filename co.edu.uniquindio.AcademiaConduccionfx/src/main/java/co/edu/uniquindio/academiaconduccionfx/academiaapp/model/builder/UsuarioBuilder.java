package co.edu.uniquindio.academiaconduccionfx.academiaapp.model.builder;

import co.edu.uniquindio.academiaconduccionfx.academiaapp.model.Usuario;

public class UsuarioBuilder{
    protected String nombre;
    protected String apellido;
    protected String cedula;
    protected int edad;
    protected String correo;

    public UsuarioBuilder nombre(String nombre) {
        this.nombre = nombre;
        return this;
    }


    public UsuarioBuilder apellido(String apellido) {
        this.apellido = apellido;
        return this;
    }


    public UsuarioBuilder  cedula(String cedula) {
        this.cedula = cedula;
        return this;
    }

    public UsuarioBuilder edad(int edad) {
        this.edad = edad;
        return this;
    }

    public UsuarioBuilder correo(String correo) {
        this.correo = correo;
        return this;
    }


  public Usuario build(){
return new Usuario(nombre,apellido,cedula, edad, correo);
  }
}
