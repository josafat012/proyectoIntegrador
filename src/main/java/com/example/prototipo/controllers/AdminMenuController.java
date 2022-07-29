package com.example.prototipo.controllers;

import com.example.prototipo.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class AdminMenuController {

    @FXML
    private Button btnMostrarUsuarios;


    @FXML
    private Button btnVolver;

    @FXML
    void btnMostrarUsuariosOnMouseClicked(MouseEvent event) {
        HelloApplication.setFMLX("usuarios-view", "Home - Prototipo");

    }


    @FXML
    void btnVolverOnMouseClicked(MouseEvent event) {
        HelloApplication.setFMLX("login-view", "Home - Prototipo");
    }

}
