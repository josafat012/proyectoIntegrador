package com.example.prototipo.controllers;

import com.example.prototipo.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

import java.awt.*;
import java.io.IOException;
import java.net.URISyntaxException;

public class Historia {

    @FXML
    private Button bottongerra;

    @FXML
    private Button buttonhistoriasdemexico;

    @FXML
    private Button buttonuniverso;

    @FXML
    private Button buttonregresar;



    @FXML
    void bottonguerraOnMouseClicked(MouseEvent event) {
        if(Desktop.isDesktopSupported()){
            Desktop desktop = Desktop.getDesktop();
            if(desktop.isSupported(Desktop.Action.BROWSE)){
                try{
                    java.net.URI uri=new java.net.URI("https://drive.google.com/file/d/139u3xHs957eGgER-1xsf4BZd77ZDhOrW/view?usp=drivesdk");
                    desktop.browse(uri);
                }catch (URISyntaxException | IOException exception){}
            }

        }

    }

    @FXML
    void buttonhistoriademexicoOnMouseClicked(MouseEvent event) {
        if(Desktop.isDesktopSupported()){
            Desktop desktop = Desktop.getDesktop();
            if(desktop.isSupported(Desktop.Action.BROWSE)){
                try{
                    java.net.URI uri=new java.net.URI("https://drive.google.com/file/d/1Dlsm-rLeUH40Y4KY2b0-WYdGhHkjAaDV/view?usp=drivesdk");
                    desktop.browse(uri);
                }catch (URISyntaxException | IOException exception){}
            }

        }


    }

    @FXML
    void buttonuniversoOnMouseClicked(MouseEvent event) {
        if(Desktop.isDesktopSupported()){
            Desktop desktop = Desktop.getDesktop();
            if(desktop.isSupported(Desktop.Action.BROWSE)){
                try{
                    java.net.URI uri=new java.net.URI("https://drive.google.com/file/d/1rQLD-jc3Rs-ogLgVfWbb3XyfhAmDMD_i/view?usp=drivesdk");
                    desktop.browse(uri);
                }catch (URISyntaxException | IOException exception){}
            }

        }

    }
    @FXML
    void buttonregresarOnMouseClicked(MouseEvent event) {
        HelloApplication.setFMLX("libro-view", "Home - Prototipo");

    }

}

