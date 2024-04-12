package co.edu.uniquindio.academiaconduccionfx.academiaapp.controller;

import co.edu.uniquindio.academiaconduccionfx.academiaapp.factory.ModelFactory;
import co.edu.uniquindio.academiaconduccionfx.academiaapp.model.Usuario;

import java.util.List;

public class UsuarioController {

    ModelFactory modelFactory;

    public UsuarioController() {
        modelFactory = ModelFactory.getInstance();
    }
    public List<Usuario> obtenerUsuarios() {
        return modelFactory.obtenerUsuarios();
    }
}

