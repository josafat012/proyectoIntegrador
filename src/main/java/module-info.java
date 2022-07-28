module com.example.prototipo {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.prototipo to javafx.fxml;
    exports com.example.prototipo;
    exports com.example.prototipo.controllers;
    opens com.example.prototipo.controllers to javafx.fxml;
}