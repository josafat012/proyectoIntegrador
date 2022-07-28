package com.example.prototipo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class HelloApplication extends Application {
    private static Stage stage;
    private static Scene scene;
    @Override
    public void start(Stage stage) throws IOException {
        this.stage = stage;
        scene = new Scene (loadFXML("login-view"));
        stage.setTitle("Login - Prototipo");
        stage.setScene(scene);
        stage.centerOnScreen(); // Centra la pantalla en tiempo de ejecucion
        stage.setResizable(false); // Impide que el usario pueda modificar el tamaño del formulario
        stage.show();

    }
    public static Parent loadFXML(String nameview) throws RuntimeException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(nameview +".fxml"));
        try {
        return fxmlLoader.load();
    } catch (IOException e){
        throw new RuntimeException(e);
    }
    }
    public static void setFMLX(String nameView, String title){
        scene.setRoot(loadFXML(nameView)); // Sustituir ene el objeto scene el archivo de vista
        stage.setResizable(true);
        stage.sizeToScene();
        stage.centerOnScreen();
        stage.setResizable(false);
        stage.setTitle(title);

    }
    public static void main(String[] args) {
        launch();
    }
}