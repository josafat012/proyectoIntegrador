package com.example.prototipo.controllers;

import com.example.prototipo.HelloApplication;
import com.example.prototipo.models.AdminDefault;
import com.example.prototipo.models.ValidateUser;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class LoginController {
    ValidateUser user = new ValidateUser();
    AdminDefault admin = new AdminDefault();
    @FXML
    private Button btnCrearLogin;

    @FXML
    private Button btnIniciaSesion;

    @FXML
    private Button btnSalir;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private TextField txtUsername;

    @FXML
    void btnCrearLoginOnMouseClicked(MouseEvent event) {
            HelloApplication.setFMLX("root-view", "Registro");

    }

    @FXML
    void btnIniciaSesionOnMouseClicked(MouseEvent event) {


        if (user.autenticarUser(txtUsername.getText(), txtPassword.getText())){
            HelloApplication.setFMLX("menu2-view", "Menu - Principal");
        }else if (admin.autenticarUser(txtUsername.getText(),txtPassword.getText())){
            HelloApplication.setFMLX("adminMenu-view", "Menu - Principal");
        }
        else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Login - Error");
            alert.setContentText("El usuario no existe");
            alert.showAndWait();
        }
    }

    @FXML
    void btnSalirOnMouseClicked(MouseEvent event) {
        System.exit(1);
    }
}
