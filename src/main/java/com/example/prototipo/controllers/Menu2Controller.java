package com.example.prototipo.controllers;

import com.example.prototipo.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class Menu2Controller {

    @FXML
    private Button cursos;

    @FXML
    private Button btnCerrarSesion;

    @FXML
    private Button foro;

    @FXML
    private Button libros;

    @FXML
    private Button mensajeria;

    @FXML
    void cursosOnMuouseCliked(MouseEvent event) {
        HelloApplication.setFMLX("curso-view", "Home - Prototipo");

    }


    @FXML
    void librosOnMouseClicked(MouseEvent event) {
        HelloApplication.setFMLX("libro-view", "Home - Prototipo");

    }

    @FXML
    void mensajeriaOnMouseClicked(MouseEvent event) {
        HelloApplication.setFMLX("mensajeria-view", "Chat - Mensajes");
    }

    @FXML
    void btnCerrarSesionOnMouseClicked(MouseEvent event) {
        HelloApplication.setFMLX("login-view", "Home - Prototipo");
    }
}


