package co.edu.uniquindio.academiaconduccionfx.academiaapp.model.builder;

import co.edu.uniquindio.academiaconduccionfx.academiaapp.model.Usuario;

public class UsuarioBuilder<T extends UsuarioBuilder<T>>{
    protected String nombre;
    protected String apellido;
    protected String cedula;
    protected int edad;
    protected String correo;

    public T setNombre(String nombre) {
        this.nombre = nombre;
        return self();
    }


    public T setApellido(String apellido) {
        this.apellido = apellido;
        return self();
    }


    public T setCedula(String cedula) {
        this.cedula = cedula;
        return self();
    }

    public T setEdad(int edad) {
        this.edad = edad;
        return self();
    }

    public T setCorreo(String correo) {
        this.correo = correo;
        return self();
    }
    @SuppressWarnings("unchecked")
    protected T self() {
        return (T) this;
    }

  public Usuario build(){
return new Usuario(nombre,apellido,cedula, edad, correo);
  }
}
