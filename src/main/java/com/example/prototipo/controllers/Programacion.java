package com.example.prototipo.controllers;

import com.example.prototipo.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

import java.awt.*;
import java.io.IOException;
import java.net.URISyntaxException;

public class Programacion {

    @FXML
    private Button buttonc;

    @FXML
    private Button buttonjava;

    @FXML
    private Button buttonregresar;

    @FXML
    private Button buttonpython;

    @FXML
    void buttoncOnMouseClicked(MouseEvent event) {
        if(Desktop.isDesktopSupported()){
            Desktop desktop = Desktop.getDesktop();
            if(desktop.isSupported(Desktop.Action.BROWSE)){
                try{
                    java.net.URI uri=new java.net.URI("https://drive.google.com/file/d/1MWz4DLPRSAa4D3RFlV8N4g9HAVp79nOg/view?usp=drivesdk");
                    desktop.browse(uri);
                }catch (URISyntaxException | IOException exception){}
            }

        }

    }

    @FXML
    void buttonjavaOnMouseClicked(MouseEvent event) {
        if(Desktop.isDesktopSupported()){
            Desktop desktop = Desktop.getDesktop();
            if(desktop.isSupported(Desktop.Action.BROWSE)){
                try{
                    java.net.URI uri=new java.net.URI("https://drive.google.com/file/d/1eqJiNhR6VevUVDm3Jsrt4ei3MfeLxdRg/view?usp=sharing");
                    desktop.browse(uri);
                }catch (URISyntaxException | IOException exception){}
            }

        }

    }

    @FXML
    void buttonpythonOnMouseClicked(MouseEvent event) {
        if(Desktop.isDesktopSupported()){
            Desktop desktop = Desktop.getDesktop();
            if(desktop.isSupported(Desktop.Action.BROWSE)){
                try{
                    java.net.URI uri=new java.net.URI("https://drive.google.com/file/d/1wnqVwN1Y8sdrHZTk_lWweTZzck7EtdVo/view?usp=sharing");
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
