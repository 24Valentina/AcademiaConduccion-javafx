package co.edu.uniquindio.academiaconduccionfx.academiaapp.factory;

import co.edu.uniquindio.academiaconduccionfx.academiaapp.model.AcademiaConduccion;
import co.edu.uniquindio.academiaconduccionfx.academiaapp.model.Usuario;
import co.edu.uniquindio.academiaconduccionfx.academiaapp.model.builder.UsuarioBuilder;

import java.util.List;

public class ModelFactory {

    private static ModelFactory modelFactory;
    private AcademiaConduccion academiaConduccion;

    private ModelFactory() {
        academiaConduccion = new AcademiaConduccion();
        inicializarDatos();
    }

    public static ModelFactory getInstance() {
        if (modelFactory == null) {
            modelFactory = new ModelFactory();
        }
        return modelFactory;
    }

    private void inicializarDatos() {
        Usuario usuario1 = Usuario.builder()
                .nombre("Jorge")
                .apellido("Montoya")
                .cedula("1094")
                .edad(28)
                .correo("Jor@24")
                .build();

        Usuario usuario2 = Usuario.builder()
                .nombre("Jimena")
                .apellido("Garcia")
                .cedula("1099")
                .edad(22)
                .correo("Jime@67")
                .build();

        Usuario usuario3 = Usuario.builder()
                .nombre("Maicol")
                .apellido("Reyes")
                .cedula("1095")
                .edad(24)
                .correo("Mai@32")
                .build();


        Usuario usuario4 = Usuario.builder()
                .nombre("Jeronimo")
                .apellido("Espinosa")
                .cedula("1098")
                .edad(26)
                .correo("Jero@68")
                .build();


        academiaConduccion.getListaUsuarios().add(usuario1);
        academiaConduccion.getListaUsuarios().add(usuario2);
        academiaConduccion.getListaUsuarios().add(usuario3);
        academiaConduccion.getListaUsuarios().add(usuario4);

    }

    public boolean crearUsuario(String nombre,
                                String apellido,
                                String cedula,
                                int edad,
                                String correo) {
        return academiaConduccion.crearUsuario(nombre, apellido , cedula, edad , correo);

        public boolean crearUsuario(Usuario usuario);
            return academiaConduccion.crearUsuario(usuario);
        }

        public List<Usuario> obtenerUsuarios() {
            return academiaConduccion.getListaUsuarios();
        }

    }

