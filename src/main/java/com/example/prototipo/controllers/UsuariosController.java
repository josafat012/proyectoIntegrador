package com.example.prototipo.controllers;

import com.example.prototipo.HelloApplication;
import com.example.prototipo.models.Operaciones;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;

public class UsuariosController {
    Operaciones operaciones = new Operaciones();
    private String datos;

    @FXML
    private Button btnRegresar;

    @FXML
    private Button btnMostrar;

    @FXML
    private TextArea txtAreaUsuarios;

    @FXML
    void btnMostrarOnMouseClicked(MouseEvent event) {
        imprimir();
    }

    @FXML
    void btnRegresarOnMouseClicked(MouseEvent event) {
        HelloApplication.setFMLX("adminmenu-view", "Registro");

    }

    public void imprimir(){
        datos = operaciones.imprimir();
        txtAreaUsuarios.setText(datos);

    }

}
