package com.example.prototipo.controllers;

import com.example.prototipo.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

import java.awt.*;
import java.io.IOException;
import java.net.URISyntaxException;

public class CursoController {

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
        if(java.awt.Desktop.isDesktopSupported()){
            java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
            if(desktop.isSupported(Desktop.Action.BROWSE)){
                try{
                    java.net.URI uri=new java.net.URI("https://www.youtube.com/watch?v=xHmO_wuv278");
                    desktop.browse(uri);
                }catch (URISyntaxException | IOException exception){}
            }
        }
    }

    @FXML
    void btnEntrarMateOnMouseClicked(MouseEvent event) {
        if(java.awt.Desktop.isDesktopSupported()){
            java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
            if(desktop.isSupported(Desktop.Action.BROWSE)){
                try{
                    java.net.URI uri=new java.net.URI("https://www.youtube.com/watch?v=gFMtPiJMX0M");
                    desktop.browse(uri);
                }catch (URISyntaxException | IOException exception){}
            }
        }
    }

    @FXML
    void btnEntrarInglesOnMouseClicked(MouseEvent event) {
        if(java.awt.Desktop.isDesktopSupported()){
            java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
            if(desktop.isSupported(Desktop.Action.BROWSE)){
                try{
                    java.net.URI uri=new java.net.URI("https://www.youtube.com/watch?v=r-Kb8SrR5LQ");
                    desktop.browse(uri);
                }catch (URISyntaxException | IOException exception){}
            }
        }

    }

    @FXML
    void btnEntrarEstadisticaOnMouseClicked(MouseEvent event) {
        if(java.awt.Desktop.isDesktopSupported()){
            java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
            if(desktop.isSupported(Desktop.Action.BROWSE)){
                try{
                    java.net.URI uri=new java.net.URI("https://www.youtube.com/watch?v=yVFAKnd9MWw&list=PLoOgewM4qFa6bJXw96CPuOu4AAktA3Gk9");
                    desktop.browse(uri);
                }catch (URISyntaxException | IOException exception){}
            }
        }

    }


    @FXML
    void btnEntrarInformaticaOnMouseClicked(MouseEvent event) {
        if(java.awt.Desktop.isDesktopSupported()){
            java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
            if(desktop.isSupported(Desktop.Action.BROWSE)){
                try{
                    java.net.URI uri=new java.net.URI("https://www.youtube.com/watch?v=vtTtqvECxE4");
                    desktop.browse(uri);
                }catch (URISyntaxException | IOException exception){}
            }
        }
    }


    @FXML
    void btnRegresarOnMouseClicked(MouseEvent event) {
        HelloApplication.setFMLX("menu2-view", "Home - Prototipo");
    }
}
