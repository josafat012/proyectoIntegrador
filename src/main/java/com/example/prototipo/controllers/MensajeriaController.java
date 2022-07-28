package com.example.prototipo.controllers;

import com.example.prototipo.HelloApplication;
import com.example.prototipo.models.Interface;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;


public class MensajeriaController implements Interface {


    @FXML
    private Button btnEnviar;

    @FXML
    private Button btnVolver;

    @FXML
    private TextField txtMensaje;

    @FXML
    private TextField txtMostrar;

    @FXML
    void OnActionEnviar(ActionEvent event) {
        Mandar();
    }

    @FXML
    void btnVolverOnMouseClicked(MouseEvent event) {
        HelloApplication.setFMLX("menu2-view", "Home - Prototipo");
    }

    @Override
    public void Mandar() {
        String mensaje = txtMensaje.getText();
        txtMostrar.setText("Usuario: " + mensaje);

    }
}
