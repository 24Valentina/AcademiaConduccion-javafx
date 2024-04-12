package co.edu.uniquindio.academiaconduccionfx.academiaapp.factory;

import co.edu.uniquindio.academiaconduccionfx.academiaapp.model.AcademiaConduccion;
import co.edu.uniquindio.academiaconduccionfx.academiaapp.model.Usuario;

import java.util.List;

public class ModelFactory {

    private static ModelFactory modelFactory;
    private AcademiaConduccion academiaConduccion;
    private ModelFactory(){
        academiaConduccion = new AcademiaConduccion();
        inicializarDatos();
    }

    public static ModelFactory getInstance(){
        if(modelFactory == null){
            modelFactory = new ModelFactory();
        }
        return modelFactory;
    }

    private void inicializarDatos() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Jorge");
        usuario.setApellido("Montoya");
        usuario.setCedula("1094");
        usuario.setEdad(27);
        usuario.setCorreo("Jor@24");

        Usuario usuario2 = new Usuario();
        usuario.setNombre("Maria");
        usuario.setApellido("Ortiz");
        usuario.setCedula("1098");
        usuario.setEdad(19);
        usuario.setCorreo("mari@87");

        Usuario usuario3 = new Usuario();
        usuario.setNombre("Jimena");
        usuario.setApellido("Garcia");
        usuario.setCedula("1097");
        usuario.setEdad(22);
        usuario.setCorreo("Jime@34");


        Usuario usuario4 = new Usuario();
        usuario.setNombre("Maicol");
        usuario.setApellido("Reyes");
        usuario.setCedula("1090");
        usuario.setEdad(26);
        usuario.setCorreo("mai@27");

        academiaConduccion.getListaUsuarios().add(usuario);
        academiaConduccion.getListaUsuarios().add(usuario2);
        academiaConduccion.getListaUsuarios().add(usuario3);
        academiaConduccion.getListaUsuarios().add(usuario4);


    }


    public List<Usuario> obtenerUsuarios() {
        return academiaConduccion.getListaUsuarios();
    }
}
