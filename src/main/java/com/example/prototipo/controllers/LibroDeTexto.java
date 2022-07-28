
package com.example.prototipo.controllers;

import com.example.prototipo.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.awt.*;
import java.io.IOException;
import java.net.URISyntaxException;

public class LibroDeTexto {

    @FXML
    private Button buttonalgebra;

    @FXML
    private Button buttoncalculo;

    @FXML
    private Button buttonderecho;

    @FXML
    private Button buttonespañol;

    @FXML
    private Button buttonmatematicas;
    @FXML
    private Button buttonregresar;

    @FXML
    private AnchorPane mostrar;

    @FXML
    void buttonalgebraOnMouseClicked(MouseEvent event) {
        if(Desktop.isDesktopSupported()){
            Desktop desktop = Desktop.getDesktop();
            if(desktop.isSupported(Desktop.Action.BROWSE)){
                try{
                    java.net.URI uri=new java.net.URI("https://drive.google.com/file/d/1VRWBtwFZ_9NOjJ1VYxgLrLyUZZP7n8Og/view?usp=drivesdk");
                    desktop.browse(uri);
                }catch (URISyntaxException | IOException exception){}
            }

        }

    }

    @FXML
    void buttoncalculoOnMouseClicked(MouseEvent event) {
        if(Desktop.isDesktopSupported()){
            Desktop desktop = Desktop.getDesktop();
            if(desktop.isSupported(Desktop.Action.BROWSE)){
                try{
                    java.net.URI uri=new java.net.URI("https://drive.google.com/file/d/1T2Ymp7ex4ErVsHshl05_-8E61kJTEK1s/view?usp=drivesdk");
                    desktop.browse(uri);
                }catch (URISyntaxException | IOException exception){}
            }

        }

    }

    @FXML
    void buttonderechoOnMouseClicked(MouseEvent event) {
        if(Desktop.isDesktopSupported()){
            Desktop desktop = Desktop.getDesktop();
            if(desktop.isSupported(Desktop.Action.BROWSE)){
                try{
                    java.net.URI uri=new java.net.URI("https://drive.google.com/file/d/1-ze_TBw4F074f4Uirgey8MN0pTfzv6ya/view?usp=drivesdk");
                    desktop.browse(uri);
                }catch (URISyntaxException | IOException exception){}
            }

        }

    }

    @FXML
    void buttonespañolOnMouseClicked(MouseEvent event) {
        if(Desktop.isDesktopSupported()){
            Desktop desktop = Desktop.getDesktop();
            if(desktop.isSupported(Desktop.Action.BROWSE)){
                try{
                    java.net.URI uri=new java.net.URI("https://drive.google.com/file/d/1D6ADhIxm-FUTF8SN-kNyZDiZ5d9gLgaU/view?usp=drivesdk");
                    desktop.browse(uri);
                }catch (URISyntaxException | IOException exception){}
            }

        }

    }

    @FXML
    void buttonmatematicasOnMouseClicked(MouseEvent event) {
        if(Desktop.isDesktopSupported()){
            Desktop desktop = Desktop.getDesktop();
            if(desktop.isSupported(Desktop.Action.BROWSE)){
                try{
                    java.net.URI uri=new java.net.URI("https://drive.google.com/file/d/1eAI6M3umN_UrL43Fp3DbBio_R6L8wnNM/view?usp=drivesdk");
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
