package co.edu.uniquindio.academiaconduccionfx.academiaapp.viewcontroller;

import co.edu.uniquindio.academiaconduccionfx.academiaapp.controller.UsuarioController;
import co.edu.uniquindio.academiaconduccionfx.academiaapp.model.Usuario;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class UsuarioViewController {
    UsuarioController usuarioController;
    ObservableList<Usuario> listaUsuarios = FXCollections.observableArrayList();
    Usuario usuarioSeleccionado;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private RadioButton rbuttonActualizar;

    @FXML
    private RadioButton rbuttonCrear;

    @FXML
    private RadioButton rbuttonEliminar;

    @FXML
    private RadioButton rbuttonLimpiar;

    @FXML
    private RadioButton rbuttonMostrar;


    @FXML
    private TableView<Usuario> tableUsuario;

    @FXML
    private TableColumn<Usuario, String> tcApellido;

    @FXML
    private TableColumn<Usuario, String> tcCedula;

    @FXML
    private TableColumn<Usuario, String> tcCorreo;

    @FXML
    private TableColumn<Usuario,String > tcEdad;

    @FXML
    private TableColumn<Usuario, String> tcNombre;

    @FXML
    private TextField txtapellido;

    @FXML
    private TextField txtcedula;

    @FXML
    private TextField txtcorreo;

    @FXML
    private TextField txtedad;

    @FXML
    private TextField txtnombre;

    @FXML
    void initialize() {
        usuarioController = new UsuarioController();
        initView();


    }

    private void initView() {
        initDataBinding();
        obtenerUsuarios();
        tableUsuario.getItems().clear();
        tableUsuario.setItems(listaUsuarios);
        listenerselection();
    }

    private void listenerselection() {
        tableUsuario.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            usuarioSeleccionado = newSelection;
            mostrarInformacionUsuario(usuarioSeleccionado);

        });
    }

    private void mostrarInformacionUsuario(Usuario usuarioSeleccionado) {
        if(usuarioSeleccionado != null){
            txtnombre.setText(usuarioSeleccionado.getNombre());
            txtapellido.setText(usuarioSeleccionado.getApellido());
            txtcedula.setText(usuarioSeleccionado.getCedula());
            txtedad.setText(String.valueOf(usuarioSeleccionado.getEdad()));
            txtcorreo.setText(usuarioSeleccionado.getCorreo());
        }
    }

    private void obtenerUsuarios() {
        listaUsuarios.addAll(usuarioController.obtenerUsurios());
    }

    private void initDataBinding() {
        tcNombre.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getNombre()));
        tcApellido.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getApellido()));
        tcCedula.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getCedula()));
        tcEdad.setCellValueFactory(cellData -> new SimpleStringProperty(String.valueOf(cellData.getValue().getEdad())));
        tcCorreo.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getCorreo()));
    }
    private void agregarUsuario() {
        if(validarFormulario()){
            Usuario usuario = construirDatosUsuariost();
            if(usuarioController.crearUsuario(usuario)){
                listaUsuarios.add(usuario);
                mostrarMensaje("Notificación usuario", "Usuario creado", "El usuario se ha creado con éxito", Alert.AlertType.INFORMATION);
                limpiarCamposEmpleado();
            }else{
                mostrarMensaje("Notificación usuario", "Usuario no creado", "El usuario no se ha creado con éxito", Alert.AlertType.ERROR);
            }
        }else{
            mostrarMensaje("Notificación usuario", "Usuario no creado", "Los datos ingresados son invalidos", Alert.AlertType.ERROR);
        }
    }

    private void limpiarCamposEmpleado() {
        txtNombre.setText("");
        txtApellido.setText("");
        txtCedula.setText("");
        txtEdad.setText("");
        txtTelefonoFijo.setText("");
        txtCelular.setText("");
    }

    private boolean validarFormulario() {
        if(txtNombre.getText().isEmpty()){
            return false;
        }

        return true;
    }

    private Usuario construirDatosUsuariost() {
        return Usuario.builder()
                .nombre(txtNombre.getText())
                .apellido(txtApellido.getText())
                .cedula(txtCedula.getText())
                .edad(Integer.parseInt(txtEdad.getText()))
                .telefonoFijo(txtTelefonoFijo.getText())
                .telefonoCelular(txtCelular.getText())
                .build();
    }



}
