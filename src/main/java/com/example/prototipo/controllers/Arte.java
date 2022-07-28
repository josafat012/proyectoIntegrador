package com.example.prototipo.controllers;

import com.example.prototipo.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

import java.awt.*;
import java.io.IOException;
import java.net.URISyntaxException;

public class Arte {

    @FXML
    private Button buttoncanto;

    @FXML
    private Button buttonmusica;

    @FXML
    private Button buttonpintar;

    @FXML
    private Button buttonregresar;


    @FXML
    void buttoncantoOnMouseClicked(MouseEvent event) {
        if(Desktop.isDesktopSupported()){
            Desktop desktop = Desktop.getDesktop();
            if(desktop.isSupported(Desktop.Action.BROWSE)){
                try{
                    java.net.URI uri=new java.net.URI("https://drive.google.com/file/d/151eS3zGBPXXxYAqyEGdrxTQ5pW5Yk1Ve/view?usp=drivesdk");
                    desktop.browse(uri);
                }catch (URISyntaxException | IOException exception){}
            }

        }

    }

    @FXML
    void buttonmusicaOnMouseClicked(MouseEvent event) {
        if(Desktop.isDesktopSupported()){
            Desktop desktop = Desktop.getDesktop();
            if(desktop.isSupported(Desktop.Action.BROWSE)){
                try{
                    java.net.URI uri=new java.net.URI("https://drive.google.com/file/d/1lsaxpZHuU7hwpwQ0KfmJ8ZjWEl50T38w/view?usp=drivesdk");
                    desktop.browse(uri);
                }catch (URISyntaxException | IOException exception){}
            }

        }


    }

    @FXML
    void buttonpintarOnMouseClicked(MouseEvent event) {
        if(Desktop.isDesktopSupported()){
            Desktop desktop = Desktop.getDesktop();
            if(desktop.isSupported(Desktop.Action.BROWSE)){
                try{
                    java.net.URI uri=new java.net.URI("https://drive.google.com/file/d/1DTTKu1v31M2oSJCwBgMWfSYO0eQZ2OD3/view?usp=drivesdk");
                    desktop.browse(uri);
                }catch (URISyntaxException | IOException exception){}
            }

        }

    }
    @FXML
    void buttonregresarOnMouseCliCked(MouseEvent event) {
        HelloApplication.setFMLX("libro-view", "Home - Prototipo");

    }


}
