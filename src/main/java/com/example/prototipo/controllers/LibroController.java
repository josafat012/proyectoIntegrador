package com.example.prototipo.controllers;

import com.example.prototipo.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class LibroController {

    @FXML
    private Button buttonartes;

    @FXML
    private Button buttonentretenimiento;

    @FXML
    private Button buttonhistorias;

    @FXML
    private Button buttonlibrosdelaescuela;

    @FXML
    private Button buttonprogramacion;
    @FXML
    private Button buttonregresar;


    @FXML
    void buttonartesOnMouseClicked(MouseEvent event) {
        HelloApplication.setFMLX("arte-view", "Home - Prototipo");

    }

    @FXML
    void buttonentretenimientoOnMouseClicked(MouseEvent event) {

    }

    @FXML
    void buttonhistoriaOnMouseClicked(MouseEvent event) {
        HelloApplication.setFMLX("historia-view", "Home - Prototipo");

    }

    @FXML
    void buttonlibrosdelaescuelaOnMouseClicked(MouseEvent event) {
        HelloApplication.setFMLX("carpinteria-view", "Login - Prototipo");

    }

    @FXML
    void buttonprogramacionOnMouseClicked(MouseEvent event) {
        HelloApplication.setFMLX("programacion-view", "Login - Prototipo");

    }
    @FXML
    void buttonregresarOnMouseClicked(MouseEvent event) {
        HelloApplication.setFMLX("menu2-view", "Home - Prototipo");

    }


}
