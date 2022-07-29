package com.example.prototipo.controllers;

import com.example.prototipo.HelloApplication;
import com.example.prototipo.models.Operaciones;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class CursoController {
    Operaciones operaciones = new Operaciones();

    @FXML
    private Button btnEntrarEstadistica;

    @FXML
    private Button btnEntrarFilo;

    @FXML
    private Button btnEntrarInformatica;

    @FXML
    private Button btnEntrarIngles;

    @FXML
    private Button btnEntrarMate;

    @FXML
    private Button btnRegresar;

    @FXML
    void btnEntrarFiloOnMouseClicked(MouseEvent event) {
        String link = "https://www.youtube.com/watch?v=xHmO_wuv278";
        operaciones.redireccionar(link);
    }

    @FXML
    void btnEntrarMateOnMouseClicked(MouseEvent event) {
        String link = "https://www.youtube.com/watch?v=gFMtPiJMX0M";
        operaciones.redireccionar(link);
    }

    @FXML
    void btnEntrarInglesOnMouseClicked(MouseEvent event) {
        String link = "https://www.youtube.com/watch?v=r-Kb8SrR5LQ";
        operaciones.redireccionar(link);
    }

    @FXML
    void btnEntrarEstadisticaOnMouseClicked(MouseEvent event) {
        String link = "https://www.youtube.com/watch?v=yVFAKnd9MWw&list=PLoOgewM4qFa6bJXw96CPuOu4AAktA3Gk9";
        operaciones.redireccionar(link);
    }


    @FXML
    void btnEntrarInformaticaOnMouseClicked(MouseEvent event) {
        String link = "https://www.youtube.com/watch?v=vtTtqvECxE4";
        operaciones.redireccionar(link);
    }


    @FXML
    void btnRegresarOnMouseClicked(MouseEvent event) {
        HelloApplication.setFMLX("menu2-view", "Home - Prototipo");
    }
}
