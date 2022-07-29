package com.example.prototipo.controllers;

import com.example.prototipo.HelloApplication;
import com.example.prototipo.models.Almanaque;
import com.example.prototipo.models.Persona;
import com.example.prototipo.models.User;
import com.example.prototipo.models.ValidateUser;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class RootController {
    Almanaque almanaque = new Almanaque();

    @FXML
    private Button btnCrearLogin;

    @FXML
    private Button btnSalir;

    @FXML
    private TextField txtCorreo;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtPassword;

    @FXML
    private TextField txtSexo;

    @FXML
    private TextField txtUsername;

    @FXML
    void btnCrearLoginOnMouseClicked(MouseEvent event) {
        if(txtCorreo.getText().equals("") || txtNombre.getText().equals("") || txtPassword.getText().equals("") || txtSexo.getText().equals("") || txtUsername.getText().equals("")){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("User - Error");
            alert.setContentText("Hace falta algun dato");
            alert.showAndWait();
        }else {
            User datos;
            Persona persona;
            ValidateUser op = new ValidateUser();
            datos = new User(txtNombre.getText(),txtCorreo.getText(),txtSexo.getText(),txtUsername.getText(),txtPassword.getText());
            op.users.add(datos);
            persona = new Persona(txtUsername.getText());
            almanaque.userEntry.add(persona);
            almanaque.userAdmin.add(datos);
            HelloApplication.setFMLX("login-view", "Login");
        }
    }

    @FXML
    void btnSalirOnMouseClicked(MouseEvent event) {
        HelloApplication.setFMLX("login-view", "Login");
    }

}
