package co.edu.uniquindio.academiaconduccionfx.academiaapp.model;

import java.util.ArrayList;
import java.util.List;

public class AcademiaConduccion {
    List<Usuario> listaUsuarios = new ArrayList<>();

    private String nombre;

    public AcademiaConduccion() {
    }

    public boolean crearUsuario(String nombre,
                                String apellido,
                                String cedula,
                                String edad,
                                String correo){
        Usuario usuarioEncontrado = obtenerUsuario(cedula);
        if(usuarioEncontrado == null){
            Usuario usuario = getBuildUsuario(nombre, apellido, cedula, edad, correo);
            getListaUsuarios().add(usuario);
            return true;
        }else{
            return  false;
        }
    }
    private Usuario getBuildCliente(String nombre, String apellido, String cedula, String edad, String correo) {
        return Usuario.builder()
                .nombre(nombre)
                .apellido(apellido)
                .cedula(cedula)
                .edad(edad)
                .correo(correo)
                .build();
    }
    private Usuario obtenerCliente(String cedula) {
        Usuario usuario = null;
        for (Usuario usuario1: getListaUsuarios()) {
            if(usuario1.getCedula().equalsIgnoreCase(cedula)){
                usuario = usuario1;
                break;
            }
        }

        return usuario;
    }
    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
